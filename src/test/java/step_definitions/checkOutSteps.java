package step_definitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.CartPage;
import org.example.pageObject.HomePage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class checkOutSteps {
    private WebDriver webDriver;/*Membuat Constructor untuk WebDriver*/

    public checkOutSteps (){
        super();
        this.webDriver = Hooks.webDriver;/*Constructor webDriver = Hooks.webDriver kenapa memanggil diclass Hooks karena setup ada pada Hooks*/
    }

    @Given("User already login")
    public void userLogin(){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @When("User choose sort option \"(.*)\"")
    public void sortItem(String sortText)throws InterruptedException{
        HomePage homePage = new HomePage(webDriver);
        homePage.sortContainerDisp();
        homePage.selectSortFilter(sortText);
        Thread.sleep(5000);
    }

    @And("User add an item and open the shopping cart")
    public void chooseItem() throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        homePage.itemContainerDisp();
        homePage.chooseItem();
        homePage.clickCartBtn();
        Thread.sleep(5000);
    }

    @And("User item must be \"(.*)\" and \"(.*)\"")
    public void cartListItem(String cartList, String cartList2) {
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertEquals(cartList, cartPage.getItemList());
        Assert.assertEquals(cartList2, cartPage.getItemList2());
    }

    @And("User Remove one of item in the shopping cart")
    public void removeCartItem() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickRemoveBtn();
        Thread.sleep(5000);
    };


}

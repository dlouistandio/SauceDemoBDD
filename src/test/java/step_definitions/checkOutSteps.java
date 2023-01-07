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

    @And("User add \"(.*)\" to cart")
    public void chooseItem(String products) throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        homePage.chooseItem(products);
    }

    @And("User click the shopping cart")
    public void clickShoppingCart() throws InterruptedException{
        HomePage homePage = new HomePage(webDriver);
        homePage.clickCartBtn();
        Thread.sleep(5000);
    }

    @And("User item must be \"(.*)\" and \"(.*)\"")
    public void cartListItem(String cartList, String cartList2) {
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertEquals(cartList, cartPage.getItemList());
        Assert.assertEquals(cartList2, cartPage.getItemList2());
    }

    @And("User Remove \"(.*)\" in the shopping cart")
    public void removeItemCart(String delItem) throws InterruptedException{
        CartPage cartPage = new CartPage(webDriver);
        cartPage.removeItemList(delItem);
    }

    @Then("User click the Checkout Button")
    public void clickCheckOut(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickCheckOutBtn();
    };

    @And("User input shipping information")
    public void inputShipping(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.inputInformationShip();
    }

}

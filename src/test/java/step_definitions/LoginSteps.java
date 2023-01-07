package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.CartPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/*Digunakan untuk membuat step BDD menggunakan function yang sudah dibuat pada LoginPage*/
public class LoginSteps {
    private WebDriver webDriver;/*Membuat Constructor untuk WebDriver*/

    public LoginSteps (){
        super();
        this.webDriver = Hooks.webDriver;/*Constructor webDriver = Hooks.webDriver kenapa memanggil diclass Hooks karena setup ada pada Hooks*/
    }

    @Given("User open the web sauce demo")/*Parameter untuk digunakan pada login.feature*/
    /*Fungsi untuk @Given*/
    public void verifyDisplay() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.isDisplayed();
    }

    @When("User input \"(.*)\" as userName and input \"(.*)\" as password")/*Parameter untuk digunakan pada login.feature*/
    /*Fungsi untuk @When*/
    public void inputCredential(String userName, String password){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
    }

    @Then("User clicked the login button")
    public void clickButton() throws InterruptedException{
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickLogin();
        Thread.sleep(6000);
    }

    /*Fungsi Assert untuk get.text*/
    @Then("User see error \"(.*)\" on login page")
    public void errorText(String errorText) throws InterruptedException {
        LoginPage loginpage = new LoginPage(webDriver);
        Assert.assertEquals(errorText, loginpage.getErrorText());
        Thread.sleep(3000);
    }


}

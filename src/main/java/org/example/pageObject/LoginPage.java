package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*Digunakan untuk setup path dan fungsi page yang akan digunakan pada LoginSteps*/
public class LoginPage {

    public static WebDriver driver;

    /*Fungsi ini digunakan agar bisa membuat path dan element*/
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /* Membuat path untuk element didalam page*/
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement btnLogin;

    @FindBy(xpath = "//h3")
    private WebElement errorText;


    /*Membuat Fungsi untuk digunakan pada LoginSteps*/
    public void setUserName(String user) {
        userName.sendKeys(user);
    }

    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public boolean isDisplayed(){
        userName.isDisplayed();
        return true;
    }

    public String getErrorText(){
        return errorText.getText();
    }
}

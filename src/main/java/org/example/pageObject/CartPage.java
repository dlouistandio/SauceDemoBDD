package org.example.pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver driver;

    /*Fungsi ini digunakan agar bisa membuat path dan element*/
    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[.='Test.allTheThings() T-Shirt (Red)']")
    private WebElement cartList;

    @FindBy(xpath = "//div[.='Sauce Labs Onesie']")
    private WebElement cartList2;

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement removeButton;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;

    public String getItemList(){
        return cartList.getText();
    }

    public String getItemList2(){
        return cartList2.getText();
    }

    public void clickRemoveBtn (){
        removeButton.click();
    }
}

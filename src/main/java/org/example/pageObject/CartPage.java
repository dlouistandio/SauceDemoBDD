package org.example.pageObject;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
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

    @FindBy(className = "cart_list")
    private WebElement removeItem;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement inputFirstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement inputLastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement inputZipCode;

    public String getItemList(){
        return cartList.getText();
    }

    public String getItemList2(){
        return cartList2.getText();
    }

    public void removeItemList(String products) throws InterruptedException {
            String[] productList = products.split(",");
            WebElement removeProduct;
            for (String productName:
                    productList) {
                String xPathSelectedProduct =  "//button[@id='remove-"+ productName.toLowerCase().replace(" ","-") +"']";
                removeProduct = removeItem.findElement(By.xpath(xPathSelectedProduct));
                removeProduct.click();
            }
            Thread.sleep(5000);
    }

    public void clickCheckOutBtn(){
        checkoutButton.click();
    };

    public void inputInformationShip(){
        inputFirstName.sendKeys("David");
        inputLastName.sendKeys("Louis");
        inputZipCode.sendKeys("70123");
    }
}
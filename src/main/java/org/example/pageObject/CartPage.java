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

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueShipBtn;

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement subTotalLabel;

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement taxLabel;

    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement totalLabel;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement thankYouText;

    public String getThankYouText(){
        return thankYouText.getText();
    }
    public String getSubTotal(){
        return subTotalLabel.getText();
    }
    public String getTaxtotal(){
        return taxLabel.getText();
    }
    public String getTotal(){
        return totalLabel.getText();
    }

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

    public void clickContinueShipBtn(){
        continueShipBtn.click();
    }

    public void clickFinishBtn(){
        finishButton.click();
    }
}
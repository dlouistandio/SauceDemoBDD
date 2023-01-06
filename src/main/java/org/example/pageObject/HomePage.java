package org.example.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    public static WebDriver driver;

    /*Fungsi ini digunakan agar bisa membuat path dan element*/
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='inventory_container']")
    private WebElement itemContainer;

    @FindBy(xpath ="//select[@class='product_sort_container']")
    private WebElement sortFilter;

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement addToCartBtn2;

    @FindBy(xpath = "//div[@id='shopping_cart_container']")
    private WebElement cartButton;

    public void selectSortFilter(String sort){
        Select b = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
        b.selectByVisibleText(sort);
    }

    public boolean sortContainerDisp(){
        sortFilter.isDisplayed();
        return true;
    }

    public boolean itemContainerDisp(){
        itemContainer.isDisplayed();
        return true;
    }

    public void chooseItem(){
        addToCartBtn.click();
        addToCartBtn2.click();
    }

    public void clickCartBtn(){
      cartButton.click();
    };

}

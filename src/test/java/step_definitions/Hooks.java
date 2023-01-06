package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Hooks digunakan untuk memanggil Fungsi Membuka dan Menutup Browser atau bisa disebut step awal sebelum melakukan BDD*/
public class Hooks {
    public static WebDriver webDriver;/*membuat Constructor untuk WebDriver*/

    @Before /*Sebelum Melakukan Automation fungsi Before akan membuka url menggunakan WebDriver sesuai fungsi yang ditulis*/
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/driver/chromedriver.exe");

        webDriver = new ChromeDriver();
        String appUrl = "https://www.saucedemo.com/"; /*membuat String untuk url yang ingin dituju*/
        webDriver.get(appUrl); /*memanggil String appUrl menggunakan get*/
        webDriver.manage().window().maximize();/*manage digunakan untuk maximize window pada browser*/
    }

    @After /*Setelah Melakukan Fungsi Automation After akan menutup WebDriver*/
    public void closeBrowser(){
        webDriver.quit();/*fungsi quit digunakan untuk exit/quit browser*/
    }
}
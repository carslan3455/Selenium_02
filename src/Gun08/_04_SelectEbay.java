package Gun08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _04_SelectEbay {
    /*
  todo Senaryo :
  1- https://www.ebay.com/ sitesini açın
  2- Arama seçim menüsünden 2984  değerli elemanı seçtiriniz.
  3- Arama işlemini yaptırınız.

 */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        WebElement menuDropDown = driver.findElement(By.id("gh-cat"));

        Select menu = new Select(menuDropDown);
        menu.selectByValue("2984");

        WebElement ara = driver.findElement(By.id("gh-btn"));
        ara.click();


        Thread.sleep(1000);
        driver.quit();
    }
}

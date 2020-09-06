package Gun08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _03_SelectClassGiris {
     /*
            select  class ı
            görünen text ile seçim:  selectByVisibleText
            value si ile seçim    :  selectByValue
            indexi ile seçim      :  selectByIndex

            seçim yaptırılabilir.

            WebElement dropDownMenu=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

            Select menu = new Select(dropDownMenu);

            menu.selectByVisibleText("Automotive");
            menu.selectByValue("search-alias=automotive-intl-ship");
            menu.selectByIndex(2);
     */

      /*
      todo Senaryo :
      1- https://www.amazon.com/ sitesine gidin.
      2- "Books" i seçin
      3- Arama butpnuna tıklatarak sonuçları gösterin.

     */



    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement menuDropDown = driver.findElement(By.id("searchDropdownBox"));

        Select menu = new Select(menuDropDown);
        menu.selectByVisibleText("Bücher");

        WebElement ara = driver.findElement(By.id("nav-search-submit-text"));
        ara.click();

        Thread.sleep(1000);


        Thread.sleep(1000);
        driver.quit();

    }
}

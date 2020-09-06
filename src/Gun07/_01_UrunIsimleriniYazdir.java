package Gun07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_UrunIsimleriniYazdir {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        List<WebElement> urunler = driver.findElements(By.cssSelector(".inventory_item_name"));
        // cssSelector("div.inventory_item_name")
        // xpath("//div[@class='inventory_item_name']"));


        for (WebElement e: urunler ) {
            System.out.println(e.getText());
        }


        Thread.sleep(3000);
        driver.quit();


    }
}

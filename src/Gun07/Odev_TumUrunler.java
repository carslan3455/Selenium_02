package Gun07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Odev_TumUrunler {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        loginIslem(driver);
        Thread.sleep(1000);
        List<WebElement> urunEkle = driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));

        for (WebElement u:urunEkle) {
            u.click();
            Thread.sleep(1000);
        }

        driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
        Thread.sleep(1500);


        List<WebElement> urunSil = driver.findElements(By.xpath("//button[@class='btn_secondary cart_button']"));

        System.out.println(urunSil.size());
        for (WebElement u:urunSil) {
            u.click();
            Thread.sleep(1000);
        }



//        Thread.sleep(1500);
//        driver.quit();




    }

    public static void loginIslem(WebDriver driver) throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();


    }
}

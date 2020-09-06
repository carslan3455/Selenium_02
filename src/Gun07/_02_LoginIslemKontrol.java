package Gun07;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.Arrays;
import java.util.List;

public class _02_LoginIslemKontrol {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        Thread.sleep(1000);


        // todo  tek metin oldugu icin split ile ayirarak yaptik...
        String userlist = driver.findElement(By.cssSelector("div[class='login_credentials']")).getText();

         String[] userDizi = userlist.split("\n");



        for (int i = 1; i < userDizi.length; i++) {

            Thread.sleep(1000);

            driver.findElement(By.xpath("//input[@id='user-name']")).clear();
            driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(userDizi[i]);

            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='password']")).clear();
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='login-button']")).click();

            List<WebElement> txtProducts = driver.findElements(By.xpath("//div[text()='Products']"));
            if (txtProducts.size() == 1) {
                System.out.println(userDizi[i] + " Login oldu");
                driver.navigate().back();
            } else {

                String hataMesaji = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
                System.out.println(userDizi[i] + " => hatali username " + hataMesaji);

            }


//      todo try-catch hata bulunca test durduruyor. yukaridaki kod ile hatayi buluyor ekrana kaydediyor
//               testi devam ettiriyor

//           try {
//                driver.findElement(By.xpath("//div[text()='Products']"));
//                System.out.println(userDizi[i] + " Login oldu");
//                driver.navigate().back();
//
//            } catch (Exception e) {
//
//                String hataMesaji = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
//                System.out.println(userDizi[i] + " " + hataMesaji);
//
//            }
        }

        Thread.sleep(3000);
        driver.quit();
    }
}

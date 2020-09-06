package Gun06.CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_Ornek_1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe" );
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        Thread.sleep(1500);
        driver.findElement(By.cssSelector("input[id$='4586_0']")).click();

        Thread.sleep(1500);
        driver.findElement(By.cssSelector("[id$='_4588']")).click();

        Thread.sleep(1500);
        driver.findElement(By.cssSelector("option[value='Online Advertising']")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("input[value='Every Day']")).click();

        Thread.sleep(1500);
        driver.findElement(By.cssSelector("input[value='Good']")).click();

        Thread.sleep(1500);
        driver.findElement(By.cssSelector("[id$='_4597']")).click();
        driver.findElement(By.cssSelector("[id$='_4597']>:nth-child(4)")).click();


        Thread.sleep(1000);
        driver.quit();



    }
}

package Mentor.TahirBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class CssSelector_Ornek {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe" );
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://developer.salesforce.com/signup");

        Thread.sleep(1500);
        driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler")).click();
        driver.findElement(By.cssSelector("input[name='user[first_name]']")).sendKeys("Techno");
        driver.findElement(By.cssSelector("input[name='user[first_name]']")).sendKeys("Study");
        driver.findElement(By.cssSelector("input[name='user[first_name]']")).sendKeys("technostudy@gmail.com");


    }
}

package Gun07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Deneme {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");


        List<WebElement> userlist = driver.findElements(By.xpath("//div[@class='login_credentials']"));
//        userlist.add(driver.findElement(By.xpath("//div[@id='login_credentials']/text()[2]")));
//        userlist.add(driver.findElement(By.xpath("//div[@id='login_credentials']/text()[3]")));
//        userlist.add(driver.findElement(By.xpath("//div[@id='login_credentials']/text()[4]")));
//        userlist.add(driver.findElement(By.xpath("//div[@id='login_credentials']/text()[5]")));

        System.out.println(userlist);

//*[@id="login_credentials"]/text()[1]

    }
}

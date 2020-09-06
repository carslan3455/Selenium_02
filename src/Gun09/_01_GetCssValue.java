package Gun09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_GetCssValue {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.snapdeal.com/");

        WebElement buton = driver.findElement(By.id("inputValEnter"));
        // todo tag in içdeki keylerin değerlerini almamızı sağlar
        System.out.println(buton.getAttribute("name"));
        System.out.println(buton.getAttribute("type"));
        System.out.println(buton.getAttribute("class"));

        WebElement butonAra = driver.findElement(By.className("searchformButton"));
        // todo Elemanın CSS yani ekranda gözüken tüm özelliklerini; font renk vs ulaşmamızı sağlar
        // Mesela ekrana kirmizi bir uyari mesaji cikmasi gerekiyor. bu sekilde test edilebilir
        System.out.println(butonAra.getCssValue("color"));
        System.out.println(butonAra.getCssValue("font-size"));
        System.out.println(butonAra.getCssValue("background"));


        Thread.sleep(3000);
        driver.quit();


    }
}

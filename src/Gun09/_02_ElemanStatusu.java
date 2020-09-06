package Gun09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_ElemanStatusu {
    /* todo
    boolean isSelected(); -> seçili mi?                 checkbox, radiobutton
    boolean isEnabled();  -> Kullanılabiliyor mu?
    boolean isDisplayed(); -> Görünüyor mu?

    isEnabled
    Monday -> true
    Sunday -> false

    isSelected();
    Tuesday -> true
    Thursday -> false


    isDisplayed();
    Monday -> true
    Sunday -> true
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        Thread.sleep(1500);
        WebElement sali = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        System.out.println(sali.isDisplayed());
        System.out.println(sali.isEnabled());
        System.out.println(sali.isSelected());
        sali.click();
        Thread.sleep(3000);

        System.out.println(sali.isSelected());


        WebElement pazar = driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-input"));
        System.out.println(pazar.isDisplayed());


        Thread.sleep(3000);
        driver.quit();



    }
}

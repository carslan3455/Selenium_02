package Gun09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_IsDisplayed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies(); // sitelerin bizim bilgilerimizi tutarak
        // bazen engel çıkardığı cookies leri sildik.


        //yeni hesap butonuna tıklattım
        WebElement yeniKayitButonu = driver.findElement(By.cssSelector("a[id^='u_'][id$='_2']"));
        yeniKayitButonu.click();
        Thread.sleep(1500);

        WebElement eMail = driver.findElement(By.cssSelector("input[id^='u_'][id$='_g']"));
        WebElement onayEmail = driver.findElement(By.cssSelector("input[id^='u_'][id$='_j']"));

        System.out.println(onayEmail.isDisplayed());
        eMail.sendKeys("techno@study.com");
        Thread.sleep(1000);

        System.out.println(onayEmail.isDisplayed());
        onayEmail.sendKeys("techno@study.com");

        // todo burada ilk email girmeden onay mail kutusu gorunmuyor ilk mail girilince aktif oluyor.
        // onun icin giris yapilmadan once onay kutusu var mi yok mu diye kontrol yaptik. girildikten sonra true
        // girilmeden once false oluyor


    }
}

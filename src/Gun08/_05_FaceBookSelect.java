package Gun08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _05_FaceBookSelect {
    /*
   todo Senaryo
   1- https://www.facebook.com/ sitesine giriniz.
   2- Yeni hesap oluştura tıklayınız.
   3- Formdaki tüm bilgileri giriniz.

    Özet Bilgi
u_1_2
u_2_2
u_3_2
u_4_2
u_6_2

u_ başlıyor
_2 bitiyor

a[id^='u_'][id$='_2']

CSS de
^ -> ile başlayan
$ -> ile biten
* -> içinde geçen

Xpath
//a[starts-with(@id,'u_')] -> ile başlayan
//a[ends-with(@id,'_2')]    -> ile biten
//a[contains(@id,'u_')]    -> içinde geçen

    */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");


        WebElement yeniKayitButonu = driver.findElement(By.cssSelector("a[id^='u_'][id$='_2']"));
        // xpath icin  3. elemana ulasmasi gerekiyor... bu kod ile  (//a[starts-with(@id,'u_')])[3]
        yeniKayitButonu.click();
        Thread.sleep(1500);

        WebElement isim = driver.findElement(By.cssSelector("input[id^='u_'][id$='_b']"));
        isim.sendKeys("Techno");

        WebElement soyad = driver.findElement(By.cssSelector("input[id^='u_'][id$='_d']"));
        soyad.sendKeys("Study");

        WebElement eMail = driver.findElement(By.cssSelector("input[id^='u_'][id$='_g']"));
        eMail.sendKeys("techno@study.com");

        Thread.sleep(1000);
        WebElement onayEmail = driver.findElement(By.cssSelector("input[id^='u_'][id$='_j']"));
        onayEmail.sendKeys("techno@study.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='password_step_input']"));
        password.sendKeys("techno.12345");




        WebElement day = driver.findElement(By.cssSelector("#day"));
        Select gun = new Select(day);
        gun.selectByValue("17");

        Thread.sleep(500);
        WebElement mounths = driver.findElement(By.cssSelector("#month"));
        Select ay = new Select(mounths);
        ay.selectByValue("9");

        Thread.sleep(500);
        WebElement years = driver.findElement(By.cssSelector("#year"));
        Select yil = new Select(years);
        yil.selectByValue("1982");

        Thread.sleep(500);

        driver.findElement(By.xpath("//label[text()='Weiblich']")).click();
        //driver.findElement(By.cssSelector("input[id^='u_'][id$='_4']")).click();
        //input._8esa[id^=u_][value='1']

        Thread.sleep(500);

      //  driver.findElement(By.cssSelector("button[id^='u_'][id$='_s']")).click();
        // kayit sartlari uymazsa hata veriyor. Onun icin butona bastirmiyoruz



        Thread.sleep(3000);
       // driver.quit();
    }
}

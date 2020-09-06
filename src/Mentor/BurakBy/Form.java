package Mentor.BurakBy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Form {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jotform.com/202422515857050");
        JavascriptExecutor js =(JavascriptExecutor) driver;    // todo sayfayi kaydirmak icin ScrollDown kodudur.

        Thread.sleep(1000);

        WebElement ad = driver.findElement(By.xpath("//input[@id='first_6']"));
        ad.sendKeys("Techno");

        WebElement soyad = driver.findElement(By.xpath("//input[@id='last_6']"));
        soyad.sendKeys("Study");

        WebElement eMail = driver.findElement(By.xpath("//input[@id='input_12']"));
        eMail.sendKeys("techno@study.com");

        WebElement yas = driver.findElement(By.xpath("//input[@id='input_10']"));
        yas.sendKeys("38");
        js.executeScript("window.scrollBy(0,600)");     // todo sayfayi kaydirmak icin kullanilan kod

        if (yas.isEnabled()){           //     (!yas.isEnabled())  degildir olarakda kullanilabiliyor  else de eklenebilir
            System.out.println("YAS KUTUSU MEVCUTTUR.\n");
        }

        WebElement hobi = driver.findElement(By.xpath("//select[@id='input_11']"));
        hobi.click();
        Thread.sleep(2000);

        WebElement hobiSec = driver.findElement(By.xpath("//option[@value='Diğer']"));
        hobiSec.click();


       // List<WebElement> dersSaati = driver.findElements(By.xpath("//span[@class='form-radio-item']"));   // liste icin
        WebElement dersSaati = driver.findElement(By.xpath("//label[@id='label_input_14_3']"));
        dersSaati.click();
        Thread.sleep(1000);

        if (dersSaati.isSelected()){
            System.out.println("Kac saat ders calistigi secildi...");
        }

     //   List<WebElement> derseEngeller = driver.findElements(By.xpath("//span[@class='form-checkbox-item']"));   //
        WebElement derseEngel = driver.findElement(By.xpath("//label[@id='label_input_16_0']"));
        derseEngel.click();

        js.executeScript("window.scrollBy(0,600)");     // todo sayfayi kaydirmak icin kullanilan kod
        WebElement puan = driver.findElement(By.xpath("//input[@id='1599146075783-number']"));
        puan.sendKeys("10");

        WebElement formBitir = driver.findElement(By.xpath("//button[@id='input_2']"));
        formBitir.click();


        WebElement mesaj = driver.findElement(By.xpath("//h1[text()='Teşekkürler!']"));
        // //h1[@style='text-align:center;']   //h1(contains[text(),'Teşekkürler!'])

        if (mesaj.isEnabled()){

            System.out.println("TESEKKUR YAZISI GORULDU");
        }



        Thread.sleep(1000);
        driver.quit();






    }
}

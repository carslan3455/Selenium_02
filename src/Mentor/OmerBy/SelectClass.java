package Mentor.OmerBy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://form.jotform.com/202468401801346");
        Thread.sleep(1000);
        JavascriptExecutor js =(JavascriptExecutor) driver;    // todo sayfayi kaydirmak icin ScrollDown kodudur.

        WebElement ad = driver.findElement(By.cssSelector("input[id='first_4']"));
        ad.sendKeys("Techno");

        WebElement soyad = driver.findElement(By.cssSelector("input[id='last_4"));
        soyad.sendKeys("Study");

        WebElement  element = driver.findElement(By.cssSelector("select#input_14"));
        Select select = new Select(element);
        select.selectByVisibleText("Hukuk Fakültesi");

        element=driver.findElement(By.xpath("//select[@id='input_20']"));
        select=new Select(element);

        select.selectByIndex(3);

        WebElement telkodu = driver.findElement(By.xpath("input#input_12_area"));
        telkodu.sendKeys("+49");


        WebElement tel = driver.findElement(By.xpath("input#input_12_phone"));
        tel.sendKeys("176343434");

        WebElement mail = driver.findElement(By.xpath("//input[@name='q5_email']"));
        mail.sendKeys("techno@study.com");


//        WebElement  adres1=driver.findElement(By.xpath("//input[@name='q3_address3[addr_line1]']"));
//        adres1.sendKeys("Yildirim sk");

        driver.findElement(By.cssSelector("#input_3_addr_line1")).sendKeys("krefeld");
        js.executeScript("window.scrollBy(0,600)");
        driver.findElement(By.cssSelector("#input_3_addr_line2")).sendKeys("westpark");
        driver.findElement(By.cssSelector("#input_3_city")).sendKeys("duseldorf");
        driver.findElement(By.cssSelector("#input_3_state")).sendKeys("krefeld");
        driver.findElement(By.cssSelector("#input_3_postal")).sendKeys("47799");


        element=driver.findElement(By.cssSelector("#input_3_country"));
        select=new Select(element);
        select.selectByValue("Germany");

        WebElement bursduzeyi = driver.findElement(By.xpath("//select[@id='input_11']"));
        bursduzeyi.click();
        Thread.sleep(1000);

       select = new Select(bursduzeyi);

        List<WebElement>  burs = select.getOptions();

        int optionSayisi = burs.size();

        int random = (int)((Math.random()*optionSayisi)+1);
        select.selectByIndex(random);

        WebElement dogumgunu = driver.findElement(By.xpath("//select[@id='input_19']"));
        dogumgunu.click();
        Thread.sleep(1000);

        WebElement dgSecim = driver.findElement(By.xpath("//option[@value='10']"));
        dgSecim.click();


        element=driver.findElement(By.cssSelector("#input_21"));
        select=new Select(element);
        select.selectByValue("Internet");

        element=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        element.click();


        String gelenMesaj = driver.findElement(By.xpath("//p[text()='Your submission has been received.']")).getText();
        String beklenenMesaj = "Your submission has been received.";

        Assert.assertEquals("Formda eksik alanlar var",beklenenMesaj,gelenMesaj);

        System.out.println("Formunuz eksiksiz doldurulmustur.....");

        /*
        String secondUrl = driver.getCurrentUrl();
        System.out.println("ikinci sayfanın URl'i :  " + secondUrl);

        // sayfanın Url ine göre test
        Assert.assertEquals("https://submit.jotformeu.com/submit/202468401801346/",driver.getCurrentUrl());


        String actualResult = driver.findElement(By.xpath("//div[@id='stage']//h1")).getText();
        Assert.assertTrue("Hata...", actualResult.contentEquals("Thank You!"));

         */

    }
}

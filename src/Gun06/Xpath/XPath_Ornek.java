package Gun06.Xpath;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Ornek {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        Thread.sleep(1500);
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='<- Back']")).click();


        Thread.sleep(1500);
        driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='<- Back']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Techno");


        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Study");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("51370");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();

        String price1Txt = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]")).getText();
        String price2Txt = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[2]")).getText();
        String itemTotalTxt = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']")).getText();

        double price1 = stringToDouble(price1Txt);
        double price2 = stringToDouble(price2Txt);


        double totalPrice = (price1 + price2);


      //  Assert.assertEquals("Tutar Hatali", totalPrice, stringToDouble(itemTotalTxt));
        Assert.assertTrue(totalPrice==stringToDouble(itemTotalTxt));

        System.out.println("*** Alisverisiniz Sorunsuz bir sekilde Tamamlanmistir ***");

        Thread.sleep(1000);
        driver.quit();




    }


    public static double stringToDouble(String strTutar){

        double tutar = 0;

       // String duzenleStr = strTutar.replaceAll("[^0-9.]", "");

        String duzenleStr = strTutar.replaceAll("[^\\d.]", "");
        // d yani sayı ve . haricindekileri(^) , bosluk ata yani sil

        return  Double.parseDouble(duzenleStr);
    }
}
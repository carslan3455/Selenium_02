package Gun08;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class _2_UrunleriListeleKiyasla {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(1000);

        List<WebElement> urunList1 = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        List<String> list1 = new ArrayList<>();

        for (WebElement u : urunList1) {
            list1.add(u.getText());

        }


        List<WebElement> urunEkle = driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));

        for (WebElement u : urunEkle) {
            u.click();
            Thread.sleep(500);
        }

        driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
        Thread.sleep(1500);

        List<WebElement> urunList2 = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        List<String> list2 = new ArrayList<>();

        for (WebElement u : urunList2) {
            list2.add(u.getText());

        }


        int esitSayisi = 0;
        for (int i = 0; i < list1.size(); i++) {
            // 1.Yöntem
            if (list1.get(i).equals(list2.get(i))) {
                esitSayisi++;
            } else
                Assert.assertEquals("Ürünler esit degil", list1.get(i), list2.get(i));

              //2.Yöntem
            //  Assert.fail("Ürün adlari esit degil= " + list1.get(i) + " " + list2.get(i));

        }

        System.out.println("Urun sayisi: " + list1.size() + " Esit urun sayisi: " + esitSayisi);

        Thread.sleep(1500);
        driver.quit();


    }
}

package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesTest extends TestBase {


    public void giris(){
        driver.get("http://fhctrip-qa.com/admin/HotelRoomAdmin");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!" + Keys.ENTER);
    }

    @Test
    public void table(){
        giris();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement elemanlar = driver.findElement(By.xpath("//tbody"));
        System.out.println(elemanlar.getText());

        List<WebElement> basliklar = driver.findElements(By.xpath("//thead/tr/th"));
        for (WebElement eleman : basliklar) {
            System.out.println(eleman.getText());
        }

    }

    @Test
    public void tumSatirlar(){
        giris();

        List<WebElement> tumSatirlar = driver.findElements(By.xpath("//tbody/tr"));
        for (WebElement satir : tumSatirlar) {
            System.out.println(satir.getText());
        }
    }

    @Test
    public void hucre(){
        giris();

        List<WebElement> hucreler = driver.findElements(By.xpath("//tbody/tr/td"));
        for (WebElement hucre : hucreler) {
            System.out.println(hucre.getText());
        }
    }

    @Test
    public void name(){
        giris();

        List<WebElement> name = driver.findElements(By.xpath("//tbody/tr/td[4]"));
        for (WebElement isimler : name) {
            System.out.println(isimler.getText());
        }
    }

    public void satirSutun(int satir, int sutun){
        String hucreBul = "//tbody/tr[" + satir + "]/td[" + sutun + "]";
        WebElement hucre = driver.findElement(By.xpath(hucreBul));
        System.out.println(hucre.getText());
    }

    @Test
    public void noktaAtisi(){
        giris();
        satirSutun(3,4);
        satirSutun(2,6);
        satirSutun(1,1);
        satirSutun(2,5);



    }

}

package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Ornek_WebTable extends TestBase {

    public void giris(){
        driver.get("http://fhctrip-qa.com/admin/HotelRoomAdmin");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!" + Keys.ENTER);
    }

    @Test
    public void test1(){
        giris();

        List<WebElement> satirSayisi = driver.findElements(By.xpath("//tbody/tr"));
        System.out.println(satirSayisi.size());

        List<WebElement> ucuncu = driver.findElements(By.xpath("//tbody/tr[3]"));
        for (WebElement uc : ucuncu) {
            System.out.println(uc.getText());
        }
    }
}

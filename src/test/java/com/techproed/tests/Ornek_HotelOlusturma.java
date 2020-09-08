package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ornek_HotelOlusturma extends TestBase {

    @BeforeMethod
    public void girisTest(){
        driver.get("http://www.fhctrip-qa.com/admin/HotelAdmin/Create");
        WebElement userName = driver.findElement(By.id("UserName"));
        userName.sendKeys("manager2");
        WebElement passWord = driver.findElement(By.id("Password"));
        passWord.sendKeys("Man1ager2!" + Keys.ENTER);
    }

    @Test
    public void HotelCreate(){
        driver.findElement(By.id("Code")).sendKeys("asdasdasd");
        driver.findElement(By.id("Name")).sendKeys("Mustafa");
        driver.findElement(By.id("Address")).sendKeys("Cumhuriyet Mahallesi no: 1234");
        driver.findElement(By.id("Phone")).sendKeys("05964030202");
        driver.findElement(By.id("Email")).sendKeys("asd.asd@gmail.com");
        WebElement dropDown = driver.findElement(By.id("IDGroup"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Hotel Type1");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("btnSubmit")).click();

       // WebElement basariliYazisi = driver.findElement(By.className("bootbox-body"));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement basariliYazisi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bootbox-body")));
        Assert.assertTrue(basariliYazisi.isDisplayed());




    }

}

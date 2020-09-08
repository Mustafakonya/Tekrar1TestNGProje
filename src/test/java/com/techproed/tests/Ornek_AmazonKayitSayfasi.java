package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ornek_AmazonKayitSayfasi extends TestBase {

    @Test
    public void Test01(){
        driver.get("http:/amazon.com");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
        WebElement start = driver.findElement(By.partialLinkText("Start here"));
        start.click();
        Assert.assertTrue(driver.getTitle().equals("Amazon Registration"));

    }

    @Test
    public void Test02(){
        driver.get("http:/amazon.com");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
        WebElement start = driver.findElement(By.partialLinkText("Start here"));
        start.click();

        WebElement isim = driver.findElement(By.id("ap_customer_name"));
        isim.sendKeys("Mustafa");
        WebElement email = driver.findElement(By.id("ap_email"));
        email.sendKeys("asdaas");
        WebElement pass = driver.findElement(By.id("ap_password"));
        pass.sendKeys("1234356");
        WebElement pass2 = driver.findElement(By.id("ap_password_check"));
        pass2.sendKeys("1234356");
    }


}

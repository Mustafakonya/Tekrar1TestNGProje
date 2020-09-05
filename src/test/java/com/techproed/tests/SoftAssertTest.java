package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class SoftAssertTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @Test
    public void Test02() {
        driver.get("http:/a.testaddressbook.com/sign_in");

        SoftAssert softAssert = new SoftAssert();
        WebElement email = driver.findElement(By.id("session_email"));
        email.sendKeys("testtechproed@gmail.com");
        softAssert.assertTrue(email.getText().equals("testtechproed@gmail.com"));

        WebElement sifre = driver.findElement(By.id("session_password"));
        sifre.sendKeys("Test1234!");
        softAssert.assertTrue(sifre.getText().equals("testtechproed@gmail.com"));


        WebElement signIn = driver.findElement(By.name("commit"));
        signIn.click();

        WebElement signOut = driver.findElement(By.partialLinkText("Sign out"));
        boolean gorunuyorMu = signOut.isDisplayed();

        softAssert.assertAll();


    }
}

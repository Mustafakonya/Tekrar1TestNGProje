package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownloadTest extends TestBase {

    @Test
    public void dosyaVarMi(){
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));

        String kullaniciDosyaYolu = System.getProperty("user.dir");

        String pomXmlDosyaYolu = kullaniciDosyaYolu + "/pom.xml";

        boolean varMi = Files.exists(Paths.get(pomXmlDosyaYolu));

        Assert.assertTrue(varMi);
    }

    @Test
    public void dosyaUpload(){
        driver.get("http:/the-internet.herokuapp.com/upload");

        WebElement element = driver.findElement(By.id("file-upload"));
        element.sendKeys("/Users/admin/Desktop/Techproed/logo.png");

        WebElement upload = driver.findElement(By.id("file-submit"));
        upload.click();

        WebElement h3 = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(h3.isDisplayed());
    }

    @Test
    public void dosyaDownload(){
        driver.get("http:/the-internet.herokuapp.com/download");
        ///Users/admin/Downloads/logo5.png
        WebElement logo = driver.findElement(By.partialLinkText("logo5.png"));
        logo.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean varMi = Files.exists(Paths.get("/Users/admin/Downloads/logo5.png"));
        Assert.assertTrue(varMi);
    }



}

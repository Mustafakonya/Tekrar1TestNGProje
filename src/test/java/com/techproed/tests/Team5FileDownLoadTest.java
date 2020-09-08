package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Team5FileDownLoadTest extends TestBase {

    @Test
    public void dosyaVarMi(){
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));

        String dosyaYolu = System.getProperty("user.dir");
        String pomXml = dosyaYolu + "/pom.xml";

        boolean varmi = Files.exists(Paths.get(pomXml));

        Assert.assertTrue(varmi);

    }

    @Test
    public void Upload(){
        driver.get("http:/the-internet.herokuapp.com/upload");

        WebElement element = driver.findElement(By.id("file-upload"));
        element.sendKeys("/Users/admin/Downloads/musterbrief-vorlage-mietvertrag-kuendigung.pdf");
        WebElement upload = driver.findElement(By.id("file-submit"));
        upload.click();

        WebElement dogrulama = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(dogrulama.isDisplayed());
    }

    @Test
    public void Download(){
        driver.get("http:/the-internet.herokuapp.com/download");
        ///Users/admin/Downloads/logo5.png
        WebElement logo = driver.findElement(By.partialLinkText("logo5.png"));
        logo.click();


    }

}

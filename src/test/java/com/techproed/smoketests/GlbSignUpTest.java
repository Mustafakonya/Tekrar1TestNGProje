package com.techproed.smoketests;

import com.techproed.pages.GlbSignUpPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class GlbSignUpTest {

    @Test
    public void test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_login"));

        GlbSignUpPage glbSignUpPage = new GlbSignUpPage();
        glbSignUpPage.emailKutusu.sendKeys(ConfigurationReader.getProperty("glb_email"));
        glbSignUpPage.nameKutusu.sendKeys(ConfigurationReader.getProperty("glb_name"));
        glbSignUpPage.mobileKutusu.sendKeys(ConfigurationReader.getProperty("glb_phone"));
        glbSignUpPage.passwordKutusu.sendKeys(ConfigurationReader.getProperty("glb_sifre"));
        glbSignUpPage.rePasswordKutusu.sendKeys(ConfigurationReader.getProperty("glb_sifre"));
        glbSignUpPage.signUpButonu.click();

        System.out.println(glbSignUpPage.basariliYazisi.getText());
        boolean dogruMu = glbSignUpPage.basariliYazisi.isDisplayed();
        Assert.assertTrue(dogruMu);
    }

    @AfterClass
    public void tearDown(){

        Driver.closeDriver();
    }

}

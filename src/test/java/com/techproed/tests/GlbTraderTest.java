package com.techproed.tests;

import com.techproed.pages.GlbTraderPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import com.techproed.utilities.TestBaseFinal;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.jvm.hotspot.jdi.ConcreteMethodImpl;

public class GlbTraderTest extends TestBaseFinal {

    @Test
    public void test1(){

        extentTest = extentReports.createTest("GlbTrader Test", "We compare the titles of product and the title of page");

        extentTest.info("We go to the link");
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_link"));

        extentTest.info("We create an object from GlbTraderPage Class");
        GlbTraderPage glbTraderPage = new GlbTraderPage();

        extentTest.info("We create an object from Select Class");
        Select select = new Select(glbTraderPage.searchCategory);

        extentTest.info("We select the product of on 6. index");
        select.selectByIndex(6);

        extentTest.info("We search 'camera'");
        glbTraderPage.searchBox.sendKeys(ConfigurationReader.getProperty("product_name") + Keys.ENTER);

        extentTest.info("We take title of the products and click the product of on 1. index");
        String productTitle = glbTraderPage.listem.get(1).getText();
        glbTraderPage.listem.get(1).click();

        extentTest.info("We wait 2 seconds");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("We take title of the page");
        String title = Driver.getDriver().getTitle();

        extentTest.info("We verify the Webelements with Assert");
        Assert.assertEquals(title, productTitle);




    }

}

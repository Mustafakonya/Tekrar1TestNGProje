package com.techproed.smoketests;

import com.techproed.pages.FhcTripHotelRoomCreatePage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FhcTripHotelRoomCreateTest extends TestBase {

    public void giris(){
        driver.get("http://fhctrip-qa.com/admin/HotelroomAdmin/Create");
        driver.findElement(By.id("UserName")).sendKeys(ConfigurationReader.getProperty("username"));
        driver.findElement(By.id("Password")).sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);
    }
    @Test
    public void test1(){
        driver.get(ConfigurationReader.getProperty("room_create_url"));
        giris();

        FhcTripHotelRoomCreatePage fhcTripHotelRoomCreatePage = new FhcTripHotelRoomCreatePage(driver);

        Select select = new Select(fhcTripHotelRoomCreatePage.idHotelDropDown);
        select.selectByIndex(3);

        fhcTripHotelRoomCreatePage.codeKutusu.sendKeys("1234");
        fhcTripHotelRoomCreatePage.nameKutusu.sendKeys("Mustafa");
        fhcTripHotelRoomCreatePage.locationKutusu.sendKeys("Moutier");
        fhcTripHotelRoomCreatePage.descriptionKutusu.sendKeys("asdqewrfsa");

        Actions actions = new Actions(driver);
        actions.dragAndDrop(fhcTripHotelRoomCreatePage.price500, fhcTripHotelRoomCreatePage.priceKutusu).perform();

        Select select1 = new Select(fhcTripHotelRoomCreatePage.idHotelDropDown);
        select.selectByIndex(2);

        fhcTripHotelRoomCreatePage.maxAdult.sendKeys("2");
        fhcTripHotelRoomCreatePage.maxChild.sendKeys("4");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        fhcTripHotelRoomCreatePage.save.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(fhcTripHotelRoomCreatePage.basariliYazisi.getText());

        boolean varMi = fhcTripHotelRoomCreatePage.basariliYazisi.isDisplayed();

                Assert.assertTrue(varMi);


    }


}

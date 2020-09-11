package com.techproed.tests;

import com.techproed.pages.FhcTripHotelCreatePage;
import com.techproed.pages.FhcTripLoginPage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FhcTripHotelCreateTest extends TestBase {

    public void giris(){
        driver.get("http://fhctrip-qa.com/admin/HotelAdmin/Create");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!"+ Keys.ENTER);
    }


    @Test
    public void test(){
        giris();

        FhcTripHotelCreatePage fhcTripHotelCreatePage = new FhcTripHotelCreatePage(driver);
        fhcTripHotelCreatePage.code.sendKeys("12342341");
        fhcTripHotelCreatePage.name.sendKeys("Mustafa");
        fhcTripHotelCreatePage.address.sendKeys("Chemin");
        fhcTripHotelCreatePage.phone.sendKeys("32445455463");
        fhcTripHotelCreatePage.email.sendKeys("asd@edad.com");

        Select select = new Select(fhcTripHotelCreatePage.idGroup);
        select.selectByIndex(2);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        fhcTripHotelCreatePage.submit.click();




    }

}

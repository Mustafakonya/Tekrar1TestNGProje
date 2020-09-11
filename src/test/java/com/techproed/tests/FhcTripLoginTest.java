package com.techproed.tests;

import com.techproed.pages.FhcTripLoginPage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FhcTripLoginTest extends TestBase {

    @Test
    public void aramaTEsti(){
        driver.get("http://fhctrip-qa.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin");

        FhcTripLoginPage fhcTripLoginPage = new FhcTripLoginPage(driver);
        fhcTripLoginPage.userName.sendKeys("manager2");
        fhcTripLoginPage.password.sendKeys("Man1ager2!");
        fhcTripLoginPage.logIn.click();
    }

}

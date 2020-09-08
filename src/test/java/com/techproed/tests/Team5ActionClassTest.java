package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Team5ActionClassTest extends TestBase {

    @Test
    public void buyukKucukYazma(){
        driver.get("http:/google.com");

        WebElement element = driver.findElement(By.name("q"));
        //element.sendKeys("ah Selenieum ah");

        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("ah selenium ah").perform();

    }

}

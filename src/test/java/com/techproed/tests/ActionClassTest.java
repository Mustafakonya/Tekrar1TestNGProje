package com.techproed.tests;

import com.techproed.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassTest extends TestBase {

    @Test
    public void sagTikla(){
        driver.get("https://the-internet.herokuapp.com/context_menu");

        WebElement element = driver.findElement(By.id("hot-spot"));

        Actions actions = new Actions(driver);
        actions.contextClick(element).perform();

    }

    @Test
    public void cifttiklama(){
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");

        WebElement eleman = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(eleman).perform();



    }

    @Test
    public void hoverOver(){
        driver.get("http:/amazon.com");
        WebElement asd = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(asd).perform();

    }

    @Test
    public void asagiYukari(){
        driver.get("http:/amazon.com");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actions.sendKeys(Keys.END);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actions.sendKeys(Keys.PAGE_UP);

    }

    @Test
    public void buyukKucukYazma(){
        driver.get("http:/google.com");
        WebElement arama = driver.findElement(By.name("q"));
        // arama.sendKeys(Keys.SHIFT + "merhaba nasilsiniz");

        Actions actions = new Actions(driver);
        actions.moveToElement(arama).click()
                .keyDown(Keys.SHIFT).sendKeys("Merhaba")
                .keyUp(Keys.SHIFT).sendKeys(" nasilsiniz")
                .perform();

    }

    @Test
    public void dragAndDrop(){
        driver.get("http:/google.com");
        WebElement arama = driver.findElement(By.name("q"));
        WebElement logo = driver.findElement(By.id("hplogo"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(logo, arama).perform();
    }


}

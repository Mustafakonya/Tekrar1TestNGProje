package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleTest extends TestBase {

    @Test
    public void cokluPencereTest(){
        driver.get("http:/the-internet.herokuapp.com/windows");

        String sayfaninHandle = driver.getWindowHandle();
        System.out.println(sayfaninHandle);

        driver.findElement(By.partialLinkText("Click Here")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        Set<String> tumPencereler = driver.getWindowHandles();
//        for (String w : tumPencereler) {
//            System.out.println(w);
//        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Object[] arr = (Object[]) tumPencereler.toArray();
        String ikinciSayfaninHndle = arr[arr.length-1].toString();
        System.out.println(ikinciSayfaninHndle);

        driver.switchTo().window(sayfaninHandle);



    }
}

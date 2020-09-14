package com.techproed.pages;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FhcTripHotelRoomCreatePage{

    WebDriver driver;

    public FhcTripHotelRoomCreatePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "IDHotel")
    public WebElement idHotelDropDown;

    @FindBy(id = "Code")
    public WebElement codeKutusu;

    @FindBy(id = "Name")
    public WebElement nameKutusu;

    @FindBy(id = "Location")
    public WebElement locationKutusu;

    @FindBy(xpath = "//textarea[@dir='ltr']")
    public WebElement descriptionKutusu;

    @FindBy(id = "Price")
    public WebElement priceKutusu;

    @FindBy(partialLinkText = "500")
    public WebElement price500;

    @FindBy(id = "IDGroupRoomType")
    public WebElement roomType;

    @FindBy(id = "MaxAdultCount")
    public WebElement maxAdult;

    @FindBy(id = "MaxChildCount")
    public WebElement maxChild;

    @FindBy(id = "IsAvailable")
    public WebElement approved;

    @FindBy(id = "btnSubmit")
    public WebElement save;

    @FindBy(xpath = "//*[.='HotelRoom was inserted successfully']")
    public WebElement basariliYazisi;



}

package com.techproed.pages;
import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Homework_HotelReservationPage {
    public Homework_HotelReservationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="btnSubmit")
    public WebElement saveButton;
}

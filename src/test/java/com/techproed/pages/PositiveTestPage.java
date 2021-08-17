package com.techproed.pages;
import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PositiveTestPage {
    public PositiveTestPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//*[@id='navLogon']")
    public WebElement login;
    @FindBy(id="UserName")
    public WebElement username;
    @FindBy(id="Password")
    public WebElement password;
    @FindBy(id="btnSubmit")
    public WebElement submitbutton;
    @FindBy(xpath="//ul[@class='sub-menu']")
    public WebElement listOfUsers;
    @FindBy(id="divMessageResult")
    public WebElement errorMessage;
    @FindBy(linkText="Hotel Management")
    public WebElement hotelManagement;
    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRooms;
    @FindBy(xpath = "(//span)[1]")
    public WebElement userID;
}
package com.techproed.tests;
import com.techproed.pages.Day12_HotelRoomPage;
import com.techproed.pages.Homework_HotelReservationPage;
import com.techproed.pages.PositiveTestPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Homework_HotelReservationCreation {
    PositiveTestPage positiveTestPage=new PositiveTestPage();
    Day12_HotelRoomPage hotelRoomPage = new Day12_HotelRoomPage();
    Homework_HotelReservationPage homework_hotelReservationPage;
    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("application_login_url"));
        positiveTestPage.username.sendKeys(ConfigReader.getProperty("admin_username"));
        positiveTestPage.password.sendKeys(ConfigReader.getProperty("admin_password"));
        // click on log in button
        positiveTestPage.submitbutton.click();
        Assert.assertTrue(positiveTestPage.listOfUsers.isDisplayed());
    }
    @Test
    public void hotelRoomCreation() {
        //Test Case:
//Click on Hotel Management
        positiveTestPage.hotelManagement.click();
//Click on Hotel Rooms
        positiveTestPage.hotelRooms.click();
//Click on Add Hotel Room
        hotelRoomPage.addHotelRoomButton.click();
//Enter All required fields
        Select select = new Select(hotelRoomPage.hotelIdDropdown);
        select.selectByIndex(2);
        hotelRoomPage.code.sendKeys("discount code");
        hotelRoomPage.name.sendKeys("Ali");
        hotelRoomPage.location.sendKeys("Oklahoma");
        hotelRoomPage.description.sendKeys("This is the best room for special guest");
        hotelRoomPage.price.sendKeys("$1000");
        //click on save button
        homework_hotelReservationPage.saveButton.click();
        //Verify the z
    }}
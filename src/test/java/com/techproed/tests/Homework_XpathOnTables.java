package com.techproed.tests;
import com.techproed.pages.PositiveTestPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class Homework_XpathOnTables {
    PositiveTestPage positiveTestPage;
    @Test
    public void findxPath(){
        //HOMEWORK DUE TOMORROW : Homework:
        //Go to https://qa-environment.resortsline.com/admin/HotelRoomAdmin
        Driver.getDriver().get(ConfigReader.getProperty("application_for_xpath"));
        positiveTestPage = new PositiveTestPage();
        positiveTestPage.username.sendKeys(ConfigReader.getProperty("admin_username"));
        positiveTestPage.password.sendKeys(ConfigReader.getProperty("admin_password"));
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        //Write xpath to find all td on row 4
        Driver.getDriver().findElement(By.xpath("//table//tbody//tr[3]"));
        //Write xpath to find 6th row 4th data
        System.out.println(Driver.getDriver().findElement(By.xpath("//table//tbody//tr[5]//td[4]")).getText());
        //Write xpath to find all 6th COLUMN data
        System.out.println(Driver.getDriver().findElement(By.xpath("//table//tbody//tr//td[6]")).getText());
    }
}

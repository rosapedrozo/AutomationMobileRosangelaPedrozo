package tests;

import io.appium.java_client.FindsByAccessibilityId;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.springframework.context.annotation.Description;

import screens.AddsPlansOption;
import screens.DashBoardScreen;
import screens.CategoryList;
import util.tests.BaseMobileTest;

import java.util.NoSuchElementException;

public class AddsPlansOptionTest extends BaseMobileTest {

    @Description(value = "Find reserve dining option test ID:0003")
    @Test()
    public void FindTest() {
        log.info("Starting Find dining option test");
        DashBoardScreen dashBoard = dismissTutorial();
        dashBoard.clickOnAddButton();
        AddsPlansOption addsPlansOption = new AddsPlansOption(driver);
        Assert.assertEquals(true,addsPlansOption.isreservediningoptionavailable());

    }
}


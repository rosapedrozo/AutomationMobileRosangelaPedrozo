package tests;

import io.appium.java_client.FindsByAccessibilityId;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.springframework.context.annotation.Description;

import screens.DashBoardScreen;
import screens.CategoryList;
import util.tests.BaseMobileTest;

import java.util.NoSuchElementException;

public class CategoryListTest extends BaseMobileTest {

    @Description(value = "Find hotel category test ID:0002")
    @Test()
    public void FindHotelCategoryTest() {
        log.info("Starting Find hotel category test");
        DashBoardScreen dashBoard = dismissTutorial();
        dashBoard.clickOnMapButton();
        CategoryList categoryList = new CategoryList(driver);
        categoryList.clickingcategorylistbuttons();
        Assert.assertEquals(true,categoryList.ishoteloptionavailable());

        }
    }
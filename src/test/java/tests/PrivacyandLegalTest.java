package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.springframework.context.annotation.Description;

import screens.DashBoardScreen;
import screens.PrivacyandLegal;
import util.tests.BaseMobileTest;

public class PrivacyandLegalTest extends BaseMobileTest {

    @Description(value = "Validate List of options test ID:0004")
    @Test()
    public void ValidateListOfOptionsTest() {
        log.info("Starting Validate List of options test");
        DashBoardScreen dashBoard = dismissTutorial();
        dashBoard.clickOnMenuButton();
        PrivacyandLegal privacyandLegal = new PrivacyandLegal(driver);
        privacyandLegal.scrollDown(5);
        privacyandLegal.clickingprivacyandlegalbutton();
        Assert.assertEquals(true,privacyandLegal.isprivacypolicyoptionavailable());
        Assert.assertEquals(true,privacyandLegal.istermsofuseoptionavailable());
        Assert.assertEquals(true,privacyandLegal.issupplementaltermsandconditionsoptionavailable());
        Assert.assertEquals(true,privacyandLegal.legalnoticesoptionavailable());
        Assert.assertEquals(true,privacyandLegal.ispropertyrulesoptionavailable());
        Assert.assertEquals(true,privacyandLegal.iselectroniccommunicationdisclosureoptionavailable());

    }
}

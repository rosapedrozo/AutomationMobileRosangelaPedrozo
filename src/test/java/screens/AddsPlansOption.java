package screens;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;

// TODO: Auto-generated Javadoc
/**
 * DashBoard screen.
 *
 * @author Hans.Marquez
 *
 */
public class AddsPlansOption extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver the driver
     * @author Rosangela.pedrozo
     */
    public AddsPlansOption(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * The Reserve Dining button.
     */
    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Reserve Dining, 2 of 5, button\"]/android.widget.LinearLayout")
    private AndroidElement ReserveDiningButton;

    public boolean isreservediningoptionavailable(){
        return isElementAvailable(ReserveDiningButton);
    }
    /**
     * Alert control.
     */
    @Override
    public void alertControl() {
        // TODO Auto-generated method stub

    }

}
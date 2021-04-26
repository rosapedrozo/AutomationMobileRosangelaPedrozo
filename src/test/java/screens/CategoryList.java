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
public class CategoryList  extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver the driver
     * @author Rosangela.pedrozo
     */
    public CategoryList(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }


    /**
     * The Attractions button.
     */
    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(id = "com.disney.wdpro.dlr:id/categoryTitle")
    private AndroidElement AttractionsButton;

    /**
     * The Hotel category button.
     */
    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Hotels, Category, 11of12, button\"]")
    private AndroidElement HotelsButton;

    public boolean ishoteloptionavailable(){
        return isElementAvailable(HotelsButton);

    }

    /**
     * Clicking CategoryList Buttons.
     */
    public void clickingcategorylistbuttons(){
                click(AttractionsButton);
    }
    /**
     * Alert control.
     */
    @Override
    public void alertControl() {
        // TODO Auto-generated method stub

    }

}
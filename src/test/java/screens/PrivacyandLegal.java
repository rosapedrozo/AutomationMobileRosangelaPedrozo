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
public class PrivacyandLegal  extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver the driver
     * @author Rosangela.pedrozo
     */
    public PrivacyandLegal(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * The privacy and legal button.
     */
    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"Privacy & Legal button\"]/android.widget.TextView[2]")
    private AndroidElement PrivacyandLegalButton;


    /**
     * The privacy Policy button.
     */
    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*:id/txt_element\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").textContains(\"Privacy Policy\")")
    private AndroidElement PrivacyPolicyButton;


    /**
     * The terms of use button.
     */
    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").textContains(\"Terms of Use\")")
    private AndroidElement TermsofUseButton;


    /**
     * The supplemental terms and conditions button.
     */
    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").textContains(\"Supplemental Terms and Conditions\")")
    private AndroidElement SupplementalTermsandConditionsButton;

    /**
     * The legal notices button.
     */
    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").textContains(\"Legal Notices\")")
    private AndroidElement LegalNoticesButton;

    /**
     * The property rules button.
     */
    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").textContains(\"Property Rules\")")
    private AndroidElement PropertyRulesButton;

    /**
     * The electronic communication disclosure button.
     */
    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").textContains(\"Electronic Communications Disclosure\")")
    private AndroidElement ElectronicCommunicationDisclosureButton;

    public boolean isprivacypolicyoptionavailable() {
        return isElementAvailable(PrivacyPolicyButton);
        }

    public boolean istermsofuseoptionavailable() {
        return isElementAvailable(TermsofUseButton);
        }

    public boolean issupplementaltermsandconditionsoptionavailable() {
        return isElementAvailable(SupplementalTermsandConditionsButton);
    }

    public boolean legalnoticesoptionavailable() {
        return isElementAvailable(LegalNoticesButton);
    }

    public boolean ispropertyrulesoptionavailable() {
        return isElementAvailable(PropertyRulesButton);
    }

    public boolean iselectroniccommunicationdisclosureoptionavailable() {
        return isElementAvailable(ElectronicCommunicationDisclosureButton);
    }
    /**
     * Clicking privacy and legal Button.
     */
    public void clickingprivacyandlegalbutton(){
        click(PrivacyandLegalButton);
    }

    public void scrollToPrivacyandLegal(){
        scrollDown(5);
    }

    /**
     * Alert control.
     */
    @Override
    public void alertControl() {
        // TODO Auto-generated method stub

    }

}

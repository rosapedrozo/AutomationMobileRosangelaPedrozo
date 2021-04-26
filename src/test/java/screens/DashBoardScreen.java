package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import screens.components.AlertPopup;
import util.screens.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

/**
 * DashBoard screen.
 * 
 * @author Hans.Marquez
 *
 */
public class DashBoardScreen extends BaseScreen {

	/**
	 * Constructor method.
	 * 
	 * @author Hans.Marquez
	 * 
	 * @param driver
	 *            : AndroidDriver
	 */
	public DashBoardScreen(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/tmpsubacts_root\").childSelector(new UiSelector().textContains(\"Sign In\"))")
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/tmpsubacts_primary\")")
    private AndroidElement signInButton;

	/**
	 * The Map button.
	 */
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath= "//android.widget.ImageView[@content-desc=\"Map, Tab, 2of5\"]")
	private AndroidElement MapButton;

	/**
	 * The Add button.
	 */
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id= "com.disney.wdpro.dlr:id/tab_animated_icon")
	private AndroidElement AddButton;

	/**
	 * The Menu button.
	 */
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"More Options, Tab, 5of5, Features shopping, photos, mobile orders, tickets, chat with us, help and your profile.\"]")
	private AndroidElement MenuButton;

	/**
	 * @author Hans.Marquez
	 *
	 * @description: Handle with random PopUps available in DashBoard Screen.
	 *
	 */
	public LoginScreen goToLoginScreen() {
		click(signInButton);
		return new LoginScreen(driver);
	}
	/**
	 * @author Hans.Marquez
	 *
	 * @description: Handle with random PopUps available in DashBoard Screen.
	 *
	 * @return
	 */

	public void clickOnMapButton(){
		click(MapButton);
	}

	public void clickOnAddButton(){
		click(AddButton);
	}
	/**
	 * Clicking Menu Button.
	 */
	public void clickOnMenuButton() {
		click(MenuButton);
	}

		/**
	 * Alert control.
	 */
	@Override
	public void alertControl() {
		int retries = 0;
		try {
			while(retries < 3) {
				AlertPopup alertPopup = new AlertPopup(driver);
				alertPopup.accept();
				retries++;
			}
		} catch (Exception e) {
			log.info("No alerts found.");
			log.info(e);
		}
	}
}

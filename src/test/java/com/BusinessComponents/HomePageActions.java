package com.BusinessComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PageFactory.HomePage;
import com.PageFactory.ModalPopUpHandler;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class HomePageActions extends CommonUtils {
	static HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	static ModalPopUpHandler handlerActions = PageFactory.initElements(driver, ModalPopUpHandler.class);
	
		/**
		 * 
		 * @throws Exception
		 */
 
		public static void HandlingModalSuggestedBox() throws Exception{
			try {
				
				TestLogger.testLoggerInfo("Modal Suggested Save Button Is Found");
				handlerActions.getClickSubmitSaveModalSetting().click();
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Modal Suggested Save Button Is Not Found" + e);
			}			
		}
		
		/**
		 * 
		 * @throws Exception
		 */
 
		public static void ClickPipingRockLogoHeader() throws Exception{
			try {
				Thread.sleep(1000);
				TestLogger.testLoggerInfo("PipingRock Logo Header Is Found");				
				homePage.getPipingRockLogoHeader().click();
			} catch (Exception e) {
				TestLogger.testLoggerInfo("PipingRock Logo Header Is Not Found" + e);
			}			
		}
		
		/**
		 * 
		 * @throws Exception
		 */
		
		public static void LoginAction() throws Exception{
			try {				
				TestLogger.testLoggerInfo("Log In ref Is Found");				
				homePage.getLogInBtn().click();
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Log In ref Is Not Found" + e);
			}			
		}
		
		/**
		 * 
		 * @throws Exception
		 */
		
		public static void SearchForAProduct(String message) throws Exception{
			try {				
				TestLogger.testLoggerInfo("Search Product Field Is Found");				
				homePage.getSearchProductsField().sendKeys(message);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Search Product Field Is Found" + e);
			}			
		}
		
		/**
		 * 
		 * @throws Exception
		 */
		
		public static void ClickSearchButton() throws Exception{
			try {				
				TestLogger.testLoggerInfo("Search Submit Btn Is Found");				
				homePage.getSearchSubmitButton().click();
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Search Submit Btn Is Found" + e);
			}			
		}
		
		/**
		 * 
		 * @throws Exception
		 */
		
		public static void ClickAddToCartButton() throws Exception{
			try {				
				TestLogger.testLoggerInfo("Add To Cart Btn Is Found");				
				homePage.getAddToCartBtn().click();
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Add To Cart Btn Is Found" + e);
			}			
		}
		
		/**
		 * 
		 * @throws Exception
		 */
		
		public static void ClickCheckoutButton() throws Exception{
			try {				
				TestLogger.testLoggerInfo("Checkout Btn Is Found");				
				homePage.getCheckoutBtn().click();
			} catch (Exception e) {
				TestLogger.testLoggerInfo("SCheckout Btn Is Found" + e);
			}			
		}
		
		/**
		 * 
		 * @throws Exception
		 */

		public static void ClickShareCartLink() throws Exception{
			try {			
				TestLogger.testLoggerInfo("Share Link Is Found");				
				homePage.getShareCartLink().click();
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Share Link Is Not Found" + e);
			}			
		}
		
		/**
		 * 
		 * @throws Exception
		 */

		public static void HandleShareCartWindow() throws Exception{
			//String shareCartTitle = null;
			try {			
				TestLogger.testLoggerInfo("Share Your Cart Window Is Found");				
				//shareCartTitle = handlerActions.getShareYourCartWindow().getText();
				Thread.sleep(1000);
				handlerActions.getShareYourCartWindowClose().click();
				Thread.sleep(1000);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Share Your Cart Window Is Not Found" + e);
			}
			//return shareCartTitle;			
		}
		
		/**
		 * 
		 * @throws Exception
		 */

		public static void ClickShareCopyButton() throws Exception{
			try {			
				TestLogger.testLoggerInfo("Copy Link Button Is Found");
				Thread.sleep(1000);
				Actions act = new Actions(driver);
				act.moveToElement(homePage.getShareCopyBtn()).click();
				Thread.sleep(1000);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Copy Link Button Is Not Found" + e);
			}	
		}
		
		/**
		 * 
		 * @throws Exception
		 */

		public static String GetShareURLFromInputBox() throws Exception{
			String shareUrl = null;
			try {			
				TestLogger.testLoggerInfo("Share URL Input Field Is Found");
				Thread.sleep(1000);
				shareUrl = homePage.getShareURLInput().getAttribute("value");
				Thread.sleep(1000);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Share URL Input Field Is Not Found" + e);
			}
			return shareUrl;
		}
		
		/**
		 * 
		 * @throws Exception
		 */
		
		public static void ValidateShortenURLCheckBox() throws Exception{
			try {
			     TestLogger.testLoggerInfo("Shorten URL CheckBox Is Found");
			     boolean isSelected = homePage.getShortenURLCheckbox().isSelected();
			     if (!isSelected) {
			    	 homePage.getShortenURLCheckbox().click();
			    	 GetShareURLFromInputBox();
			     }
			     else {
			    	 homePage.getShortenURLCheckbox().click();
			     }
			     takeSnapShot();
			     Thread.sleep(1000);
			} catch (Exception e) {
			     TestLogger.testLoggerInfo("Shorten URL CheckBox Is Not Found");
			}
			homePage.getShortenURLCheckbox().click();
			takeSnapShot();
		}
		
		/**
		 * 
		 * @throws Exception
		 */
		
		public static void PresenceOfSocialShareButton() throws Exception{
			try {
			     TestLogger.testLoggerInfo("Shorten URL CheckBox Is Found");
			     Actions act = new Actions(driver);
					act.moveToElement(driver.findElement(By.xpath("//*[@class='at-icon at-icon-facebook']"))).perform();
					takeSnapShot();
					Thread.sleep(1000);
					act.moveToElement(driver.findElement(By.xpath("//*[@class='at-icon at-icon-messenger']"))).perform();
					takeSnapShot();
					Thread.sleep(1000);
					act.moveToElement(driver.findElement(By.xpath("//a[@class='at-icon-wrapper at-share-btn at-svc-twitter']"))).perform();
					takeSnapShot();
					Thread.sleep(1000);
					act.moveToElement(driver.findElement(By.xpath("//*[@class='at-icon at-icon-pinterest_share']"))).perform();
					takeSnapShot();
					Thread.sleep(1000);
					act.moveToElement(driver.findElement(By.xpath("//*[@class='at-icon at-icon-email']"))).perform();
					takeSnapShot();
					Thread.sleep(1000);
					act.moveToElement(driver.findElement(By.xpath("//span[@class='at4-share-count-container']"))).perform();
					takeSnapShot();
			} catch (Exception e) {
			     TestLogger.testLoggerInfo("Shorten URL CheckBox Is Not Found");
			}
			takeSnapShot();
		}
		
		/**
		 * 
		 * @throws Exception
		 */

		public static String GetHomePageBannerSize() throws Exception{
			String bannerSize = null;
			try {			
				TestLogger.testLoggerInfo("Banner In Home Page Is Found");
				Thread.sleep(700);
				bannerSize = homePage.getHomePageBannerSize().getAttribute("class");
				Thread.sleep(700);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Banner In Home Page Is Not Found" + e);
			}
			return bannerSize;
		}
		
		/**
		 * 
		 * @throws Exception
		 */

		public static void ClickShopAllCategories() throws Exception{
			try {			
				TestLogger.testLoggerInfo("Shop All Categories In Home Page Is Found");
				Thread.sleep(500);
				homePage.getShopAllCategories().click();
				Thread.sleep(500);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Shop All Categories In Home Page Is Not Found" + e);
			}
		}
		
		/**
		 * 
		 * @throws Exception
		 */

		public static void ClickSupplementsCategory() throws Exception{
			try {			
				TestLogger.testLoggerInfo("Supplements Category In Home Page Is Found");
				Thread.sleep(500);
				homePage.getSupplementsNav().click();
				Thread.sleep(500);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Supplements Category In Home Page Is Not Found" + e);
			}
		}
		
		/**
		 * 
		 * @throws Exception
		 */

		public static String GetHurryTextInBanner() throws Exception{
			String bannerSize = null;
			try {			
				TestLogger.testLoggerInfo("Hurry Up Text In Banner Inside Shopping Home Page Is Found");
				Thread.sleep(1000);
				bannerSize = homePage.getHomePageBannerSize().getText();
				Thread.sleep(1000);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Hurry Up Text In Banner Inside Shopping Home Page Is Not Found" + e);
			}
			return bannerSize;
		}
 
}

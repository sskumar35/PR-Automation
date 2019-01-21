package com.BusinessComponents;

import org.openqa.selenium.support.PageFactory;

import com.PageFactory.HomePage;
import com.PageFactory.ShareButtonHandler;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class ShareButtonHandlerActions extends CommonUtils{
	static HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	static ShareButtonHandler sharebuttonActions = PageFactory.initElements(driver, ShareButtonHandler.class);
	
	public static void ClickAllProductsMenu() throws Exception{
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("All Products Menu Button Is Found");
			sharebuttonActions.getClickAllProductsMenu().click();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("All Products Menu Button Is Not Found");
		}
	}
	
	public static void ClickAllProductsItem() throws Exception{
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("All Products Item Is Found");
			sharebuttonActions.getClickAllProductsItem().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("All Products Item Is Not Found");
		}
	}
	
	public static void ClickProductsItem() throws Exception{
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("Products Item Is Found");
			sharebuttonActions.getClickProductItem().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Products Item Is Not Found");
		}
	}
	
	public static void ClickAllCategoriesMenu() throws Exception{
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("All Categories Menu Is Found");
			sharebuttonActions.getClickAllCategoriesMenu().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("All Categories Menu Is Not Found");
		}
	}
	
	public static void ClickCategoriesLink() throws Exception{
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("All Categories Link Is Found");
			sharebuttonActions.getClickCategoriesLink().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("All Categories Link Is Not Found");
		}
	}
	
	public static void ClickAddToCart() throws Exception{
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("Add To Cart Button Is Found");
			sharebuttonActions.getClickAddToCart().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Add To Cart Button Is Not Found");
		}
	}
	
	public static void ClickShareCartButton() throws Exception{
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("Share Button Is Found");
			sharebuttonActions.getClickShareCartButton().click();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Share Button Is Not Found");
		}
	}
	
	public static void CopyLinkButton() throws Exception{
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("Copy Link Button Is Found");
			sharebuttonActions.getCopyLinkButton().click();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Copy Link Button Is Not Found");
		}
	}
	
	public static String CopyRewardURL() throws Exception{
		String CopyUrl = null;
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("Reward URL Is Found");
			CopyUrl = sharebuttonActions.getCopyRewardURL().getAttribute("value");
			System.out.println("value:" +CopyUrl);
			Thread.sleep(2000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Reward URL Is Not Found");
		}
		return CopyUrl;
	}
	
	public static void CheckShortenUrl() throws Exception{
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("Check Button for Shorten URL Is Found");
			sharebuttonActions.getShortenUrl().click();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Check Button for Shorten URL Is Not Found");
		}
	}
	
	public static void ClickLearnMoreLink() throws Exception{
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("Learn More Link Is Found");
			sharebuttonActions.getClickLearnMoreLink().click();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Learn More Link Is Not Found");
		}
	}
	
	public static String GetRewardPageHeader() throws Exception{
		String RewardPageHeader = null;
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("Learn More Reward Page Is Found");
			RewardPageHeader = sharebuttonActions.getRewardPageHeader().getText();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Learn More Reward Page Is Not Found");
		}
		return RewardPageHeader;
	}
	
	public static void ClickSignInLink() throws Exception{
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("SignIn Link Is Found");
			sharebuttonActions.getClickSignInLink().click();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("SignIn Link Is Not Found");
		}
	}
	
	public static String GetConfirmLoginPage() throws Exception{
		String LoginPageText = null;
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("Login Page Is Found");
			LoginPageText = sharebuttonActions.getConfirmLoginPage().getText();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Login Page Is Not Found");
		}
		return LoginPageText;
	}
	
	public static void ClickFbButton() throws Exception{
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("Facebook Button Is Found");
			String parentFBHandle = driver.getWindowHandle();
			sharebuttonActions.getClickFbButton().click();
			for (String winFBHandle : driver.getWindowHandles()) {
			    driver.switchTo().window(winFBHandle);
			}
			driver.close();
			driver.switchTo().window(parentFBHandle);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Facebook Button Is Not Found");
		}
	}
	
	public static void ClickTwitterButton() throws Exception{
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("Twitter Button Is Found");
			String parentTWHandle = driver.getWindowHandle();
			sharebuttonActions.getClickTwitterButton().click();
			for (String winTWHandle : driver.getWindowHandles()) {
			    driver.switchTo().window(winTWHandle);
			}
			driver.close();
			driver.switchTo().window(parentTWHandle);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Twitter Button Is Not Found");
		}
	}
	
	public static void ClickPrintButton() throws Exception{
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("Print Button Is Found");
			sharebuttonActions.getClickPrintButton().click();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Print Button Is Not Found");
		}
	}
	
	public static void ClickEmailButton() throws Exception{
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("Email Button Is Found");
			sharebuttonActions.getClickEmailButton().click();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Email Button Is Not Found");
		}
	}
	
	public static void ClickAddThisButton() throws Exception{
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("AddThis Button Is Found");
			sharebuttonActions.getClickAddThisButton().click();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("AddThis Button Is Not Found");
		}
	}
	
	public static void ClickEarnRewardLink() throws Exception{
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("Earn Reward Link Is Found");
			sharebuttonActions.getClickEarnRewardLink().click();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Earn Reward Link Is Not Found");
		}
	}
	
	public static void ClickSharePopupLogo() throws Exception{
		try {
			Thread.sleep(3000);
			TestLogger.testLoggerInfo("PipingRock Logo Is Found");
			sharebuttonActions.getClickSharePopupLogo().click();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("PipingRock Logo Is Not Found");
		}
	}
	
    public static void CloseSharePopUpWindow() {
    	try {
    		TestLogger.testLoggerInfo("Close button for Share Popup Window Is Found");
    		sharebuttonActions.getSharePopUpClose().click();
    	} catch (Exception e) {
    		TestLogger.testLoggerInfo("Close button for Share Popup Window Is Not Found");
    	}

    }
}

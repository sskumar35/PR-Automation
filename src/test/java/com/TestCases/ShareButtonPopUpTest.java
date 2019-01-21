package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BusinessComponents.HomePageActions;
import com.BusinessComponents.LoginPageAction;
import com.BusinessComponents.ShareButtonHandlerActions;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class ShareButtonPopUpTest extends CommonUtils{
	
	@BeforeTest
	public void setUp() throws Exception {
		init();
    }
	
    @Test (priority=0)
	public void LoggedOutSharePopUpTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Logged Out Share Button Popup Window TestCase");
			Thread.sleep(3000);
			HomePageActions.HandlingModalSuggestedBox();
			ShareButtonHandlerActions.ClickAllProductsMenu();
			ShareButtonHandlerActions.ClickAllProductsItem();
			ShareButtonHandlerActions.ClickProductsItem();
			ShareButtonHandlerActions.ClickShareCartButton();
			
			ShareButtonHandlerActions.CopyLinkButton();
			ShareButtonHandlerActions.CopyRewardURL();
			ShareButtonHandlerActions.ClickSharePopupLogo();
			takeSnapShot();
			Thread.sleep(1000);
			
			ShareButtonHandlerActions.ClickAllCategoriesMenu();
			ShareButtonHandlerActions.ClickCategoriesLink();
			ShareButtonHandlerActions.ClickShareCartButton();
			ShareButtonHandlerActions.CopyLinkButton();
			ShareButtonHandlerActions.CopyRewardURL();
			
			takeSnapShot();
			ShareButtonHandlerActions.CheckShortenUrl();
			ShareButtonHandlerActions.CopyLinkButton();
			ShareButtonHandlerActions.CopyRewardURL();
			
			ShareButtonHandlerActions.ClickSharePopupLogo();
			ShareButtonHandlerActions.ClickAllProductsMenu();
			ShareButtonHandlerActions.ClickAllProductsItem();
			ShareButtonHandlerActions.ClickProductsItem();
			ShareButtonHandlerActions.ClickAddToCart();
			Thread.sleep(1000);
			ShareButtonHandlerActions.ClickShareCartButton();
			ShareButtonHandlerActions.CopyLinkButton();
			ShareButtonHandlerActions.CopyRewardURL();
			
			ShareButtonHandlerActions.ClickLearnMoreLink();
			
            String RewardPage = ShareButtonHandlerActions.GetRewardPageHeader();
			Assert.assertTrue(RewardPage.contains("Logo Pipingrock Rewards"));
			driver.navigate().back();
			Thread.sleep(2000);
			
			ShareButtonHandlerActions.ClickShareCartButton();
			ShareButtonHandlerActions.ClickSignInLink();
			Thread.sleep(2000);
			String LoginPage = ShareButtonHandlerActions.GetConfirmLoginPage();
			Thread.sleep(2000);
			Assert.assertTrue(LoginPage.contains("Returning Customers"));
			driver.navigate().back();
			
			/*ShareButtonHandlerActions.ClickFbButton();
			
			ShareButtonHandlerActions.ClickTwitterButton();
			
			ShareButtonHandlerActions.ClickPrintButton();
			
			ShareButtonHandlerActions.ClickEmailButton();
			
			ShareButtonHandlerActions.ClickAddThisButton();

			ShareButtonHandlerActions.ClickSignInLink();
			
			ShareButtonHandlerActions.ClickSharePopupLogo();
			
			ShareButtonHandlerActions.ClickEarnRewardLink(); */
			
			TestLogger.testLoggerTCEnd("Logged Out Share Button Popup Window TestCase");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Logged Out Share Button Popup Window Test Case Failed");
		}		
	} 
        
	    @Test (priority=1)
        public void LoggedInSharePopUpTest() throws Exception {
        	try {
        		TestLogger.testLoggerTCStart("Logged In Share Button Popup Window TestCase");
        		String emailAddress = "testprod123@gmail.com";
				String password = "Test123";
				ShareButtonHandlerActions.ClickShareCartButton();
        		ShareButtonHandlerActions.ClickSignInLink();
				Thread.sleep(3000); 
				
        		LoginPageAction.TypeUserEmailAddress(emailAddress);			
				LoginPageAction.TypeUserPassword(password);
				LoginPageAction.clickSignInButton();
				Thread.sleep(1000);
				
				driver.navigate().to("https://www.pipingrock.com/?prisp=1");
				Thread.sleep(1000);
				ShareButtonHandlerActions.ClickAllProductsMenu();
				ShareButtonHandlerActions.ClickAllProductsItem();
				ShareButtonHandlerActions.ClickProductsItem();
				ShareButtonHandlerActions.ClickShareCartButton();
				Thread.sleep(1000);
				
				ShareButtonHandlerActions.CopyLinkButton();
				ShareButtonHandlerActions.CopyRewardURL();
				ShareButtonHandlerActions.CloseSharePopUpWindow();
				Thread.sleep(1000);
				takeSnapShot();
				
				ShareButtonHandlerActions.ClickAllCategoriesMenu();
				ShareButtonHandlerActions.ClickCategoriesLink();
				ShareButtonHandlerActions.ClickShareCartButton();
				ShareButtonHandlerActions.CopyLinkButton();
				ShareButtonHandlerActions.CopyRewardURL();
				
				takeSnapShot();
				ShareButtonHandlerActions.CheckShortenUrl();
				ShareButtonHandlerActions.CopyLinkButton();
				ShareButtonHandlerActions.CopyRewardURL();
				
				ShareButtonHandlerActions.CloseSharePopUpWindow();
				Thread.sleep(1000);
				ShareButtonHandlerActions.ClickAllProductsMenu();
				ShareButtonHandlerActions.ClickAllProductsItem();
				ShareButtonHandlerActions.ClickProductsItem();
				ShareButtonHandlerActions.ClickAddToCart();
				Thread.sleep(1000);
				ShareButtonHandlerActions.ClickShareCartButton();
				ShareButtonHandlerActions.CopyLinkButton();
				ShareButtonHandlerActions.CopyRewardURL();
				ShareButtonHandlerActions.CloseSharePopUpWindow();
				Thread.sleep(1000);
				
				ShareButtonHandlerActions.ClickShareCartButton();
			    ShareButtonHandlerActions.ClickEarnRewardLink();
			    String RewardPage = ShareButtonHandlerActions.GetRewardPageHeader();
			    Thread.sleep(2000);
			    Assert.assertTrue(RewardPage.contains("Logo Pipingrock Rewards"));
			    driver.navigate().back();
			    Thread.sleep(2000);

        		TestLogger.testLoggerTCEnd("Logged In Share Button Popup Window TestCase");
        	} catch (Exception e) {
    			TestLogger.testLoggerInfo("Logged In Share Button Popup Window Test Case Failed");
    		}	
        } 


}
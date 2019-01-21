package com.TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BusinessComponents.CategoriesAndSubCategoriesPageActions;
import com.BusinessComponents.CountrySelectorActions;
import com.BusinessComponents.HomePageActions;
import com.BusinessComponents.LoginPageAction;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

//import junit.framework.Assert;

public class BazaarVoiceAnchorPointPRT4586 extends CommonUtils{
	
	@BeforeTest
	public void setUp() throws Exception {
		init();
		HomePageActions.HandlingModalSuggestedBox();
		HomePageActions.LoginAction();
		String emailAddress = "vishnm.216@gmail.com";
		String password = "1234567890";
		LoginPageAction.TypeUserEmailAddress(emailAddress);			
		LoginPageAction.TypeUserPassword(password);
		LoginPageAction.clickSignInButton();
	}
	
	@Test (priority=0)
	public void BazaarVoiceAnchorPointTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BazaarVoice Anchor Point Test - TC Start");
			
			String[] countryIds = {"Spain", "France", "Germany", "Netherlands", "Argentina", "Mexico"};
			
			for(int i = 0; i< countryIds.length; i++){

				CountrySelectorActions.ClickCountrySelectorInHomePage();
				CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
				CountrySelectorActions.SearchCountryDropDownInModalWindow(countryIds[i]);
				Thread.sleep(500);
				takeSnapShot();
				HomePageActions.HandlingModalSuggestedBox();
				Thread.sleep(1000);
				String prodId1 = "CoQ10";
				HomePageActions.SearchForAProduct(prodId1);
				HomePageActions.ClickSearchButton();
				takeSnapShot();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				CategoriesAndSubCategoriesPageActions.ClickNumberOfReviewsInBVAnchor();
				Thread.sleep(500);
				String URlChk1 = driver.getCurrentUrl();
				js.executeScript("window.scrollBy(0,500)");
				Thread.sleep(500);
				takeSnapShot();
				driver.navigate().back();
				CategoriesAndSubCategoriesPageActions.ClickNumberOfReviewsInBVAnchor();
				Thread.sleep(500);
				takeSnapShot();
				String URlChk2 = driver.getCurrentUrl();
				js.executeScript("window.scrollBy(0,500)");
				Thread.sleep(500);
				takeSnapShot();
				Assert.assertTrue(URlChk1.contains("#reviews"));
				Assert.assertTrue(URlChk2.contains("#reviews"));

			}
			
			
			TestLogger.testLoggerTCEnd("BazaarVoice Anchor Point Test - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BazaarVoice Anchor Point Test - Failed" + e);
		}
	}
			
	@AfterTest
	public void driverClose() throws Exception {
		LoginPageAction.UserLogout();
		closeDriver();
	}

}

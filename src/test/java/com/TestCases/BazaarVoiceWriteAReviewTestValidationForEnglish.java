package com.TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.BusinessComponents.CountrySelectorActions;
import com.BusinessComponents.HomePageActions;
import com.BusinessComponents.LoginPageAction;
import com.BusinessComponents.ProductDetailPageActions;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class BazaarVoiceWriteAReviewTestValidationForEnglish extends CommonUtils{
	
	@BeforeTest
	public void setUp() throws Exception {
		init();
		HomePageActions.HandlingModalSuggestedBox();
		HomePageActions.LoginAction();
		String emailAddress = "testbazaar@gmail.com";
		String password = "12345678";
		LoginPageAction.TypeUserEmailAddress(emailAddress);			
		LoginPageAction.TypeUserPassword(password);
		LoginPageAction.clickSignInButton();
	}
	
	@Test (priority=0)
	public void NonGoogleShoppingUser_BazaarVoiceWriteAReviewValidationForEnglish_INDIA() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BazaarVoice Write A Review Validation For English_INDIA - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("India");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(1000);
			String prodId1 = "40719";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			ProductDetailPageActions.ClickWriteReviewLink();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectFiveStarOverallRating();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewTitle("Testing English_INDIA Language Review");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewDescription("Very good product. Timely delivery too. Thank you team");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerEmail("TestEnglishINDIA@language.com");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerNickName("TestEnglishINDIA");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectGenderDropDown();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectAgeDropDown();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectFiveStarQualityRating();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectFiveStarValueRating();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.ClickTermsAndConditionsCheckBox();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.ClickPostReviewBtn();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			takeSnapShot();
			HomePageActions.ClickPipingRockLogoHeader();
			TestLogger.testLoggerTCEnd("BazaarVoice Write A Review Validation For English_INDIA - TC Start");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BazaarVoice Write A Review Validation For English_INDIA - TC Start" + e);
		}
	}
		
	@AfterTest
	public void driverClose() throws Exception {
		LoginPageAction.UserLogout();
		closeDriver();
	}

}

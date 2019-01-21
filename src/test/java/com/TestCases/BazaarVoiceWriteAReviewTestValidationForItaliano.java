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

public class BazaarVoiceWriteAReviewTestValidationForItaliano extends CommonUtils{
	
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
	public void NonGoogleShoppingUser_BazaarVoiceWriteAReviewValidationForItaliano_ITALY() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BazaarVoice Write A Review Validation For Italiano_ITALY - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Italy");
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
			ProductDetailPageActions.EnterReviewTitle("Testing Italiano_ITALY Language Review");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewDescription("Ottimo prodotto Consegna puntuale anche Grazie squadra");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerEmail("TestItalianoITALY@language.com");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerNickName("TestItalianoITALY");
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
			TestLogger.testLoggerTCEnd("BazaarVoice Write A Review Validation For Italiano_ITALY - TC Start");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BazaarVoice Write A Review Validation For Italiano_ITALY - TC Start" + e);
		}
	}
	
	@Test (priority=1)
	public void NonGoogleShoppingUser_BazaarVoiceWriteAReviewValidationForItaliano_SWITZERLAND() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BazaarVoice Write A Review Validation For Italiano_SWITZERLAND - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Switzerland");
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Italiano");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(1000);
			String prodId1 = "2901";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			ProductDetailPageActions.ClickWriteReviewLink();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectFourStarOverallRating();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewTitle("Testing Italiano_SWITZERLAND Language Review");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewDescription("Ottimo prodotto Consegna puntuale anche Grazie squadra");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerEmail("TestItalianoSWITZERLAND@language.com");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerNickName("TestItalianoSWITZERLAND");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectGenderDropDown();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectAgeDropDown();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectFourStarQualityRating();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectFourStarValueRating();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.ClickTermsAndConditionsCheckBox();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.ClickPostReviewBtn();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			takeSnapShot();
			HomePageActions.ClickPipingRockLogoHeader();
			TestLogger.testLoggerTCEnd("BazaarVoice Write A Review Validation For Italiano_SWITZERLAND - TC Start");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BazaarVoice Write A Review Validation For Italiano_SWITZERLAND - TC Start" + e);
		}
	}
		
	@AfterTest
	public void driverClose() throws Exception {
		LoginPageAction.UserLogout();
		closeDriver();
	}

}

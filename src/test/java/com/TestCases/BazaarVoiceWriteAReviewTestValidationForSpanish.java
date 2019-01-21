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

public class BazaarVoiceWriteAReviewTestValidationForSpanish extends CommonUtils{
	
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
	public void NonGoogleShoppingUser_BazaarVoiceWriteAReviewValidationForSpanish_SPAIN() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BazaarVoice Write A Review Validation For Spanish_SPAIN - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Spain");
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
			ProductDetailPageActions.EnterReviewTitle("Testing Spanish_SPAIN Language Review");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewDescription("Muy buen producto Entrega oportuna también. Gracias equipo");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerEmail("TestSpanishSPAIN@language.com");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerNickName("TestSpanishSPAIN");
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
			TestLogger.testLoggerTCEnd("BazaarVoice Write A Review Validation For Spanish_SPAIN - TC Start");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BazaarVoice Write A Review Validation For Spanish_SPAIN - TC Start" + e);
		}
	}
	
	@Test (priority=1)
	public void NonGoogleShoppingUser_BazaarVoiceWriteAReviewValidationForSpanish_ARGENTINA() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BazaarVoice Write A Review Validation For Spanish_ARGENTINA - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Argentina");
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
			ProductDetailPageActions.EnterReviewTitle("Testing Spanish_ARGENTINA Language Review");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewDescription("Muy buen producto Entrega oportuna también. Gracias equipo");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerEmail("TestSpanishARGENTINA@language.com");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerNickName("TestSpanishARGENTINA");
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
			TestLogger.testLoggerTCEnd("BazaarVoice Write A Review Validation For Spanish_ARGENTINA - TC Start");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BazaarVoice Write A Review Validation For Spanish_ARGENTINA - TC Start" + e);
		}
	}
	
	@Test (priority=2)
	public void NonGoogleShoppingUser_BazaarVoiceWriteAReviewValidationForSpanish_CHILE() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BazaarVoice Write A Review Validation For Spanish_CHILE - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Chile");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(1000);
			String prodId1 = "2702";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			ProductDetailPageActions.ClickWriteReviewLink();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectThreeStarOverallRating();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewTitle("Testing Spanish_CHILE Language Review");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewDescription("Muy buen producto Entrega oportuna también. Gracias equipo");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerEmail("TestSpanishCHILE@language.com");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerNickName("TestSpanishCHILE");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectGenderDropDown();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectAgeDropDown();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectThreeStarQualityRating();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectThreeStarValueRating();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.ClickTermsAndConditionsCheckBox();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.ClickPostReviewBtn();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			takeSnapShot();
			HomePageActions.ClickPipingRockLogoHeader();
			TestLogger.testLoggerTCEnd("BazaarVoice Write A Review Validation For Spanish_CHILE - TC Start");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BazaarVoice Write A Review Validation For Spanish_CHILE - TC Start" + e);
		}
	}
	
	@Test (priority=3)
	public void NonGoogleShoppingUser_BazaarVoiceWriteAReviewValidationForSpanish_COSTARICA() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BazaarVoice Write A Review Validation For Spanish_COSTARICA - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Costa Rica");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(1000);
			String prodId1 = "40388";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			ProductDetailPageActions.ClickWriteReviewLink();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectTwoStarOverallRating();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewTitle("Testing Spanish_COSTARICA Language Review");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewDescription("Muy buen producto Entrega oportuna también. Gracias equipo");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerEmail("TestSpanishCOSTARICA@language.com");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerNickName("TestSpanishCOSTARICA");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectGenderDropDown();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectAgeDropDown();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectTwoStarQualityRating();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectTwoStarValueRating();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.ClickTermsAndConditionsCheckBox();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.ClickPostReviewBtn();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			takeSnapShot();
			HomePageActions.ClickPipingRockLogoHeader();
			TestLogger.testLoggerTCEnd("BazaarVoice Write A Review Validation For Spanish_COSTARICA - TC Start");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BazaarVoice Write A Review Validation For Spanish_COSTARICA - TC Start" + e);
		}
	}
	
	@Test (priority=4)
	public void NonGoogleShoppingUser_BazaarVoiceWriteAReviewValidationForSpanish_MEXICO() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BazaarVoice Write A Review Validation For Spanish_MEXICO - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Mexico");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(1000);
			String prodId1 = "39404";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			ProductDetailPageActions.ClickWriteReviewLink();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectTwoStarOverallRating();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewTitle("Testing Spanish_MEXICO Language Review");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewDescription("Muy buen producto Entrega oportuna también. Gracias equipo");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerEmail("TestSpanishMEXICOA@language.com");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerNickName("TestSpanishMEXICO");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectGenderDropDown();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectAgeDropDown();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectTwoStarQualityRating();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectTwoStarValueRating();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.ClickTermsAndConditionsCheckBox();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.ClickPostReviewBtn();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			takeSnapShot();
			HomePageActions.ClickPipingRockLogoHeader();
			TestLogger.testLoggerTCEnd("BazaarVoice Write A Review Validation For Spanish_MEXICO - TC Start");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BazaarVoice Write A Review Validation For Spanish_MEXICO - TC Start" + e);
		}
	}
	
	@Test (priority=5)
	public void NonGoogleShoppingUser_BazaarVoiceWriteAReviewValidationForSpanish_PERU() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BazaarVoice Write A Review Validation For Spanish_PERU - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Peru");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(1000);
			String prodId1 = "2811";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			ProductDetailPageActions.ClickWriteReviewLink();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectTwoStarOverallRating();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewTitle("Testing Spanish_PERU Language Review");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewDescription("Muy buen producto Entrega oportuna también. Gracias equipo");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerEmail("TestSpanishPERU@language.com");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerNickName("TestSpanishPERU");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectGenderDropDown();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectAgeDropDown();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectTwoStarQualityRating();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.SelectTwoStarValueRating();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.ClickTermsAndConditionsCheckBox();
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.ClickPostReviewBtn();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			takeSnapShot();
			HomePageActions.ClickPipingRockLogoHeader();
			TestLogger.testLoggerTCEnd("BazaarVoice Write A Review Validation For Spanish_PERU - TC Start");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BazaarVoice Write A Review Validation For Spanish_PERU - TC Start" + e);
		}
	}
	
	@AfterTest
	public void driverClose() throws Exception {
		LoginPageAction.UserLogout();
		closeDriver();
	}


}

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

public class BazaarVoiceWriteAReviewTestValidationForFrench extends CommonUtils{
	
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
	public void NonGoogleShoppingUser_BazaarVoiceWriteAReviewValidationForFrench_FRANCE() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BazaarVoice Write A Review Validation For French_FRANCE - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("France");
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
			ProductDetailPageActions.EnterReviewTitle("Testing French_France Language Review");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewDescription("Très bon produit. Livraison en temps opportun aussi. Merci l'équipe");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerEmail("TestFrenchFrance@language.com");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerNickName("TestFrenchFrance");
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
			TestLogger.testLoggerTCEnd("BazaarVoice Write A Review Validation For French_FRANCE - TC Start");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BazaarVoice Write A Review Validation For French_FRANCE - TC Start" + e);
		}
	}
	
	@Test (priority=1)
	public void NonGoogleShoppingUser_BazaarVoiceWriteAReviewValidationForFrench_CANADA() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BazaarVoice Write A Review Validation For French_CANADA - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Canada");
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Français");
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
			ProductDetailPageActions.EnterReviewTitle("Testing French_CANADA Language Review");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewDescription("Très bon produit. Livraison en temps opportun aussi. Merci l'équipe");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerEmail("TestFrenchCanada@language.com");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerNickName("TestFrenchCanada");
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
			TestLogger.testLoggerTCEnd("BazaarVoice Write A Review Validation For French_CANADA - TC Start");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BazaarVoice Write A Review Validation For French_CANADA - TC Start" + e);
		}
	}
	
	@Test (priority=2)
	public void NonGoogleShoppingUser_BazaarVoiceWriteAReviewValidationForFrench_SWITZERLAND() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BazaarVoice Write A Review Validation For French_SWITZERLAND - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("SWITZERLAND");
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Français");
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
			ProductDetailPageActions.EnterReviewTitle("Testing French_SWITZERLAND Language Review");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewDescription("Très bon produit. Livraison en temps opportun aussi. Merci l'équipe");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerEmail("TestFrenchSWITZERLAND@language.com");
			takeSnapShot();
			Thread.sleep(400);
			ProductDetailPageActions.EnterReviewerNickName("TestFrenchSWITZERLAND");
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
			TestLogger.testLoggerTCEnd("BazaarVoice Write A Review Validation For French_SWITZERLAND - TC Start");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BazaarVoice Write A Review Validation For French_SWITZERLAND - TC Start" + e);
		}
	}
	
	@AfterTest
	public void driverClose() throws Exception {
		LoginPageAction.UserLogout();
		closeDriver();
	}


}

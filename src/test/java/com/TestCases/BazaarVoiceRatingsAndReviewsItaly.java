package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.BusinessComponents.CheckoutReviewPageActions;
import com.BusinessComponents.CountrySelectorActions;
import com.BusinessComponents.HomePageActions;
import com.BusinessComponents.LoginPageAction;
import com.BusinessComponents.ShoppingCartPageActions;
import com.BusinessComponents.ProductDetailPageActions;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class BazaarVoiceRatingsAndReviewsItaly extends CommonUtils{

	@BeforeTest
	public void setUp() throws Exception {
		init();	
	}
	
	@Test (priority=0)
	public void NonGoogleShoppingUsersWriteNewReviewTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Non Google Shopping Users Write New Review Test case - TC Start");
			String emailAddress = "testbazaar@gmail.com";
			String password = "12345678";
			driver.navigate().refresh();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Italy");
			//CountrySelectorActions.SearchLanguageDropDownInModalWindow("Espanol");
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(1000);
			HomePageActions.LoginAction();			
			LoginPageAction.TypeUserEmailAddress(emailAddress);			
			LoginPageAction.TypeUserPassword(password);
			LoginPageAction.clickSignInButton();
			//String prodId1 = "60240";
			//String prodId1 = "60260";
			//String prodId1 = "60060";
			//String prodId1 = "60261"; 
			//String prodId1 = "5081";
			String prodId1 = "40122";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(1500);
			ProductDetailPageActions.SelectFiveStarOverallRating();
			Thread.sleep(1500);
			ProductDetailPageActions.EnterReviewTitle("TestItaly");
			Thread.sleep(1500);
			ProductDetailPageActions.EnterReviewDescription("ottimo prodotto e consegna puntuale grazie squadra");
			Thread.sleep(1500);
			ProductDetailPageActions.EnterReviewerEmail("testItalian@language.com");
			Thread.sleep(1500);
			ProductDetailPageActions.EnterReviewerNickName("TestItalian");
			Thread.sleep(1500);
			ProductDetailPageActions.SelectGenderDropDown();
			Thread.sleep(1500);
			ProductDetailPageActions.SelectAgeDropDown();
			Thread.sleep(1500);
			ProductDetailPageActions.SelectFiveStarQualityRating();
			Thread.sleep(1500);
			ProductDetailPageActions.SelectFiveStarValueRating();
			Thread.sleep(1500);
			ProductDetailPageActions.ClickTermsAndConditionsCheckBox();
			Thread.sleep(1500);
			ProductDetailPageActions.ClickPostReviewBtn();
			Thread.sleep(1500);
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			
			//String pageSrc = driver.getPageSource();
			//System.out.println("Page View Source: " + pageSrc);
			//CheckoutShippingPageActions.AddNewShippingAddressLink();
			TestLogger.testLoggerTCEnd("Non Google Shopping Users Write New Review Test case - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Non Google Shopping Users Write New Review Test case - Failed" + e);
		}
	}
	
	@Test (priority=1)
	public void NonGoogleShoppingUsersCheckOldReviewTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Google Shopping Non English Speaking Countries Users Check Old Reviews TestCase");
			
			
			TestLogger.testLoggerTCEnd("Google Shopping Non English Speaking Countries Users Check Old Reviews TestCase");
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Google Shopping Non English Speaking Countries Users  Check Old Reviews Test Case Failed");
			}		
		}
	
	@Test (priority=2)
	public void GoogleShoppingNonEnglishSpeakingCountriesReviewTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Google Shopping Non English Speaking Countries Users Reviews TestCase");
			
			
			TestLogger.testLoggerTCEnd("Google Shopping Non English Speaking Countries Users Reviews TestCase");
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Google Shopping Non English Speaking Countries Users Reviews Test Case Failed");
			}		
		}
	
	@Test (priority=3)
	public void GoogleShoppingEnglishSpeakingCountriesReviewTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Google Shopping English Speaking Countries Users Reviews TestCase");
			
			
			
			TestLogger.testLoggerTCEnd("Google Shopping English Speaking Countries Users Reviews TestCase");
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Google Shopping English Speaking Countries Users Reviews TestCase Failed");
			}		
		}
	
	@Test (priority=3)
	public void SuppressReviewTabTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Suppress Reviews Tab for Countries TestCase");
			
			
			
			TestLogger.testLoggerTCEnd("Suppress Reviews Tab for Countries TestCase");
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Suppress Reviews Tab for Countries Test Case Failed");
			}		
		}
	/*@AfterTest
	public void driverClose() {
	closeDriver();
	}*/
}	

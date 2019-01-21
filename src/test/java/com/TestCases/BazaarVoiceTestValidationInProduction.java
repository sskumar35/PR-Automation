package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BusinessComponents.CountrySelectorActions;
import com.BusinessComponents.HomePageActions;
import com.BusinessComponents.LoginPageAction;
import com.BusinessComponents.ProductDetailPageActions;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

//import junit.framework.Assert;

public class BazaarVoiceTestValidationInProduction extends CommonUtils{
	
	@BeforeTest
	public void setUp() throws Exception {
		init();
		HomePageActions.HandlingModalSuggestedBox();
		HomePageActions.LoginAction();
		String emailAddress = "testprod123@gmail.com";
		String password = "Test123";
		LoginPageAction.TypeUserEmailAddress(emailAddress);			
		LoginPageAction.TypeUserPassword(password);
		LoginPageAction.clickSignInButton();
		String prodId1 = "912";
		HomePageActions.SearchForAProduct(prodId1);
		HomePageActions.ClickSearchButton();
	}
	
	@Test (priority=0)
	public void NonGoogleShoppingUser_BazaarVoiceReviewTestValidationForSpanish() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Bazaar Voice Review Test Validation For Spanish - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Spain");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc = driver.getPageSource(); 
			Assert.assertTrue(pageSrc.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/es_ES/bv.js"));
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Argentina");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc1 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc1.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/es_AR/bv.js"));
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Chile");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc2 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc2.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/es_CL/bv.js"));
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Costa Rica");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc3 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc3.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/es_CR/bv.js"));
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Mexico");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc4 = driver.getPageSource();
			Assert.assertTrue(pageSrc4.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/es_MX/bv.js"));
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Peru");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc5 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc5.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/es_PE/bv.js"));
			TestLogger.testLoggerTCEnd("Bazaar Voice Review Test Validation For Spanish - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Bazaar Voice Review Test Validation For Spanish - Failed" + e);
		}
	}
	
	@Test (priority=1)
	public void NonGoogleShoppingUser_BazaarVoiceReviewTestValidationForGerman() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Bazaar Voice Review Test Validation For German - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Germany");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc1 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc1.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/de_DE/bv.js"));
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Austria");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc2 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc2.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/de_AT/bv.js"));
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Belgium");
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Deutsch");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc3 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc3.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/de_BE/bv.js"));
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Switzerland");
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Deutsch");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc4 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc4.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/de_CH/bv.js"));
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Denmark");
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Deutsch");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc5 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc5.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/de_DK/bv.js"));
			TestLogger.testLoggerTCEnd("Bazaar Voice Review Test Validation For Spanish - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Bazaar Voice Review Test Validation For Spanish - Failed" + e);
		}
	}
	
	@Test (priority=2)
	public void NonGoogleShoppingUser_BazaarVoiceReviewTestValidationForFrench() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Bazaar Voice Review Test Validation For French - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("France");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc1 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc1.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/fr_FR/bv.js"));
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Canada");
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Français");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc2 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc2.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/fr_CA/bv.js"));
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Switzerland");
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Français");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc3 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc3.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/fr_CH/bv.js"));
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Belgium");
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Français");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc4 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc4.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/fr_BE/bv.js"));
			TestLogger.testLoggerTCEnd("Bazaar Voice Review Test Validation For French - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Bazaar Voice Review Test Validation For French - Failed" + e);
		}
	}
	
	@Test (priority=3)
	public void NonGoogleShoppingUser_BazaarVoiceReviewTestValidationForItaliano() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Bazaar Voice Review Test Validation For Italiano - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Italy");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc1 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc1.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/it_IT/bv.js"));
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Switzerland");
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Italiano");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc2 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc2.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/it_CH/bv.js"));
			TestLogger.testLoggerTCEnd("Bazaar Voice Review Test Validation For Italiano - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Bazaar Voice Review Test Validation For Italiano - Failed" + e);
		}
	}
	
	@Test (priority=4)
	public void NonGoogleShoppingUser_BazaarVoiceReviewTestValidationForPortuguese() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Bazaar Voice Review Test Validation For Portuguese - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Portugal");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc1 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc1.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/pt_PT/bv.js"));
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Brazil");
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Português");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc2 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc2.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/pt_PT/bv.js"));
			TestLogger.testLoggerTCEnd("Bazaar Voice Review Test Validation For Portuguese - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Bazaar Voice Review Test Validation For Portuguese - Failed" + e);
		}
	}
	
	@Test (priority=5)
	public void NonGoogleShoppingUser_BazaarVoiceReviewTestValidationForSwedish() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Bazaar Voice Review Test Validation For Swedish - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Sweden");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc1 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc1.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/sv_SE/bv.js"));
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Finland");
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Svenska");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc2 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc2.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/sv_FI/bv.js"));
			TestLogger.testLoggerTCEnd("Bazaar Voice Review Test Validation For Swedish - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Bazaar Voice Review Test Validation For Swedish - Failed" + e);
		}
	}
	
	@Test (priority=6)
	public void NonGoogleShoppingUser_BazaarVoiceReviewTestValidationForDutch() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Bazaar Voice Review Test Validation For Dutch - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Netherlands");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc1 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc1.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/nl_NL/bv.js"));
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Belgium");
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Dutch");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc2 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc2.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/nl_BE/bv.js"));
			TestLogger.testLoggerTCEnd("Bazaar Voice Review Test Validation For Dutch - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Bazaar Voice Review Test Validation For Dutch - Failed" + e);
		}
	}
	
	@Test (priority=7)
	public void NonGoogleShoppingUser_BazaarVoiceReviewTestValidationForChinese() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Bazaar Voice Review Test Validation For Chinese - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Hong Kong");
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("中文简体");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc1 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc1.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/zh_HK/bv.js"));
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Singapore");
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("中文简体");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc2 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc2.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/zh_SG/bv.js"));
			TestLogger.testLoggerTCEnd("Bazaar Voice Review Test Validation For Korean - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Bazaar Voice Review Test Validation For Korean - Failed" + e);
		}
	}
	
	@Test (priority=8)
	public void NonGoogleShoppingUser_BazaarVoiceReviewTestValidationForKorean() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Bazaar Voice Review Test Validation For Korean - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Korea, Republic Of");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc1 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc1.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/ko_KR/bv.js"));
			TestLogger.testLoggerTCEnd("Bazaar Voice Review Test Validation For Chinese - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Bazaar Voice Review Test Validation For Chinese - Failed" + e);
		}
	}
	
	@Test (priority=9)
	public void NonGoogleShoppingUser_BazaarVoiceReviewTestValidationForJapanese() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Bazaar Voice Review Test Validation For Japanese - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Japan");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc1 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc1.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/ja_JP/bv.js"));
			TestLogger.testLoggerTCEnd("Bazaar Voice Review Test Validation For Japanese - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Bazaar Voice Review Test Validation For Japanese - Failed" + e);
		}
	}
	
	@Test (priority=10)
	public void NonGoogleShoppingUser_BazaarVoiceReviewTestValidationForEnglish() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Bazaar Voice Review Test Validation For English - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			CountrySelectorActions.SearchCountryDropDownInModalWindow("India");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);						
			ProductDetailPageActions.ClickViewReviewsTab();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewLink();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickWriteReviewButton();
			Thread.sleep(500);
			takeSnapShot();
			ProductDetailPageActions.ClickReviewPopUpCloseBtn();
			Thread.sleep(500);
			takeSnapShot();
			String pageSrc1 = driver.getPageSource(); 
			Assert.assertTrue(pageSrc1.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/production/en_US/bv.js"));
			TestLogger.testLoggerTCEnd("Bazaar Voice Review Test Validation For English - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Bazaar Voice Review Test Validation For English - Failed" + e);
		}
	}
			
	@AfterTest
	public void driverClose() throws Exception {
		//LoginPageAction.UserLogout();
		closeDriver();
	}

}

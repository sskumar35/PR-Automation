package com.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BusinessComponents.CountrySelectorActions;
import com.BusinessComponents.HomePageActions;
import com.BusinessComponents.ShareButtonHandlerActions;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

import junit.framework.Assert;

public class CustomSocialMediaBasedOnFrenchAndOtherLanguage extends CommonUtils{
	
	@BeforeTest
	public void setUp() throws Exception {
		init();
}
	
	@Test(priority=0)
	public void FrenchAndOtherLanguagesTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Custom Social Media Based On French And OtherLanguages Test Case");
			
			//CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("France");
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Français");
			String HeaderForFR = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForFR.contains("Nous sommes fiers de livrer vers plus de 160 pays !"));
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(2000);
			ShareButtonHandlerActions.ClickShareCartButton();
			ShareButtonHandlerActions.CopyLinkButton();
			takeSnapShot();
			ShareButtonHandlerActions.CloseSharePopUpWindow();
			driver.navigate().refresh();
			
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("France");
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			String HeaderForEN = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForEN.contains("We proudly ship to over 160 countries!"));
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(2000);
			ShareButtonHandlerActions.ClickShareCartButton();
			ShareButtonHandlerActions.CopyLinkButton();
			takeSnapShot();
			ShareButtonHandlerActions.CloseSharePopUpWindow();
			driver.navigate().refresh();
			
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("France");
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Italiano");
			String HeaderForIT = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForIT.contains("Siamo orgogliosi di effettuare spedizioni in più di 160 paesi!"));
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(2000);
			ShareButtonHandlerActions.ClickShareCartButton();
			ShareButtonHandlerActions.CopyLinkButton();
			takeSnapShot();
			ShareButtonHandlerActions.CloseSharePopUpWindow();
			driver.navigate().refresh();
			
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("France");
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("日本語 (にほんご)");
			String HeaderForJP = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForJP.contains("160 を超える国と地域に配送いたします"));
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(2000);
			ShareButtonHandlerActions.ClickShareCartButton();
			ShareButtonHandlerActions.CopyLinkButton();
			takeSnapShot();
			ShareButtonHandlerActions.CloseSharePopUpWindow();
			driver.navigate().refresh();
			
			TestLogger.testLoggerTCEnd("Custom Social Media Based On France And OtherLanguages Test Case");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Custom Social Media Test Case FAILS" + e);
		}

	}

}

package com.BusinessComponents;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.PageFactory.CountrySelectorAndSocialMediaPage;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class CountrySelectorActions extends CommonUtils{
	
	static CountrySelectorAndSocialMediaPage CountrySelectorActions = PageFactory.initElements(driver, CountrySelectorAndSocialMediaPage.class);
	
	
	public static void SearchCountryDropDownInModalWindow(String CountryName) throws Exception{
		try {			
			TestLogger.testLoggerInfo("Search Field In Country Drop Down In Modal Windows Is Found");
			CountrySelectorActions.getClickCountryDropDownMenu().click();
			CountrySelectorActions.getMoveToCountrySearchField().sendKeys(CountryName);
			CountrySelectorActions.getMoveToCountrySearchField().sendKeys(Keys.ENTER);
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Search Field In Country Drop Down In Modal Windows Is Not Found" + e);
		}		
	}
	
	public static void SearchLanguageDropDownInModalWindow(String Language) throws Exception{
		try {	
			
			TestLogger.testLoggerInfo("Search Field In Language Drop Down In Modal Windows Is Found");
			CountrySelectorActions.getClickLanguageDropDownMenu().click();
			CountrySelectorActions.getMoveToLanguageSearchField().sendKeys(Language);
			CountrySelectorActions.getMoveToLanguageSearchField().sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Search Field In Language Drop Down In Modal Windows Is Not Found" + e);
		}		
	}
	
	public static String GetCountrySelectorPageHeader() throws Exception{
		String CountrySelectorPageHeader = null;
		try {
			
			TestLogger.testLoggerInfo("Country Selector Header Page Is Found");
			CountrySelectorPageHeader = CountrySelectorActions.getCountrySelectorPageHeader().getText();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Country Selector Header Page Is Not Found");
		}
		return CountrySelectorPageHeader;
	}
	
	public static void ClickCountrySelectorInHomePage() throws Exception{
		try {	
			
			TestLogger.testLoggerInfo("Country Selector In HomePage Is Found");
			CountrySelectorActions.getClickCountrySelector().click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Country Selector In HomePage Is Not Found" + e);
		}		
	}
	

}

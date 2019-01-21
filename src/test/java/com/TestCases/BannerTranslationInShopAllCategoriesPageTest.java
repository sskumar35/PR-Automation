package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.BusinessComponents.CountrySelectorActions;
import com.BusinessComponents.HomePageActions;
import com.BusinessComponents.LoginPageAction;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class BannerTranslationInShopAllCategoriesPageTest extends CommonUtils{
	
	@BeforeTest
	public void setUp() throws Exception {
		init();
		HomePageActions.HandlingModalSuggestedBox();
		HomePageActions.LoginAction();
		String emailAddress = "vishnm.216@gmail.com";
		String password = "0987654321";
		LoginPageAction.TypeUserEmailAddress(emailAddress);			
		LoginPageAction.TypeUserPassword(password);
		LoginPageAction.clickSignInButton();
		HomePageActions.ClickPipingRockLogoHeader();
		HomePageActions.ClickShopAllCategories();	
	}
	
	@Test (priority=1)
	public void BannerTranslationInShopAllCategoriesPage_AZE_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_AZE_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("azərbaycan dili");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_AZE_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_AZE_ImageTest" + e);
		}
	}
	
	@Test (priority=2)
	public void BannerTranslationInShopAllCategoriesPage_AZE_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_AZE_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_AZE_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_AZE_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_AZE_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_AZE_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_AZE_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=3)
	public void BannerTranslationInShopAllCategoriesPage_AZE_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_AZE_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue((hurryText.contains("Tələs")) && (hurryText.contains("-ci il tarixində başa çatır")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_AZE_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_AZE_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=4)
	public void BannerTranslationInShopAllCategoriesPage_BUL_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_BUL_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("български език");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_BUL_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_BUL_ImageTest" + e);
		}
	}
	
	@Test (priority=5)
	public void BannerTranslationInShopAllCategoriesPage_BUL_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_BUL_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_BUL_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_BUL_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_BUL_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_BUL_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_BUL_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=6)
	public void BannerTranslationInShopAllCategoriesPage_BUL_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_BUL_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Побързайте – изтича на"));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_BUL_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_BUL_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=7)
	public void BannerTranslationInShopAllCategoriesPage_DAN_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_DAN_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("dansk");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_DAN_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_DAN_ImageTest" + e);
		}
	}
	
	@Test (priority=8)
	public void BannerTranslationInShopAllCategoriesPage_DAN_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_DAN_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_DAN_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_DAN_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_DAN_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_DAN_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_DAN_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=9)
	public void BannerTranslationInShopAllCategoriesPage_DAN_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_DAN_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue((hurryText.contains("Skynd dig,")) && (hurryText.contains("det udløber")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_DAN_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_DAN_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=10)
	public void BannerTranslationInShopAllCategoriesPage_DEU_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_DEU_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Deutsch");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_DEU_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_DEU_ImageTest" + e);
		}
	}
	
	@Test (priority=11)
	public void BannerTranslationInShopAllCategoriesPage_DEU_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_DEU_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_DEU_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_DEU_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_DEU_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_DEU_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_DEU_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=12)
	public void BannerTranslationInShopAllCategoriesPage_DEU_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_DEU_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue((hurryText.contains("Beeilung, das Angebot läuft am")) && (hurryText.contains("ab")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_DEU_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_DEU_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=13)
	public void BannerTranslationInShopAllCategoriesPage_ELL_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_ELL_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("ελληνικά");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_ELL_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_ELL_ImageTest" + e);
		}
	}
	
	@Test (priority=14)
	public void BannerTranslationInShopAllCategoriesPage_ELL_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_ELL_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_ELL_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_ELL_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_ELL_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_ELL_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_ELL_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=15)
	public void BannerTranslationInShopAllCategoriesPage_ELL_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_ELL_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Βιαστείτε λήξη εκπτώσεων στις"));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_ELL_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_ELL_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=16)
	public void BannerTranslationInShopAllCategoriesPage_ENG_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_ENG_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_ENG_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_ENG_ImageTest" + e);
		}
	}
	
	@Test (priority=17)
	public void BannerTranslationInShopAllCategoriesPage_ENG_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_ENG_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_ENG_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_ENG_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_ENG_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_ENG_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_ENG_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=18)
	public void BannerTranslationInShopAllCategoriesPage_ENG_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_ENG_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("HURRY! Expires"));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_ENG_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_ENG_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=19)
	public void BannerTranslationInShopAllCategoriesPage_FIN_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_FIN_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("suomi");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_FIN_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_FIN_ImageTest" + e);
		}
	}
	
	@Test (priority=20)
	public void BannerTranslationInShopAllCategoriesPage_FIN_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_FIN_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_FIN_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_FIN_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_FIN_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_FIN_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_FIN_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=21)
	public void BannerTranslationInShopAllCategoriesPage_FIN_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_FIN_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Kiiruhda, se päättyy "));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_FIN_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_FIN_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=22)
	public void BannerTranslationInShopAllCategoriesPage_FRA_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_FRA_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Français");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_FRA_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_FRA_ImageTest" + e);
		}
	}
	
	@Test (priority=23)
	public void BannerTranslationInShopAllCategoriesPage_FRA_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_FRA_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_FRA_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_FRA_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_FRA_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_FRA_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_FRA_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=24)
	public void BannerTranslationInShopAllCategoriesPage_FRA_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_FRA_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Dépêchez-vous, expiration le "));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_FRA_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_FRA_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=25)
	public void BannerTranslationInShopAllCategoriesPage_HRV_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_HRV_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("hrvatski jezik");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_HRV_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_HRV_ImageTest" + e);
		}
	}
	
	@Test (priority=26)
	public void BannerTranslationInShopAllCategoriesPage_HRV_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_HRV_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_HRV_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_HRV_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_HRV_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_HRV_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_HRV_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=27)
	public void BannerTranslationInShopAllCategoriesPage_HRV_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_HRV_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Požurite, istek "));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_HRV_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_HRV_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=28)
	public void BannerTranslationInShopAllCategoriesPage_HUN_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_HUN_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("magyar");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_HUN_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_HUN_ImageTest" + e);
		}
	}
	
	@Test (priority=29)
	public void BannerTranslationInShopAllCategoriesPage_HUN_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_HUN_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_HUN_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_HUN_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_HUN_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_HUN_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_HUN_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=30)
	public void BannerTranslationInShopAllCategoriesPage_HUN_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_HUN_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue((hurryText.contains("Siessen! ")) && (hurryText.contains(" -án vége.")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_HUN_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_HUN_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=31)
	public void BannerTranslationInShopAllCategoriesPage_IND_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_IND_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Bahasa Indonesia");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_IND_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_IND_ImageTest" + e);
		}
	}
	
	@Test (priority=32)
	public void BannerTranslationInShopAllCategoriesPage_IND_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_IND_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_IND_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_IND_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_IND_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_IND_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_IND_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=33)
	public void BannerTranslationInShopAllCategoriesPage_IND_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_IND_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Buruan, cuma sampai "));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_IND_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_IND_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=34)
	public void BannerTranslationInShopAllCategoriesPage_ITA_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_ITA_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Italiano");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_ITA_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_ITA_ImageTest" + e);
		}
	}
	
	@Test (priority=35)
	public void BannerTranslationInShopAllCategoriesPage_ITA_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_ITA_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_ITA_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_ITA_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_ITA_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_ITA_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_ITA_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=36)
	public void BannerTranslationInShopAllCategoriesPage_ITA_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_ITA_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Affrettati: scade il "));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_ITA_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_ITA_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=37)
	public void BannerTranslationInShopAllCategoriesPage_JPN_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_JPN_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("日本語 (にほんご)");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_JPN_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_JPN_ImageTest" + e);
		}
	}
	
	@Test (priority=38)
	public void BannerTranslationInShopAllCategoriesPage_JPN_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_JPN_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_JPN_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_JPN_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_JPN_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_JPN_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_JPN_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=39)
	public void BannerTranslationInShopAllCategoriesPage_JPN_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_JPN_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue((hurryText.contains("お急ぎください！")) && (hurryText.contains(" まで")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_JPN_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_JPN_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=40)
	public void BannerTranslationInShopAllCategoriesPage_KOR_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_KOR_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("한국어");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_KOR_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_KOR_ImageTest" + e);
		}
	}
	
	@Test (priority=41)
	public void BannerTranslationInShopAllCategoriesPage_KOR_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_KOR_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_KOR_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_KOR_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_KOR_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_KOR_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_KOR_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=42)
	public void BannerTranslationInShopAllCategoriesPage_KOR_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_KOR_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains(" 까지이니 서두르세요"));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_KOR_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_KOR_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=43)
	public void BannerTranslationInShopAllCategoriesPage_MSA_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_MSA_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Bahasa Melayu");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_MSA_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_MSA_ImageTest" + e);
		}
	}
	
	@Test (priority=44)
	public void BannerTranslationInShopAllCategoriesPage_MSA_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_MSA_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_MSA_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_MSA_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_MSA_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_MSA_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_MSA_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=45)
	public void BannerTranslationInShopAllCategoriesPage_MSA_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_MSA_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Cepat, Tamat Tempoh pada "));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_MSA_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_MSA_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=46)
	public void BannerTranslationInShopAllCategoriesPage_NLD_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_NLD_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Dutch");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_NLD_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_NLD_ImageTest" + e);
		}
	}
	
	@Test (priority=47)
	public void BannerTranslationInShopAllCategoriesPage_NLD_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_NLD_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_NLD_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_NLD_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_NLD_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_NLD_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_NLD_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=48)
	public void BannerTranslationInShopAllCategoriesPage_NLD_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_NLD_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Schiet op, verloopt "));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_NLD_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_NLD_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=49)
	public void BannerTranslationInShopAllCategoriesPage_NOR_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_NOR_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Norsk");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_NOR_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_NOR_ImageTest" + e);
		}
	}
	
	@Test (priority=50)
	public void BannerTranslationInShopAllCategoriesPage_NOR_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_NOR_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_NOR_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_NOR_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_NOR_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_NOR_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_NOR_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=51)
	public void BannerTranslationInShopAllCategoriesPage_NOR_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_NOR_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Fort deg! Utløper "));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_NOR_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_NOR_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=52)
	public void BannerTranslationInShopAllCategoriesPage_POL_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_POL_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("język polski");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_POL_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_POL_ImageTest" + e);
		}
	}
	
	@Test (priority=53)
	public void BannerTranslationInShopAllCategoriesPage_POL_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_POL_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_POL_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_POL_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_POL_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_POL_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_POL_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=54)
	public void BannerTranslationInShopAllCategoriesPage_POL_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_POL_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Śpiesz się! Oferta ważna do "));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_POL_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_POL_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=55)
	public void BannerTranslationInShopAllCategoriesPage_POR_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_POR_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Português");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_POR_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_POR_ImageTest" + e);
		}
	}
	
	@Test (priority=56)
	public void BannerTranslationInShopAllCategoriesPage_POR_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_POR_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_POR_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_POR_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_POR_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_POR_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_POR_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=57)
	public void BannerTranslationInShopAllCategoriesPage_POR_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_POR_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Corra logo, acaba em "));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_POR_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_POR_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=58)
	public void BannerTranslationInShopAllCategoriesPage_RON_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_RON_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("limba română");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_RON_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_RON_ImageTest" + e);
		}
	}
	
	@Test (priority=59)
	public void BannerTranslationInShopAllCategoriesPage_RON_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_RON_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_RON_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_RON_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_RON_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_RON_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_RON_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=60)
	public void BannerTranslationInShopAllCategoriesPage_RON_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_RON_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Grăbiți-vă, expiră pe "));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_RON_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_RON_HurryTranslationTest" + e);
		}
	}
	
	/*@Test (priority=88)
	public void BannerTranslationInShopAllCategoriesPage_RUS_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_RUS_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("русский язык");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_RUS_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_RUS_ImageTest" + e);
		}
	}
	
	@Test (priority=89)
	public void BannerTranslationInShopAllCategoriesPage_RUS_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_RUS_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_RUS_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_RUS_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_RUS_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_RUS_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_RUS_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=90)
	public void BannerTranslationInShopAllCategoriesPage_RUS_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_RUS_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Поторопитесь! Распродажа заканчивается "));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_RUS_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_RUS_HurryTranslationTest" + e);
		}
	}*/
	
	@Test (priority=64)
	public void BannerTranslationInShopAllCategoriesPage_SLK_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_SLK_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("slovenčina");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_SLK_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_SLK_ImageTest" + e);
		}
	}
	
	@Test (priority=65)
	public void BannerTranslationInShopAllCategoriesPage_SLK_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_SLK_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_SLK_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_SLK_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_SLK_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_SLK_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_SLK_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=66)
	public void BannerTranslationInShopAllCategoriesPage_SLK_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_SLK_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Ponáhľajte sa, zľavy končia "));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_SLK_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_SLK_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=67)
	public void BannerTranslationInShopAllCategoriesPage_SLV_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_MSA_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("slovenščina");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_SLV_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_SLV_ImageTest" + e);
		}
	}
	
	@Test (priority=68)
	public void BannerTranslationInShopAllCategoriesPage_SLV_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_SLV_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_SLV_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_SLV_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_SLV_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_SLV_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_SLV_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=69)
	public void BannerTranslationInShopAllCategoriesPage_SLV_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_SLV_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Pohitite, poteče "));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_SLV_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_SLV_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=70)
	public void BannerTranslationInShopAllCategoriesPage_SPA_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_SPA_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Español");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_SPA_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_SPA_ImageTest" + e);
		}
	}
	
	@Test (priority=71)
	public void BannerTranslationInShopAllCategoriesPage_SPA_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_SPA_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_SPA_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_SPA_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_SPA_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_SPA_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_SPA_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=72)
	public void BannerTranslationInShopAllCategoriesPage_SPA_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_SPA_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Dése prisa: termina el "));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_SPA_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_SPA_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=73)
	public void BannerTranslationInShopAllCategoriesPage_SWE_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_SWE_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Svenska");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_SWE_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_SWE_ImageTest" + e);
		}
	}
	
	@Test (priority=74)
	public void BannerTranslationInShopAllCategoriesPage_SWE_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_SWE_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_SWE_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_SWE_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_SWE_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_SWE_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_SWE_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=75)
	public void BannerTranslationInShopAllCategoriesPage_SWE_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_SWE_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Skynda dig, den slutar "));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_SWE_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_SWE_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=76)
	public void BannerTranslationInShopAllCategoriesPage_THA_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_THA_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("ไทย");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_THA_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_THA_ImageTest" + e);
		}
	}
	
	@Test (priority=77)
	public void BannerTranslationInShopAllCategoriesPage_THA_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_THA_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_THA_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_THA_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_THA_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_THA_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_THA_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=78)
	public void BannerTranslationInShopAllCategoriesPage_THA_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_THA_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("ด่วน หมดเขตวันที่ "));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_THA_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_THA_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=79)
	public void BannerTranslationInShopAllCategoriesPage_TUR_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_TUR_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Türkçe");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_TUR_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_TUR_ImageTest" + e);
		}
	}
	
	@Test (priority=80)
	public void BannerTranslationInShopAllCategoriesPage_TUR_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_TUR_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_TUR_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_TUR_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_TUR_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_TUR_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_TUR_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=81)
	public void BannerTranslationInShopAllCategoriesPage_TUR_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_TUR_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue((hurryText.contains("Acele Edin ")) && (hurryText.contains(" tarihinde bitiyor")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_TUR_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_TUR_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=82)
	public void BannerTranslationInShopAllCategoriesPage_VIE_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_VIE_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Tiếng Việt");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_VIE_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_VIE_ImageTest" + e);
		}
	}
	
	@Test (priority=83)
	public void BannerTranslationInShopAllCategoriesPage_VIE_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_VIE_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_VIE_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_VIE_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_VIE_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_VIE_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_VIE_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=84)
	public void BannerTranslationInShopAllCategoriesPage_VIE_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_VIE_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue(hurryText.contains("Nhanh tay lên! Hết hạn "));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_VIE_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_VIE_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=85)
	public void BannerTranslationInShopAllCategoriesPage_ZHS_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_ZHS_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("中文简体");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_ZHS_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_ZHS_ImageTest" + e);
		}
	}
	
	@Test (priority=86)
	public void BannerTranslationInShopAllCategoriesPage_ZHS_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_ZHS_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_ZHS_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_ZHS_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_ZHS_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_ZHS_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_ZHS_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=87)
	public void BannerTranslationInShopAllCategoriesPage_ZHS_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_ZHS_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue((hurryText.contains("抓紧 ")) && (hurryText.contains(" 到期")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_ZHS_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_ZHS_HurryTranslationTest" + e);
		}
	}
	
	@Test (priority=61)
	public void BannerTranslationInShopAllCategoriesPage_ZHT_ImageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_ZHT_ImageTest - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("中文繁体");
			Thread.sleep(1000);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(700);
			takeSnapShot();
			String bSize = HomePageActions.GetHomePageBannerSize();
			Assert.assertEquals(bSize, "small");
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_ZHT_ImageTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_ZHT_ImageTest" + e);
		}
	}
	
	@Test (priority=62)
	public void BannerTranslationInShopAllCategoriesPage_ZHT_SourceCodeTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_ZHT_SourceCodeTest - TC Start");
			String pageSrc = driver.getPageSource(); 
			Thread.sleep(700);
			Assert.assertTrue((pageSrc.contains("/files/assets/images/Banners/Website_Banners/30/30_ZHT_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/50/50_ZHT_small.png?")) || (pageSrc.contains("/files/assets/images/Banners/Website_Banners/BOGO/BOGO_ZHT_small.png?")));
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_ZHT_SourceCodeTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_ZHT_SourceCodeTest" + e);
		}
	}
	
	@Test (priority=63)
	public void BannerTranslationInShopAllCategoriesPage_ZHT_HurryTranslationTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationInShopAllCategoriesPage_ZHT_HurryTranslationTest - TC Start");
			String hurryText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(700);
			Assert.assertTrue((hurryText.contains("抓緊 ")) && (hurryText.contains(" 到期")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationInShopAllCategoriesPage_ZHT_HurryTranslationTest - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationInShopAllCategoriesPage_ZHT_HurryTranslationTest" + e);
		}
	}
		
	@AfterTest
	public void driverClose() throws Exception {
		closeDriver();
	}

}

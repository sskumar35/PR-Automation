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

public class BannerTranslationForExpiryMonthTest extends CommonUtils{
	
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
		String prodId1 = "6015";
		HomePageActions.SearchForAProduct(prodId1);
		HomePageActions.ClickSearchButton();
	}
	
	@Test (priority=6)
	public void BannerTranslationForExpiryMonthTest_AZE() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_AZE - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("azərbaycan dili");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Yanvar")) || (monthText.contains("Fevral")) || 
					          (monthText.contains("Mart")) || (monthText.contains("Aprel")) || 
					          (monthText.contains("May")) || (monthText.contains("İyun")) || 
					          (monthText.contains("İyul")) || (monthText.contains("Avqust")) || 
					          (monthText.contains("Sentyabr")) || (monthText.contains("Oktyabr")) || 
					          (monthText.contains("Noyabr")) || (monthText.contains("Dekabr")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_AZE - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_AZE" + e);
		}
	}
	
	@Test (priority=2)
	public void BannerTranslationForExpiryMonthTest_BUL() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_BUL - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("български език");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Януари")) || (monthText.contains("Февруари")) || 
					          (monthText.contains("Март")) || (monthText.contains("Април")) || 
					          (monthText.contains("Май")) || (monthText.contains("Юни")) || 
					          (monthText.contains("Юли")) || (monthText.contains("Август")) || 
					          (monthText.contains("Септември")) || (monthText.contains("Октомври")) || 
					          (monthText.contains("Ноември")) || (monthText.contains("Декември")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_BUL - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_BUL" + e);
		}
	}
	
	@Test (priority=3)
	public void BannerTranslationForExpiryMonthTest_DAN() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_DAN - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("dansk");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Januar")) || (monthText.contains("Februar")) || 
					          (monthText.contains("Marts")) || (monthText.contains("April")) || 
					          (monthText.contains("Maj")) || (monthText.contains("Juni")) || 
					          (monthText.contains("Juli")) || (monthText.contains("August")) || 
					          (monthText.contains("September")) || (monthText.contains("Oktober")) || 
					          (monthText.contains("November")) || (monthText.contains("December")));
			driver.navigate().refresh();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_DAN" + e);
		}
	}
	
	@Test (priority=4)
	public void BannerTranslationForExpiryMonthTest_DEU() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_DEU - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Deutsch");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Januar")) || (monthText.contains("Februar")) || 
					          (monthText.contains("März")) || (monthText.contains("April")) || 
					          (monthText.contains("Mai")) || (monthText.contains("Juni")) || 
					          (monthText.contains("Juli")) || (monthText.contains("August")) || 
					          (monthText.contains("September")) || (monthText.contains("Oktober")) || 
					          (monthText.contains("November")) || (monthText.contains("Dezember")));
			driver.navigate().refresh();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_DEU" + e);
		}
	}
	
	@Test (priority=5)
	public void BannerTranslationForExpiryMonthTest_ELL() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_ELL - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("ελληνικά");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Ιανουάριος")) || (monthText.contains("Φεβρουάριος")) || 
					          (monthText.contains("Μάρτιος")) || (monthText.contains("Απρίλιος")) || 
					          (monthText.contains("Μάιος")) || (monthText.contains("Ιούνιος")) || 
					          (monthText.contains("Ιούλιος")) || (monthText.contains("Αύγουστος")) || 
					          (monthText.contains("Σεπτέμβριος")) || (monthText.contains("Οκτώβριος")) || 
					          (monthText.contains("Νοέμβριος")) || (monthText.contains("Δεκέμβριος")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_ELL - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_ELL" + e);
		}
	}
	
	@Test (priority=1)
	public void BannerTranslationForExpiryMonthTest_ENG() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_ENG - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("January")) || (monthText.contains("February")) || 
					          (monthText.contains("March")) || (monthText.contains("April")) || 
					          (monthText.contains("May")) || (monthText.contains("June")) || 
					          (monthText.contains("July")) || (monthText.contains("August")) || 
					          (monthText.contains("September")) || (monthText.contains("October")) || 
					          (monthText.contains("November")) || (monthText.contains("December")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_ENG - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_ENG" + e);
		}
	}
	
	@Test (priority=7)
	public void BannerTranslationForExpiryMonthTest_FIN() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_FIN - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("suomi");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Tammikuu")) || (monthText.contains("Helmikuu")) || 
					          (monthText.contains("Maaliskuu")) || (monthText.contains("Huhtikuu")) || 
					          (monthText.contains("Toukokuu")) || (monthText.contains("Kesäkuu")) || 
					          (monthText.contains("Heinäkuu")) || (monthText.contains("Elokuu")) || 
					          (monthText.contains("Syyskuu")) || (monthText.contains("Lokakuu")) || 
					          (monthText.contains("Marraskuu")) || (monthText.contains("Joulukuu")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_FIN - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_FIN" + e);
		}
	}
	
	@Test (priority=8)
	public void BannerTranslationForExpiryMonthTest_FRA() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_FRA - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Français");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Janvier")) || (monthText.contains("Février")) || 
					          (monthText.contains("Mars")) || (monthText.contains("Avril")) || 
					          (monthText.contains("Mai")) || (monthText.contains("Juin")) || 
					          (monthText.contains("Juillet")) || (monthText.contains("Août")) || 
					          (monthText.contains("Septembre")) || (monthText.contains("Octobre")) || 
					          (monthText.contains("Novembre")) || (monthText.contains("Décembre")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_FRA - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_FRA" + e);
		}
	}
	
	@Test (priority=9)
	public void BannerTranslationForExpiryMonthTest_HRV() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_HRV - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("hrvatski jezik");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Siječanj")) || (monthText.contains("Veljača")) || 
					          (monthText.contains("Ožujak")) || (monthText.contains("Travanj")) || 
					          (monthText.contains("Svibanj")) || (monthText.contains("Lipanj")) || 
					          (monthText.contains("Srpanj")) || (monthText.contains("Kolovoz")) || 
					          (monthText.contains("Rujan")) || (monthText.contains("Listopad")) || 
					          (monthText.contains("Studeni")) || (monthText.contains("Prosinac")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_HRV - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_HRV" + e);
		}
	}
	
	@Test (priority=10)
	public void BannerTranslationForExpiryMonthTest_HUN() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_HUN - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("magyar");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Január")) || (monthText.contains("Február")) || 
					          (monthText.contains("Március")) || (monthText.contains("Április")) || 
					          (monthText.contains("Május")) || (monthText.contains("Június")) || 
					          (monthText.contains("Július")) || (monthText.contains("Augusztus")) || 
					          (monthText.contains("Szeptember")) || (monthText.contains("Október")) || 
					          (monthText.contains("November")) || (monthText.contains("December")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_HUN - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_HUN" + e);
		}
	}
	
	@Test (priority=11)
	public void BannerTranslationForExpiryMonthTest_IND() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_IND - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Bahasa Indonesia");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Januari")) || (monthText.contains("Februari")) || 
					          (monthText.contains("Maret")) || (monthText.contains("April")) || 
					          (monthText.contains("Mei")) || (monthText.contains("Juni")) || 
					          (monthText.contains("Juli")) || (monthText.contains("Agustus")) || 
					          (monthText.contains("September")) || (monthText.contains("Oktober")) || 
					          (monthText.contains("November")) || (monthText.contains("Desember")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_IND - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_IND" + e);
		}
	}
	
	@Test (priority=12)
	public void BannerTranslationForExpiryMonthTest_ITA() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_ITA - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Italiano");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Gennaio")) || (monthText.contains("Febbraio")) || 
					          (monthText.contains("Marzo")) || (monthText.contains("Aprile")) || 
					          (monthText.contains("Maggio")) || (monthText.contains("Giugno")) || 
					          (monthText.contains("Luglio")) || (monthText.contains("Agosto")) || 
					          (monthText.contains("Settembre")) || (monthText.contains("Ottobre")) || 
					          (monthText.contains("Novembre")) || (monthText.contains("Dicembre")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_ITA - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_ITA" + e);
		}
	}
	
	@Test (priority=13)
	public void BannerTranslationForExpiryMonthTest_JPN() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_JPN - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("日本語 (にほんご)");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("1月")) || (monthText.contains("2月")) || 
					          (monthText.contains("3月")) || (monthText.contains("4月")) || 
					          (monthText.contains("5月")) || (monthText.contains("6月")) || 
					          (monthText.contains("7月")) || (monthText.contains("8月")) || 
					          (monthText.contains("9月")) || (monthText.contains("10月")) || 
					          (monthText.contains("11月")) || (monthText.contains("12月")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_JPN - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_JPN" + e);
		}
	}
	
	@Test (priority=14)
	public void BannerTranslationForExpiryMonthTest_KOR() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_KOR - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("한국어");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("1월")) || (monthText.contains("2월")) || 
					          (monthText.contains("3월")) || (monthText.contains("4월")) || 
					          (monthText.contains("5월")) || (monthText.contains("6월")) || 
					          (monthText.contains("7월")) || (monthText.contains("8월")) || 
					          (monthText.contains("9월")) || (monthText.contains("10월")) || 
					          (monthText.contains("11월")) || (monthText.contains("12월")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_KOR - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_KOR" + e);
		}
	}
	
	@Test (priority=15)
	public void BannerTranslationForExpiryMonthTest_MSA() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_MSA - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Bahasa Melayu");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Januari")) || (monthText.contains("Februari")) || 
					          (monthText.contains("Mac")) || (monthText.contains("April")) || 
					          (monthText.contains("Mei")) || (monthText.contains("Jun")) || 
					          (monthText.contains("Julai")) || (monthText.contains("Ogos")) || 
					          (monthText.contains("September")) || (monthText.contains("Oktober")) || 
					          (monthText.contains("November")) || (monthText.contains("Disember")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_MSA - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_MSA" + e);
		}
	}
	
	@Test (priority=16)
	public void BannerTranslationForExpiryMonthTest_NLD() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_NLD - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Dutch");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Januari")) || (monthText.contains("Februari")) || 
					          (monthText.contains("Maart")) || (monthText.contains("April")) || 
					          (monthText.contains("Mei")) || (monthText.contains("Juni")) || 
					          (monthText.contains("Juli")) || (monthText.contains("Augustus")) || 
					          (monthText.contains("September")) || (monthText.contains("Oktober")) || 
					          (monthText.contains("November")) || (monthText.contains("December")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_NLD - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_NLD" + e);
		}
	}
	
	@Test (priority=17)
	public void BannerTranslationForExpiryMonthTest_NOR() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_NOR - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Norsk");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Januar")) || (monthText.contains("Februar")) || 
					          (monthText.contains("Mars")) || (monthText.contains("April")) || 
					          (monthText.contains("Mai")) || (monthText.contains("Juni")) || 
					          (monthText.contains("Juli")) || (monthText.contains("August")) || 
					          (monthText.contains("September")) || (monthText.contains("Oktober")) || 
					          (monthText.contains("November")) || (monthText.contains("Desember")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_NOR - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_NOR" + e);
		}
	}
	
	@Test (priority=18)
	public void BannerTranslationForExpiryMonthTest_POL() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_POL - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("język polski");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Styczeń")) || (monthText.contains("Luty")) || 
					          (monthText.contains("Marzec")) || (monthText.contains("Kwiecień")) || 
					          (monthText.contains("Maj")) || (monthText.contains("Czerwiec")) || 
					          (monthText.contains("Lipiec")) || (monthText.contains("Sierpień")) || 
					          (monthText.contains("Wrzesień")) || (monthText.contains("Październik")) || 
					          (monthText.contains("Listopad")) || (monthText.contains("Grudzień")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_POL - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_POL" + e);
		}
	}
	
	@Test (priority=19)
	public void BannerTranslationForExpiryMonthTest_POR() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_POR - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Português");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Janeiro")) || (monthText.contains("Fevereiro")) || 
					          (monthText.contains("Março")) || (monthText.contains("Abril")) || 
					          (monthText.contains("Maio")) || (monthText.contains("Junho")) || 
					          (monthText.contains("Julho")) || (monthText.contains("Agosto")) || 
					          (monthText.contains("Setembro")) || (monthText.contains("Outubro")) || 
					          (monthText.contains("Novembro")) || (monthText.contains("Dezembro")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_POR - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_POR" + e);
		}
	}
	
	@Test (priority=20)
	public void BannerTranslationForExpiryMonthTest_RON() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_RON - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("limba română");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Ianuarie")) || (monthText.contains("Februarie")) || 
					          (monthText.contains("Martie")) || (monthText.contains("Aprilie")) || 
					          (monthText.contains("Mai")) || (monthText.contains("Iunie")) || 
					          (monthText.contains("Iulie")) || (monthText.contains("August")) || 
					          (monthText.contains("Septembrie")) || (monthText.contains("Octombrie")) || 
					          (monthText.contains("Noiembrie")) || (monthText.contains("Decembrie")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_RON - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_RON" + e);
		}
	}
	
	/*@Test (priority=30)
	public void BannerTranslationForExpiryMonthTest_RUS() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_RUS - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("русский язык");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Январь")) || (monthText.contains("Фефраль")) || 
					          (monthText.contains("Март")) || (monthText.contains("Апрель")) || 
					          (monthText.contains("Май")) || (monthText.contains("Июнь")) || 
					          (monthText.contains("Июль")) || (monthText.contains("Август")) || 
					          (monthText.contains("Сентябрь")) || (monthText.contains("Октябрь")) || 
					          (monthText.contains("Ноябрь")) || (monthText.contains("Декабрь")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_RUS - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_RUS" + e);
		}
	}*/
	
	@Test (priority=21)
	public void BannerTranslationForExpiryMonthTest_SLK() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_SLK - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("slovenčina");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Január")) || (monthText.contains("Február")) || 
					          (monthText.contains("Marec")) || (monthText.contains("Apríl")) || 
					          (monthText.contains("Máj")) || (monthText.contains("Jún")) || 
					          (monthText.contains("Júl")) || (monthText.contains("August")) || 
					          (monthText.contains("September")) || (monthText.contains("Október")) || 
					          (monthText.contains("November")) || (monthText.contains("December")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_SLK - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_SLK" + e);
		}
	}
	
	@Test (priority=22)
	public void BannerTranslationForExpiryMonthTest_SLV() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_SLV - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("slovenščina");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Januar")) || (monthText.contains("Februar")) || 
					          (monthText.contains("Marec")) || (monthText.contains("April")) || 
					          (monthText.contains("Maj")) || (monthText.contains("Junij")) || 
					          (monthText.contains("Julij")) || (monthText.contains("Avgust")) || 
					          (monthText.contains("September")) || (monthText.contains("Oktober")) || 
					          (monthText.contains("November")) || (monthText.contains("December")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_SLV - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_SLV" + e);
		}
	}
	
	@Test (priority=23)
	public void BannerTranslationForExpiryMonthTest_SPA() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_SPA - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Español");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Enero")) || (monthText.contains("Febrero")) || 
					          (monthText.contains("Marzo")) || (monthText.contains("Abril")) || 
					          (monthText.contains("Mayo")) || (monthText.contains("Junio")) || 
					          (monthText.contains("Julio")) || (monthText.contains("Agosto")) || 
					          (monthText.contains("Septiembre")) || (monthText.contains("Octubre")) || 
					          (monthText.contains("Noviembre")) || (monthText.contains("Diciembre")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_SPA - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_SPA" + e);
		}
	}
	
	@Test (priority=24)
	public void BannerTranslationForExpiryMonthTest_SWE() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_SWE - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Svenska");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Januari")) || (monthText.contains("Februari")) || 
					          (monthText.contains("Mars")) || (monthText.contains("April")) || 
					          (monthText.contains("Maj")) || (monthText.contains("Juni")) || 
					          (monthText.contains("Juli")) || (monthText.contains("Augusti")) || 
					          (monthText.contains("September")) || (monthText.contains("Oktober")) || 
					          (monthText.contains("November")) || (monthText.contains("December")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_SWE - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_SWE" + e);
		}
	}
	
	@Test (priority=25)
	public void BannerTranslationForExpiryMonthTest_THA() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_THA - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("ไทย");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("มกราคม")) || (monthText.contains("กุมภาพันธ์")) || 
					          (monthText.contains("มีนาคม")) || (monthText.contains("เมษายน")) || 
					          (monthText.contains("พฤษภาคม")) || (monthText.contains("มิถุนายน")) || 
					          (monthText.contains("กรกฎาคม")) || (monthText.contains("สิงหาคม")) || 
					          (monthText.contains("กันยายน")) || (monthText.contains("ตุลาคม")) || 
					          (monthText.contains("พฤศจิกายน")) || (monthText.contains("ธันวาคม")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_THA - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_THA" + e);
		}
	}
	
	@Test (priority=26)
	public void BannerTranslationForExpiryMonthTest_TUR() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_TUR - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Türkçe");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Ocak")) || (monthText.contains("Şubat")) || 
					          (monthText.contains("Mart")) || (monthText.contains("Nisan")) || 
					          (monthText.contains("Mayıs")) || (monthText.contains("Haziran")) || 
					          (monthText.contains("Temmuz")) || (monthText.contains("Ağustos")) || 
					          (monthText.contains("Eylül")) || (monthText.contains("Ekim")) || 
					          (monthText.contains("Kasım")) || (monthText.contains("Aralık")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_TUR - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_TUR" + e);
		}
	}
	
	@Test (priority=27)
	public void BannerTranslationForExpiryMonthTest_VIE() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_VIE - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Tiếng Việt");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("Tháng Một")) || (monthText.contains("Tháng Hai")) || 
					          (monthText.contains("Tháng Ba")) || (monthText.contains("Tháng Tư")) || 
					          (monthText.contains("Tháng Năm")) || (monthText.contains("Tháng Sáu")) || 
					          (monthText.contains("Tháng Bảy")) || (monthText.contains("Tháng Tám")) || 
					          (monthText.contains("Tháng Chín")) || (monthText.contains("Tháng Mười")) || 
					          (monthText.contains("Tháng Mười Một")) || (monthText.contains("Tháng Mười Hai")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_VIE - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_VIE" + e);
		}
	}
	
	@Test (priority=28)
	public void BannerTranslationForExpiryMonthTest_ZHS() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_ZHS - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("中文简体");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("一月")) || (monthText.contains("二月")) || 
					          (monthText.contains("三月")) || (monthText.contains("四月")) || 
					          (monthText.contains("五月")) || (monthText.contains("六月")) || 
					          (monthText.contains("七月")) || (monthText.contains("八月")) || 
					          (monthText.contains("九月")) || (monthText.contains("十月")) || 
					          (monthText.contains("十一月")) || (monthText.contains("十二月")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_ZHS - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_ZHS" + e);
		}
	}
	
	@Test (priority=29)
	public void BannerTranslationForExpiryMonthTest_ZHT() throws Exception{
		try {
			TestLogger.testLoggerTCStart("BannerTranslationForExpiryMonthTest_ZHT - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			Thread.sleep(500);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("中文繁体");
			Thread.sleep(500);
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(500);
			takeSnapShot();
			String monthText = HomePageActions.GetHurryTextInBanner();
			Thread.sleep(500);
			Assert.assertTrue((monthText.contains("一月")) || (monthText.contains("二月")) || 
					          (monthText.contains("三月")) || (monthText.contains("四月")) || 
					          (monthText.contains("五月")) || (monthText.contains("六月")) || 
					          (monthText.contains("七月")) || (monthText.contains("八月")) || 
					          (monthText.contains("九月")) || (monthText.contains("十月")) || 
					          (monthText.contains("十一月")) || (monthText.contains("十二月")));
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("BannerTranslationForExpiryMonthTest_ZHT - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("BannerTranslationForExpiryMonthTest_ZHT" + e);
		}
	}
		
	@AfterTest
	public void driverClose() throws Exception {
		closeDriver();
	}

}

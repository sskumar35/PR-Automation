package com.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BusinessComponents.CountrySelectorActions;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

import junit.framework.Assert;

public class CustomLanguagesBasedOnFrance extends CommonUtils{
	
	@BeforeTest
	public void setUp() throws Exception {
		init();	
	}
	
	@Test(priority=1)
	public void FrenchAndOtherLanguagesTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Country Selector Based On French And OtherLanguages Test Case");
			
			CountrySelectorActions.SearchCountryDropDownInModalWindow("France");
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("English");
			String HeaderForUS = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForUS.contains("We proudly ship to over 160 countries!"));
			takeSnapShot();

			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Español");
			String HeaderForES = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForES.contains("¡Mandamos pedidos a más de 160 países!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Français");
			String HeaderForFR = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForFR.contains("Nous sommes fiers de livrer vers plus de 160 pays !"));
			takeSnapShot();

			CountrySelectorActions.SearchLanguageDropDownInModalWindow("日本語 (にほんご)");
			String HeaderForJP = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForJP.contains("160 を超える国と地域に配送いたします"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("azərbaycan dili");
			String HeaderForAZ = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForAZ.contains("Biz fəxrlə 160-dan çox ölkəyə çatdırırıq!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("български език");
			String HeaderForBL = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForBL.contains("Гордеем се, че изпращаме до над 160 страни!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("dansk");
			String HeaderForDN = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForDN.contains("Vi sender til over 160 lande!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Deutsch");
			String HeaderForGM = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForGM.contains("Wir liefern in mehr als 160 Länder!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("ελληνικά");
			String HeaderForGK = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForGK.contains("Εκτελούμε αποστολές με υπερηφάνεια σε περσισσότερες από 160 χώρες!"));
			takeSnapShot();

			CountrySelectorActions.SearchLanguageDropDownInModalWindow("suomi");
			String HeaderForFN = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForFN.contains("Toimitamme paketteja 160 eri maahan!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("hrvatski jezik");
			String HeaderForCR = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForCR.contains("Ponosni smo što isporučujemo u više od 160 zemalja!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("magyar");
			String HeaderForHN = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForHN.contains("Több mint 160 országba szállítjuk termékeinket!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Bahasa Indonesia");
			String HeaderForIN = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForIN.contains("Kami dengan bangga dapat mengirim ke lebih dari 160 negara!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Italiano");
			String HeaderForIT = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForIT.contains("Siamo orgogliosi di effettuare spedizioni in più di 160 paesi!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("한국어");
			String HeaderForKO = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForKO.contains("당사는 160개국 이상에 배송하고 있습니다!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Bahasa Melayu");
			String HeaderForMA = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForMA.contains("Kami dengan bangganya menghantar ke lebih 160 negara!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Dutch");
			String HeaderForNED = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForNED.contains("Wij zijn er trots op dat wij in meer dan 160 landen leveren!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Norsk");
			String HeaderForNOR = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForNOR.contains("Vi er stolte over å sende til fler enn 160 land!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("język polski");
			String HeaderForPOL = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForPOL.contains("Dostarczamy do ponad 160 krajów!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Português");
			String HeaderForPOR = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForPOR.contains("Temos o maior orgulho em servir mais de 160 países!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("limba română");
			String HeaderForRO = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForRO.contains("Livrăm cu plăcere în peste 160 de țări!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("русский язык");
			String HeaderForRUS = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForRUS.contains("Мы с гордостью осуществляем доставку в 160 стран по всему миру!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("slovenčina");
			String HeaderForSLO = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForSLO.contains("S hrdosťou zasielame tovar do viac ako 160 krajín!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("slovenščina");
			String HeaderForSLA = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForSLA.contains("Dostavljamo v več kot 160 držav."));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Svenska");
			String HeaderForSWE = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForSWE.contains("Vi är stolta över att kunna leverera till över 160 länder!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("ไทย");
			String HeaderForTHA = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForTHA.contains("เราภาคภูมิใจที่ได้จัดส่งสินค้าสู่ประเทศกว่า 160 ประเทศ!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Türkçe");
			String HeaderForTUR = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForTUR.contains("Gururla 160'dan fazla ülkeye gönderim yapıyoruz!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Tiếng Việt");
			String HeaderForVIE = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForVIE.contains("Chúng tôi tự hào có thể giao hàng đến hơn 160 quốc gia!"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("中文简体");
			String HeaderForCHN = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForCHN.contains("我们自豪地运送到全球 160 多个国家和地区！"));
			takeSnapShot();
			
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("中文繁体");
			String HeaderForMAN = CountrySelectorActions.GetCountrySelectorPageHeader();
			Assert.assertTrue(HeaderForMAN.contains("我們的商品可以運送到超過 160 個國家/地區！"));
			takeSnapShot();
			
			TestLogger.testLoggerTCEnd("Country Selector Based On French And OtherLanguages Test Case");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Country Selector Based On French Test Case FAILS" + e);
		}

	}

}

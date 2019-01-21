package com.TestCases;

import java.text.DecimalFormat;

import org.openqa.selenium.JavascriptExecutor;
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

public class BazaarVoiceReviewTestValidationForGerman extends CommonUtils{
	
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
	public void NonGoogleShoppingUser_BazaarVoiceReviewTestValidationForGerman_GERMANY() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Bazaar Voice Review Test Validation For German_GERMANY - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Germany");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(1000);
			String prodId1 = "912";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();			
			ProductDetailPageActions.ClickViewReviewsTab();
			takeSnapShot();
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
			takeSnapShot();
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(1000);
			takeSnapShot();
			double valForAvgStarRating = ProductDetailPageActions.ValidateAvgOverallRatingFromStar();
			DecimalFormat d = new DecimalFormat("##.0");
			String rABR = ProductDetailPageActions.GetAvgOverallBVRatings();
			System.out.println("Average Overall BV Ratings: " + rABR);
			String rOQS = ProductDetailPageActions.GetAvgOverallQualityRatings();
			System.out.println("Average Overall Quality Ratings: " + rOQS);
			String rOVS = ProductDetailPageActions.GetAvgOverallValueRatings();
			System.out.println("Average Overall Value Ratings: " + rOVS);
			String r5 = ProductDetailPageActions.GetRatingSnapShot5Star();
			System.out.println("Average 5 Star Total Ratings: " + r5);
			String r4 = ProductDetailPageActions.GetRatingSnapShot4Star();
			System.out.println("Average 4 Star Total Ratings: " + r4);
			String r3 = ProductDetailPageActions.GetRatingSnapShot3Star();
			System.out.println("Average 3 Star Total Ratings: " + r3);
			String r2 = ProductDetailPageActions.GetRatingSnapShot2Star();
			System.out.println("Average 2 Star Total Ratings: " + r2);
			String r1 = ProductDetailPageActions.GetRatingSnapShot1Star();
			System.out.println("Average 1 Star Total Ratings: " + r1);
			//takeSnapShot();
			String rOR = ProductDetailPageActions.GetRatingOnlyReviews();
			System.out.println("Ratings Only Reviews: "+ rOR);
			String rOL = ProductDetailPageActions.GetReviewsInOtherLanguages();
			System.out.println("Reviews In Other Languages: " + rOL);
			String titleChk1 = ProductDetailPageActions.GetAvgCustRatingsTitleInPanel();
			System.out.println("Avg Cust Ratings Title In Panel " + titleChk1);
			String titleChk2 = ProductDetailPageActions.GetAvgCustOverallRatingsTitle();
			System.out.println("Avg Cust Overall Ratings " + titleChk2);
			String titleChk3 = ProductDetailPageActions.GetAvgCustOverallQualityRatingsTitle();
			System.out.println("Avg Cust Overall Quality Ratings Title " + titleChk3);
			String titleChk4 = ProductDetailPageActions.GetAvgCustOverallValueRatingsTitle();
			System.out.println("Avg Cust Overall Value Ratings Title " + titleChk4);
			String titleChk5 = ProductDetailPageActions.GetRatingSnapshotFilterTitle();
			System.out.println("Rating Snapshot Filter Title " + titleChk5);
			String titleChk6 = ProductDetailPageActions.GetReviewPanelHeaderTitle();
			System.out.println("Review Panel Header Title " + titleChk6);
			String titleChk7 = ProductDetailPageActions.GetRatingSnapshotTitle();
			System.out.println("Rating Snapshot Title " + titleChk7);
			String pageSrc = driver.getPageSource(); 
			Assert.assertTrue(pageSrc.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/staging/de_DE/bv.js"));
			Assert.assertEquals(d.format(valForAvgStarRating), rABR);
			Assert.assertEquals(titleChk1, "Durchschnittliche Kundenbeurteilungen");
			Assert.assertEquals(titleChk2, "Gesamt");
			Assert.assertEquals(titleChk3, "Qualität des Produkts");
			Assert.assertEquals(titleChk4, "Wert des Produkts");
			Assert.assertEquals(titleChk5, "Wählen Sie unten eine Reihe aus, um Bewertungen zu filtern.");
			Assert.assertEquals(titleChk6, "Bewertungen");
			Assert.assertEquals(titleChk7, "Beurteilungsüberblick");
			TestLogger.testLoggerTCEnd("Bazaar Voice Review Test Validation For German_GERMANY - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Bazaar Voice Review Test Validation For German_GERMANY - Failed" + e);
		}
	}
	
	@Test (priority=1)
	public void NonGoogleShoppingUser_BazaarVoiceReviewTestValidationForGerman_AUSTRIA() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Bazaar Voice Review Test Validation For German_AUSTRIA - TC Start");
			HomePageActions.ClickPipingRockLogoHeader();
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Austria");
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Deutsch");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(1000);
			String prodId1 = "912";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();			
			ProductDetailPageActions.ClickViewReviewsTab();
			takeSnapShot();
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
			takeSnapShot();
			js.executeScript("window.scrollBy(0,800)");
			Thread.sleep(1000);
			takeSnapShot();
			double valForAvgStarRating = ProductDetailPageActions.ValidateAvgOverallRatingFromStar();
			DecimalFormat d = new DecimalFormat("##.0");
			String rABR = ProductDetailPageActions.GetAvgOverallBVRatings();
			System.out.println("Average Overall BV Ratings: " + rABR);
			String rOQS = ProductDetailPageActions.GetAvgOverallQualityRatings();
			System.out.println("Average Overall Quality Ratings: " + rOQS);
			String rOVS = ProductDetailPageActions.GetAvgOverallValueRatings();
			System.out.println("Average Overall Value Ratings: " + rOVS);
			String r5 = ProductDetailPageActions.GetRatingSnapShot5Star();
			System.out.println("Average 5 Star Total Ratings: " + r5);
			String r4 = ProductDetailPageActions.GetRatingSnapShot4Star();
			System.out.println("Average 4 Star Total Ratings: " + r4);
			String r3 = ProductDetailPageActions.GetRatingSnapShot3Star();
			System.out.println("Average 3 Star Total Ratings: " + r3);
			String r2 = ProductDetailPageActions.GetRatingSnapShot2Star();
			System.out.println("Average 2 Star Total Ratings: " + r2);
			String r1 = ProductDetailPageActions.GetRatingSnapShot1Star();
			System.out.println("Average 1 Star Total Ratings: " + r1);
			//takeSnapShot();
			String rOR = ProductDetailPageActions.GetRatingOnlyReviews();
			System.out.println("Ratings Only Reviews: "+ rOR);
			String rOL = ProductDetailPageActions.GetReviewsInOtherLanguages();
			System.out.println("Reviews In Other Languages: " + rOL);
			String titleChk1 = ProductDetailPageActions.GetAvgCustRatingsTitleInPanel();
			System.out.println("Avg Cust Ratings Title In Panel " + titleChk1);
			String titleChk2 = ProductDetailPageActions.GetAvgCustOverallRatingsTitle();
			System.out.println("Avg Cust Overall Ratings " + titleChk2);
			String titleChk3 = ProductDetailPageActions.GetAvgCustOverallQualityRatingsTitle();
			System.out.println("Avg Cust Overall Quality Ratings Title " + titleChk3);
			String titleChk4 = ProductDetailPageActions.GetAvgCustOverallValueRatingsTitle();
			System.out.println("Avg Cust Overall Value Ratings Title " + titleChk4);
			String titleChk5 = ProductDetailPageActions.GetRatingSnapshotFilterTitle();
			System.out.println("Rating Snapshot Filter Title " + titleChk5);
			String titleChk6 = ProductDetailPageActions.GetReviewPanelHeaderTitle();
			System.out.println("Review Panel Header Title " + titleChk6);
			String titleChk7 = ProductDetailPageActions.GetRatingSnapshotTitle();
			System.out.println("Rating Snapshot Title " + titleChk7);
			String pageSrc = driver.getPageSource(); 
			Assert.assertTrue(pageSrc.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/staging/de_AT/bv.js"));
			Assert.assertEquals(titleChk1, "Durchschnittliche Kundenbeurteilungen");
			Assert.assertEquals(titleChk2, "Gesamt");
			Assert.assertEquals(titleChk3, "Qualität des Produkts");
			Assert.assertEquals(titleChk4, "Wert des Produkts");
			Assert.assertEquals(titleChk5, "Wählen Sie unten eine Reihe aus, um Bewertungen zu filtern.");
			Assert.assertEquals(titleChk6, "Bewertungen");
			Assert.assertEquals(titleChk7, "Beurteilungsüberblick");
			TestLogger.testLoggerTCEnd("Bazaar Voice Review Test Validation For German_AUSTRIA - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Bazaar Voice Review Test Validation For German_AUSTRIA - Failed" + e);
		}
	}
	
	@Test (priority=2)
	public void NonGoogleShoppingUser_BazaarVoiceReviewTestValidationForGerman_BELGIUM() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Bazaar Voice Review Test Validation For German_BELGIUM - TC Start");
			HomePageActions.ClickPipingRockLogoHeader();
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Belgium");
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Deutsch");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(1000);
			String prodId1 = "912";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			driver.navigate().refresh();
			ProductDetailPageActions.ClickViewReviewsTab();
			takeSnapShot();
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
			takeSnapShot();
			js.executeScript("window.scrollBy(0,800)");
			Thread.sleep(1000);
			takeSnapShot();
			double valForAvgStarRating = ProductDetailPageActions.ValidateAvgOverallRatingFromStar();
			DecimalFormat d = new DecimalFormat("##.0");
			String rABR = ProductDetailPageActions.GetAvgOverallBVRatings();
			System.out.println("Average Overall BV Ratings: " + rABR);
			String rOQS = ProductDetailPageActions.GetAvgOverallQualityRatings();
			System.out.println("Average Overall Quality Ratings: " + rOQS);
			String rOVS = ProductDetailPageActions.GetAvgOverallValueRatings();
			System.out.println("Average Overall Value Ratings: " + rOVS);
			String r5 = ProductDetailPageActions.GetRatingSnapShot5Star();
			System.out.println("Average 5 Star Total Ratings: " + r5);
			String r4 = ProductDetailPageActions.GetRatingSnapShot4Star();
			System.out.println("Average 4 Star Total Ratings: " + r4);
			String r3 = ProductDetailPageActions.GetRatingSnapShot3Star();
			System.out.println("Average 3 Star Total Ratings: " + r3);
			String r2 = ProductDetailPageActions.GetRatingSnapShot2Star();
			System.out.println("Average 2 Star Total Ratings: " + r2);
			String r1 = ProductDetailPageActions.GetRatingSnapShot1Star();
			System.out.println("Average 1 Star Total Ratings: " + r1);
			//takeSnapShot();
			String rOR = ProductDetailPageActions.GetRatingOnlyReviews();
			System.out.println("Ratings Only Reviews: "+ rOR);
			String rOL = ProductDetailPageActions.GetReviewsInOtherLanguages();
			System.out.println("Reviews In Other Languages: " + rOL);
			String titleChk1 = ProductDetailPageActions.GetAvgCustRatingsTitleInPanel();
			System.out.println("Avg Cust Ratings Title In Panel " + titleChk1);
			String titleChk2 = ProductDetailPageActions.GetAvgCustOverallRatingsTitle();
			System.out.println("Avg Cust Overall Ratings " + titleChk2);
			String titleChk3 = ProductDetailPageActions.GetAvgCustOverallQualityRatingsTitle();
			System.out.println("Avg Cust Overall Quality Ratings Title " + titleChk3);
			String titleChk4 = ProductDetailPageActions.GetAvgCustOverallValueRatingsTitle();
			System.out.println("Avg Cust Overall Value Ratings Title " + titleChk4);
			String titleChk5 = ProductDetailPageActions.GetRatingSnapshotFilterTitle();
			System.out.println("Rating Snapshot Filter Title " + titleChk5);
			String titleChk6 = ProductDetailPageActions.GetReviewPanelHeaderTitle();
			System.out.println("Review Panel Header Title " + titleChk6);
			String titleChk7 = ProductDetailPageActions.GetRatingSnapshotTitle();
			System.out.println("Rating Snapshot Title " + titleChk7);
			String pageSrc = driver.getPageSource(); 
			Assert.assertTrue(pageSrc.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/staging/de_BE/bv.js"));
			Assert.assertEquals(d.format(valForAvgStarRating), rABR);
			Assert.assertEquals(titleChk1, "Durchschnittliche Kundenbeurteilungen");
			Assert.assertEquals(titleChk2, "Gesamt");
			Assert.assertEquals(titleChk3, "Qualität des Produkts");
			Assert.assertEquals(titleChk4, "Wert des Produkts");
			Assert.assertEquals(titleChk5, "Wählen Sie unten eine Reihe aus, um Bewertungen zu filtern.");
			Assert.assertEquals(titleChk6, "Bewertungen");
			Assert.assertEquals(titleChk7, "Beurteilungsüberblick");
			TestLogger.testLoggerTCEnd("Bazaar Voice Review Test Validation For German_BELGIUM - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Bazaar Voice Review Test Validation For German_BELGIUM - Failed" + e);
		}
	}
	
	@Test (priority=3)
	public void NonGoogleShoppingUser_BazaarVoiceReviewTestValidationForGerman_SWITZERLAND() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Bazaar Voice Review Test Validation For German_SWITZERLAND - TC Start");
			HomePageActions.ClickPipingRockLogoHeader();
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Switzerland");
			Thread.sleep(700);
			CountrySelectorActions.SearchLanguageDropDownInModalWindow("Deutsch");
			Thread.sleep(500);
			takeSnapShot();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(1000);
			String prodId1 = "912";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			driver.navigate().refresh();
			ProductDetailPageActions.ClickViewReviewsTab();
			takeSnapShot();
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
			takeSnapShot();
			js.executeScript("window.scrollBy(0,800)");
			Thread.sleep(1000);
			takeSnapShot();
			double valForAvgStarRating = ProductDetailPageActions.ValidateAvgOverallRatingFromStar();
			DecimalFormat d = new DecimalFormat("##.0");
			String rABR = ProductDetailPageActions.GetAvgOverallBVRatings();
			System.out.println("Average Overall BV Ratings: " + rABR);
			String rOQS = ProductDetailPageActions.GetAvgOverallQualityRatings();
			System.out.println("Average Overall Quality Ratings: " + rOQS);
			String rOVS = ProductDetailPageActions.GetAvgOverallValueRatings();
			System.out.println("Average Overall Value Ratings: " + rOVS);
			String r5 = ProductDetailPageActions.GetRatingSnapShot5Star();
			System.out.println("Average 5 Star Total Ratings: " + r5);
			String r4 = ProductDetailPageActions.GetRatingSnapShot4Star();
			System.out.println("Average 4 Star Total Ratings: " + r4);
			String r3 = ProductDetailPageActions.GetRatingSnapShot3Star();
			System.out.println("Average 3 Star Total Ratings: " + r3);
			String r2 = ProductDetailPageActions.GetRatingSnapShot2Star();
			System.out.println("Average 2 Star Total Ratings: " + r2);
			String r1 = ProductDetailPageActions.GetRatingSnapShot1Star();
			System.out.println("Average 1 Star Total Ratings: " + r1);
			//takeSnapShot();
			String rOR = ProductDetailPageActions.GetRatingOnlyReviews();
			System.out.println("Ratings Only Reviews: "+ rOR);
			String rOL = ProductDetailPageActions.GetReviewsInOtherLanguages();
			System.out.println("Reviews In Other Languages: " + rOL);
			String titleChk1 = ProductDetailPageActions.GetAvgCustRatingsTitleInPanel();
			System.out.println("Avg Cust Ratings Title In Panel " + titleChk1);
			String titleChk2 = ProductDetailPageActions.GetAvgCustOverallRatingsTitle();
			System.out.println("Avg Cust Overall Ratings " + titleChk2);
			String titleChk3 = ProductDetailPageActions.GetAvgCustOverallQualityRatingsTitle();
			System.out.println("Avg Cust Overall Quality Ratings Title " + titleChk3);
			String titleChk4 = ProductDetailPageActions.GetAvgCustOverallValueRatingsTitle();
			System.out.println("Avg Cust Overall Value Ratings Title " + titleChk4);
			String titleChk5 = ProductDetailPageActions.GetRatingSnapshotFilterTitle();
			System.out.println("Rating Snapshot Filter Title " + titleChk5);
			String titleChk6 = ProductDetailPageActions.GetReviewPanelHeaderTitle();
			System.out.println("Review Panel Header Title " + titleChk6);
			String titleChk7 = ProductDetailPageActions.GetRatingSnapshotTitle();
			System.out.println("Rating Snapshot Title " + titleChk7);
			String pageSrc = driver.getPageSource(); 
			Assert.assertTrue(pageSrc.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/staging/de_CH/bv.js"));
			Assert.assertEquals(d.format(valForAvgStarRating), rABR);
			Assert.assertEquals(titleChk1, "Durchschnittliche Kundenbewertungen");
			Assert.assertEquals(titleChk2, "Insgesamt");
			Assert.assertEquals(titleChk3, "Qualität des Produkts");
			Assert.assertEquals(titleChk4, "Wert des Produkts");
			Assert.assertEquals(titleChk5, "Wählen Sie unten eine Reihe, um Bewertungen zu filtern.");
			Assert.assertEquals(titleChk6, "Bewertungen");
			Assert.assertEquals(titleChk7, "Schnappschuss Bewertung");
			TestLogger.testLoggerTCEnd("Bazaar Voice Review Test Validation For German_SWITZERLAND - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Bazaar Voice Review Test Validation For German_SWITZERLAND - Failed" + e);
		}
	}
		
	@AfterTest
	public void driverClose() throws Exception {
		LoginPageAction.UserLogout();
		closeDriver();
	}

}

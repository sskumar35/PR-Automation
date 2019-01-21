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

public class BazaarVoiceReviewTestValidationForKorean extends CommonUtils{
	
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
	public void NonGoogleShoppingUser_BazaarVoiceReviewTestValidationForKorean_KOREA() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Bazaar Voice Review Test Validation For Korean_KOREA - TC Start");
			CountrySelectorActions.ClickCountrySelectorInHomePage();
			CountrySelectorActions.SearchCountryDropDownInModalWindow("Korea, Republic Of");
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
			Assert.assertTrue(pageSrc.contains("//apps.bazaarvoice.com/deployments/pipingrock/main_site/staging/ko_KR/bv.js"));
			Assert.assertEquals(d.format(valForAvgStarRating), rABR);
			Assert.assertEquals(titleChk1, "평균 고객 평점");
			Assert.assertEquals(titleChk2, "전체");
			Assert.assertEquals(titleChk3, "제품 품질");
			Assert.assertEquals(titleChk4, "제품 가치");
			Assert.assertEquals(titleChk5, "상품평을 필터링할 행을 아래에서 선택합니다.");
			Assert.assertEquals(titleChk6, "상품평");
			Assert.assertEquals(titleChk7, "평점 스냅샷");
			TestLogger.testLoggerTCEnd("Bazaar Voice Review Test Validation For Korean_KOREA - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Bazaar Voice Review Test Validation For Korean_KOREA - Failed" + e);
		}
	}
			
	@AfterTest
	public void driverClose() throws Exception {
		LoginPageAction.UserLogout();
		closeDriver();
	}

}

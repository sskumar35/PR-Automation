package com.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BusinessComponents.HomePageActions;
import com.BusinessComponents.ProductDetailPageActions;
import com.BusinessComponents.ShareButtonHandlerActions;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class ProductDetailsPageDisplayReviewsTest extends CommonUtils{
	
	@BeforeTest
	public void setUp() throws Exception {
		init();
    }
	
	@Test (priority=0)
	public void NonGoogleShoppingUsersReviewTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Non Google Shopping Users Reviews TestCase");
			Thread.sleep(3000);
			HomePageActions.HandlingModalSuggestedBox();
			ShareButtonHandlerActions.ClickAllProductsMenu();
			ShareButtonHandlerActions.ClickAllProductsItem();
			ShareButtonHandlerActions.ClickProductsItem();
			ProductDetailPageActions.ClickProductLabelTab();
			ProductDetailPageActions.ClickMoreInfoTab();
			ProductDetailPageActions.ClickViewReviewsTab();
			ProductDetailPageActions.ClickHealthEncyclopediaTab();
			
			
			TestLogger.testLoggerTCEnd("Non Google Shopping Users Reviews TestCase");
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Non Google Shopping Users Reviews Test Case Failed");
			}		
		}
	
	@Test (priority=1)
	public void GoogleShoppingUsersReviewTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Google Shopping Users Reviews TestCase");
			
			
			
			TestLogger.testLoggerTCEnd("Google Shopping Users Reviews TestCase");
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Google Shopping Users Reviews Test Case Failed");
			}		
		}
	
	@Test (priority=2)
	public void SuppressReviewTabTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Suppress Reviews Tab for Countries TestCase");
			
			
			
			TestLogger.testLoggerTCEnd("Suppress Reviews Tab for Countries TestCase");
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Suppress Reviews Tab for Countries Test Case Failed");
			}		
		}

}

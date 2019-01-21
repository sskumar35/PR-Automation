package com.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BusinessComponents.HomePageActions;
import com.BusinessComponents.ShareButtonHandlerActions;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class NavigateToSocialMediaFromShareCartWindow extends CommonUtils{
	
	@BeforeTest
	public void setUp() throws Exception {
		init();

}

	@Test (priority=0)
	public void NavigateToSocialMediaTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Navigate To Social Media From ShareCart Window TestCase");
			Thread.sleep(3000);
			HomePageActions.HandlingModalSuggestedBox();
			ShareButtonHandlerActions.ClickShareCartButton();
			ShareButtonHandlerActions.CopyLinkButton();
			
			ShareButtonHandlerActions.ClickFbButton();
			takeSnapShot();
			Thread.sleep(3000);
			ShareButtonHandlerActions.ClickTwitterButton();
			takeSnapShot();
			
			TestLogger.testLoggerTCEnd("Navigate To Social Media From ShareCart Window TestCase");
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Navigate To Social Media From ShareCart Window Test Case Failed");
			}		
		}
}
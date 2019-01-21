package com.BusinessComponents;

import org.openqa.selenium.support.PageFactory;

import com.PageFactory.CategoriesAndSubCategoriesPage;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class CategoriesAndSubCategoriesPageActions extends CommonUtils {
	static CategoriesAndSubCategoriesPage CategoriesAndSubCategoriesPage = PageFactory.initElements(driver, CategoriesAndSubCategoriesPage.class);	
	
		/**
		 * 
		 * @throws Exception
		 */
 
		public static void ClickAvgRatingValueInBVAnchor() throws Exception{
			try {
				Thread.sleep(1000);
				TestLogger.testLoggerInfo("Avg Rating Value Is Found");				
				CategoriesAndSubCategoriesPage.getAvgRatingValue().click();
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Avg Rating Value Is Not Found" + e);
			}			
		}
		
		/**
		 * 
		 * @throws Exception
		 */
 
		public static void ClickNumberOfReviewsInBVAnchor() throws Exception{
			try {
				Thread.sleep(2000);
				TestLogger.testLoggerInfo("Number Of Reviews Is Found");				
				CategoriesAndSubCategoriesPage.getNumberOfReviews().click();
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Number Of Reviews Is Not Found" + e);
			}			
		}
		
		 
}

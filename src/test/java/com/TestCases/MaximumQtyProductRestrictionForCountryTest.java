package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.BusinessComponents.CheckoutReviewPageActions;
import com.BusinessComponents.HomePageActions;
import com.BusinessComponents.LoginPageAction;
import com.BusinessComponents.ProductDetailPageActions;
import com.BusinessComponents.ShoppingCartPageActions;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class MaximumQtyProductRestrictionForCountryTest extends CommonUtils{

	@BeforeTest
	public void setUp() throws Exception {
		init();	
	}
	
	@Test (priority=1)
	public void MaximumQtyProductRestrictionForCountryChina() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Maximum Qty Product Restriction For Country China - TC Start");
			String emailAddress = "testmaxqtyproductrestrictionsCHN@pr.com";
			String password = "1234567890";
			driver.navigate().refresh();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(1000);
			HomePageActions.LoginAction();			
			LoginPageAction.TypeUserEmailAddress(emailAddress);			
			LoginPageAction.TypeUserPassword(password);
			LoginPageAction.clickSignInButton();
			Integer itemVal = 10;
			String prodId1 = "4001";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			ProductDetailPageActions.SetItemQuantity(itemVal);
			HomePageActions.ClickAddToCartButton();
			String prodId2 = "7122";
			HomePageActions.SearchForAProduct(prodId2);
			HomePageActions.ClickSearchButton();
			ProductDetailPageActions.SetItemQuantity(itemVal);
			HomePageActions.ClickAddToCartButton();
			Thread.sleep(1000);
			ShoppingCartPageActions.ClickCheckoutButton();
			String testBody = CheckoutReviewPageActions.getModalBodyMessage();
			String testTitle = CheckoutReviewPageActions.getModalWindowTitle();
			takeSnapShot();
			CheckoutReviewPageActions.ClickModalCloseIcon();
			driver.navigate().refresh();
			String errorMsg1 = CheckoutReviewPageActions.getRestrictionErrorMsgInOrderSummary();
			String errorMsg2 = CheckoutReviewPageActions.getRestrictionErrorMsgInOrderSummary();
			String qtySize1 = CheckoutReviewPageActions.GetQtySizeInOrderSummarySection();
			String qtySize2 = CheckoutReviewPageActions.GetQtySizeInOrderSummarySection();
			takeSnapShot();
			Assert.assertEquals(testTitle, "ERRORS WITH YOUR CART");
			Assert.assertTrue(testBody.contains("We are sorry, but we have found the following issue with your cart:"));
			Assert.assertTrue(testBody.contains("Maximum Quantity Limit Exceeded - Items in your cart have limited quantities for China destinations. Your cart has been updated."));
			Assert.assertTrue(errorMsg1.contains("Sorry, no more than 5 quantity per line item is allowed for China destinations."));
			Assert.assertTrue(errorMsg2.contains("Sorry, no more than 5 quantity per line item is allowed for China destinations."));
			Assert.assertEquals(qtySize1.toString(), "5");
			Assert.assertEquals(qtySize2.toString(), "5");
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			ShoppingCartPageActions.ClickRemoveLink();
			ShoppingCartPageActions.ConfirmRemoveItem();
			ShoppingCartPageActions.ClickRemoveLink();
			ShoppingCartPageActions.ConfirmRemoveItem();
			LoginPageAction.UserLogout();
			//CheckoutShippingPageActions.AddNewShippingAddressLink();
			TestLogger.testLoggerTCEnd("Maximum Qty Product Restriction For Country China - TC End");
		} catch (Exception e) 
			{
			TestLogger.testLoggerInfo("Maximum Qty Product Restriction For Country China" + e);
			}
	}
	
	@AfterTest
	public void driverClose() {
	closeDriver();
	}
}	

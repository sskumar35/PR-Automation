package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.BusinessComponents.CheckoutReviewPageActions;
import com.BusinessComponents.HomePageActions;
import com.BusinessComponents.LoginPageAction;
import com.BusinessComponents.ShoppingCartPageActions;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class TotalProductRestrictionForCountryTest extends CommonUtils{

	@BeforeTest
	public void setUp() throws Exception {
		init();	
	}
	
	@Test (priority=1)
	public void TotalProductRestrictionForCountryCanada() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Total Product Restriction For Country Canada - TC Start");
			String emailAddress = "test2@pipingrock.com";
			String password = "123456";
			driver.navigate().refresh();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(1000);
			HomePageActions.LoginAction();			
			LoginPageAction.TypeUserEmailAddress(emailAddress);			
			LoginPageAction.TypeUserPassword(password);
			LoginPageAction.clickSignInButton();
			String prodId1 = "8581";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			HomePageActions.ClickAddToCartButton();
			String prodId2 = "8582";
			HomePageActions.SearchForAProduct(prodId2);
			HomePageActions.ClickSearchButton();
			HomePageActions.ClickAddToCartButton();
			Thread.sleep(1000);
			ShoppingCartPageActions.ClickCheckoutButton();
			String testBody = CheckoutReviewPageActions.getModalBodyMessage();
			String testTitle = CheckoutReviewPageActions.getModalWindowTitle();
			takeSnapShot();
			CheckoutReviewPageActions.ClickModalCloseIcon();
			driver.navigate().refresh();
			CheckoutReviewPageActions.ClickPlaceOrderBtnInOrderSummary();
			String testBody2 = CheckoutReviewPageActions.getModalBodyMessage();
			String testTitle2 = CheckoutReviewPageActions.getModalWindowTitle();
			takeSnapShot();
			CheckoutReviewPageActions.ClickContinueCheckoutBtn();
			String errorMsg1 = CheckoutReviewPageActions.getRestrictionErrorMsgInOrderSummary();
			String errorMsg2 = CheckoutReviewPageActions.getRestrictionErrorMsgInOrderSummary();
			takeSnapShot();
			Assert.assertEquals(testTitle, "ERRORS WITH YOUR CART");
			Assert.assertTrue(testBody.contains("We are sorry, but we have found the following issue with your cart:"));
			Assert.assertTrue(testBody.contains("Product Restriction - We are unable to ship some items to Canada destinations. These items have been removed from your cart."));
			Assert.assertEquals(testTitle2, "ERRORS WITH YOUR CART");
			Assert.assertTrue(testBody2.contains("THERE ARE A FEW ITEMS WE CANNOT SHIP TO YOUR COUNTRY"));
			Assert.assertTrue(testBody2.contains("We are sorry, but we have found the following issue with your cart:"));
			Assert.assertTrue(testBody2.contains("Product Restriction - We are unable to ship some items to Canada destinations. These items have been removed from your cart."));
			Assert.assertTrue(errorMsg1.contains("Sorry, this product cannot be shipped to Canada destinations."));
			Assert.assertTrue(errorMsg2.contains("Sorry, this product cannot be shipped to Canada destinations."));
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			ShoppingCartPageActions.ClickRemoveLink();
			ShoppingCartPageActions.ConfirmRemoveItem();
			ShoppingCartPageActions.ClickRemoveLink();
			ShoppingCartPageActions.ConfirmRemoveItem();
			LoginPageAction.UserLogout();
			//CheckoutShippingPageActions.AddNewShippingAddressLink();
			TestLogger.testLoggerTCEnd("Total Product Restriction For Country Canada - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Total Product Restriction For Country Canada" + e);
		}
	}
	
	@Test (priority=2)
	public void TotalProductRestrictionForCountryAustralia() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Total Product Restriction For Country Australia - TC Start");
			String emailAddress = "testtotalproductrestrictionsAUS@pr.com";
			String password = "1234567890";
			driver.navigate().refresh();
			LoginPageAction.TypeUserEmailAddress(emailAddress);			
			LoginPageAction.TypeUserPassword(password);
			LoginPageAction.clickSignInButton();
			String prodId1 = "4011";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			HomePageActions.ClickAddToCartButton();
			String prodId2 = "4012";
			HomePageActions.SearchForAProduct(prodId2);
			HomePageActions.ClickSearchButton();
			HomePageActions.ClickAddToCartButton();
			Thread.sleep(1000);
			ShoppingCartPageActions.ClickCheckoutButton();
			String testBody = CheckoutReviewPageActions.getModalBodyMessage();
			System.out.println(testBody);
			String testTitle = CheckoutReviewPageActions.getModalWindowTitle();
			takeSnapShot();
			CheckoutReviewPageActions.ClickModalCloseIcon();
			driver.navigate().refresh();
			CheckoutReviewPageActions.ClickPlaceOrderBtnInOrderSummary();
			String testBody2 = CheckoutReviewPageActions.getModalBodyMessage();
			String testTitle2 = CheckoutReviewPageActions.getModalWindowTitle();
			takeSnapShot();
			CheckoutReviewPageActions.ClickContinueCheckoutBtn();
			String errorMsg1 =CheckoutReviewPageActions.getRestrictionErrorMsgInOrderSummary();
			String errorMsg2 = CheckoutReviewPageActions.getRestrictionErrorMsgInOrderSummary();
			takeSnapShot();
			Assert.assertEquals(testTitle, "ERRORS WITH YOUR CART");
			Assert.assertTrue(testBody.contains("We are sorry, but we have found the following issue with your cart:"));
			Assert.assertTrue(testBody.contains("Product Restriction - We are unable to ship some items to Australia destinations. These items have been removed from your cart."));
			Assert.assertEquals(testTitle2, "ERRORS WITH YOUR CART");
			Assert.assertTrue(testBody2.contains("THERE ARE A FEW ITEMS WE CANNOT SHIP TO YOUR COUNTRY"));
			Assert.assertTrue(testBody2.contains("We are sorry, but we have found the following issue with your cart:"));
			Assert.assertTrue(testBody2.contains("Product Restriction - We are unable to ship some items to Australia destinations. These items have been removed from your cart."));
			Assert.assertTrue(errorMsg1.contains("Sorry, this product cannot be shipped to Australia destinations."));
			Assert.assertTrue(errorMsg2.contains("Sorry, this product cannot be shipped to Australia destinations."));
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			ShoppingCartPageActions.ClickRemoveLink();
			ShoppingCartPageActions.ConfirmRemoveItem();
			ShoppingCartPageActions.ClickRemoveLink();
			ShoppingCartPageActions.ConfirmRemoveItem();
			//CheckoutShippingPageActions.AddNewShippingAddressLink();
			TestLogger.testLoggerTCEnd("Total Product Restriction For Country Australia - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Total Product Restriction For Country Australia FAILS" + e);
		}
	}
		
	@AfterTest
	public void driverClose() {
	closeDriver();
	}
}	

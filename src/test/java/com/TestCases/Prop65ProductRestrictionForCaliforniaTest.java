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

public class Prop65ProductRestrictionForCaliforniaTest extends CommonUtils{

	@BeforeTest
	public void setUp() throws Exception {
		init();	
	}
	
	@Test (priority=1)
	public void Prop65ProductRestrictionForCaliforniaErrorMessageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Prop65 Product Restriction For California Error Message - TC Start");
			String emailAddress = "testprop65productrestrictionsCA@pr.com";
			String password = "1234567890";
			driver.navigate().refresh();
			HomePageActions.HandlingModalSuggestedBox();
			HomePageActions.LoginAction();			
			LoginPageAction.TypeUserEmailAddress(emailAddress);			
			LoginPageAction.TypeUserPassword(password);
			LoginPageAction.clickSignInButton();
			String prodId1 = "6015";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			HomePageActions.ClickAddToCartButton();
			String prodId2 = "4291";
			HomePageActions.SearchForAProduct(prodId2);
			HomePageActions.ClickSearchButton();
			HomePageActions.ClickAddToCartButton();
			Thread.sleep(1000);
			ShoppingCartPageActions.ClickCheckoutButton();
			driver.navigate().refresh();
			String testBody = CheckoutReviewPageActions.getModalBodyMessageProp65();
			System.out.println("Body Message: " + testBody);
			String testTitle = CheckoutReviewPageActions.getModalWindowTitle();
			takeSnapShot();
			CheckoutReviewPageActions.ClickModalCloseIconProp65();
			driver.navigate().refresh();
			CheckoutReviewPageActions.ClickPlaceOrderBtnInOrderSummary();
			String testBody2 = CheckoutReviewPageActions.getModalBodyMessageProp65();
			String testTitle2 = CheckoutReviewPageActions.getModalWindowTitle();
			takeSnapShot();
			CheckoutReviewPageActions.ClickModalCloseIconProp65();
			String testProp65EMBeforeClickingIAccept = CheckoutReviewPageActions.GetProp65ErrorMessageInOrderSummary();
			Boolean CheckIAcceptBeforeClickingIAccept = CheckoutReviewPageActions.IAcceptCheckBoxInOrderSummary();
			takeSnapShot();
			Assert.assertEquals(testTitle, "PRODUCT NOTICE");
			Assert.assertTrue(testBody.contains("*Warning: The following product(s) contains lead, a chemical known to the State of California to cause birth defects or other reproductive harm."));
			Assert.assertTrue(testBody.contains("**Warning: This product contains a chemical known to the State of California to cause cancer."));
			Assert.assertTrue(testBody.contains("Please confirm (by clicking \"I Accept\" below) that you still wish to purchase the product(s)."));
			Assert.assertTrue(testBody.contains("* Item 4291 Triple Action Fiber Complex 120 Capsules"));
			Assert.assertTrue(testBody.contains("** Item 6015 Pennyroyal Oil 1/2 fl oz (15 mL) Dropper Bottle"));
			Assert.assertEquals(testTitle2, "PRODUCT NOTICE");
			Assert.assertTrue(testBody2.contains("YOU MUST ACCEPT THE FOLLOWING TERMS TO SHIP YOUR CURRENT CART ITEMS"));
			Assert.assertTrue(testBody2.contains("*Warning: The following product(s) contains lead, a chemical known to the State of California to cause birth defects or other reproductive harm."));
			Assert.assertTrue(testBody2.contains("**Warning: This product contains a chemical known to the State of California to cause cancer."));
			Assert.assertTrue(testBody2.contains("Please confirm (by clicking \"I Accept\" below) that you still wish to purchase the product(s)."));
			Assert.assertTrue(testBody2.contains("* Item 4291 Triple Action Fiber Complex 120 Capsules"));
			Assert.assertTrue(testBody2.contains("** Item 6015 Pennyroyal Oil 1/2 fl oz (15 mL) Dropper Bottle"));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("*Warning: The following product(s) contains lead, a chemical known to the State of California to cause birth defects or other reproductive harm. Please confirm (by checking the \"I Accept\" box on the right) that you still wish to purchase the product(s) and the item(s) will be added back to your cart."));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("**Warning: This product contains a chemical known to the State of California to cause cancer."));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("Please confirm (by checking the \"I Accept\" box on the right) that you still wish to purchase the product(s) and the item(s) will be added back to your cart."));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("Your product will be removed from the cart if you do not check the box next to \"I Accept\"."));
			Assert.assertTrue(CheckIAcceptBeforeClickingIAccept.equals(false));
			TestLogger.testLoggerTCEnd("Prop65 Product Restriction For California Error Message - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Prop65 Product Restriction For California Error Message" + e);
		}
	}
	
	@Test (priority=2)
	public void Prop65ProductRestrictionForCaliforniaIAcceptTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Prop65 Product Restriction For California I Accept Option - TC Start");
			System.out.println("=========================================================================");
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			ShoppingCartPageActions.ClickCheckoutButton();
			//CheckoutReviewPageActions.ClickPlaceOrderBtnInOrderSummary();
			//CheckoutReviewPageActions.ClickModalCloseIconProp65();
			takeSnapShot();
			Thread.sleep(5000);
			CheckoutReviewPageActions.ClickIAcceptCheckBoxInOrderSummary();
			Thread.sleep(2000);
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			ShoppingCartPageActions.ClickCheckoutButton();
			//String testProp65EMAfterClickingIAccept = CheckoutReviewPageActions.GetProp65ErrorMessageInOrderSummary();
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			//System.out.println("testProp65EMAfterClickingIAccept" + testProp65EMAfterClickingIAccept);
			ShoppingCartPageActions.ClickRemoveLink();
			ShoppingCartPageActions.ConfirmRemoveItem();
			ShoppingCartPageActions.ClickRemoveLink();
			ShoppingCartPageActions.ConfirmRemoveItem();
			LoginPageAction.UserLogout();
			
			//Assert.assertNull(testProp65EMAfterClickingIAccept);
			TestLogger.testLoggerTCEnd("Prop65 Product Restriction For California I Accept Option - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Prop65 Product Restriction For California I Accept Option" + e);
		}
	}
	
		
	@AfterTest
	public void driverClose() {
	closeDriver();
	}
}	

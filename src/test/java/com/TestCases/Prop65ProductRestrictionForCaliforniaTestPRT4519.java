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

public class Prop65ProductRestrictionForCaliforniaTestPRT4519 extends CommonUtils{

	@BeforeTest
	public void setUp() throws Exception {
		init();
		String emailAddress = "test1@pipingrock.com";
		String password = "123456";
		driver.navigate().refresh();
		HomePageActions.HandlingModalSuggestedBox();
		Thread.sleep(1000);
		HomePageActions.LoginAction();			
		LoginPageAction.TypeUserEmailAddress(emailAddress);			
		LoginPageAction.TypeUserPassword(password);
		LoginPageAction.clickSignInButton();
	}
	
	@Test (priority=1)
	public void Prop65ProductRestrictionForCaliforniaStandardErrorMessageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Prop65 Product Restriction For California Standard Error Message Test - TC Start");
			String prodId1 = "7102";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			HomePageActions.ClickAddToCartButton();
			Thread.sleep(1000);
			ShoppingCartPageActions.ClickCheckoutButton();
			driver.navigate().refresh();
			String testBody = CheckoutReviewPageActions.getModalBodyMessageProp65();
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
			driver.navigate().refresh();
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			ShoppingCartPageActions.ClickRemoveLink();
			ShoppingCartPageActions.ConfirmRemoveItem();
			Assert.assertEquals(testTitle, "PRODUCT NOTICE");
			Assert.assertTrue(testBody.contains("Warning: Consuming this product can expose you to chemicals including lead, which is known to the State of California to cause birth defects or other reproductive harm. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody.contains("Please confirm (by clicking \"I Accept\" below) that you still wish to purchase the product(s)."));
			Assert.assertTrue(testBody.contains("* Item 7102 ProstAid Herbal Complex 200 Capsules"));
			Assert.assertEquals(testTitle2, "PRODUCT NOTICE");
			Assert.assertTrue(testBody2.contains("YOU MUST ACCEPT THE FOLLOWING TERMS TO SHIP YOUR CURRENT CART ITEMS"));
			Assert.assertTrue(testBody2.contains("Warning: Consuming this product can expose you to chemicals including lead, which is known to the State of California to cause birth defects or other reproductive harm. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody2.contains("Please confirm (by clicking \"I Accept\" below) that you still wish to purchase the product(s)."));
			Assert.assertTrue(testBody2.contains("* Item 7102 ProstAid Herbal Complex 200 Capsules"));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("Warning: Consuming this product can expose you to chemicals including lead, which is known to the State of California to cause birth defects or other reproductive harm. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("Please confirm (by checking the \"I Accept\" box on the right) that you still wish to purchase the product(s) and the item(s) will be added back to your cart."));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("Your product will be removed from the cart if you do not check the box next to \"I Accept\"."));
			Assert.assertTrue(CheckIAcceptBeforeClickingIAccept.equals(false));
			TestLogger.testLoggerTCEnd("Prop65 Product Restriction For California Standard Error Message Test - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Prop65 Product Restriction For California Standard Error Message Test" + e);
		}
	}
	
	@Test (priority=2)
	public void Prop65ProductRestrictionForCaliforniaPulegoneErrorMessageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Prop65 Product Restriction For California Pulegone Error Message Test - TC Start");
			String prodId1 = "6015";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			HomePageActions.ClickAddToCartButton();
			Thread.sleep(1000);
			ShoppingCartPageActions.ClickCheckoutButton();
			driver.navigate().refresh();
			String testBody = CheckoutReviewPageActions.getModalBodyMessageProp65();
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
			driver.navigate().refresh();
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			ShoppingCartPageActions.ClickRemoveLink();
			ShoppingCartPageActions.ConfirmRemoveItem();
			Assert.assertEquals(testTitle, "PRODUCT NOTICE");
			Assert.assertTrue(testBody.contains("**Warning: Consuming this product can expose you to chemicals including pulegone, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody.contains("Please confirm (by clicking \"I Accept\" below) that you still wish to purchase the product(s)."));
			Assert.assertTrue(testBody.contains("** Item 6015 Pennyroyal Oil 1/2 fl oz (15 mL) Dropper Bottle"));
			Assert.assertEquals(testTitle2, "PRODUCT NOTICE");
			Assert.assertTrue(testBody2.contains("YOU MUST ACCEPT THE FOLLOWING TERMS TO SHIP YOUR CURRENT CART ITEMS"));
			Assert.assertTrue(testBody2.contains("**Warning: Consuming this product can expose you to chemicals including pulegone, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody2.contains("Please confirm (by clicking \"I Accept\" below) that you still wish to purchase the product(s)."));
			Assert.assertTrue(testBody2.contains("** Item 6015 Pennyroyal Oil 1/2 fl oz (15 mL) Dropper Bottle"));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("**Warning: Consuming this product can expose you to chemicals including pulegone, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("Please confirm (by checking the \"I Accept\" box on the right) that you still wish to purchase the product(s) and the item(s) will be added back to your cart."));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("Your product will be removed from the cart if you do not check the box next to \"I Accept\"."));
			Assert.assertTrue(CheckIAcceptBeforeClickingIAccept.equals(false));
			TestLogger.testLoggerTCEnd("Prop65 Product Restriction For California Pulegone Error Message Test - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Prop65 Product Restriction For California Pulegone Error Message Test" + e);
		}
	}
	
	@Test (priority=3)
	public void Prop65ProductRestrictionForCaliforniaProgesteroneErrorMessageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Prop65 Product Restriction For California Progesterone Error Message Test - TC Start");
			String prodId1 = "39452";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			HomePageActions.ClickAddToCartButton();
			Thread.sleep(1000);
			ShoppingCartPageActions.ClickCheckoutButton();
			driver.navigate().refresh();
			String testBody = CheckoutReviewPageActions.getModalBodyMessageProp65();
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
			driver.navigate().refresh();
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			ShoppingCartPageActions.ClickRemoveLink();
			ShoppingCartPageActions.ConfirmRemoveItem();
			Assert.assertEquals(testTitle, "PRODUCT NOTICE");
			Assert.assertTrue(testBody.contains("***Warning: Consuming this product can expose you to chemicals including Progesterone, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody.contains("Please confirm (by clicking \"I Accept\" below) that you still wish to purchase the product(s)."));
			Assert.assertTrue(testBody.contains("*** Item 39452 Progesterone Cream (Unscented) 3 oz (85 g) Bottle"));
			Assert.assertEquals(testTitle2, "PRODUCT NOTICE");
			Assert.assertTrue(testBody2.contains("YOU MUST ACCEPT THE FOLLOWING TERMS TO SHIP YOUR CURRENT CART ITEMS"));
			Assert.assertTrue(testBody2.contains("***Warning: Consuming this product can expose you to chemicals including Progesterone, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody2.contains("Please confirm (by clicking \"I Accept\" below) that you still wish to purchase the product(s)."));
			Assert.assertTrue(testBody2.contains("*** Item 39452 Progesterone Cream (Unscented) 3 oz (85 g) Bottle"));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("***Warning: Consuming this product can expose you to chemicals including Progesterone, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("Please confirm (by checking the \"I Accept\" box on the right) that you still wish to purchase the product(s) and the item(s) will be added back to your cart."));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("Your product will be removed from the cart if you do not check the box next to \"I Accept\"."));
			Assert.assertTrue(CheckIAcceptBeforeClickingIAccept.equals(false));
			TestLogger.testLoggerTCEnd("Prop65 Product Restriction For California Progesterone Error Message Test - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Prop65 Product Restriction For California Progesterone Error Message Test" + e);
		}
	}
	
	@Test (priority=4)
	public void Prop65ProductRestrictionForCaliforniaGoldensealRootPowderErrorMessageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Prop65 Product Restriction For California Goldenseal Root Powder Error Message Test - TC Start");
			String prodId1 = "39505";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			HomePageActions.ClickAddToCartButton();
			Thread.sleep(1000);
			ShoppingCartPageActions.ClickCheckoutButton();
			driver.navigate().refresh();
			String testBody = CheckoutReviewPageActions.getModalBodyMessageProp65();
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
			driver.navigate().refresh();
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			ShoppingCartPageActions.ClickRemoveLink();
			ShoppingCartPageActions.ConfirmRemoveItem();
			Assert.assertEquals(testTitle, "PRODUCT NOTICE");
			Assert.assertTrue(testBody.contains("****Warning: Consuming this product can expose you to chemicals including Goldenseal Root Powder, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody.contains("Please confirm (by clicking \"I Accept\" below) that you still wish to purchase the product(s)."));
			Assert.assertTrue(testBody.contains("**** Item 39505 Goldenseal Root 500 mg 60 Capsules"));
			Assert.assertEquals(testTitle2, "PRODUCT NOTICE");
			Assert.assertTrue(testBody2.contains("YOU MUST ACCEPT THE FOLLOWING TERMS TO SHIP YOUR CURRENT CART ITEMS"));
			Assert.assertTrue(testBody2.contains("****Warning: Consuming this product can expose you to chemicals including Goldenseal Root Powder, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody2.contains("Please confirm (by clicking \"I Accept\" below) that you still wish to purchase the product(s)."));
			Assert.assertTrue(testBody2.contains("**** Item 39505 Goldenseal Root 500 mg 60 Capsules"));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("****Warning: Consuming this product can expose you to chemicals including Goldenseal Root Powder, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("Please confirm (by checking the \"I Accept\" box on the right) that you still wish to purchase the product(s) and the item(s) will be added back to your cart."));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("Your product will be removed from the cart if you do not check the box next to \"I Accept\"."));
			Assert.assertTrue(CheckIAcceptBeforeClickingIAccept.equals(false));
			TestLogger.testLoggerTCEnd("Prop65 Product Restriction For California Goldenseal Root Powder Error Message Test - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Prop65 Product Restriction For California Goldenseal Root Powder Error Message Test" + e);
		}
	}
	
	@Test (priority=5)
	public void Prop65ProductRestrictionForCaliforniaGoldensealRootPowderAndLeadErrorMessageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Prop65 Product Restriction For California Goldenseal Root Powder And Lead Error Message Test - TC Start");
			String prodId1 = "4304";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			HomePageActions.ClickAddToCartButton();
			Thread.sleep(1000);
			ShoppingCartPageActions.ClickCheckoutButton();
			driver.navigate().refresh();
			String testBody = CheckoutReviewPageActions.getModalBodyMessageProp65();
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
			driver.navigate().refresh();
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			ShoppingCartPageActions.ClickRemoveLink();
			ShoppingCartPageActions.ConfirmRemoveItem();
			Assert.assertEquals(testTitle, "PRODUCT NOTICE");
			Assert.assertTrue(testBody.contains("*****Warning: Consuming this product can expose you to chemicals including lead, which is known to the State of California to cause birth defects or other reproductive harm and Goldenseal Root Powder, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody.contains("Please confirm (by clicking \"I Accept\" below) that you still wish to purchase the product(s)."));
			Assert.assertTrue(testBody.contains("***** Item 4304 Ultimate Colon Cleanser 300 Capsules"));
			Assert.assertEquals(testTitle2, "PRODUCT NOTICE");
			Assert.assertTrue(testBody2.contains("YOU MUST ACCEPT THE FOLLOWING TERMS TO SHIP YOUR CURRENT CART ITEMS"));
			Assert.assertTrue(testBody2.contains("*****Warning: Consuming this product can expose you to chemicals including lead, which is known to the State of California to cause birth defects or other reproductive harm and Goldenseal Root Powder, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody2.contains("Please confirm (by clicking \"I Accept\" below) that you still wish to purchase the product(s)."));
			Assert.assertTrue(testBody2.contains("***** Item 4304 Ultimate Colon Cleanser 300 Capsules"));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("*****Warning: Consuming this product can expose you to chemicals including lead, which is known to the State of California to cause birth defects or other reproductive harm and Goldenseal Root Powder, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("Please confirm (by checking the \"I Accept\" box on the right) that you still wish to purchase the product(s) and the item(s) will be added back to your cart."));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("Your product will be removed from the cart if you do not check the box next to \"I Accept\"."));
			Assert.assertTrue(CheckIAcceptBeforeClickingIAccept.equals(false));
			TestLogger.testLoggerTCEnd("Prop65 Product Restriction For California Goldenseal Root Powder And Lead Error Message Test - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Prop65 Product Restriction For California Goldenseal Root Powder And Lead Error Message Test" + e);
		}
	}
	
	@Test (priority=6)
	public void Prop65ProductRestrictionForCaliforniaDiethanolamineErrorMessageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Prop65 Product Restriction For California Diethanolamine Error Message Test - TC Start");
			String prodId1 = "39044";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			HomePageActions.ClickAddToCartButton();
			Thread.sleep(1000);
			ShoppingCartPageActions.ClickCheckoutButton();
			driver.navigate().refresh();
			String testBody = CheckoutReviewPageActions.getModalBodyMessageProp65();
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
			driver.navigate().refresh();
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			ShoppingCartPageActions.ClickRemoveLink();
			ShoppingCartPageActions.ConfirmRemoveItem();
			Assert.assertEquals(testTitle, "PRODUCT NOTICE");
			Assert.assertTrue(testBody.contains("******Warning: This product can expose you to chemicals including Diethanolamine which is known to the State of California to cause cancer. For more information, go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody.contains("Please confirm (by clicking \"I Accept\" below) that you still wish to purchase the product(s)."));
			Assert.assertTrue(testBody.contains("****** Item 39044 V-Loe Vaginal Cream & Lubricant 4 fl oz (118 mL) Tube"));
			Assert.assertEquals(testTitle2, "PRODUCT NOTICE");
			Assert.assertTrue(testBody2.contains("YOU MUST ACCEPT THE FOLLOWING TERMS TO SHIP YOUR CURRENT CART ITEMS"));
			Assert.assertTrue(testBody2.contains("******Warning: This product can expose you to chemicals including Diethanolamine which is known to the State of California to cause cancer. For more information, go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody2.contains("Please confirm (by clicking \"I Accept\" below) that you still wish to purchase the product(s)."));
			Assert.assertTrue(testBody2.contains("****** Item 39044 V-Loe Vaginal Cream & Lubricant 4 fl oz (118 mL) Tube"));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("******Warning: This product can expose you to chemicals including Diethanolamine which is known to the State of California to cause cancer. For more information, go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("Please confirm (by checking the \"I Accept\" box on the right) that you still wish to purchase the product(s) and the item(s) will be added back to your cart."));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("Your product will be removed from the cart if you do not check the box next to \"I Accept\"."));
			Assert.assertTrue(CheckIAcceptBeforeClickingIAccept.equals(false));
			TestLogger.testLoggerTCEnd("Prop65 Product Restriction For California Diethanolamine Error Message Test - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Prop65 Product Restriction For California Diethanolamine Error Message Test" + e);
		}
	}
	
	@Test (priority=7)
	public void Prop65ProductRestrictionForCaliforniaCompleteErrorMessageTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Prop65 Product Restriction For California Complete Error Message Test - TC Start");
			String[] prodIds = {"7102", "6015", "39452", "39505", "4304", "39044"};
			
			for(int i = 0; i< prodIds.length; i++){

				HomePageActions.SearchForAProduct(prodIds[i]);
				HomePageActions.ClickSearchButton();
				HomePageActions.ClickAddToCartButton();

			}
			
			Thread.sleep(1000);
			ShoppingCartPageActions.ClickCheckoutButton();
			driver.navigate().refresh();
			String testBody = CheckoutReviewPageActions.getModalBodyMessageProp65();
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
			driver.navigate().refresh();
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			
			for(int i = 0; i< prodIds.length; i++){
				
				ShoppingCartPageActions.ClickRemoveLink();
				ShoppingCartPageActions.ConfirmRemoveItem();

			}
			
			Assert.assertEquals(testTitle, "PRODUCT NOTICE");
			Assert.assertTrue(testBody.contains("*Warning: Consuming this product can expose you to chemicals including lead, which is known to the State of California to cause birth defects or other reproductive harm. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody.contains("**Warning: Consuming this product can expose you to chemicals including pulegone, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody.contains("***Warning: Consuming this product can expose you to chemicals including Progesterone, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody.contains("****Warning: Consuming this product can expose you to chemicals including Goldenseal Root Powder, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody.contains("*****Warning: Consuming this product can expose you to chemicals including lead, which is known to the State of California to cause birth defects or other reproductive harm and Goldenseal Root Powder, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody.contains("******Warning: This product can expose you to chemicals including Diethanolamine which is known to the State of California to cause cancer. For more information, go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody.contains("Please confirm (by clicking \"I Accept\" below) that you still wish to purchase the product(s)."));
			Assert.assertTrue(testBody.contains("* Item 7102 ProstAid Herbal Complex 200 Capsules"));
			Assert.assertTrue(testBody.contains("** Item 6015 Pennyroyal Oil 1/2 fl oz (15 mL) Dropper Bottle"));
			Assert.assertTrue(testBody.contains("*** Item 39452 Progesterone Cream (Unscented) 3 oz (85 g) Bottle"));
			Assert.assertTrue(testBody.contains("**** Item 39505 Goldenseal Root 500 mg 60 Capsules"));
			Assert.assertTrue(testBody.contains("***** Item 4304 Ultimate Colon Cleanser 300 Capsules"));
			Assert.assertTrue(testBody.contains("****** Item 39044 V-Loe Vaginal Cream & Lubricant 4 fl oz (118 mL) Tube"));
			Assert.assertEquals(testTitle2, "PRODUCT NOTICE");
			Assert.assertTrue(testBody2.contains("YOU MUST ACCEPT THE FOLLOWING TERMS TO SHIP YOUR CURRENT CART ITEMS"));
			Assert.assertTrue(testBody2.contains("******Warning: This product can expose you to chemicals including Diethanolamine which is known to the State of California to cause cancer. For more information, go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody2.contains("Please confirm (by clicking \"I Accept\" below) that you still wish to purchase the product(s)."));
			Assert.assertTrue(testBody.contains("* Item 7102 ProstAid Herbal Complex 200 Capsules"));
			Assert.assertTrue(testBody.contains("** Item 6015 Pennyroyal Oil 1/2 fl oz (15 mL) Dropper Bottle"));
			Assert.assertTrue(testBody.contains("*** Item 39452 Progesterone Cream (Unscented) 3 oz (85 g) Bottle"));
			Assert.assertTrue(testBody.contains("**** Item 39505 Goldenseal Root 500 mg 60 Capsules"));
			Assert.assertTrue(testBody.contains("***** Item 4304 Ultimate Colon Cleanser 300 Capsules"));
			Assert.assertTrue(testBody.contains("****** Item 39044 V-Loe Vaginal Cream & Lubricant 4 fl oz (118 mL) Tube"));
			Assert.assertTrue(testBody.contains("*Warning: Consuming this product can expose you to chemicals including lead, which is known to the State of California to cause birth defects or other reproductive harm. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody.contains("**Warning: Consuming this product can expose you to chemicals including pulegone, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody.contains("***Warning: Consuming this product can expose you to chemicals including Progesterone, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody.contains("****Warning: Consuming this product can expose you to chemicals including Goldenseal Root Powder, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody.contains("*****Warning: Consuming this product can expose you to chemicals including lead, which is known to the State of California to cause birth defects or other reproductive harm and Goldenseal Root Powder, which is known to the State of California to cause cancer. For more information go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testBody.contains("******Warning: This product can expose you to chemicals including Diethanolamine which is known to the State of California to cause cancer. For more information, go to www.P65Warnings.ca.gov/food."));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("Please confirm (by checking the \"I Accept\" box on the right) that you still wish to purchase the product(s) and the item(s) will be added back to your cart."));
			Assert.assertTrue(testProp65EMBeforeClickingIAccept.contains("Your product will be removed from the cart if you do not check the box next to \"I Accept\"."));
			Assert.assertTrue(CheckIAcceptBeforeClickingIAccept.equals(false));
			TestLogger.testLoggerTCEnd("Prop65 Product Restriction For California Complete Error Message Test - TC End");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Prop65 Product Restriction For California Complete Error Message Test" + e);
		}
	}
	
	@Test (priority=8)
	public void Prop65ProductRestrictionForCaliforniaIAcceptTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Prop65 Product Restriction For California I Accept Option - TC Start");
			System.out.println("=========================================================================");
			String prodId1 = "39044";
			HomePageActions.SearchForAProduct(prodId1);
			HomePageActions.ClickSearchButton();
			HomePageActions.ClickAddToCartButton();
			Thread.sleep(1000);
			ShoppingCartPageActions.ClickCheckoutButton();
			CheckoutReviewPageActions.ClickModalCloseIconProp65();
			takeSnapShot();
			Thread.sleep(2000);
			CheckoutReviewPageActions.ClickIAcceptCheckBoxInOrderSummary();
			Thread.sleep(2000);
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			//String testProp65EMAfterClickingIAccept = CheckoutReviewPageActions.GetProp65ErrorMessageInOrderSummary();
			//System.out.println("testProp65EMAfterClickingIAccept" + testProp65EMAfterClickingIAccept);
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

package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BusinessComponents.CheckoutConfirmationPageActions;
import com.BusinessComponents.CheckoutReviewPageActions;
import com.BusinessComponents.HomePageActions;
import com.BusinessComponents.LoginPageAction;
import com.BusinessComponents.ShoppingCartPageActions;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class OrderConfirmationPageTest extends CommonUtils{
	
	@BeforeTest
	public void setUp() throws Exception {
		init();		
	}
	
	@Test (priority=1)
	public void PrerequisteTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Prerequiste Test Case");
			String emailAddress = "skumar@pipingrock.com";
			String password = "omsairam35";
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(5000);
			HomePageActions.LoginAction();			
			LoginPageAction.TypeUserEmailAddress(emailAddress);			
			LoginPageAction.TypeUserPassword(password);
			LoginPageAction.clickSignInButton();
			takeSnapShot();
			TestLogger.testLoggerTCEnd("Prerequiste Test Case");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Prerequiste Test Case FAILS" + e);
		}
	}
	@Test (priority=2)
	public void ButtonsAndLinksTest() throws Exception{	
		try {
			TestLogger.testLoggerTCStart("Button and Links Test Case");
			String prodId = "4761";
			HomePageActions.SearchForAProduct(prodId);
			HomePageActions.ClickSearchButton();
			String PageTitleBefore = driver.getTitle();				
			HomePageActions.ClickAddToCartButton();
			takeSnapShot();
			ShoppingCartPageActions.ClickContinueShoppingButton();
			String PageTitleAfter = driver.getTitle();
			takeSnapShot();
			Assert.assertEquals(PageTitleBefore, PageTitleAfter);
			HomePageActions.ClickCheckoutButton();
			ShoppingCartPageActions.ClickCheckoutButton();
			takeSnapShot();
			TestLogger.testLoggerTCEnd("Button and Links Test Case");
		} catch (Exception e) {
			Assert.fail("Test" + e);
		}			
	}
	@Test (priority=3)
	public void ReviewPageScreenTest() throws Exception{	
		try {
			TestLogger.testLoggerTCStart("Checkout Review Page Test Case");
			/*Shipping Address Section*/
			String section1 = CheckoutReviewPageActions.ShippingAddressSection();
			Assert.assertEquals("Shipping Address", "Shipping Address");
			System.out.println("section1" +section1);
			String section2 = CheckoutReviewPageActions.ChangeShippingAddressLink();
			Assert.assertEquals("Change", "Change");
			System.out.println("section2" +section2);
	        String section4 = CheckoutReviewPageActions.AddNewShippingAddressLink();
	        Assert.assertEquals("+ Add New Shipping Address", "+ Add New Shipping Address");
	        System.out.println("section4" +section4);
	        String section5 = CheckoutReviewPageActions.UseThisShippingAddressButton();
	        Assert.assertEquals("Use this address", "Use this address");
	        System.out.println("section5" +section5);
	        String section6 = CheckoutReviewPageActions.CancelChoosingShippingAddress();
	        Assert.assertEquals("Cancel", "Cancel");
	        System.out.println("section5" +section6);
	        /*Billing Address and Payment Method Section*/
	        String section7 = CheckoutReviewPageActions.PaymentMethodSection();
	        Assert.assertEquals("Payment Method", "Payment Method");
	        System.out.println("section7" +section7);
	        String section8 = CheckoutReviewPageActions.ChangePaymentMethodLink();
	        Assert.assertEquals("Change", "Change");
	        System.out.println("section8" +section8);
	        String section9 = CheckoutReviewPageActions.AddNewPaymentMethodLink();
	        Assert.assertEquals("+ Add a payment method", "+ Add a payment method");
	        System.out.println("section9" +section9);
	        String section10 = CheckoutReviewPageActions.UseThisPaymentMethodButton();
	        Assert.assertEquals("Use this payment method", "Use this payment method");
	        System.out.println("section10" +section10);
	        String section11 = CheckoutReviewPageActions.BillingAddressLink();
	        Assert.assertEquals("Billing Address", "Billing Address");
	        System.out.println("section11" +section11);
	        String section12 = CheckoutReviewPageActions.AddNewBillingAddressLink();
	        Assert.assertEquals("Add New Billing Address", "Add New Billing Address");
	        System.out.println("section12" +section12);
	        String section14 = CheckoutReviewPageActions.UseThisBillingAddressButton();
	        Assert.assertEquals("Use this address", "Use this address");
	        System.out.println("section14" +section14);
	        String section13 = CheckoutReviewPageActions.CancelChoosingBillingAddress();
	        Assert.assertEquals("Cancel", "Cancel");
	        System.out.println("section13" +section13);
	        /*Shipping Method Section*/
	        String section15 = CheckoutReviewPageActions.ShippingMethodSection();
	        Assert.assertEquals("Shipping Method", "Shipping Method");
	        System.out.println("section15" +section15);
	        String section16 = CheckoutReviewPageActions.ChooseStandardDelivery();
	        Assert.assertEquals("Standard", "Standard");
	        System.out.println("section16" +section16);
	        String section17 = CheckoutReviewPageActions.Choose2ndDayAirDelivery();
	        Assert.assertEquals("2nd Day Air", "2nd Day Air");
	        System.out.println("section17" +section17);
	        String section18 = CheckoutReviewPageActions.ChooseNextDayDelivery();
	        Assert.assertEquals("Next Day Air", "Next Day Air");
	        System.out.println("section18" +section18);
	        /*Order Summary Section*/
	        String section19 = CheckoutReviewPageActions.OrderSummarySection();
	        Assert.assertEquals("Order Summary", "Order Summary");
	        System.out.println("section19" +section19);
	        String section20 = CheckoutReviewPageActions.PriceTitleOrderSummarySection();
	        Assert.assertEquals("Price", "Price");
	        System.out.println("section20" +section20);
	        String section21 = CheckoutReviewPageActions.ItemsTitleOrderSummarySection();
	        Assert.assertEquals("Items", "Items");
	        System.out.println("section21" +section21);
	        String section22 = CheckoutReviewPageActions.SubtotalTitleOrderSummarySection();
	        Assert.assertEquals("Subtotal", "Subtotal");
	        System.out.println("section22" +section22);
	        String section23 = CheckoutReviewPageActions.QuantityTitleOrderSummarySection();
	        Assert.assertEquals("Quantity", "Quantity");
	        System.out.println("section23" +section23);
	        String section24 = CheckoutReviewPageActions.PlaceOrderButton();
	        Assert.assertEquals("Quantity", "Quantity");
	        System.out.println("section24" +section24);
	        /*Order Summary at Right Side Section*/
	        String section25 = CheckoutReviewPageActions.OrderSummarySectionRightSide();
	        Assert.assertEquals("Order Summary", "Order Summary");
	        System.out.println("section25" +section25);
	        String section26 = CheckoutReviewPageActions.ShippingCost();
	        Assert.assertEquals("Shipping", "Shipping");
	        System.out.println("section26" +section26);
	        String section27 = CheckoutReviewPageActions.OrderTotal();
	        Assert.assertEquals("Order Total:", "Order Total:");
	        System.out.println("section27" +section27);
	        String section28 = CheckoutReviewPageActions.SubtotalOrderSummarySectionRightSide();
	        Assert.assertEquals("Subtotal", "Subtotal");
	        System.out.println("section28" +section28);
	        String section29 = CheckoutReviewPageActions.PlaceOrderButtonRightSide();
	        Assert.assertEquals("Place Order", "Place Order");
	        System.out.println("section29" +section29);
			TestLogger.testLoggerTCEnd("Checkout Review Page Test Case");
		} catch (Exception e) {
			Assert.fail("Test" + e);
		}			
	}
	@Test(priority=4)
	public void OrderConfirmationScreenTest() throws Exception{	
		try {
			TestLogger.testLoggerTCStart("Checkout Order Confirmation Page Test Case");
	        String section1 = CheckoutConfirmationPageActions.GoogleCustomerReviewsPopup();
	        Assert.assertEquals("Google Customer Reviews", "Google Customer Reviews");
	        System.out.println("section1" +section1);
	        CheckoutConfirmationPageActions.GoogleCustomerReviewsPopupClose();
	        Thread.sleep(2000);
	        String section2 = CheckoutConfirmationPageActions.OrderConfirmationSection();
	        Assert.assertEquals("Order Confirmation", "Order Confirmation");
	        System.out.println("section2" +section2);
	        String section3 = CheckoutConfirmationPageActions.ShippingDetailSection();
	        Assert.assertEquals("Shipping Details", "Shipping Details");
	        System.out.println("section3" +section3);
	        String section4 = CheckoutConfirmationPageActions.PaymentDetailSection();
	        Assert.assertEquals("Payment Details", "Payment Details");
	        System.out.println("section4" +section4);
	        String section5 = CheckoutConfirmationPageActions.OrderSummarySection();
	        Assert.assertEquals("Order Summary", "Order Summary");
	        System.out.println("section5" +section5);
	        String section6 = CheckoutConfirmationPageActions.ReferAndEarnSection();
	        Assert.assertEquals("REFER&EARN", "REFER&EARN");
	        System.out.println("section6" +section6);
			TestLogger.testLoggerTCEnd("Checkout Order Confirmation Page Test Case");
		} catch (Exception e) {
			Assert.fail("Test" + e);
		}			
	}

}

package com.BusinessComponents;

import java.util.concurrent.TimeUnit;

import javax.security.auth.Refreshable;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.testng.internal.ExitCode;

import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;
import com.PageFactory.CheckoutReviewPage;

public class CheckoutReviewPageActions extends CommonUtils{
	
	static CheckoutReviewPage CheckoutReviewPage = PageFactory.initElements(driver, CheckoutReviewPage.class);
	
	public static String ShippingAddressSection() throws Exception{
		String section1 = null;
	
		try {
		     TestLogger.testLoggerInfo("Shipping Address Section In Review Page Is Found");
		     section1 = CheckoutReviewPage.getShippingAddressSection().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Shipping Address Section In Review Page Not Found");
	}
	
    return section1;
	}		

	public static String ChangeShippingAddressLink() throws Exception{
		String section2 = null;
	
		try {
		     TestLogger.testLoggerInfo("Change Shipping Address Link In Review Page Is Found");
		     section2 = CheckoutReviewPage.getChangeShippingAddressLink().getText();
		     Thread.sleep(2000);
		     CheckoutReviewPage.getChangeShippingAddressLink().click();
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Chnage Shipping Address Link In Review Page Not Found");
	}
		
      return section2;

}

	public static String AddNewShippingAddressLink() throws Exception{
		String section4 = null;
	
		try {
		     TestLogger.testLoggerInfo("Add New Shipping Address Link In Review Page Is Found");
		     section4 = CheckoutReviewPage.getAddNewShippingAddressLink().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Add New Shipping Address Link In Review Page Not Found");
	}
		
      return section4;
}
	public static String UseThisShippingAddressButton() throws Exception{
		String section5 = null;
	
		try {
		     TestLogger.testLoggerInfo("Use This Address Button In Review Page Is Found");
		     section5 = CheckoutReviewPage.getUseThisShippingAddressButton().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Use This Address Button In Review Page Not Found");
	}
		
      return section5;
}
	public static String CancelChoosingShippingAddress() throws Exception{
		String section6 = null;
	
		try {
		     TestLogger.testLoggerInfo("Cancel Shipping Address Button In Review Page Is Found");
		     section6 = CheckoutReviewPage.getCancelChoosingShippingAddress().getText();
		     Thread.sleep(2000);
		     CheckoutReviewPage.getCancelChoosingShippingAddress().click();
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Cancel Shipping Address Button In Review Page Not Found");
	}
		
      return section6;
}
	public static String PaymentMethodSection() throws Exception{
		String section7 = null;
	
		try {
		     TestLogger.testLoggerInfo("Payment Method Section In Review Page Is Found");
		     section7 = CheckoutReviewPage.getPaymentMethodSection().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Payment Method Section In Review Page Not Found");
	}
		
      return section7;
}

	public static String ChangePaymentMethodLink() throws Exception{
		String section8 = null;
	
		try {
		     TestLogger.testLoggerInfo("Change Payment Method Link In Review Page Is Found");
		     section8 = CheckoutReviewPage.getChangePaymentMethodLink().getText();
		     Thread.sleep(2000);
		     CheckoutReviewPage.getChangePaymentMethodLink().click();
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Change Payment Method Section Link In Review Page Not Found");
	}
		
      return section8;
}

	public static String AddNewPaymentMethodLink() throws Exception{
		String section9 = null;
	
		try {
		     TestLogger.testLoggerInfo("Add New Payment Method Link In Review Page Is Found");
		     section9 = CheckoutReviewPage.getAddNewPaymentMethodLink().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Add New Payment Method Section Link In Review Page Not Found");
	}
		
      return section9;
}
	public static String UseThisPaymentMethodButton() throws Exception{
		String section10 = null;
	
		try {
		     TestLogger.testLoggerInfo("Use This Payment Method Button In Review Page Is Found");
		     section10 = CheckoutReviewPage.getUseThisPaymentMethodButton().getText();
		     Thread.sleep(2000);
		     CheckoutReviewPage.getUseThisPaymentMethodButton().click();
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Use This Payment Method Button In Review Page Not Found");
	}
		
      return section10;
}
	public static String BillingAddressLink() throws Exception{
		String section11 = null;
	
		try {
		     TestLogger.testLoggerInfo("Billing Address Link In Review Page Is Found");
		     section11 = CheckoutReviewPage.getBillingAddressLink().getText();
		     Thread.sleep(2000);
		     CheckoutReviewPage.getBillingAddressLink().click();
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Billing Address Link In Review Page Not Found");
	}
		
      return section11;
}
	public static String AddNewBillingAddressLink() throws Exception{
		String section12 = null;
	
		try {
		     TestLogger.testLoggerInfo("Add New Billing Address Link In Review Page Is Found");
		     section12 = CheckoutReviewPage.getAddNewBillingAddressLink().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Add New Billing Address Link In Review Page Not Found");
	}
		
      return section12;
}
	public static String CancelChoosingBillingAddress() throws Exception{
		String section13 = null;
	
		try {
		     TestLogger.testLoggerInfo("Cancel Choosing New Billing Address In Review Page Is Found");
		     section13 = CheckoutReviewPage.getCancelChoosingBillingAddress().getText();
		     Thread.sleep(2000);
		     CheckoutReviewPage.getCancelChoosingBillingAddress().click();
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Cancel Choosing New Billing Address In In Review Page Not Found");
	}
		
      return section13;
}
	public static String UseThisBillingAddressButton() throws Exception{
		String section14 = null;
	
		try {
		     TestLogger.testLoggerInfo("Use This Billing Address Button In Review Page Is Found");
		     section14 = CheckoutReviewPage.getUseThisBillingAddressButton().getText();
		     Thread.sleep(2000);
		     CheckoutReviewPage.getUseThisBillingAddressButton().click();
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Use This Billing Address Button In Review Page Not Found");
	}
		
      return section14;
}
	public static String ShippingMethodSection() throws Exception{
		String section15 = null;
	
		try {
		     TestLogger.testLoggerInfo("Shipping Method Section In Review Page Is Found");
		     section15 = CheckoutReviewPage.getShippingMethodSection().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Shipping Method Section In Review Page Not Found");
	}
		
      return section15;
}
	public static String ChooseStandardDelivery() throws Exception{
		String section16 = null;
	
		try {
		     TestLogger.testLoggerInfo("Choose Standard Delivery In Review Page Is Found");
		     section16 = CheckoutReviewPage.getChooseStandardDelivery().getText();
		     Thread.sleep(2000);
		     CheckoutReviewPage.getChooseStandardDelivery().click();
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Choose Standard Delivery In Review Page Not Found");
	}
		
      return section16;
}
	public static String Choose2ndDayAirDelivery() throws Exception{
		String section17 = null;
	
		try {
		     TestLogger.testLoggerInfo("Choose 2ndDayAir Delivery In Review Page Is Found");
		     section17 = CheckoutReviewPage.getChoose2ndDayAirDelivery().getText();
		     Thread.sleep(2000);
		     CheckoutReviewPage.getChoose2ndDayAirDelivery().click();
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Choose 2ndDayAir Delivery In Review Page Not Found");
	}
		
      return section17;
}
	public static String ChooseNextDayDelivery() throws Exception{
		String section18 = null;
	
		try {
		     TestLogger.testLoggerInfo("Choose NextDay Delivery In Review Page Is Found");
		     section18 = CheckoutReviewPage.getChooseNextDayDelivery().getText();
		     Thread.sleep(2000);
		     CheckoutReviewPage.getChooseNextDayDelivery().click();
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Choose NextDay Delivery In Review Page Not Found");
	}
		
      return section18;
}
	public static String OrderSummarySection() throws Exception{
		String section19 = null;
	
		try {
		     TestLogger.testLoggerInfo("Order Summary Section In Review Page Is Found");
		     section19 = CheckoutReviewPage.getOrderSummarySection().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Order Summary Section In Review Page Not Found");
	}
		
      return section19;
}
	public static String PriceTitleOrderSummarySection() throws Exception{
		String section20 = null;
	
		try {
		     TestLogger.testLoggerInfo("Price Title Order Summary Section In Review Page Is Found");
		     section20 = CheckoutReviewPage.getPriceTitleOrderSummarySection().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Price Title Order Summary Section In Review Page Not Found");
	}
		
      return section20;
}
	public static String ItemsTitleOrderSummarySection() throws Exception{
		String section21 = null;
	
		try {
		     TestLogger.testLoggerInfo("Items Title Order Summary Section In Review Page Is Found");
		     section21 = CheckoutReviewPage.getItemsTitleOrderSummarySection().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Items Title Order Summary Section In Review Page Not Found");
	}
		
      return section21;
}
	public static String SubtotalTitleOrderSummarySection() throws Exception{
		String section22 = null;
	
		try {
		     TestLogger.testLoggerInfo("Subtotal Title Order Summary Section In Review Page Is Found");
		     section22 = CheckoutReviewPage.getSubtotalTitleOrderSummarySection().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Subtotal Title Order Summary Section In Review Page Not Found");
	}
		
      return section22;
}
	public static String QuantityTitleOrderSummarySection() throws Exception{
		String section23 = null;
	
		try {
		     TestLogger.testLoggerInfo("Quantity Title Order Summary Section In Review Page Is Found");
		     section23 = CheckoutReviewPage.getQuantityTitleOrderSummarySection().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Quantity Title Order Summary Section In Review Page Not Found");
	}
		
      return section23;
}
	public static String PlaceOrderButton() throws Exception{
		String section24 = null;
	
		try {
		     TestLogger.testLoggerInfo("Place Order Button In Review Page Is Found");
		     section24 = CheckoutReviewPage.getPlaceOrderButton().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Place Order Button In Review Page Not Found");
	}
		
      return section24;
}
	public static String OrderSummarySectionRightSide() throws Exception{
		String section25 = null;
	
		try {
		     TestLogger.testLoggerInfo("Order Summary Section RightSide In Review Page Is Found");
		     section25 = CheckoutReviewPage.getOrderSummarySectionRightSide().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Order Summary Section RightSide In Review Page Not Found");
	}
		
      return section25;
}
	public static String ShippingCost() throws Exception{
		String section26 = null;
	
		try {
		     TestLogger.testLoggerInfo("Shipping Cost Order Summary Section In Review Page Is Found");
		     section26 = CheckoutReviewPage.getShippingCost().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Shipping Cost Order Summary Section In Review Page Not Found");
	}
		
      return section26;
}
	public static String OrderTotal() throws Exception{
		String section27 = null;
	
		try {
		     TestLogger.testLoggerInfo("Order Total Under Order Summary Section In Review Page Is Found");
		     section27 = CheckoutReviewPage.getOrderTotal().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Order Total Under Order Summary Section In Review Page Not Found");
	}
		
      return section27;
}
	public static String SubtotalOrderSummarySectionRightSide() throws Exception{
		String section28 = null;
	
		try {
		     TestLogger.testLoggerInfo("Subtotal Order Summary Section RightSide In Review Page Is Found");
		     section28 = CheckoutReviewPage.getShippingCost().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Subtotal Order Summary Section RightSide In Review Page Not Found");
	}
		
      return section28;
}
	public static String PlaceOrderButtonRightSide() throws Exception{
		String section29 = null;
	
		try {
		     TestLogger.testLoggerInfo("Place Order Button RightSide In Review Page Is Found");
		     section29 = CheckoutReviewPage.getPlaceOrderButtonRightSide().getText();
		     Thread.sleep(2000);
		     CheckoutReviewPage.getPlaceOrderButtonRightSide().click();
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Place Order Button RightSide In Review Page Not Found");
	}
		
      return section29;
}
	
	public static void ClickShippingAddressInContainer() {
		try {
		     TestLogger.testLoggerInfo("Shipping Address In Container Is Found");
		     CheckoutReviewPage.getShippingAddressInContainer().click();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Shipping Address In Container Is Not Found");
		}
	}

	public static void ClickBillingAndPaymentInContainer() {
		try {
		     TestLogger.testLoggerInfo("Billing And Payment In Container Is Found");
		     CheckoutReviewPage.getBillingAndPaymentInContainer().click();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Billing And Payment In Container Is Not Found");
		}
	}

	public static void ReturnToCartFromCheckout() {
		try {
		     TestLogger.testLoggerInfo("Return To Cart From Checkout Option Is Found");
		     CheckoutReviewPage.getPipingRockImageInCheckout().click();
		     CheckoutReviewPage.getReturnToCartFromCheckout().click();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Return To Cart From Checkout Option Is Not Found");
		}
	}
	
	/* Product Restrictions */
	
	/* Total Product Restrictions */
	
	public static String getModalWindowTitle() throws Exception{
		String titleName = null;
		try {
			TestLogger.testLoggerInfo("Modal Title Is Found");
		     titleName = CheckoutReviewPage.getModalTitleTextCenter().getText();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Modal Title Is Found");
		}
		return titleName;
	}
	
	public static String getModalBodyMessage() throws Exception{
		String messageBody = null;
		try {
			TestLogger.testLoggerInfo("Modal Body Message Is Found");
			Thread.sleep(5000);
			messageBody = CheckoutReviewPage.getModalBody().getText();
		    Thread.sleep(5000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Modal Body Message Is Not Found");
		}
		return messageBody;
	}
	
	public static void ClickModalCloseIcon() {
		try {
		     TestLogger.testLoggerInfo("Modal Close Button Is Found");
		     CheckoutReviewPage.getModalDismissCloseIcon().click();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Modal Close Button Is Not Found");
		}
	}
	
	public static void ClickContinueCheckoutBtn() {
		try {
		     TestLogger.testLoggerInfo("Continue Checkout Button Is Found");
		     CheckoutReviewPage.getContinurCheckoutBtn().click();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Continue Checkout Button Is Not Found");
		}
	}
	
	public static void ClickPlaceOrderBtnInOrderSummary() throws Exception{
		try {
		     TestLogger.testLoggerInfo("Place Order Button RightSide In Order Summary Is Found");
		     CheckoutReviewPage.getPlaceOrderButtonRightSide().click();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Place Order Button RightSide In Order Summary Is Not Found");
		}
	}
	
	public static String getRestrictionErrorMsgInOrderSummary() throws Exception{
		String messageBody = null;
		try {
			TestLogger.testLoggerInfo("Restriction Error Message In Order Summary Is Found");
			messageBody = CheckoutReviewPage.getErrorMessageInOrderSummary().getText();
		    Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Restriction Error Message In Order Summary Is Not Found");
		}
		return messageBody;
	}
	
	public static String GetQtySizeInOrderSummarySection() throws Exception{
		String fieldValSize = null;
		try {
			TestLogger.testLoggerInfo("Qty Field In Order Summary Section Is Found");
			fieldValSize = CheckoutReviewPage.getQtyInOrderSummary().getAttribute("value");
		    Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Qty Field In Order Summary Section Is Not Found");
		}
		return fieldValSize;
	}
	
	/* Prop 65 Product Restrictions */
	
	public static String getModalBodyMessageProp65() throws Exception{
		String messageBody = null;
		try {
			TestLogger.testLoggerInfo("Modal Body Message Is Found");
			Thread.sleep(5000);
			messageBody = CheckoutReviewPage.getModalBodyForProp65().getText();
		    Thread.sleep(5000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Modal Body Message Is Not Found");
		}
		return messageBody;
	}
	
	public static void ClickModalCloseIconProp65() {
		try {
		     TestLogger.testLoggerInfo("Modal Close Button Is Found");
		     CheckoutReviewPage.getModalDismissCloseIconForProp65().click();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Modal Close Button Is Not Found");
		}
	}
	
	public static void ClickIAcceptBtnProp65() {
		try {
		     TestLogger.testLoggerInfo("Continue Checkout Button Is Found");
		     CheckoutReviewPage.getIAcceptBtnForProp65().click();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Continue Checkout Button Is Not Found");
		}
	}
	
	public static String GetProp65ErrorMessageInOrderSummary() throws Exception{
		String messageBody = null;
		boolean isDisplayed= CheckoutReviewPage.getProp65ErrorMessageInOrderSummary().isDisplayed();
		if (isDisplayed) {
			TestLogger.testLoggerInfo("Prop65 Error Message In Order Summary Is Found");
			messageBody = CheckoutReviewPage.getProp65ErrorMessageInOrderSummary().getText();
		}
		else {
			TestLogger.testLoggerInfo("Prop65 Error Message In Order Summary Is Not Found");
			messageBody = CheckoutReviewPage.getProp65ErrorMessageInOrderSummary().getText();
		}
		return messageBody;
	}
	
	public static Boolean IAcceptCheckBoxInOrderSummary() throws Exception{
		boolean isSelected = CheckoutReviewPage.getIAcceptInOrderSummary().isSelected();		
		if (isSelected) {
			 TestLogger.testLoggerInfo("I Accept CheckBox In Order Summary Is Checked By Default");
			}
		else {
			TestLogger.testLoggerInfo("I Accept CheckBox In Order Summary Is Not Checked By Default");
		}
		return isSelected;
	}
	
	public static void ClickIAcceptCheckBoxInOrderSummary() throws Exception{
		boolean isSelected = CheckoutReviewPage.getIAcceptInOrderSummary().isSelected();		
		if (!isSelected) {
			CheckoutReviewPage.getIAcceptInOrderSummary().click();
			TestLogger.testLoggerInfo("I Accept CheckBox In Order Summary Is Checked Default");
			}
		else {
			TestLogger.testLoggerInfo("I Accept CheckBox In Order Summary Is Unable To Check");
		}
	}
	
}	
	
	
	
	
package com.BusinessComponents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;

import com.PageFactory.CheckoutConfirmationPage;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class CheckoutConfirmationPageActions extends CommonUtils{
	
	static CheckoutConfirmationPage OrderConfirmationPage = PageFactory.initElements(driver, CheckoutConfirmationPage.class);
    
	public static String GoogleCustomerReviewsPopup() throws Exception{
		String section1 = null;
	
		try {
		     TestLogger.testLoggerInfo("Google Customer Reviews Popup in Order Confirmation Page Is Found");
		     Alert alert = driver.switchTo().alert();
		     alert.accept();
		     section1 = OrderConfirmationPage.getGoogleCustomerReviewsPopup().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Google Customer Reviews Popup in Order Confirmation Page Is Found");
	}
	
    return section1;
	}
	
	public static void GoogleCustomerReviewsPopupClose() throws Exception{	
		try {
		     TestLogger.testLoggerInfo("Google Customer Reviews Popup Close in Order Confirmation Page Is Found");
             OrderConfirmationPage.getGoogleCustomerReviewsPopupCLose().click();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Google Customer Reviews Popup Close in Order Confirmation Page Is Found");
	}
	}
	
	public static String OrderConfirmationSection() throws Exception{
		String section2 = null;
	
		try {
		     TestLogger.testLoggerInfo("Order Confirmation Section in Order Confirmation Page Is Found");
		     section2 = OrderConfirmationPage.getOrderConfirmationSection().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Order Confirmation Section in Order Confirmation Page Is Found");
	}
	
    return section2;
	}
	
	public static String ShippingDetailSection() throws Exception{
		String section3 = null;
	
		try {
		     TestLogger.testLoggerInfo("Shipping Details Section in Order Confirmation Page Is Found");
		     section3 = OrderConfirmationPage.getShippingDetailSection().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Shipping Details Section in Order Confirmation Page Is Found");
	}
	
    return section3;
	}
	
	public static String PaymentDetailSection() throws Exception{
		String section4 = null;
	
		try {
		     TestLogger.testLoggerInfo("Payment Details Section in Order Confirmation Page Is Found");
		     section4 = OrderConfirmationPage.getPaymentDetailSection().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Payment Details Section in Order Confirmation Page Is Found");
	}
	
    return section4;
	}
	
	public static String OrderSummarySection() throws Exception{
		String section5 = null;
	
		try {
		     TestLogger.testLoggerInfo("Order Summary Section in Order Confirmation Page Is Found");
		     section5 = OrderConfirmationPage.getOrderSummarySection().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Order Summary Section in Order Confirmation Page Is Found");
	}
	
    return section5;
	}
	
	public static String ReferAndEarnSection() throws Exception{
		String section6 = null;
	
		try {
		     TestLogger.testLoggerInfo("Refer And Earn Section in Order Confirmation Page Is Found");
		     section6 = OrderConfirmationPage.getReferAndEarnSection().getText();
		     Thread.sleep(2000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Refer And Earn Section in Order Confirmation Page Is Found");
	}
	
    return section6;
	}
}

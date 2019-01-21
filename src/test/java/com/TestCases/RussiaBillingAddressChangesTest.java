package com.TestCases;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BusinessComponents.CheckoutBillingPageActions;
import com.BusinessComponents.CheckoutReviewPageActions;
import com.BusinessComponents.CheckoutShippingPageActions;
import com.BusinessComponents.HomePageActions;
import com.BusinessComponents.LoginPageAction;
import com.BusinessComponents.ShoppingCartPageActions;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class RussiaBillingAddressChangesTest extends CommonUtils{

	@BeforeTest
	public void setUp() throws Exception {
		init();	
	}
	
	@Test (priority=1)
	public void PrerequisteTestForExistingUser() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Existing Customer - Prerequiste Test Case");
			String emailAddress = "testshippingaddr1@pr.com";
			String password = "1234567890";
			driver.navigate().refresh();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(1000);
			HomePageActions.LoginAction();			
			LoginPageAction.TypeUserEmailAddress(emailAddress);			
			LoginPageAction.TypeUserPassword(password);
			LoginPageAction.clickSignInButton();
			String prodId = "4761";
			HomePageActions.SearchForAProduct(prodId);
			HomePageActions.ClickSearchButton();
			HomePageActions.ClickAddToCartButton();
			Thread.sleep(1000);
			ShoppingCartPageActions.ClickCheckoutButton();
			CheckoutReviewPageActions.ClickBillingAndPaymentInContainer();
			CheckoutBillingPageActions.ClickBillingAddressLink();
			CheckoutBillingPageActions.ClickAddAnBillingAddress();
			TestLogger.testLoggerTCEnd("Existing Customer - Prerequiste Test Case");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Prerequiste Test Case FAILS" + e);
		}
	}
	
	@Test (priority=2)
	public void RussiaBillingAddressFieldsValidationsTest() throws Exception {
		try {
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Russian Federation");
			takeSnapShot();
			Thread.sleep(1000);
			CheckoutShippingPageActions.FirstNameInputFieldInShippingPage("TestFN");
			CheckoutShippingPageActions.LastNameInputFieldInShippingPage("TestLN");
			takeSnapShot();
			CheckoutShippingPageActions.Address1InputFieldInShippingPage("Addr1");
			CheckoutShippingPageActions.Address2InputFieldInShippingPage("Addr2");
			takeSnapShot();
			CheckoutShippingPageActions.CityInputFieldInShippingPage("TestCity");
			CheckoutShippingPageActions.StateInputFieldInShippingPage("TestState");
			takeSnapShot();
			CheckoutShippingPageActions.ZipCodeInputFieldInShippingPage("1234567890");
			CheckoutShippingPageActions.PhoneNumberInputFieldInShippingPage("1234567890");
			takeSnapShot();
			CheckoutBillingPageActions.ClickUseThisAddrBtn();
			driver.navigate().refresh();
			CheckoutBillingPageActions.ClickBillingAddressLink();
			CheckoutBillingPageActions.ClickEdit();
			Thread.sleep(1000);
			CheckoutShippingPageActions.FirstNameInputFieldInShippingPage("TestFN-123451234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
			Integer fieldValueFN = CheckoutShippingPageActions.GetFirstNameFieldValueSize();
			System.out.print("fieldValue FN: " + fieldValueFN);
			CheckoutShippingPageActions.LastNameInputFieldInShippingPage("TestLN-123451234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
			Integer fieldValueLN = CheckoutShippingPageActions.GetLastNameFieldValueSize();
			System.out.print("fieldValue LN: " + fieldValueLN);
			takeSnapShot();
			CheckoutShippingPageActions.Address1InputFieldInShippingPage("Addr1-12345678901234567890123456789012345678901234567890");
			Integer fieldValueAddr1 = CheckoutShippingPageActions.GetAddrLn1FieldValueSize();
			System.out.print("fieldValue Addr1: " + fieldValueAddr1);
			CheckoutShippingPageActions.Address2InputFieldInShippingPage("Addr2-12345678901234567890123456789012345678901234567890");
			Integer fieldValueAddr2 = CheckoutShippingPageActions.GetAddrLn2FieldValueSize();
			System.out.print("fieldValue Addr2: " + fieldValueAddr2);
			takeSnapShot();
			CheckoutShippingPageActions.CityInputFieldInShippingPage("City-1234567890123456789012345678901234567890");
			Integer fieldValueCity = CheckoutShippingPageActions.GetCityFieldValueSize();
			System.out.print("fieldValue City: " + fieldValueCity);
			CheckoutShippingPageActions.StateInputFieldInShippingPage("State-12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
			Integer fieldValueState = CheckoutShippingPageActions.GetStateFieldValueSize();
			System.out.print("fieldValue State: " + fieldValueState);
			takeSnapShot();
			CheckoutShippingPageActions.ZipCodeInputFieldInShippingPage("ZipCode-12345678901234567890");
			Integer fieldValueZipCode = CheckoutShippingPageActions.GetZipCodeFieldValueSize();
			System.out.print("fieldValue ZipCode: " + fieldValueZipCode);
			CheckoutShippingPageActions.PhoneNumberInputFieldInShippingPage("PhoneNumber-123456789012345678901234567890");
			Integer fieldValuePhoneNum = CheckoutShippingPageActions.GetPhoneNumberFieldValueSize();
			System.out.print("fieldValue PhoneNum: " + fieldValuePhoneNum);
			takeSnapShot();
			CheckoutBillingPageActions.ClickUseThisAddrBtn();
			driver.navigate().refresh();
			CheckoutBillingPageActions.ClickBillingAddressLink();
			takeSnapShot();
			CheckoutBillingPageActions.ClickDeleteLinkInPanel();
			CheckoutBillingPageActions.ConfirmDeleteBillingAddr();
			driver.navigate().refresh();
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			LoginPageAction.UserLogout();
			Assert.assertEquals(fieldValueFN.toString(), "100");
			Assert.assertEquals(fieldValueLN.toString(), "100");
			Assert.assertEquals(fieldValueAddr1.toString(), "35");
			Assert.assertEquals(fieldValueAddr2.toString(), "35");
			Assert.assertEquals(fieldValueState.toString(), "100");
			Assert.assertEquals(fieldValueCity.toString(), "30");
			Assert.assertEquals(fieldValueZipCode.toString(), "6");
			Assert.assertEquals(fieldValuePhoneNum.toString(), "20");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("LabelsTest" + e);
		}
	}
	
	@AfterTest
	public void driverClose() {
	closeDriver();
	}
}	

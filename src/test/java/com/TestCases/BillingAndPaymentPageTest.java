package com.TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BusinessComponents.CheckoutBillingPageActions;
import com.BusinessComponents.CheckoutReviewPageActions;
import com.BusinessComponents.HomePageActions;
import com.BusinessComponents.LoginPageAction;
import com.BusinessComponents.ShoppingCartPageActions;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class BillingAndPaymentPageTest extends CommonUtils{

	@BeforeTest
	public void setUp() throws Exception {
		init();	
	}
	
	@Test (priority=1)
	public void PrerequisteTestForExistingUser() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Prerequiste Test Case");
			String emailAddress = "vishnm.216@gmail.com";
			String password = "1234567890";
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(2000);
			HomePageActions.LoginAction();			
			LoginPageAction.TypeUserEmailAddress(emailAddress);			
			LoginPageAction.TypeUserPassword(password);
			LoginPageAction.clickSignInButton();
			takeSnapShot();
			String prodId = "4761";
			HomePageActions.SearchForAProduct(prodId);
			HomePageActions.ClickSearchButton();
			HomePageActions.ClickAddToCartButton();
			Thread.sleep(2000);
			ShoppingCartPageActions.ClickCheckoutButton();
			driver.navigate().refresh();
			CheckoutReviewPageActions.ClickBillingAndPaymentInContainer();
			TestLogger.testLoggerTCEnd("Prerequiste Test Case");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Prerequiste Test Case FAILS" + e);
		}
	}
	
	@Test (priority=2)
	public void ExistingCustomerDeletePaymentMethodTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Existing Customer - Delete Billing & Payment Method");
			CheckoutBillingPageActions.ClickDeleteLinkInPanel();
			CheckoutBillingPageActions.DeclineDeletePaymentMethod();
			driver.navigate().refresh();
			CheckoutBillingPageActions.ClickDeleteLinkInPanel();
			CheckoutBillingPageActions.ConfirmDeletePaymentMethod();
			TestLogger.testLoggerTCEnd("Existing Customer - Delete Billing & Payment Method");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Test FAILS" + e);
		}
	}
	
	@Test (priority=3)
	public void ExistingCustomerAddNewPaymentMethodTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Existing Customer - Add New Payment Method");			
			CheckoutBillingPageActions.AddNewBillingAddressLink();
			CheckoutBillingPageActions.CardHolderNameInputFieldInBillingpage("VishnuTest");
			CheckoutBillingPageActions.CardNumberInputFieldInBillingpage("4111111111111111");
			CheckoutBillingPageActions.SelectCardExpirationMonthInBillingpage("06");
			CheckoutBillingPageActions.SelectCardExpirationYearInBillingpage("2020");
			CheckoutBillingPageActions.CardCvvInputFieldInBillingpage("111");
			CheckoutBillingPageActions.ClickUseThisPaymentMethodBtn();
			driver.navigate().refresh();
			CheckoutReviewPageActions.ClickBillingAndPaymentInContainer();
			TestLogger.testLoggerTCEnd("Existing Customer - Add New Payment Method");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Test FAILS" + e);
		}
	}
	
	@Test (priority=4)
	public void ExistingCustomerAddNewBillingAddressMethodTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Existing Customer - Add New Billing Address");
			CheckoutBillingPageActions.ClickBillingAddressLink();
			CheckoutBillingPageActions.ClickAddAnBillingAddress();
			CheckoutBillingPageActions.ClickCancelBtn();
			CheckoutBillingPageActions.ClickAddAnBillingAddress();
			CheckoutBillingPageActions.SelectCountryDropDownInBillingPage("United States");
			CheckoutBillingPageActions.FirstNameInputFieldInBillingPage("Vishnu");
			CheckoutBillingPageActions.LastNameInputFieldInBillingPage("Test");
			CheckoutBillingPageActions.Address1InputFieldInBillingPage("Test");
			CheckoutBillingPageActions.Address2InputFieldInBillingPage("test");
			CheckoutBillingPageActions.CityInputFieldInBillingPage("San Diego");
			CheckoutBillingPageActions.SelectStateDropDownInBillingPage("California");
			CheckoutBillingPageActions.ZipCodeInputFieldInBillingPage("12345");
			CheckoutBillingPageActions.PhoneNumberInputFieldInBillingPage("1234567890");
			CheckoutBillingPageActions.ClickUseThisAddrBtn();
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("Existing Customer - Add New Billing Address");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Test FAILS" + e);
		}
	}
	
	@Test (priority=5)
	public void ExistingCustomerEditBillingAddressMethodTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Existing Customer - Edit Billing Address");
			CheckoutBillingPageActions.ClickBillingAddressLink();
			CheckoutBillingPageActions.ClickEdit();
			CheckoutBillingPageActions.SelectCountryDropDownInBillingPage("India");
			CheckoutBillingPageActions.FirstNameInputFieldInBillingPage("Test");
			CheckoutBillingPageActions.LastNameInputFieldInBillingPage("Test");
			CheckoutBillingPageActions.Address1InputFieldInBillingPage("Test");
			CheckoutBillingPageActions.Address2InputFieldInBillingPage("test");
			CheckoutBillingPageActions.CityInputFieldInBillingPage("Bengaluru");
			CheckoutBillingPageActions.SendStateValue("Karnataka");
			CheckoutBillingPageActions.ZipCodeInputFieldInBillingPage("560102");
			CheckoutBillingPageActions.PhoneNumberInputFieldInBillingPage("0987654321");
			CheckoutBillingPageActions.ClickUseThisAddrBtn();
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("Existing Customer - Add New Billing Address");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Test FAILS" + e);
		}
	}
	
	@Test (priority=6)
	public void ExistingCustomerDeleteBillingAddressMethodTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Existing Customer - Delete Billing Address");
			CheckoutBillingPageActions.ClickBillingAddressLink();
			CheckoutBillingPageActions.ClickDelete();
			CheckoutBillingPageActions.DeclineDeleteBillingAddr();
			CheckoutBillingPageActions.ClickDelete();
			CheckoutBillingPageActions.ConfirmDeleteBillingAddr();
			driver.navigate().refresh();
			TestLogger.testLoggerTCEnd("Existing Customer - Delete Billing Address");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Test FAILS" + e);
		}
	}
	
	/*@Test (priority=7)
	public void ExistingCustomerSelectAnotherBillingAddressMethodTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Existing Customer - Select Another Existing Billing Address");
			CheckoutBillingPageActions.ClickSelectBtn();
			TestLogger.testLoggerTCEnd("Existing Customer - Select Another Existing Billing Address");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Test FAILS" + e);
		}
	}*/
	
	@Test (priority=7)
	public void ExistingCustomerSaveCardForFutureUseTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Existing Customer - Save Card For Future Use CheckBox");
			CheckoutBillingPageActions.AddNewBillingAddressLink();
			CheckoutBillingPageActions.CardHolderNameInputFieldInBillingpage("VishnuTest");
			CheckoutBillingPageActions.CardNumberInputFieldInBillingpage("4111111111111111");
			CheckoutBillingPageActions.SelectCardExpirationMonthInBillingpage("06");
			CheckoutBillingPageActions.SelectCardExpirationYearInBillingpage("2020");
			CheckoutBillingPageActions.CardCvvInputFieldInBillingpage("111");
			CheckoutBillingPageActions.DefaultSaveCardForFutureUseCheckBox();
			CheckoutBillingPageActions.ValidateSaveCardForFutureUseCheckBox();
			CheckoutBillingPageActions.AddNewBillingAddressLink();
			TestLogger.testLoggerTCEnd("Existing Customer - Save Card For Future Use CheckBox");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Test FAILS" + e);
		}
	}
	
	@Test (priority=8)
	public void ExistingCustomerSameAsShippingAddressTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Existing Customer - Same As Shipping Address CheckBox");
			CheckoutBillingPageActions.AddNewBillingAddressLink();
			CheckoutBillingPageActions.CardHolderNameInputFieldInBillingpage("VishnuTest");
			CheckoutBillingPageActions.CardNumberInputFieldInBillingpage("4111111111111111");
			CheckoutBillingPageActions.SelectCardExpirationMonthInBillingpage("06");
			CheckoutBillingPageActions.SelectCardExpirationYearInBillingpage("2020");
			CheckoutBillingPageActions.CardCvvInputFieldInBillingpage("111");
			CheckoutBillingPageActions.DefaultSameAsShippingAddressCheckBox();
			CheckoutBillingPageActions.ValidateSameAsShippingAddressCheckBox();
			CheckoutBillingPageActions.AddNewBillingAddressLink();
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			ShoppingCartPageActions.ClickRemoveLink();
			ShoppingCartPageActions.ConfirmRemoveItem();
			TestLogger.testLoggerTCEnd("Existing Customer - Select Existing Billing Address CheckBox");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Test FAILS" + e);
		}
	}
	
}	
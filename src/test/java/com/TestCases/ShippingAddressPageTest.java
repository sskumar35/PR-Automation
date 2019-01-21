package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.BusinessComponents.CheckoutReviewPageActions;
import com.BusinessComponents.HomePageActions;
import com.BusinessComponents.LoginPageAction;
import com.BusinessComponents.CheckoutShippingPageActions;
import com.BusinessComponents.ShoppingCartPageActions;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class ShippingAddressPageTest extends CommonUtils{

	@BeforeTest
	public void setUp() throws Exception {
		init();	
	}
	@Test (priority=1)
	public void PrerequisteTestForExistingUser() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Existing Customer - Prerequiste Test Case");
			String emailAddress = "testdemocartpage@gmail.com";
			String password = "omsairam35@";
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
			CheckoutReviewPageActions.ClickShippingAddressInContainer();
			TestLogger.testLoggerTCEnd("Existing Customer - Prerequiste Test Case");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Prerequiste Test Case FAILS" + e);
		}
	}
	
	@Test (priority=2)
	public void ExistingCustomerAddNewShippingAddressTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Existing Customer - Add New Shipping Address");
			String firstName = "Test";
			String lastName = "Test";
			String address1 = "Test";
			String address2 = "Test";
			String city = "New York";
			String zipCode = "10009";
			String phoneNumber = "0809876453";
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("United States");
			CheckoutShippingPageActions.FirstNameInputFieldInShippingPage(firstName);
			CheckoutShippingPageActions.LastNameInputFieldInShippingPage(lastName);
			CheckoutShippingPageActions.Address1InputFieldInShippingPage(address1);
			CheckoutShippingPageActions.Address2InputFieldInShippingPage(address2);
			CheckoutShippingPageActions.CityInputFieldInShippingPage(city);
			CheckoutShippingPageActions.SelectStateDropDownInShippingPage("California");
			CheckoutShippingPageActions.ZipCodeInputFieldInShippingPage(zipCode);
			CheckoutShippingPageActions.PhoneNumberInputFieldInShippingPage(phoneNumber);
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			driver.navigate().refresh();
			CheckoutReviewPageActions.ClickShippingAddressInContainer();
			TestLogger.testLoggerTCEnd("Existing Customer - Add New Shipping Address");
		} catch (Exception e) {
			Assert.fail("Test" + e);
		}
	}
	
	@Test (priority=3)
	public void ExistingCustomerCancelShippingAddressFormTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Existing Customer - Cancel Shipping Address Form");
			String firstName = "Test";
			String lastName = "Test";
			String address1 = "Test";
			String address2 = "Test";
			String city = "New York";
			String zipCode = "10009";
			String phoneNumber = "0809876453";
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("United States");
			CheckoutShippingPageActions.FirstNameInputFieldInShippingPage(firstName);
			CheckoutShippingPageActions.LastNameInputFieldInShippingPage(lastName);
			CheckoutShippingPageActions.Address1InputFieldInShippingPage(address1);
			CheckoutShippingPageActions.Address2InputFieldInShippingPage(address2);
			CheckoutShippingPageActions.CityInputFieldInShippingPage(city);
			CheckoutShippingPageActions.SelectStateDropDownInShippingPage("California");
			CheckoutShippingPageActions.ZipCodeInputFieldInShippingPage(zipCode);
			CheckoutShippingPageActions.PhoneNumberInputFieldInShippingPage(phoneNumber);
			CheckoutShippingPageActions.ClickCancelBtn();
			driver.navigate().refresh();
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			ShoppingCartPageActions.ClickCheckoutButton();
			CheckoutReviewPageActions.ClickShippingAddressInContainer();
			TestLogger.testLoggerTCEnd("Existing Customer - Cancel Shipping Address Form");
		} catch (Exception e) {
			Assert.fail("Test" + e);
		}
	}
	
	@Test (priority=4)
	public void ExistingCustomerEditShippingAddressTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Existing Customer - Edit Existing Shipping Address");
			String firstName = "TestEdit";
			String lastName = "TestEdit";
			String address1 = "TestEdit";
			String address2 = "TestEdit";
			String city = "Bangalore";
			String zipCode = "560102";
			String phoneNumber = "1234567890";			
			CheckoutShippingPageActions.ClickEditShippingAddress();			
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("India");
			CheckoutShippingPageActions.FirstNameInputFieldInShippingPage(firstName);
			CheckoutShippingPageActions.LastNameInputFieldInShippingPage(lastName);
			CheckoutShippingPageActions.Address1InputFieldInShippingPage(address1);
			CheckoutShippingPageActions.Address2InputFieldInShippingPage(address2);
			CheckoutShippingPageActions.CityInputFieldInShippingPage(city);
			CheckoutShippingPageActions.SendStateValue("Karnataka");
			CheckoutShippingPageActions.ZipCodeInputFieldInShippingPage(zipCode);
			CheckoutShippingPageActions.PhoneNumberInputFieldInShippingPage(phoneNumber);
			CheckoutShippingPageActions.ClickUseThisAddressBtnInEditForm();
			driver.navigate().refresh();
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			ShoppingCartPageActions.ClickCheckoutButton();
			CheckoutReviewPageActions.ClickShippingAddressInContainer();
			//LoginPageAction.UserLogout();
			TestLogger.testLoggerTCEnd("Existing Customer - Edit Existing Shipping Address");
		} catch (Exception e) {
			Assert.fail("Test" + e);
		}
	}	

	@Test (priority=5)
	public void ExistingCustomerDeleteShippingAddressTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Existing Customer - Delete Existing Shipping Address");						
			CheckoutShippingPageActions.ClickEditShippingAddress();			
			CheckoutShippingPageActions.ClickDeleteLinkInAddrForm();
			CheckoutShippingPageActions.DeclineRemoveItem();
			CheckoutShippingPageActions.ClickEditShippingAddress();			
			CheckoutShippingPageActions.ClickDeleteLinkInAddrForm();
			CheckoutShippingPageActions.ConfirmRemoveItem();
			driver.navigate().refresh();
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			ShoppingCartPageActions.ClickRemoveLink();
			ShoppingCartPageActions.ConfirmRemoveItem();
			TestLogger.testLoggerTCEnd("Existing Customer - Delete Existing Shipping Address");
		} catch (Exception e) {
			Assert.fail("Test" + e);
		}
	}
	
	/*@Test (priority=6)
	public void ExistingCustomerChooseAnotherShippingAddressTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Existing Customer - Choose Another Shipping Address");						
			CheckoutShippingPageActions.SelectAnotherShippingAddressUsingRadioBtn();
			CheckoutShippingPageActions.ContinueButtonInShippingPage();
			driver.navigate().refresh();
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			ShoppingCartPageActions.ClickCheckoutButton();
			CheckoutReviewPageActions.ClickShippingAddressInContainer();			
			TestLogger.testLoggerTCEnd("Existing Customer - Choose Another Shipping Address");
		} catch (Exception e) {
			Assert.fail("Test" + e);
		}
	}*/
	
	@Test (priority=7)
	public void PrerequisteTestForNewUser() throws Exception{
		try {
			TestLogger.testLoggerTCStart("New Customer - Prerequiste Test Case");
			LoginPageAction.UserLogout();
			//HomePageActions.HandlingModalSuggestedBox();
			//HomePageActions.LoginAction();	
			LoginPageAction.CreateNewUserAcc("test@5777ch545uhaujkd8.com", "1234567890");
			takeSnapShot();
			String prodId = "9231";
			HomePageActions.SearchForAProduct(prodId);
			HomePageActions.ClickSearchButton();
			HomePageActions.ClickAddToCartButton();
			Thread.sleep(2000);
			ShoppingCartPageActions.ClickCheckoutButton();
			TestLogger.testLoggerTCEnd("Prerequiste Test Case");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("New Customer - Prerequiste Test Case FAILS" + e);
		}
	}
	
	@Test (priority=8)
	public void NewCustomerAddNewShippingAddressTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("New Customer - Add New Shipping Address");
			String firstName = "Test";
			String lastName = "Test";
			String address1 = "Test";
			String address2 = "Test";
			String city = "New York";
			String zipCode = "10009";
			String phoneNumber = "0809876453";
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("United States");
			CheckoutShippingPageActions.FirstNameInputFieldInShippingPage(firstName);
			CheckoutShippingPageActions.LastNameInputFieldInShippingPage(lastName);
			CheckoutShippingPageActions.Address1InputFieldInShippingPage(address1);
			CheckoutShippingPageActions.Address2InputFieldInShippingPage(address2);
			CheckoutShippingPageActions.CityInputFieldInShippingPage(city);
			CheckoutShippingPageActions.SelectStateDropDownInShippingPage("California");
			CheckoutShippingPageActions.ZipCodeInputFieldInShippingPage(zipCode);
			CheckoutShippingPageActions.PhoneNumberInputFieldInShippingPage(phoneNumber);
			CheckoutShippingPageActions.ContinueButtonInShippingPageNewCust();
			driver.navigate().refresh();
			CheckoutReviewPageActions.ClickShippingAddressInContainer();
			TestLogger.testLoggerTCEnd("New Customer - Add New Shipping Address");
		} catch (Exception e) {
			Assert.fail("Test" + e);
		}
	}
	
	@Test (priority=9)
	public void NewCustomerCancelShippingAddressFormTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("New Customer - Cancel Shipping Address Form");
			String firstName = "Test";
			String lastName = "Test";
			String address1 = "Test";
			String address2 = "Test";
			String city = "New York";
			String zipCode = "10009";
			String phoneNumber = "0809876453";
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("United States");
			CheckoutShippingPageActions.FirstNameInputFieldInShippingPage(firstName);
			CheckoutShippingPageActions.LastNameInputFieldInShippingPage(lastName);
			CheckoutShippingPageActions.Address1InputFieldInShippingPage(address1);
			CheckoutShippingPageActions.Address2InputFieldInShippingPage(address2);
			CheckoutShippingPageActions.CityInputFieldInShippingPage(city);
			CheckoutShippingPageActions.SelectStateDropDownInShippingPage("California");
			CheckoutShippingPageActions.ZipCodeInputFieldInShippingPage(zipCode);
			CheckoutShippingPageActions.PhoneNumberInputFieldInShippingPage(phoneNumber);
			CheckoutShippingPageActions.ClickCancelBtn();
			driver.navigate().refresh();
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			ShoppingCartPageActions.ClickCheckoutButton();
			CheckoutReviewPageActions.ClickShippingAddressInContainer();
			TestLogger.testLoggerTCEnd("New Customer - Cancel Shipping Address Form");
		} catch (Exception e) {
			Assert.fail("Test" + e);
		}
	}
	
	@Test (priority=10)
	public void NewCustomerEditShippingAddressTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("New Customer - Edit Existing Shipping Address");
			String firstName = "TestEdit";
			String lastName = "TestEdit";
			String address1 = "TestEdit";
			String address2 = "TestEdit";
			String city = "Bangalore";
			String zipCode = "560102";
			String phoneNumber = "1234567890";			
			CheckoutShippingPageActions.ClickEditShippingAddress();			
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("India");
			CheckoutShippingPageActions.FirstNameInputFieldInShippingPage(firstName);
			CheckoutShippingPageActions.LastNameInputFieldInShippingPage(lastName);
			CheckoutShippingPageActions.Address1InputFieldInShippingPage(address1);
			CheckoutShippingPageActions.Address2InputFieldInShippingPage(address2);
			CheckoutShippingPageActions.CityInputFieldInShippingPage(city);
			CheckoutShippingPageActions.SendStateValue("Karnataka");
			CheckoutShippingPageActions.ZipCodeInputFieldInShippingPage(zipCode);
			CheckoutShippingPageActions.PhoneNumberInputFieldInShippingPage(phoneNumber);
			CheckoutShippingPageActions.ClickUseThisAddressBtnInEditForm();
			driver.navigate().refresh();
			CheckoutReviewPageActions.ClickShippingAddressInContainer();
			//LoginPageAction.UserLogout();
			TestLogger.testLoggerTCEnd("New Customer - Edit Existing Shipping Address");
		} catch (Exception e) {
			Assert.fail("Test" + e);
		}
	}	

	@Test (priority=11)
	public void NewCustomerDeleteShippingAddressTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Existing Customer - Delete Existing Shipping Address");						
			CheckoutShippingPageActions.ClickEditShippingAddress();			
			CheckoutShippingPageActions.ClickDeleteLinkInAddrForm();
			CheckoutShippingPageActions.DeclineRemoveItem();
			CheckoutShippingPageActions.ClickEditShippingAddress();			
			CheckoutShippingPageActions.ClickDeleteLinkInAddrForm();
			CheckoutShippingPageActions.ConfirmRemoveItem();
			driver.navigate().refresh();
			CheckoutReviewPageActions.ReturnToCartFromCheckout();
			ShoppingCartPageActions.ClickRemoveLink();
			ShoppingCartPageActions.ConfirmRemoveItem();
			TestLogger.testLoggerTCEnd("New Customer - Delete Existing Shipping Address");
		} catch (Exception e) {
			Assert.fail("Test" + e);
		}
	}
	
	@AfterTest
	public void driverClose() {
		closeDriver();
	}
}	
	

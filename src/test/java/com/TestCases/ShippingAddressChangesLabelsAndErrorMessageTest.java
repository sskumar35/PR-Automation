package com.TestCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.BusinessComponents.CheckoutReviewPageActions;
import com.BusinessComponents.CheckoutShippingPageActions;
import com.BusinessComponents.HomePageActions;
import com.BusinessComponents.LoginPageAction;
import com.BusinessComponents.ShoppingCartPageActions;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class ShippingAddressChangesLabelsAndErrorMessageTest extends CommonUtils{

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
			//driver.navigate().refresh();
			HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(1000);
			HomePageActions.LoginAction();			
			LoginPageAction.TypeUserEmailAddress(emailAddress);			
			LoginPageAction.TypeUserPassword(password);
			LoginPageAction.clickSignInButton();
			takeSnapShot();
			String prodId = "4761";
			HomePageActions.SearchForAProduct(prodId);
			HomePageActions.ClickSearchButton();
			HomePageActions.ClickAddToCartButton();
			Thread.sleep(1000);
			ShoppingCartPageActions.ClickCheckoutButton();
			CheckoutReviewPageActions.ClickShippingAddressInContainer();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			/* WebElement formElement = driver.findElement(By.xpath("//form[@class='form-horizontal js-address-form']"));
			//List<WebElement> allFormChildElements = formElement.findElements(By.xpath("//div[@class='js-address-form-fields']//div[@class='js-address-form-fields']/*"));
			String labelAttr = driver.findElement(By.xpath("//label[@for='country_id']")).getText();
			//System.out.println("allFormChildElements: "+ allFormChildElements);
			System.out.println("Label is:- " + labelAttr); */
			TestLogger.testLoggerTCEnd("Existing Customer - Prerequiste Test Case");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Prerequiste Test Case FAILS" + e);
		}
	}
	
	@Test (priority=2)
	public void CountryLabelsTest() throws Exception {
		try {
			List<String> AusLabel = new ArrayList<String>(Arrays.asList("Country", "First Name", "Last Name", "Address Line 1", "Address Line 2 (Optional)", "City/Suburb/Town", "State/Territory", "Postcode", "Phone Number"));
			List<String> CALabel = new ArrayList<String>(Arrays.asList("Country", "First Name", "Last Name", "Address Line 1", "Address Line 2 (Optional)", "City", "State/Province/Region", "Postal Code/Zip", "Phone Number"));
			List<String> NZLabel = new ArrayList<String>(Arrays.asList("Country", "First Name", "Last Name", "Address Line 1", "Address Line 2 (Optional)", "Suburb", "State/Region", "Postal Code/Zip", "Phone Number"));
			List<String> TaiLabel = new ArrayList<String>(Arrays.asList("Country", "First Name", "Last Name", "Address Line 1", "Address Line 2 (Optional)", "District Township", "City/County", "Zip/Postal Code", "Phone Number"));
			List<String> RusLabel = new ArrayList<String>(Arrays.asList("Country", "First Name", "Last Name", "Street name, House number, Company name", "Apartment, Suite, unit, building, floor, etc. (Optional)", "City", "State/Region", "Postal Code/Zip", "Phone Number (+7### ### ####)"));
			List<String> SaudiLabel = new ArrayList<String>(Arrays.asList("Country", "First Name", "Last Name", "Building No, Street Name, Apartment", "Exit No, Landmark, Unit/Office No (Optional)", "City", "District/Area", "Zip/Postal Code", "Phone Number (966#########)"));
			List<String> KoreaLabel = new ArrayList<String>(Arrays.asList("Country", "First Name", "Last Name", "Address Line 1 (City, District, Ward)", "Address Line 2 (Building, Street, Number)", "", "", "Zip/Postal Code", "Phone Number"));
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Australia");
			takeSnapShot();
			List<String> labelAus = CheckoutShippingPageActions.getLabelValues();
			takeSnapShot();
			System.out.println("labelAus: " + labelAus);
			Thread.sleep(2000);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Canada");
			takeSnapShot();
			List<String> labelCan = CheckoutShippingPageActions.getLabelValues();
			takeSnapShot();
			System.out.println("labelCan: " + labelCan);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("New Zealand");
			takeSnapShot();
			List<String> labelNz = CheckoutShippingPageActions.getLabelValues();
			takeSnapShot();
			System.out.println("labelNz: " + labelNz);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Taiwan");
			takeSnapShot();
			List<String> labelTai = CheckoutShippingPageActions.getLabelValues();
			takeSnapShot();
			System.out.println("labelTai: " + labelTai);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Saudi Arabia");
			takeSnapShot();
			List<String> labelSaudi = CheckoutShippingPageActions.getLabelValues();
			takeSnapShot();
			System.out.println("labelSaudi: " + labelSaudi);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Russian Federation");
			takeSnapShot();
			List<String> labelRus = CheckoutShippingPageActions.getLabelValues();
			takeSnapShot();
			System.out.println("labelRus: " + labelRus);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Korea, Republic Of");
			takeSnapShot();
			List<String> labelKor = CheckoutShippingPageActions.getLabelValues();
			takeSnapShot();
			System.out.println("labelKor: " + labelKor);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			Assert.assertEquals(labelAus, AusLabel);
			Assert.assertEquals(labelCan, CALabel);
			Assert.assertEquals(labelNz, NZLabel);
			Assert.assertEquals(labelTai, TaiLabel);
			Assert.assertEquals(labelSaudi, SaudiLabel);
			Assert.assertEquals(labelRus, RusLabel);
			Assert.assertEquals(labelKor, KoreaLabel);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("LabelsTest" + e);
		}
	}
	
	@Test (priority=3)
	public void CountryFieldsErrorMessageTest() throws Exception {
		try {
			List<String> EM = new ArrayList<String>(Arrays.asList("Field Required.", "Field Required.", "Field Required.", "Field Required.", "Field Required.", "Field Required.", "Field Required."));
			List<String> EMCanZP = new ArrayList<String>(Arrays.asList("Field Required.", "Field Required.", "Field Required.", "Field Required.", "Field Required.", "Field Required.", "Format is invalid for the selected country."));
			List<String> KorEM = new ArrayList<String>(Arrays.asList("Field Required.", "Field Required.", "Field Required.", "Field Required.", "Field Required.", "Field Required."));
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Australia");
			takeSnapShot();
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			List<String> EMAus = CheckoutShippingPageActions.getLabelValuesErrorMessageWithOptionalFields();
			takeSnapShot();
			System.out.println("EMAus: " + EMAus);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Canada");
			takeSnapShot();
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			List<String> EMCan = CheckoutShippingPageActions.getLabelValuesErrorMessageWithOptionalFields();
			takeSnapShot();
			System.out.println("EMCan: " + EMCan);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("New Zealand");
			takeSnapShot();
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			List<String> EMNz = CheckoutShippingPageActions.getLabelValuesErrorMessageWithOptionalFields();
			takeSnapShot();
			System.out.println("EMNz: " + EMNz);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Taiwan");
			takeSnapShot();
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			List<String> EMTai = CheckoutShippingPageActions.getLabelValuesErrorMessageWithOptionalFields();
			takeSnapShot();
			System.out.println("EMTai: " + EMTai);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Saudi Arabia");
			takeSnapShot();
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			List<String> EMSaudi = CheckoutShippingPageActions.getLabelValuesErrorMessageWithOptionalFields();
			takeSnapShot();
			System.out.println("EMSaudi: " + EMSaudi);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Russian Federation");
			takeSnapShot();
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			List<String> EMRus = CheckoutShippingPageActions.getLabelValuesErrorMessageWithOptionalFields();
			takeSnapShot();
			System.out.println("EMRus: " + EMRus);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Korea, Republic Of");
			takeSnapShot();
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			List<String> EMKor = CheckoutShippingPageActions.getLabelValuesErrorMessageKorea();
			takeSnapShot();
			System.out.println("EMKor: " + EMKor);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Canada");
			takeSnapShot();
			CheckoutShippingPageActions.ZipCodeInputFieldInShippingPage("123456");
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			List<String> EMCan1 = CheckoutShippingPageActions.getLabelValuesErrorMessageWithOptionalFields();
			takeSnapShot();
			System.out.println("EMCan1: " + EMCan1);
			Assert.assertEquals(EMAus, EM);
			Assert.assertEquals(EMCan, EM);
			Assert.assertEquals(EMNz, EM);
			Assert.assertEquals(EMTai, EM);
			Assert.assertEquals(EMSaudi, EM);
			Assert.assertEquals(EMRus, EM);
			Assert.assertEquals(EMKor, KorEM);
			Assert.assertEquals(EMCan1, EMCanZP);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("LabelsTest" + e);
		}
	}

	/*@Test (priority=2)
	public void AustraliaFieldsValidationsTest() throws Exception {
		try {
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Australia");
			Thread.sleep(1000);
			CheckoutShippingPageActions.FirstNameInputFieldInShippingPage("TestFN");
			CheckoutShippingPageActions.LastNameInputFieldInShippingPage("TestLN");
			CheckoutShippingPageActions.Address1InputFieldInShippingPage("Addr1");
			CheckoutShippingPageActions.Address2InputFieldInShippingPage("Addr2");
			CheckoutShippingPageActions.CityInputFieldInShippingPage("TestCity");
			CheckoutShippingPageActions.SelectStateDropDownInShippingPageAustralia("Tasmania");
			List<String> stateOptions = CheckoutShippingPageActions.GetDropDownOptionsInShippingPageAustralia();
			System.out.println("stateOptionsAUS: " + stateOptions);
			CheckoutShippingPageActions.ZipCodeInputFieldInShippingPage("1234");
			CheckoutShippingPageActions.PhoneNumberInputFieldInShippingPage("12345");
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			CheckoutReviewPageActions.ClickShippingAddressInContainer();
			CheckoutShippingPageActions.ClickEditShippingAddress();
			Thread.sleep(1000);
			CheckoutShippingPageActions.FirstNameInputFieldInShippingPage("Test12345123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
			CheckoutShippingPageActions.LastNameInputFieldInShippingPage("Test12345123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
			CheckoutShippingPageActions.Address1InputFieldInShippingPage("12345678901234567890123456789012345");
			CheckoutShippingPageActions.Address2InputFieldInShippingPage("12345678901234567890123456789012345");
			CheckoutShippingPageActions.CityInputFieldInShippingPage("City1234567890123456789012345");
			CheckoutShippingPageActions.SelectStateDropDownInShippingPageAustralia("Tasmania");
			CheckoutShippingPageActions.ZipCodeInputFieldInShippingPage("123456789012345678901234567890");
			CheckoutShippingPageActions.PhoneNumberInputFieldInShippingPage("12345678901234567890");
			CheckoutShippingPageActions.ClickUseThisAddressBtnInEditForm();
			CheckoutReviewPageActions.ClickShippingAddressInContainer();
			CheckoutShippingPageActions.ClickEditShippingAddress();
			CheckoutShippingPageActions.ClickDeleteLinkInAddrForm();
			CheckoutShippingPageActions.ConfirmRemoveItem();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("LabelsTest" + e);
		}
	}

	@Test (priority=3)
	public void CanadaFieldsValidationsTest() throws Exception {
		try {
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Canada");
			Thread.sleep(1000);
			CheckoutShippingPageActions.FirstNameInputFieldInShippingPage("TestFN");
			CheckoutShippingPageActions.LastNameInputFieldInShippingPage("TestLN");
			CheckoutShippingPageActions.Address1InputFieldInShippingPage("Addr1");
			CheckoutShippingPageActions.Address2InputFieldInShippingPage("Addr2");
			CheckoutShippingPageActions.CityInputFieldInShippingPage("TestCity");
			CheckoutShippingPageActions.SelectStateDropDownInShippingPageCanada("Alberta");
			List<String> stateOptions = CheckoutShippingPageActions.GetDropDownOptionsInShippingPageCanada();
			System.out.println("stateOptionsCA: " + stateOptions);
			CheckoutShippingPageActions.ZipCodeInputFieldInShippingPage("A2A2A2");
			CheckoutShippingPageActions.PhoneNumberInputFieldInShippingPage("12345");
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			CheckoutReviewPageActions.ClickShippingAddressInContainer();
			CheckoutShippingPageActions.ClickEditShippingAddress();
			Thread.sleep(1000);
			CheckoutShippingPageActions.FirstNameInputFieldInShippingPage("Test12345123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
			CheckoutShippingPageActions.LastNameInputFieldInShippingPage("Test12345123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
			CheckoutShippingPageActions.Address1InputFieldInShippingPage("12345678901234567890123456789012345");
			CheckoutShippingPageActions.Address2InputFieldInShippingPage("12345678901234567890123456789012345");
			CheckoutShippingPageActions.CityInputFieldInShippingPage("City1234567890123456789012345");
			CheckoutShippingPageActions.SelectStateDropDownInShippingPageCanada("Alberta");
			CheckoutShippingPageActions.ZipCodeInputFieldInShippingPage("A2A2A2");
			CheckoutShippingPageActions.PhoneNumberInputFieldInShippingPage("12345678901234567890");
			CheckoutShippingPageActions.ClickUseThisAddressBtnInEditForm();
			CheckoutReviewPageActions.ClickShippingAddressInContainer();
			CheckoutShippingPageActions.ClickEditShippingAddress();
			CheckoutShippingPageActions.ClickDeleteLinkInAddrForm();
			CheckoutShippingPageActions.ConfirmRemoveItem();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("LabelsTest" + e);
		}
	}*/
	
	@AfterTest
	public void driverClose() {
	closeDriver();
	}
	
}	

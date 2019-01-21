package com.TestCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.BusinessComponents.CheckoutReviewPageActions;
import com.BusinessComponents.CheckoutShippingPageActions;
import com.BusinessComponents.HomePageActions;
import com.BusinessComponents.LoginPageAction;
import com.BusinessComponents.ShoppingCartPageActions;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class AddlShippingAddressLabelsAndErrorMessageTest extends CommonUtils{

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
			TestLogger.testLoggerTCEnd("Existing Customer - Prerequiste Test Case");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Prerequiste Test Case FAILS" + e);
		}
	}
	
	@Test (priority=2)
	public void BrazilCountryLabelsTest() throws Exception {
		try {
			List<String> BRLabel = new ArrayList<String>(Arrays.asList("Country", "First Name", "Last Name", "Street or Avenue, number", "Floor, unit, block, etc (Optional)", "City", "State/Region (SP, RS, MG, BA, ES etc.)", "Zip Code", "Phone Number (including DDD)"));
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Brazil");
			takeSnapShot();
			List<String> labelBR = CheckoutShippingPageActions.getLabelValues();
			takeSnapShot();
			System.out.println("labelBR: " + labelBR);
			Assert.assertEquals(labelBR, BRLabel);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("LabelsTest" + e);
		}
	}
	
	@Test (priority=3)
	public void FranceCountryLabelsTest() throws Exception {
		try {
			List<String> FRLabel = new ArrayList<String>(Arrays.asList("Country", "First Name", "Last Name", "Street, lane, post office box, company name", "Building, floor, locality, indication to the deliveryman, etc. (if appropriate)", "City", "State / Region / Township:  (if appropriate)", "Postal Code", "Phone Number"));
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("France");
			takeSnapShot();
			List<String> labelFR = CheckoutShippingPageActions.getLabelValues();
			takeSnapShot();
			System.out.println("labelFR: " + labelFR);
			Assert.assertEquals(labelFR, FRLabel);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("LabelsTest" + e);
		}
	}
	
	@Test (priority=4)
	public void GermanyCountryLabelsTest() throws Exception {
		try {
			List<String> GELabel = new ArrayList<String>(Arrays.asList("Country", "First Name", "Last Name", "Street and house number", "Additional Address Info (Optional)", "Town/City", "County / State:  (optional)", "Postcode", "Telephone number"));
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Germany");
			takeSnapShot();
			List<String> labelGE = CheckoutShippingPageActions.getLabelValues();
			takeSnapShot();
			System.out.println("labelGE: " + labelGE);
			Assert.assertEquals(labelGE, GELabel);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("LabelsTest" + e);
		}
	}
	
	@Test (priority=5)
	public void IndiaCountryLabelsTest() throws Exception {
		try {
			List<String> INDLabel = new ArrayList<String>(Arrays.asList("Country", "First Name", "Last Name", "Phone Number", "Pincode", "House no., Flat, Apartment, Building, Company", "Area, Colony, Street, Sector, Village (Optional)", "Town/City", "State"));
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("India");
			takeSnapShot();
			List<String> labelIND = CheckoutShippingPageActions.getLabelValues();
			takeSnapShot();
			System.out.println("labelIND: " + labelIND);
			Assert.assertEquals(labelIND, INDLabel);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("LabelsTest" + e);
		}
	}
	
	@Test (priority=6)
	public void ItalyCountryLabelsTest() throws Exception {
		try {
			List<String> ITALabel = new ArrayList<String>(Arrays.asList("Country", "First Name", "Last Name", "Address Line 1", "Address Line 2 (Optional)", "City", "Province (Optional)", "Postal Code", "Telephone number"));
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Italy");
			takeSnapShot();
			List<String> labelITA = CheckoutShippingPageActions.getLabelValues();
			takeSnapShot();
			System.out.println("labelITA: " + labelITA);
			Assert.assertEquals(labelITA, ITALabel);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("LabelsTest" + e);
		}
	}
	
	@Test (priority=7)
	public void MexicoCountryLabelsTest() throws Exception {
		try {
			List<String> MXLabel = new ArrayList<String>(Arrays.asList("Country", "First Name", "Last Name", "Address (street, house number, company)", "Additional Address Info (Optional)", "Postal Code", "State", "City", "Telephone number"));
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Mexico");
			takeSnapShot();
			List<String> labelMX = CheckoutShippingPageActions.getLabelValues();
			takeSnapShot();
			System.out.println("labelMX: " + labelMX);
			Assert.assertEquals(labelMX, MXLabel);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("LabelsTest" + e);
		}
	}
	
	@Test (priority=8)
	public void SpainCountryLabelsTest() throws Exception {
		try {
			List<String> SPLabel = new ArrayList<String>(Arrays.asList("Country", "First Name", "Last Name", "Street and number, PO box, company name", "Floor, door, NIF For Canary Islands/ Ceuta/ Melilla (Optional)", "City", "Province/Region (Optional)", "Postal Code", "Telephone number"));
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Spain");
			takeSnapShot();
			List<String> labelSP = CheckoutShippingPageActions.getLabelValues();
			takeSnapShot();
			System.out.println("labelSP: " + labelSP);
			Assert.assertEquals(labelSP, SPLabel);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("LabelsTest" + e);
		}
	}
	
	@Test (priority=9)
	public void GreatBritainCountryLabelsTest() throws Exception {
		try {
			List<String> GBLabel = new ArrayList<String>(Arrays.asList("Country", "First Name", "Last Name", "Phone Number", "Postcode", "Address Line 1", "Address Line 2 (Optional)", "Town/City", "County (Optional)"));
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Great Britain");
			takeSnapShot();
			List<String> labelGB = CheckoutShippingPageActions.getLabelValues();
			takeSnapShot();
			System.out.println("labelGB: " + labelGB);
			Assert.assertEquals(labelGB, GBLabel);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("LabelsTest" + e);
		}
	}
	
	@Test (priority=10)
	public void JapanCountryLabelsTest() throws Exception {
		try {
			List<String> JPLabel = new ArrayList<String>(Arrays.asList("Country", "First Name", "Last Name", "Address Line 1", "Address Line 2 (Optional)", "", "Prefecture", "Zip/Postal Code", "Phone Number"));
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Japan");
			takeSnapShot();
			List<String> labelJP = CheckoutShippingPageActions.getLabelValues();
			takeSnapShot();
			System.out.println("labelJP: " + labelJP);
			Assert.assertEquals(labelJP, JPLabel);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("LabelsTest" + e);
		}
	}
	
	@Test (priority=11)
	public void SingaporeCountryLabelsTest() throws Exception {
		try {
			List<String> SGLabel = new ArrayList<String>(Arrays.asList("Country", "First Name", "Last Name", "Address Line 1", "Address Line 2 (Optional)", "City", "", "Zip/Postal Code", "Phone Number"));
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Singapore");
			takeSnapShot();
			List<String> labelSG = CheckoutShippingPageActions.getLabelValues();
			takeSnapShot();
			System.out.println("labelSG: " + labelSG);
			Assert.assertEquals(labelSG, SGLabel);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("LabelsTest" + e);
		}
	}
	
	@Test (priority=12)
	public void CountryFieldsErrorMessageTest() throws Exception {
		try {
			List<String> EM = new ArrayList<String>(Arrays.asList("Field Required.", "Field Required.", "Field Required.", "Field Required.", "Field Required.", "Field Required.", "Field Required."));
			List<String> EMEU = new ArrayList<String>(Arrays.asList("Field Required.", "Field Required.", "Field Required.", "Field Required.", "Field Required.", "Field Required."));
			List<String> EMNoState = new ArrayList<String>(Arrays.asList("Field Required.", "Field Required.", "Field Required.", "Field Required.", "Field Required.", "Field Required."));
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Brazil");
			takeSnapShot();
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			List<String> EMBR = CheckoutShippingPageActions.getLabelValuesErrorMessageWithOptionalFields();
			takeSnapShot();
			System.out.println("EMBR: " + EMBR);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("India");
			takeSnapShot();
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			List<String> EMIND = CheckoutShippingPageActions.getLabelValuesErrorMessageWithOptionalFields();
			takeSnapShot();
			System.out.println("EMIND: " + EMIND);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Mexico");
			takeSnapShot();
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			List<String> EMMX = CheckoutShippingPageActions.getLabelValuesErrorMessageWithOptionalFields();
			takeSnapShot();
			System.out.println("EMMX: " + EMMX);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("France");
			takeSnapShot();
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			List<String> EMFR = CheckoutShippingPageActions.getLabelValuesErrorMessageWithOptionalFieldsEU();
			takeSnapShot();
			System.out.println("EMFR: " + EMFR);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Germany");
			takeSnapShot();
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			List<String> EMGE = CheckoutShippingPageActions.getLabelValuesErrorMessageWithOptionalFieldsEU();
			takeSnapShot();
			System.out.println("EMGE: " + EMGE);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Italy");
			takeSnapShot();
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			List<String> EMIT = CheckoutShippingPageActions.getLabelValuesErrorMessageWithOptionalFieldsEU();
			takeSnapShot();
			System.out.println("EMIT: " + EMIT);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Spain");
			takeSnapShot();
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			List<String> EMSP = CheckoutShippingPageActions.getLabelValuesErrorMessageWithOptionalFieldsEU();
			takeSnapShot();
			System.out.println("EMSP: " + EMSP);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Singapore");
			takeSnapShot();
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			List<String> EMJP = CheckoutShippingPageActions.getLabelValuesErrorMessageWithOptionalFieldsEU();
			takeSnapShot();
			System.out.println("EMJP: " + EMJP);
			driver.navigate().refresh();
			CheckoutShippingPageActions.AddNewShippingAddressLink();
			CheckoutShippingPageActions.SelectCountryDropDownInShippingPage("Japan");
			takeSnapShot();
			CheckoutShippingPageActions.ClickUseThisAddressBtn();
			List<String> EMSG = CheckoutShippingPageActions.getLabelValuesErrorMessageWithOptionalFieldsEU();
			takeSnapShot();
			System.out.println("EMSG: " + EMSG);
			Assert.assertEquals(EMBR, EM);
			Assert.assertEquals(EMIND, EM);
			Assert.assertEquals(EMMX, EM);
			Assert.assertEquals(EMFR, EMEU);
			Assert.assertEquals(EMGE, EMEU);
			Assert.assertEquals(EMIT, EMEU);
			Assert.assertEquals(EMSP, EMEU);
			Assert.assertEquals(EMJP, EMNoState);
			Assert.assertEquals(EMSG, EMNoState);
			closeDriver();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("LabelsTest" + e);
		}
	}	
}	

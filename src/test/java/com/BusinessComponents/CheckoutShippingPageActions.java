package com.BusinessComponents;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.formula.functions.Code;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.Zip;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;
import com.PageFactory.CheckoutShippingPage;
import com.PageFactory.ModalPopUpHandler;

public class CheckoutShippingPageActions extends CommonUtils{
	
	private static final String dd = null;
	static CheckoutShippingPage ShippingAddressPage = PageFactory.initElements(driver, CheckoutShippingPage.class);
	static ModalPopUpHandler handlerActions = PageFactory.initElements(driver, ModalPopUpHandler.class);
    
	public static void AddNewShippingAddressLink() throws Exception{
		try {
		     TestLogger.testLoggerInfo("Add New Shipping Address Link In Shipping Address Page Is Found");
		     ShippingAddressPage.getAddNewShippingAddressLink().click();
		     Thread.sleep(1000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Add New Shipping Address Link In Shipping Address Page Not Found");
	}	
}
	public static void SelectCountryDropDownInShippingPage(String countryName) throws Exception{
		try {
		     TestLogger.testLoggerInfo("Country Drop Down In Shipping Address Page Is Found");
		     ShippingAddressPage.getSelectCountryDropDownInShippingPage().click();
		     Select countryInDropDown = new Select(driver.findElement(By.name("country_id")));
		     countryInDropDown.selectByVisibleText(countryName);
		     Thread.sleep(1000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Country Drop Down In Shipping Address Page Not Found");
	}	
}
	public static void FirstNameInputFieldInShippingPage(String message) throws Exception{
		try {
		     TestLogger.testLoggerInfo("Firstname Field In Shipping Address Page Is Found");
		     ShippingAddressPage.getFirstNameInputFieldInShippingPage().clear();
		     ShippingAddressPage.getFirstNameInputFieldInShippingPage().sendKeys(message);
		     Thread.sleep(1000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Firstname Field In Shipping Address Page Not Found");
	}	
}
	public static void LastNameInputFieldInShippingPage(String message) throws Exception{
		try {
		     TestLogger.testLoggerInfo("Lastname Field In Shipping Address Page Is Found");
		     ShippingAddressPage.getLastNameInputFieldInShippingPage().clear();
		     ShippingAddressPage.getLastNameInputFieldInShippingPage().sendKeys(message);
		     Thread.sleep(1000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Lastname Field In Shipping Address Page Not Found");
	}	
}
	public static void Address1InputFieldInShippingPage(String message) throws Exception{
		try {
		     TestLogger.testLoggerInfo("Address1 Field In Shipping Address Page Is Found");
		     ShippingAddressPage.getAddress1InputFieldInShippingPage().clear();
		     ShippingAddressPage.getAddress1InputFieldInShippingPage().sendKeys(message);
		     Thread.sleep(1000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Address1 Field In Shipping Address Page Not Found");
	}	
}
	public static void Address2InputFieldInShippingPage(String message) throws Exception{
		try {
		     TestLogger.testLoggerInfo("Address2 Field In Shipping Address Page Is Found");
		     ShippingAddressPage.getAddress2InputFieldInShippingPage().clear();
		     ShippingAddressPage.getAddress2InputFieldInShippingPage().sendKeys(message);
		     Thread.sleep(1000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Address2 Field In Shipping Address Page Not Found");
	}	
}
	public static void CityInputFieldInShippingPage(String message) throws Exception{
		try {
		     TestLogger.testLoggerInfo("City Field In Shipping Address Page Is Found");
		     ShippingAddressPage.getCityInputFieldInShippingPage().clear();
		     ShippingAddressPage.getCityInputFieldInShippingPage().sendKeys(message);
		     Thread.sleep(1000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("City Field In Shipping Address Page Not Found");
	}	
}
	public static void SelectStateDropDownInShippingPage(String stateName) throws Exception{
		try {
		     TestLogger.testLoggerInfo("State Drop Down In Shipping Address Is Found");
		     ShippingAddressPage.getSelectStateDropDownInShippingPage().click();
		     Select stateDropDown = new Select(driver.findElement(By.name("state_id")));
		     stateDropDown.selectByVisibleText(stateName);
		     Thread.sleep(1000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("State Field In Shipping Address Page Not Found");
	}	
}
	public static void ZipCodeInputFieldInShippingPage(String message) throws Exception{
		try {
		     TestLogger.testLoggerInfo("Zipcode Field In Shipping Address Is Found");
		     ShippingAddressPage.getZipCodeInputFieldInShippingPage().clear();
		     ShippingAddressPage.getZipCodeInputFieldInShippingPage().sendKeys(message);
		     Thread.sleep(1000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Zipcode Field In Shipping Address Page Not Found");
	}	
}
	public static void PhoneNumberInputFieldInShippingPage(String message) throws Exception{
		try {
		     TestLogger.testLoggerInfo("Phone Number Field In Shipping Address Is Found");
		     ShippingAddressPage.getPhoneNumberInputFieldInShippingPage().clear();
		     ShippingAddressPage.getPhoneNumberInputFieldInShippingPage().sendKeys(message);
		     Thread.sleep(1000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Phone Number Field In Shipping Address Page Not Found");
	}	
}
	public static void EmailAddressInputFieldInShippingPage(String message) throws Exception{
		try {
		     TestLogger.testLoggerInfo("Email Address Field In Shipping Address Is Found");
		     ShippingAddressPage.getEmailAddressInputFieldInShippingPage().sendKeys(message);
		     Thread.sleep(1000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Email Address Field In Shipping Address Page Not Found");
	}	
}
	
	public static void ContinueButtonInShippingPage() throws Exception{
		try {
		     TestLogger.testLoggerInfo("Continue Button In Shipping Address Is Found");
		     ShippingAddressPage.getContinueButtonInShippingPage().click();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Continue Button In Shipping Address Page Not Found");
		}	
	}
	
	public static void ContinueButtonInShippingPageNewCust() throws Exception{
		try {
		     TestLogger.testLoggerInfo("Continue Button In Shipping Address Is Found");
		     ShippingAddressPage.getContinueButtonInShippingPageForNewCust().click();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Continue Button In Shipping Address Page Not Found");
		}	
	}
	
	public static void ClickUseThisAddressBtn() throws Exception{
		try {
		     TestLogger.testLoggerInfo("Use this address btn Is Found");
		     ShippingAddressPage.getUseThisAdddrBtnForAddrForm().click();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Use this address btn Is Not Found");
		}	
	}
	
	public static void ClickCancelBtn() throws Exception{
		try {
		     TestLogger.testLoggerInfo("Cancel Btn In Address Form Is Found");
		     ShippingAddressPage.getCancelBtnForAddrForm().click();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Cancel Btn In Address Form Is Not Found");
		}	
	}
	
	public static void ClickEditShippingAddress() throws Exception{
		try {
		     TestLogger.testLoggerInfo("Edit Link In Address Container Is Found");
		     ShippingAddressPage.getEditShippingAddress().click();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Edit Link In Address Container Is Not Found");
		}	
	}
	
	public static void SendStateValue(String stateName) throws Exception{
		try {
		     TestLogger.testLoggerInfo("State or Province Field Is Found");
		     ShippingAddressPage.getStateFieldNonDropDownInShippingAddressPage().clear();
		     ShippingAddressPage.getStateFieldNonDropDownInShippingAddressPage().sendKeys(stateName);
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("State or Province Field Is Not Found");
		}	
	}
	
	public static void ClickUseThisAddressBtnInEditForm() throws Exception{
		try {
		     TestLogger.testLoggerInfo("Use this address btn In Edit Form Is Found");
		     ShippingAddressPage.getUseThisAdddrBtnForEditAddrForm().click();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Use this address btn In Edit Form Is Not Found");
		}	
	}
	
	public static void ClickDeleteLinkInAddrForm() throws Exception{
		try {
		     TestLogger.testLoggerInfo("Delete Link In Addr Form Is Found");
		     ShippingAddressPage.getDeleteLinkInShippingAddress().click();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Delete Link In Addr Form Is Not Found");
		}	
	}

	public static void ConfirmRemoveItem() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Yes Button in Remove Cart Modal Is Found");
			handlerActions.getRemoveItemModalConfirm().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Yes Button in Remove Cart Modal Is Not Found" + e);
		}		
	}

	public static void DeclineRemoveItem() throws Exception{
		try {			
			TestLogger.testLoggerInfo("No Button in Remove Cart Modal Is Found");
			handlerActions.getRemoveItemModalDecline().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("No Button in Remove Cart Modal Is Not Found" + e);
		}		
	}
	
	public static void SelectAnotherShippingAddressUsingRadioBtn() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Radio Btn In Shipping Address Panel Is Found");
			ShippingAddressPage.getSelectRadioBtnInShippingAddress().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Radio Btn In Shipping Address Panel Is Not Found" + e);
		}		
	}
	
	public static void NavigateToAllDisplayedShippingAddressUsingRadioBtn() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Radio Btn In Shipping Address Panel Is Found");
			while(true) {
				//Boolean isSelected = ShippingAddressPage.getSelectRadioBtnInShippingAddress().isSelected();
				ShippingAddressPage.getSelectRadioBtnInShippingAddress().click();
				ShippingAddressPage.getSelectCheckoutArea().click();
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Radio Btn In Shipping Address Panel Is Not Found" + e);
		}		
	}
	
	
	
	/* --- Shipping Address Changes  ---*/
	
	
	public static List<String> getLabelValues() throws Exception{
		List<String> listLabels = new ArrayList<String>();
		try {			
			TestLogger.testLoggerInfo("Radio Btn In Shipping Address Panel Is Found");
			listLabels.add(ShippingAddressPage.getlabelCountry().getText());
			listLabels.add(ShippingAddressPage.getlabelFirstName().getText());
			listLabels.add(ShippingAddressPage.getlabelLastName().getText());
			listLabels.add(ShippingAddressPage.getlabelAddressLn1().getText());
			listLabels.add(ShippingAddressPage.getlabelAddressLn2().getText());
			listLabels.add(ShippingAddressPage.getlabelCity().getText());
			listLabels.add(ShippingAddressPage.getlabelState().getText());
			listLabels.add(ShippingAddressPage.getlabelZipCode().getText());
			listLabels.add(ShippingAddressPage.getlabelPhone().getText());
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Radio Btn In Shipping Address Panel Is Not Found" + e);
		}
		return listLabels;		
	}
	
	public static List<String> getLabelValuesErrorMessageWithOptionalFields() throws Exception{
		List<String> listEM = new ArrayList<String>();
		try {			
			TestLogger.testLoggerInfo("Radio Btn In Shipping Address Panel Is Found");
			//listEM.add(ShippingAddressPage.getlabelCountryEM().getText());
			listEM.add(ShippingAddressPage.getlabelFirstNameEM().getText());
			listEM.add(ShippingAddressPage.getlabelLastNameEM().getText());
			listEM.add(ShippingAddressPage.getlabelAddressLn1EM().getText());
			listEM.add(ShippingAddressPage.getlabelCityEM().getText());
			listEM.add(ShippingAddressPage.getlabelPhoneEM().getText());
			listEM.add(ShippingAddressPage.getlabelStateEM().getText());
			listEM.add(ShippingAddressPage.getlabelZipCodeEM().getText());
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Radio Btn In Shipping Address Panel Is Not Found" + e);
		}
		return listEM;		
	}
	
	public static List<String> getLabelValuesErrorMessageWithOptionalFieldsEU() throws Exception{
		List<String> listEM = new ArrayList<String>();
		try {			
			TestLogger.testLoggerInfo("Radio Btn In Shipping Address Panel Is Found");
			//listEM.add(ShippingAddressPage.getlabelCountryEM().getText());
			listEM.add(ShippingAddressPage.getlabelFirstNameEM().getText());
			listEM.add(ShippingAddressPage.getlabelLastNameEM().getText());
			listEM.add(ShippingAddressPage.getlabelAddressLn1EM().getText());
			listEM.add(ShippingAddressPage.getlabelCityEM().getText());
			listEM.add(ShippingAddressPage.getlabelPhoneEM().getText());
			//listEM.add(ShippingAddressPage.getlabelStateEM().getText());
			listEM.add(ShippingAddressPage.getlabelZipCodeEM().getText());
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Radio Btn In Shipping Address Panel Is Not Found" + e);
		}
		return listEM;		
	}
	
	public static List<String> getLabelValuesErrorMessageKorea() throws Exception{
		List<String> listEM = new ArrayList<String>();
		try {			
			TestLogger.testLoggerInfo("Radio Btn In Shipping Address Panel Is Found");
			//listEM.add(ShippingAddressPage.getlabelCountryEM().getText());
			listEM.add(ShippingAddressPage.getlabelFirstNameEM().getText());
			listEM.add(ShippingAddressPage.getlabelLastNameEM().getText());
			listEM.add(ShippingAddressPage.getlabelAddressLn1EM().getText());
			listEM.add(ShippingAddressPage.getlabelAddressLn2EM().getText());
			listEM.add(ShippingAddressPage.getlabelPhoneEM().getText());
			listEM.add(ShippingAddressPage.getlabelZipCodeEM().getText());
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Radio Btn In Shipping Address Panel Is Not Found" + e);
		}
		return listEM;		
	}
	
	public static void SelectStateDropDownInShippingPageAustralia(String stateName) throws Exception{
		try {
		     TestLogger.testLoggerInfo("State Drop Down In Shipping Address Is Found");
		     ShippingAddressPage.getSelectStateDropDownInShippingPageAustralia().click();
		     Thread.sleep(3000);
		     takeSnapShot();
		     Thread.sleep(2000);
		     Select stateDropDown = new Select(driver.findElement(By.xpath("//html//div[contains(@id,'panel')]//select[2]")));
		     stateDropDown.selectByVisibleText(stateName);
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("State Field In Shipping Address Page Not Found");
		}	
	}
	
	public static List<String> GetDropDownOptionsInShippingPageAustralia() throws Exception{
		 ShippingAddressPage.getSelectStateDropDownInShippingPageAustralia().click();
		 takeSnapShot();
	     Select stateDropDown = new Select(driver.findElement(By.xpath("//html//div[contains(@id,'panel')]//select[2]")));
	     List<WebElement> allOptions  = stateDropDown.getOptions();
	     List<String> optionsText = new ArrayList<String>();
	     for(int l = 0; l < allOptions.size(); l++)
	     {
	    	 optionsText.add(allOptions.get(l).getText());
	     }
	     return optionsText;
	}
	
	public static void SelectStateDropDownInShippingPageCanada(String stateName) throws Exception{
		try {
		     TestLogger.testLoggerInfo("State Drop Down In Shipping Address Is Found");
		     ShippingAddressPage.getSelectStateDropDownInShippingPageCanada().click();
		     Thread.sleep(3000);
		     takeSnapShot();
		     Thread.sleep(2000);
		     Select stateDropDown = new Select(driver.findElement(By.xpath("//html//div[contains(@id,'panel')]//select[3]")));
		     stateDropDown.selectByVisibleText(stateName);
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("State Field In Shipping Address Page Not Found");
		}	
	}
	
	public static List<String> GetDropDownOptionsInShippingPageCanada() throws Exception{
		 ShippingAddressPage.getSelectStateDropDownInShippingPageCanada().click();
		 Thread.sleep(3000);
		 takeSnapShot();
	     Thread.sleep(2000);
	     Select stateDropDown = new Select(driver.findElement(By.xpath("//html//div[contains(@id,'panel')]//select[3]")));
	     List<WebElement> allOptions  = stateDropDown.getOptions();
	     List<String> optionsText = new ArrayList<String>();
	     for(int l = 0; l < allOptions.size(); l++)
	     {
	    	 optionsText.add(allOptions.get(l).getText());
	     }
	     return optionsText;
	}
	
	public static void SelectStateDropDownInShippingPageJapan(String stateName) throws Exception{
		try {
		     TestLogger.testLoggerInfo("State Drop Down In Shipping Address Is Found");
		     ShippingAddressPage.getSelectStateDropDownInShippingPageJapan().click();
		     Thread.sleep(3000);
		     takeSnapShot();
		     Thread.sleep(2000);
		     Select stateDropDown = new Select(driver.findElement(By.xpath("//html//div[contains(@id,'panel')]//select[4]")));
		     stateDropDown.selectByVisibleText(stateName);
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("State Field In Shipping Address Page Not Found");
		}	
	}
	
	public static List<String> GetDropDownOptionsInShippingPageJapan() throws Exception{
		 ShippingAddressPage.getSelectStateDropDownInShippingPageJapan().click();
		 Thread.sleep(3000);
		 takeSnapShot();
	     Thread.sleep(2000);
	     Select stateDropDown = new Select(driver.findElement(By.xpath("//html//div[contains(@id,'panel')]//select[4]")));
	     List<WebElement> allOptions  = stateDropDown.getOptions();
	     List<String> optionsText = new ArrayList<String>();
	     for(int l = 0; l < allOptions.size(); l++)
	     {
	    	 optionsText.add(allOptions.get(l).getText());
	     }
	     return optionsText;
	}
	
	public static void StateInputFieldInShippingPage(String message) throws Exception{
		try {
		     TestLogger.testLoggerInfo("State Field In Shipping Address Is Found");
		     ShippingAddressPage.getStateInputValueInShippingPage().clear();
		     ShippingAddressPage.getStateInputValueInShippingPage().sendKeys(message);
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("State Field In Shipping Address Is Not Found");
		}	
	}
	
	public static Integer GetFirstNameFieldValueSize() throws Exception{
		int fieldValSize = 0;
		try {
			TestLogger.testLoggerInfo("First Name In Shipping Address Is Found");
		     String value = ShippingAddressPage.getFirstNameInputFieldInShippingPage().getAttribute("value");
		     fieldValSize = value.length();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("First Name In Shipping Address Is Not Found");
		}
		return fieldValSize;
	}
	
	public static Integer GetLastNameFieldValueSize() throws Exception{
		int fieldValSize = 0;
		try {
			TestLogger.testLoggerInfo("Last Name In Shipping Address Is Found");
		     String value = ShippingAddressPage.getLastNameInputFieldInShippingPage().getAttribute("value");
		     fieldValSize = value.length();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Last Name In Shipping Address Is Not Found");
		}
		return fieldValSize;
	}
	
	public static Integer GetAddrLn1FieldValueSize() throws Exception{
		int fieldValSize = 0;
		try {
			TestLogger.testLoggerInfo("Addr Ln 1 In Shipping Address Is Found");
		     String value = ShippingAddressPage.getAddress1InputFieldInShippingPage().getAttribute("value");
		     fieldValSize = value.length();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Addr Ln 1 In Shipping Address Is Not Found");
		}
		return fieldValSize;
	}
	
	public static Integer GetAddrLn2FieldValueSize() throws Exception{
		int fieldValSize = 0;
		try {
			TestLogger.testLoggerInfo("Addr Ln 2 In Shipping Address Is Found");
		     String value = ShippingAddressPage.getAddress2InputFieldInShippingPage().getAttribute("value");
		     fieldValSize = value.length();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Addr Ln 2 In Shipping Address Is Not Found");
		}
		return fieldValSize;
	}
	
	public static Integer GetStateFieldValueSize() throws Exception{
		int fieldValSize = 0;
		try {
			TestLogger.testLoggerInfo("State Field In Shipping Address Is Found");
		     String value = ShippingAddressPage.getStateInputValueInShippingPage().getAttribute("value");
		     fieldValSize = value.length();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("State Field In Shipping Address Is Not Found");
		}
		return fieldValSize;
	}
	
	public static Integer GetCityFieldValueSize() throws Exception{
		int fieldValSize = 0;
		try {
			TestLogger.testLoggerInfo("City Field In Shipping Address Is Found");
		     String value = ShippingAddressPage.getCityInputFieldInShippingPage().getAttribute("value");
		     fieldValSize = value.length();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("City Field In Shipping Address Is Not Found");
		}
		return fieldValSize;
	}
	
	public static Integer GetPhoneNumberFieldValueSize() throws Exception{
		int fieldValSize = 0;
		try {
			TestLogger.testLoggerInfo("Phone Number Field In Shipping Address Is Found");
		     String value = ShippingAddressPage.getPhoneNumberInputFieldInShippingPage().getAttribute("value");
		     fieldValSize = value.length();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Phone Number Field In Shipping Address Is Not Found");
		}
		return fieldValSize;
	}
	
	public static Integer GetZipCodeFieldValueSize() throws Exception{
		int fieldValSize = 0;
		try {
			TestLogger.testLoggerInfo("Zip Code Field In Shipping Address Is Found");
		     String value = ShippingAddressPage.getZipCodeInputFieldInShippingPage().getAttribute("value");
		     fieldValSize = value.length();
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Zip Code Field In Shipping Address Is Not Found");
		}
		return fieldValSize;
	}
	
	public static void JapanZipCodeInput(String message1, String message2) throws Exception{
		try {
		     TestLogger.testLoggerInfo("State Field In Shipping Address Is Found");
		     ShippingAddressPage.getJapanZipCodeInput1().clear();
		     ShippingAddressPage.getJapanZipCodeInput1().sendKeys(message1);
		     ShippingAddressPage.getJapanZipCodeInput2().clear();
		     ShippingAddressPage.getJapanZipCodeInput2().sendKeys(message2);
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("State Field In Shipping Address Is Not Found");
		}	
	}
	
	public static Integer GetJapanZipCodeInputValueSize() throws Exception{
		int totalValueSize = 0;
		try {
			TestLogger.testLoggerInfo("Zip Code Field In Shipping Address Is Found");
		     String value1 = ShippingAddressPage.getJapanZipCodeInput1().getAttribute("value");
		     int fieldValSize1 = value1.length();
		     String value2 = ShippingAddressPage.getJapanZipCodeInput2().getAttribute("value");
		     int fieldValSize2 = value2.length();
		     totalValueSize = fieldValSize1 + fieldValSize2;
		     Thread.sleep(1000);
		} catch (Exception e) {
		     TestLogger.testLoggerInfo("Zip Code Field In Shipping Address Is Not Found");
		}
		return totalValueSize;
	}
	
}


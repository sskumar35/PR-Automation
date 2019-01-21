package com.BusinessComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.PageFactory.CheckoutBillingPage;
import com.PageFactory.ModalPopUpHandler;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class CheckoutBillingPageActions extends CommonUtils {
	
	static CheckoutBillingPage BillingAddressPage = PageFactory.initElements(driver, CheckoutBillingPage.class);
	static ModalPopUpHandler handlerActions = PageFactory.initElements(driver, ModalPopUpHandler.class);

	public static void AddNewBillingAddressLink() throws Exception{
		try {
		     TestLogger.testLoggerInfo("Add New Billing Address Link Is Found");
		     BillingAddressPage.getAddNewBillingAddressLink().click();
		     Thread.sleep(1000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("Add New Billing Address Link Is Not Found");
	}	
}
	public static void CardHolderNameInputFieldInBillingpage(String message) throws Exception{
		try {
		     TestLogger.testLoggerInfo("CardHolder Name Field In Billing Address Page Is Found");
		     BillingAddressPage.getCardHolderNameInputFieldInBillingpage().sendKeys(message);
		     Thread.sleep(1000);
	} catch (Exception e) {
		     TestLogger.testLoggerInfo("CardHolder Name Field In Billing Address Page Not Found");
	}
}	
		public static void CardNumberInputFieldInBillingpage(String message) throws Exception{
			try {
			     TestLogger.testLoggerInfo("Card Number Field In Billing Address Page Is Found");
			     BillingAddressPage.getCardNumberInputFieldInBillingpage().sendKeys(message);
			     Thread.sleep(1000);
		} catch (Exception e) {
			     TestLogger.testLoggerInfo("Card Number Field In Billing Address Page Not Found");
		}
}
		public static void SelectCardExpirationMonthInBillingpage(String month) throws Exception{
				try {
				     TestLogger.testLoggerInfo("Select Card Expiry Month Dropdown In Billing Address Page Is Found");
				     BillingAddressPage.getSelectCardExpirationMonthInBillingpage().click();
				     Select ExpMonthDropDown = new Select(driver.findElement(By.name("cardMonth")));
				     ExpMonthDropDown.selectByVisibleText(month);
				     Thread.sleep(1000);
			} catch (Exception e) {
				     TestLogger.testLoggerInfo("Select Card Expiry Month Dropdown In Billing Address Page Not Found");
			}
}	
		public static void SelectCardExpirationYearInBillingpage(String year) throws Exception{
					try {
					     TestLogger.testLoggerInfo("Select Card Expiry Year Dropdown In Billing Address Page Is Found");
					     BillingAddressPage.getSelectCardExpirationYearInBillingpage().click();
					     Select ExpYearDropDown = new Select(driver.findElement(By.name("cardYear")));
					     ExpYearDropDown.selectByVisibleText(year);
					     Thread.sleep(1000);
				} catch (Exception e) {
					     TestLogger.testLoggerInfo("Select Card Expiry Year Dropdown In Billing Address Page Not Found");
			}
}
		public static void CardCvvInputFieldInBillingpage(String cvv) throws Exception{
						try {
						     TestLogger.testLoggerInfo("CardHolder CVV Field In Billing Address Page Is Found");
						     BillingAddressPage.getCardCvvInputFieldInBillingpage().sendKeys(cvv);
						     Thread.sleep(1000);
					} catch (Exception e) {
						     TestLogger.testLoggerInfo("CardHolder CVV Field In Billing Address Page Not Found");
			}
}						
		public static void ContinueButtonInBillingpage() throws Exception{
							try {
							     TestLogger.testLoggerInfo("Continue Button In Billing Address Page Is Found");
							     BillingAddressPage.getContinueButtonInBillingpage().click();
							     Thread.sleep(1000);
						} catch (Exception e) {
							     TestLogger.testLoggerInfo("Continue Button Field In Billing Address Page Not Found");
			}	
	}
		
		public static void ClickDeleteLinkInPanel() throws Exception{
			try {
			     TestLogger.testLoggerInfo("Delete Link In Addr Form Is Found");
			     BillingAddressPage.getDeleteLinkInBillingAddress().click();
			     Thread.sleep(1000);
			} catch (Exception e) {
			     TestLogger.testLoggerInfo("Delete Link In Addr Form Is Not Found");
			}	
		}
		
		public static void ConfirmDeletePaymentMethod() throws Exception{
			try {			
				TestLogger.testLoggerInfo("Yes Button Is Found");
				BillingAddressPage.getRemovePaymentMethodConfirm().click();
				Thread.sleep(1000);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Yes Button Is Not Found" + e);
			}		
		}

		public static void DeclineDeletePaymentMethod() throws Exception{
			try {			
				TestLogger.testLoggerInfo("No Button Is Found");
				BillingAddressPage.getRemovePaymentMethodDecline().click();
				Thread.sleep(1000);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("No Button Is Not Found" + e);
			}		
		}
		
		public static void ConfirmDeleteBillingAddr() throws Exception{
			try {			
				TestLogger.testLoggerInfo("Yes Button Is Found");
				BillingAddressPage.getRemoveBillingAddrConfirm().click();
				Thread.sleep(1000);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Yes Button Is Not Found" + e);
			}		
		}

		public static void DeclineDeleteBillingAddr() throws Exception{
			try {			
				TestLogger.testLoggerInfo("No Button Is Found");
				BillingAddressPage.getRemoveBillingAddrDecline().click();
				Thread.sleep(1000);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("No Button Is Not Found" + e);
			}		
		}
		
		public static void ClickUseThisPaymentMethodBtn() throws Exception{
			try {			
				TestLogger.testLoggerInfo("Use This Payment Method Btn Is Found");
				BillingAddressPage.getUsethispaymentmethod().click();
				Thread.sleep(1000);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Use This Payment Method Btn Is Not Found" + e);
			}		
		}
		
		public static void ClickBillingAddressLink() throws Exception{
			try {			
				TestLogger.testLoggerInfo("Billing Address Link Is Found");
				BillingAddressPage.getBillingAddressLink().click();
				Thread.sleep(1000);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Billing Address Link Is Not Found" + e);
			}		
		}
		
		public static void ClickAddAnBillingAddress() throws Exception{
			try {			
				TestLogger.testLoggerInfo("Add An Billing Address Is Found");
				BillingAddressPage.getAddAnBillingAddress().click();
				Thread.sleep(1000);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Add An Billing Address Is Not Found" + e);
			}		
		}
		
		public static void ClickCancelBtn() throws Exception{
			try {			
				TestLogger.testLoggerInfo("Cancel Btn In Addr Form Is Found");
				BillingAddressPage.getCancelBtnInAddrForm().click();
				Thread.sleep(1000);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Cancel Btn In Addr Form Is Not Found" + e);
			}		
		}
		
		public static void FirstNameInputFieldInBillingPage(String message) throws Exception{
			try {
			     TestLogger.testLoggerInfo("Firstname Field In Billing Address Page Is Found");
			     BillingAddressPage.getFirstNameInputFieldInBillingPage().clear();
			     BillingAddressPage.getFirstNameInputFieldInBillingPage().sendKeys(message);
			     Thread.sleep(1000);
			} catch (Exception e) {
			     TestLogger.testLoggerInfo("Firstname Field In Billing Address Page Not Found");
			}	
		}
		
		public static void LastNameInputFieldInBillingPage(String message) throws Exception{
			try {
			     TestLogger.testLoggerInfo("Lastname Field In Billing Address Page Is Found");
			     BillingAddressPage.getLastNameInputFieldInBillingPage().clear();
			     BillingAddressPage.getLastNameInputFieldInBillingPage().sendKeys(message);
			     Thread.sleep(1000);
			} catch (Exception e) {
			     TestLogger.testLoggerInfo("Lastname Field In Billing Address Page Not Found");
			}	
		}
		
		public static void Address1InputFieldInBillingPage(String message) throws Exception{
			try {
			     TestLogger.testLoggerInfo("Address1 Field In Billing Address Page Is Found");
			     BillingAddressPage.getAddress1InputFieldInBillingPage().clear();
			     BillingAddressPage.getAddress1InputFieldInBillingPage().sendKeys(message);
			     Thread.sleep(1000);
			} catch (Exception e) {
			     TestLogger.testLoggerInfo("Address1 Field In Billing Address Page Not Found");
			}	
		}
		
		public static void Address2InputFieldInBillingPage(String message) throws Exception{
			try {
			     TestLogger.testLoggerInfo("Address2 Field In Billing Address Page Is Found");
			     BillingAddressPage.getAddress2InputFieldInBillingPage().clear();
			     BillingAddressPage.getAddress2InputFieldInBillingPage().sendKeys(message);
			     Thread.sleep(1000);
		} catch (Exception e) {
			     TestLogger.testLoggerInfo("Address2 Field In Billing Address Page Not Found");
		}	
	}
		
		public static void CityInputFieldInBillingPage(String message) throws Exception{
			try {
			     TestLogger.testLoggerInfo("City Field In Billing Address Page Is Found");
			     BillingAddressPage.getCityInputFieldInBillingPage().clear();
			     BillingAddressPage.getCityInputFieldInBillingPage().sendKeys(message);
			     Thread.sleep(1000);
		} catch (Exception e) {
			     TestLogger.testLoggerInfo("City Field In Billing Address Page Not Found");
		}	
	}
		
		public static void SelectStateDropDownInBillingPage(String stateName) throws Exception{
			try {
			     TestLogger.testLoggerInfo("State Drop Down In Billing Address Is Found");
			     BillingAddressPage.getSelectStateDropDownInBillingPage().click();
			     Select stateDropDown = new Select(driver.findElement(By.name("state_id")));
			     stateDropDown.selectByVisibleText(stateName);
			     Thread.sleep(1000);
			} catch (Exception e) {
			     TestLogger.testLoggerInfo("State Field In Billing Address Page Not Found");
			}	
		}
		
		public static void ZipCodeInputFieldInBillingPage(String message) throws Exception{
			try {
			     TestLogger.testLoggerInfo("Zipcode Field In Billing Address Is Found");
			     BillingAddressPage.getZipCodeInputFieldInBillingPage().clear();
			     BillingAddressPage.getZipCodeInputFieldInBillingPage().sendKeys(message);
			     Thread.sleep(1000);
			} catch (Exception e) {
			     TestLogger.testLoggerInfo("Zipcode Field In Billing Address Page Not Found");
			}	
		}
		
		public static void PhoneNumberInputFieldInBillingPage(String message) throws Exception{
			try {
			     TestLogger.testLoggerInfo("Phone Number Field In Billing Address Is Found");
			     BillingAddressPage.getPhoneNumberInputFieldInBillingPage().clear();
			     BillingAddressPage.getPhoneNumberInputFieldInBillingPage().sendKeys(message);
			     Thread.sleep(1000);
			} catch (Exception e) {
			     TestLogger.testLoggerInfo("Phone Number Field In Billing Address Page Not Found");
			}	
		}
		
		public static void SelectCountryDropDownInBillingPage(String countryName) throws Exception{
			try {
			     TestLogger.testLoggerInfo("Country Drop Down In Billing Address Page Is Found");
			     BillingAddressPage.getSelectCountryDropDownInBillingPage().click();
			     Select countryInDropDown = new Select(driver.findElement(By.name("country_id")));
			     countryInDropDown.selectByVisibleText(countryName);
			     Thread.sleep(1000);
			} catch (Exception e) {
			     TestLogger.testLoggerInfo("Country Drop Down In Billing Address Page Not Found");
			}	
		}
		
		public static void SendStateValue(String stateName) throws Exception{
			try {
			     TestLogger.testLoggerInfo("State or Province Field Is Found");
			     BillingAddressPage.getStateFieldNonDropDownInBillingAddressPage().clear();
			     BillingAddressPage.getStateFieldNonDropDownInBillingAddressPage().sendKeys(stateName);
			     Thread.sleep(1000);
			} catch (Exception e) {
			     TestLogger.testLoggerInfo("State or Province Field Is Not Found");
			}	
		}
		
		public static void ClickUseThisAddrBtn() throws Exception{
			try {
			     TestLogger.testLoggerInfo("Use This Addr Btn Is Found");
			     BillingAddressPage.getUseThisAddressInAddrPanel().click();
			     Thread.sleep(1000);
			} catch (Exception e) {
			     TestLogger.testLoggerInfo("Use This Addr Btn Is Not Found");
			}	
		}
		
		public static void ClickEdit() throws Exception{
			try {
			     TestLogger.testLoggerInfo("Edit Link Is Found");
			     BillingAddressPage.getEditOptionInAddrPanel().click();
			     Thread.sleep(1000);
			} catch (Exception e) {
			     TestLogger.testLoggerInfo("Edit Link Is Not Found");
			}	
		}
		
		public static void ClickDelete() throws Exception{
			try {
			     TestLogger.testLoggerInfo("Delete Link Is Found");
			     BillingAddressPage.getDeleteOptionInAddrPanel().click();
			     Thread.sleep(1000);
			} catch (Exception e) {
			     TestLogger.testLoggerInfo("Delete Link Is Not Found");
			}	
		}
		
		public static void ClickSelectBtn() throws Exception{
			try {
			     TestLogger.testLoggerInfo("Select Btn Is Found");
			     BillingAddressPage.getSelectOptionInAddrPanel().click();
			     Thread.sleep(1000);
			} catch (Exception e) {
			     TestLogger.testLoggerInfo("Select Btn Is Not Found");
			}	
		}
		
		public static Boolean DefaultSaveCardForFutureUseCheckBox() throws Exception{
			boolean isSelected = BillingAddressPage.getSaveCardForFutureUseCheckBox().isSelected();	
			if (isSelected) {
				 TestLogger.testLoggerInfo("Save Card For Future Use CheckBox Is Checked By Default");
				}
			else {
				TestLogger.testLoggerInfo("Save Card For Future Use CheckBox Is Not Checked By Default");
			}
			return isSelected;
		}
		
		public static void ValidateSaveCardForFutureUseCheckBox() throws Exception{
			try {
			     TestLogger.testLoggerInfo("Save Card For Future Use CheckBox Is Found");
			     boolean isSelected = BillingAddressPage.getSaveCardForFutureUseCheckBox().isSelected();
			     if (isSelected) {
			    	 BillingAddressPage.getSaveCardForFutureUseCheckBox().click();
			     }
			     else {
			    	 BillingAddressPage.getSaveCardForFutureUseCheckBox().click();
			     }
			    	 
			     Thread.sleep(1000);
			} catch (Exception e) {
			     TestLogger.testLoggerInfo("Save Card For Future Use CheckBox Is Not Found");
			}
			BillingAddressPage.getSaveCardForFutureUseCheckBox().click();
		}
		
		public static Boolean DefaultSameAsShippingAddressCheckBox() throws Exception{
			boolean isSelected = BillingAddressPage.getSameAsShippingAddressCheckBox().isSelected();			
			if (isSelected) {
				 TestLogger.testLoggerInfo("Same As Shipping Address CheckBox Is Checked By Default");
				}
			else {
				TestLogger.testLoggerInfo("Same As Shipping Address CheckBox Is Not Checked By Default");
			}
			return isSelected;
		}
		
		public static void ValidateSameAsShippingAddressCheckBox() throws Exception{
			try {
			     TestLogger.testLoggerInfo("Same As Shipping Address CheckBox Is Found");
			     boolean isSelected = BillingAddressPage.getSameAsShippingAddressCheckBox().isSelected();
			     if (isSelected) {
			    	 BillingAddressPage.getSameAsShippingAddressCheckBox().click();
			     }
			     else {
			    	 BillingAddressPage.getSameAsShippingAddressCheckBox().click();
			     }
			    	 
			     Thread.sleep(1000);
			} catch (Exception e) {
			     TestLogger.testLoggerInfo("Same As Shipping Address CheckBox Is Not Found");
			}
			BillingAddressPage.getSameAsShippingAddressCheckBox().click();
		}
}

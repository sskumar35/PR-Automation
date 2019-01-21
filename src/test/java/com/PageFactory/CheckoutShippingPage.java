package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutShippingPage {
	
	public CheckoutShippingPage (WebDriver driver) {
		
		/* Constructor to Initialize all WebElements */
		
		PageFactory.initElements(driver, this);
	}
	   @FindBy(xpath = "//b[@class='js-open-accordion primary-link']")
       WebElement AddNewShippingAddressLink;
	
       @FindBy(xpath = "//SELECT[@id='cty']")
       WebElement SelectCountryDropDownInShippingPage;
       
       @FindBy(xpath = "//input[@id='state-name']")
       WebElement StateFieldNonDropDownInShippingAddressPage;
       
       @FindBy(xpath = "//div[contains(@id,'panel')]//div[@class='clearfix']//div[@class='col-xs-9 text-center js-accordion-link co-links']//a[@class='js-open-accordion co-accordion-actions pull-right']")
       WebElement EditShippingAddress;
       
       @FindBy(xpath = "//div[contains(@id,'panel')]//div[@class='clearfix']//div[@class='col-xs-9 text-center js-accordion-link co-links']//a[@class='primary-link js-shipping-delete pull-right']")
       WebElement DeleteLinkInShippingAddress;
       
       @FindBy(xpath = "//div[contains(@id,'panel')]//div[@class='clearfix']//div[@class='col-xs-37']//div[@class='radio no-margin']//div[@class='label']//input[@type='radio']")
       WebElement SelectRadioBtnInShippingAddress;
       
       @FindBy(xpath = "//html/body[@id='checkout-area']/div[1]")
       WebElement SelectCheckoutArea;
       
       @FindBy(xpath = "//INPUT[@id='first_name']")
       WebElement FirstNameInputFieldInShippingPage;
       
       @FindBy(xpath = "//INPUT[@id='last_name']")
       WebElement LastNameInputFieldInShippingPage;
       
       @FindBy(xpath = "//INPUT[@id='address_1']")
       WebElement Address1InputFieldInShippingPage;
       
       @FindBy(xpath = "//INPUT[@id='address_2']")
       WebElement Address2InputFieldInShippingPage;
       
       @FindBy(xpath = "//INPUT[@id='city']")
       WebElement CityInputFieldInShippingPage;
       
       @FindBy(xpath = "//SELECT[@id='state']")
       WebElement SelectStateDropDownInShippingPage;
       
       @FindBy(xpath = "//INPUT[@id='zip_code']")
       WebElement ZipCodeInputFieldInShippingPage;
       
       @FindBy(xpath = "//INPUT[@id='phone']")
       WebElement PhoneNumberInputFieldInShippingPage;
       
       @FindBy(xpath = "//INPUT[@id='userEmail']")
       WebElement EmailAddressInputFieldInShippingPage;
       
       @FindBy(xpath = "//INPUT[@name='subscribe']")
       WebElement SubscribeCheckButtonInShippingPage;
       
       @FindBy(xpath = "//INPUT[@id='password']")
       WebElement PasswordInputFieldInShippingPage;
       
       @FindBy(xpath = "//INPUT[@id='confirmationPassword']")
       WebElement ConfirmPasswordInputFieldInShippingPage;
       
       @FindBy(xpath = "//form[@method='post']//button[@type='button']")
       WebElement ContinueButtonInShippingPage;
       
       @FindBy(xpath = "//button[@type='submit']")
       WebElement ContinueButtonInShippingPageForNewCust;
       
       @FindBy(xpath = "//div[@class='co-choose-button-form text-right']//button[@type='button']")
       WebElement UseThisAdddrBtnForAddrForm;
       
       @FindBy(xpath = "//div[@class='js-form-button text-right']//div[@class='co-choose-button-form']//button[@type='button']")
       WebElement UseThisAdddrBtnForEditAddrForm;
       
       @FindBy(xpath = "//a[@href='#collapse0'][contains(text(),'Cancel')]")
       WebElement CancelBtnForAddrForm;
       
       /* --- Shipping Address Changes --- */
       
       @FindBy(xpath = "//label[@for='country_id']")
       WebElement labelCountry;
       
       @FindBy(xpath = "//label[@for='first_name']")
       WebElement labelFirstName;
       
       @FindBy(xpath = "//label[@for='last_name']")
       WebElement labelLastName;
       
       @FindBy(xpath = "//label[@for='address_1']")
       WebElement labelAddressLn1;
       
       @FindBy(xpath = "//label[@for='address_2']")
       WebElement labelAddressLn2;
       
       @FindBy(xpath = "//label[@for='city']")
       WebElement labelCity;
       
       @FindBy(xpath = "//label[@for='state-name']")
       WebElement labelState;
       
       @FindBy(xpath = "//label[@for='zip_code']")
       WebElement labelZipCode;
       
       @FindBy(xpath = "//label[@for='phone']")
       WebElement labelPhone;
       
       @FindBy(xpath = "//label[@for='country_id']//b[@class='co-error-msg']")
       WebElement labelCountryEM;
       
       @FindBy(xpath = "//label[@for='first_name']//b[@class='co-error-msg']")
       WebElement labelFirstNameEM;
       
       @FindBy(xpath = "//label[@for='last_name']//b[@class='co-error-msg']")
       WebElement labelLastNameEM;
       
       @FindBy(xpath = "//label[@for='address_1']//b[@class='co-error-msg']")
       WebElement labelAddressLn1EM;
       
       @FindBy(xpath = "//label[@for='address_2']//b[@class='co-error-msg']")
       WebElement labelAddressLn2EM;
       
       @FindBy(xpath = "//label[@for='city']//b[@class='co-error-msg']")
       WebElement labelCityEM;
       
       @FindBy(xpath = "//label[@for='state-name']//b[@class='co-error-msg']")
       WebElement labelStateEM;
       
       @FindBy(xpath = "//label[@for='zip_code']//b[@class='co-error-msg']")
       WebElement labelZipCodeEM;
       
       @FindBy(xpath = "//label[@for='phone']//b[@class='co-error-msg']")
       WebElement labelPhoneEM;
       
       @FindBy(xpath = "//html//div[contains(@id,'panel')]//select[2]")
       WebElement SelectStateDropDownInShippingPageAustralia;
       
       @FindBy(xpath = "//html//div[contains(@id,'panel')]//select[3]")
       WebElement SelectStateDropDownInShippingPageCanada;
       
       @FindBy(xpath = "//html//div[contains(@id,'panel')]//select[4]")
       WebElement SelectStateDropDownInShippingPageJapan;
       
       @FindBy(xpath = "//input[@id='state-name']")
       WebElement StateInputValueInShippingPage;
       
       @FindBy(xpath = "//html//div[4]/div[1]/input[1]")
       WebElement JapanZipCodeInput1;
       
       @FindBy(xpath = "//html//div[3]/input[1]")
       WebElement JapanZipCodeInput2;
       
       
       /* Get Methods for WebElements */
       
       /* --- Shipping Address Changes --- */
       
       public WebElement getJapanZipCodeInput1()
		{
			return JapanZipCodeInput1;
		}
       
       public WebElement getJapanZipCodeInput2()
		{
			return JapanZipCodeInput2;
		}
       
       public WebElement getStateInputValueInShippingPage()
		{
			return StateInputValueInShippingPage;
		}
       
       public WebElement getSelectStateDropDownInShippingPageAustralia()
		{
			return SelectStateDropDownInShippingPageAustralia;
		}
       
       public WebElement getSelectStateDropDownInShippingPageCanada()
		{
			return SelectStateDropDownInShippingPageCanada;
		}
       
       public WebElement getSelectStateDropDownInShippingPageJapan()
		{
			return SelectStateDropDownInShippingPageJapan;
		}
       
       public WebElement getlabelCountry()
		{
			return labelCountry;
		}
       
       public WebElement getlabelFirstName()
		{
			return labelFirstName;
		}
       
       public WebElement getlabelLastName()
		{
			return labelLastName;
		}
       
       public WebElement getlabelAddressLn1()
		{
			return labelAddressLn1;
		}
       
       public WebElement getlabelAddressLn2()
		{
			return labelAddressLn2;
		}
       
       public WebElement getlabelCity()
		{
			return labelCity;
		}
       
       public WebElement getlabelState()
		{
			return labelState;
		}
       
       public WebElement getlabelZipCode()
		{
			return labelZipCode;
		}
       
       public WebElement getlabelPhone()
		{
			return labelPhone;
		}
       
       public WebElement getlabelCountryEM()
		{
			return labelCountryEM;
		}
      
      public WebElement getlabelFirstNameEM()
		{
			return labelFirstNameEM;
		}
      
      public WebElement getlabelLastNameEM()
		{
			return labelLastNameEM;
		}
      
      public WebElement getlabelAddressLn1EM()
		{
			return labelAddressLn1EM;
		}
      
      public WebElement getlabelAddressLn2EM()
		{
			return labelAddressLn2EM;
		}
      
      public WebElement getlabelCityEM()
		{
			return labelCityEM;
		}
      
      public WebElement getlabelStateEM()
		{
			return labelStateEM;
		}
      
      public WebElement getlabelZipCodeEM()
		{
			return labelZipCodeEM;
		}
      
      public WebElement getlabelPhoneEM()
		{
			return labelPhoneEM;
		}
       
       
       /* --------------------------------- */
       
       public WebElement getAddNewShippingAddressLink()
		{
			return AddNewShippingAddressLink;
		}
       
       public WebElement getContinueButtonInShippingPageForNewCust()
		{
			return ContinueButtonInShippingPageForNewCust;
		}
       
       public WebElement getSelectCountryDropDownInShippingPage()
		{
			return SelectCountryDropDownInShippingPage;
		}
       
       public WebElement getEditShippingAddress()
		{
			return EditShippingAddress;
		}
       
       public WebElement getStateFieldNonDropDownInShippingAddressPage()
		{
			return StateFieldNonDropDownInShippingAddressPage;
		}
       
       public WebElement getSelectRadioBtnInShippingAddress()
		{
			return SelectRadioBtnInShippingAddress;
		}
       
       public WebElement getDeleteLinkInShippingAddress()
		{
			return DeleteLinkInShippingAddress;
		}
       
       public WebElement getSelectCheckoutArea()
		{
			return SelectCheckoutArea;
		}
       
       public WebElement getFirstNameInputFieldInShippingPage()
		{
			return FirstNameInputFieldInShippingPage;
		}
       public WebElement getLastNameInputFieldInShippingPage()
		{
			return LastNameInputFieldInShippingPage;
		}
       public WebElement getAddress1InputFieldInShippingPage()
		{
			return Address1InputFieldInShippingPage;
		}
       public WebElement getAddress2InputFieldInShippingPage()
		{
			return Address2InputFieldInShippingPage;
		}
       public WebElement getCityInputFieldInShippingPage()
		{
			return CityInputFieldInShippingPage;
		}
       public WebElement getSelectStateDropDownInShippingPage()
		{
			return SelectStateDropDownInShippingPage;
		}
       public WebElement getZipCodeInputFieldInShippingPage()
		{
			return ZipCodeInputFieldInShippingPage;
		}
       public WebElement getPhoneNumberInputFieldInShippingPage()
		{
			return PhoneNumberInputFieldInShippingPage;
		}
       public WebElement getEmailAddressInputFieldInShippingPage()
		{
			return EmailAddressInputFieldInShippingPage;
		}
       public WebElement getSubscribeCheckButtonInShippingPage()
		{
			return SubscribeCheckButtonInShippingPage;
		}
       public WebElement getPasswordInputFieldInShippingPage()
		{
			return PasswordInputFieldInShippingPage;
		}
       public WebElement getConfirmPasswordInputFieldInShippingPage()
		{
			return ConfirmPasswordInputFieldInShippingPage;
		}
       public WebElement getContinueButtonInShippingPage()
		{
			return ContinueButtonInShippingPage;
		}
       
       public WebElement getUseThisAdddrBtnForAddrForm()
		{
			return UseThisAdddrBtnForAddrForm;
		}
       
       public WebElement getUseThisAdddrBtnForEditAddrForm()
		{
			return UseThisAdddrBtnForEditAddrForm;
		}
       
       public WebElement getCancelBtnForAddrForm()
		{
			return CancelBtnForAddrForm;
		}
       
}

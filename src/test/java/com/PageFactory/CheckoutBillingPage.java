package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutBillingPage {

	public CheckoutBillingPage(WebDriver driver) {  /* Constructor to Initialize all WebElements */
		PageFactory.initElements(driver, this);
		
	}
	 @FindBy(xpath = "//h1[@class='js-shipping-title']//a")
	 WebElement AddNewBillingAddressLink;
	 
	 @FindBy(xpath = "//INPUT[@id='cardHolder']")
	 WebElement CardHolderNameInputFieldInBillingpage;
	 
	 @FindBy(xpath = "//INPUT[@id='cardNumber']")
	 WebElement CardNumberInputFieldInBillingpage;
	 
	 @FindBy(xpath = "//SELECT[@id='cardExpirationMonth']")
	 WebElement SelectCardExpirationMonthInBillingpage;
	 
	 @FindBy(xpath = "//SELECT[@id='cardExpirationYear']")
	 WebElement SelectCardExpirationYearInBillingpage;
	 
	 @FindBy(xpath = "//INPUT[@id='cardCsc']")
	 WebElement CardCvvInputFieldInBillingpage;
	 
	 @FindBy(xpath = "//BUTTON[@type='submit'][text()='Continue']")
	 WebElement ContinueButtonInBillingpage;
	 
	 /*@FindBy(xpath = "//div[contains(@id,'panel')]//div[@class='clearfix']//div[@class='col-xs-46']//table[@width='100%']//tbody//tr//td[@rowspan='2']//a[@class='co-accordion-actions primary-link pull-right']")
     WebElement DeleteLinkInBillingAddress;*/
	 
	 @FindBy(xpath = "//div[contains(@id,'panel')]//div[1]/div[3]/div[1]/div[1]/div[1]/a[2]")
     WebElement DeleteLinkInBillingAddress;
	 
	 @FindBy(xpath = "//button[@type='button'][contains(text(),'Use this payment method')]")
	 WebElement Usethispaymentmethod;
	 
	 @FindBy(xpath = "//div[@id='panel1391846']//a[@class='js-open-accordion co-accordion-actions primary-link'][contains(text(),'Change')]")
     WebElement BillingAddressLink;
	 
	 @FindBy(xpath = "//div[@id='collapse1391846']//a[@class='primary-link js-add-address-inner'][contains(text(),'enter a new billing address')]")
     WebElement AddAnBillingAddress;
	 
	 @FindBy(xpath = "//html//div[contains(@id,'panel')]//button[1]")
     WebElement CancelBtnInAddrForm;
	 
	 @FindBy(xpath = "//INPUT[@id='first_name']")
     WebElement FirstNameInputFieldInBillingPage;
     
     @FindBy(xpath = "//INPUT[@id='last_name']")
     WebElement LastNameInputFieldInBillingPage;
     
     @FindBy(xpath = "//INPUT[@id='address_1']")
     WebElement Address1InputFieldInBillingPage;
     
     @FindBy(xpath = "//INPUT[@id='address_2']")
     WebElement Address2InputFieldInBillingPage;
     
     @FindBy(xpath = "//INPUT[@id='city']")
     WebElement CityInputFieldInBillingPage;
     
     @FindBy(xpath = "//SELECT[@id='state']")
     WebElement SelectStateDropDownInBillingPage;
     
     @FindBy(xpath = "//INPUT[@id='zip_code']")
     WebElement ZipCodeInputFieldInBillingPage;
     
     @FindBy(xpath = "//INPUT[@id='phone']")
     WebElement PhoneNumberInputFieldInBillingPage;
     
     @FindBy(xpath = "//SELECT[@id='cty']")
     WebElement SelectCountryDropDownInBillingPage;
     
     @FindBy(xpath = "//input[@id='state-name']")
     WebElement StateFieldNonDropDownInBillingAddressPage;
     
     @FindBy(xpath = "//html//div[@class='col-xs-46']//button[2]")
     WebElement UseThisAddressInAddrPanel;
     
     @FindBy(xpath = "//div[@class='co-select-address']/div[1]/a[1]")
     WebElement EditOptionInAddrPanel;
     
     @FindBy(xpath = "//div[@class='co-select-address']/div[1]/a[2]")
     WebElement DeleteOptionInAddrPanel;
     
     @FindBy(xpath = "//div[@class='co-select-address']//div[@class='no-padding pull-right']/a[1]")
     WebElement SelectOptionInAddrPanel;
     
     @FindBy(xpath = "//div[@class='modal-footer text-center']/button[1]")
	 WebElement RemovePaymentMethodConfirm;
	  	
	 @FindBy(xpath = "//div[@class='modal-footer text-center']/button[2]")
	 WebElement RemovePaymentMethodDecline;
	 
	 @FindBy(xpath = "//div[@id='js-modal-delete-address']//div[@class='modal-footer text-center']/button[1]")
	 WebElement RemoveBillingAddrConfirm;
	  	
	 @FindBy(xpath = "//div[@id='js-modal-delete-address']//div[@class='modal-footer text-center']/button[2]")
	 WebElement RemoveBillingAddrDecline;
	 
	 @FindBy(xpath = "//label[@class='checkbox-inline']//input[@type='checkbox']")
	 WebElement SaveCardForFutureUseCheckBox;
	 
	 @FindBy(xpath = "//input[@class='js-same-address']")
	 WebElement SameAsShippingAddressCheckBox;
	 
	 /* Get Methods for WebElements */
     
     public WebElement getFirstNameInputFieldInBillingPage()
		{
			return FirstNameInputFieldInBillingPage;
		}
     
     public WebElement getSaveCardForFutureUseCheckBox()
		{
			return SaveCardForFutureUseCheckBox;
		}
     
     public WebElement getSameAsShippingAddressCheckBox()
		{
			return SameAsShippingAddressCheckBox;
		}
     
     public WebElement getRemoveBillingAddrConfirm()
		{
			return RemoveBillingAddrConfirm;
		}
     
     public WebElement getRemoveBillingAddrDecline()
		{
			return RemoveBillingAddrDecline;
		}
     
     public WebElement getEditOptionInAddrPanel()
		{
			return EditOptionInAddrPanel;
		}
     
     public WebElement getSelectOptionInAddrPanel()
		{
			return SelectOptionInAddrPanel;
		}
     
     public WebElement getRemovePaymentMethodConfirm()
		{
			return RemovePaymentMethodConfirm;
		}
	  	
	  	public WebElement getRemovePaymentMethodDecline()
		{
			return RemovePaymentMethodDecline;
		}
     
     public WebElement getDeleteOptionInAddrPanel()
		{
			return DeleteOptionInAddrPanel;
		}
     
     public WebElement getUseThisAddressInAddrPanel()
		{
			return UseThisAddressInAddrPanel;
		}
     
     public WebElement getSelectCountryDropDownInBillingPage()
		{
			return SelectCountryDropDownInBillingPage;
		}
     
     public WebElement getStateFieldNonDropDownInBillingAddressPage()
		{
			return StateFieldNonDropDownInBillingAddressPage;
		}
     
    public WebElement getLastNameInputFieldInBillingPage()
		{
			return LastNameInputFieldInBillingPage;
		}
    
    public WebElement getAddress1InputFieldInBillingPage()
		{
			return Address1InputFieldInBillingPage;
		}
    
    public WebElement getAddress2InputFieldInBillingPage()
		{
			return Address2InputFieldInBillingPage;
		}
    
    public WebElement getCityInputFieldInBillingPage()
		{
			return CityInputFieldInBillingPage;
		}
    
    public WebElement getSelectStateDropDownInBillingPage()
		{
			return SelectStateDropDownInBillingPage;
		}
    
    public WebElement getZipCodeInputFieldInBillingPage()
		{
			return ZipCodeInputFieldInBillingPage;
		}
    
    public WebElement getPhoneNumberInputFieldInBillingPage()
		{
			return PhoneNumberInputFieldInBillingPage;
		}
	 
	 public WebElement getDeleteLinkInBillingAddress()
		{
			return DeleteLinkInBillingAddress;
		}
	 
	 public WebElement getCancelBtnInAddrForm()
		{
			return CancelBtnInAddrForm;
		}
	 
	 public WebElement getAddAnBillingAddress()
		{
			return AddAnBillingAddress;
		}
	 
	 public WebElement getBillingAddressLink()
		{
			return BillingAddressLink;
		}
	 
	 public WebElement getUsethispaymentmethod()
		{
			return Usethispaymentmethod;
		}
	 
	 public WebElement getAddNewBillingAddressLink()
		{
			return AddNewBillingAddressLink;
		}
	 public WebElement getCardHolderNameInputFieldInBillingpage()
		{
			return CardHolderNameInputFieldInBillingpage;
		}
	 public WebElement getCardNumberInputFieldInBillingpage()
		{
			return CardNumberInputFieldInBillingpage;
		}
	 public WebElement getSelectCardExpirationMonthInBillingpage()
		{
			return SelectCardExpirationMonthInBillingpage;
		}
	 public WebElement getSelectCardExpirationYearInBillingpage()
		{
			return SelectCardExpirationYearInBillingpage;
		}
	 public WebElement getCardCvvInputFieldInBillingpage()
		{
			return CardCvvInputFieldInBillingpage;
		}
	 public WebElement getContinueButtonInBillingpage()
		{
			return ContinueButtonInBillingpage;
		}

}

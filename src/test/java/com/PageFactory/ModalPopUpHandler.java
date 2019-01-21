package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalPopUpHandler {	

	//WebDriver driver;

	/* Constructor to Initialize all WebElements */
	  	public ModalPopUpHandler (WebDriver driver) {
	  		//this.driver = driver;
	  		PageFactory.initElements(driver, this);		
	    }
	
	  	@FindBy(xpath = "//*[@id=\"modal-suggested\"]/form/div[3]/button")
		WebElement ClickSubmitSaveModalSetting;
	  	
	  	@FindBy(xpath = "//div[@id='pr-window-f-content']//div[@class='generate-share-cart']//div[@class='header']")
		WebElement ShareYourCartWindow;
	  	
	  	//@FindBy(xpath = "//a[@id='pr-window-f-close']")
	  	@FindBy(xpath = "//button[@id='close-btn']//span[@aria-hidden='true'][contains(text(),'×')]")
		WebElement ShareYourCartWindowClose;
	  	
	  	@FindBy(xpath = "//div[@id='modal-suggested-header']")
	  	WebElement ModalSuggestedHeader;
	  	
	  	@FindBy(xpath = "//a[@title='Close']")
	  	WebElement ModalSuggestedWindowClose;
	  	
	  	@FindBy(xpath = "//div[@id='js-modal-delete-item']//div[@class='modal-dialog']//div[@class='modal-content']//div[@class='modal-header']")
	  	WebElement RemoveItemModalHeader;
	  	
	  	@FindBy(xpath = "//div[@id='js-modal-delete-item']//div[@class='modal-dialog']//div[@class='modal-content']//div[@class='modal-header']//button[@type='button']//span[@aria-hidden='true']")
	  	WebElement RemoveItemModalHeaderClose;
	  	
	  	@FindBy(xpath = "//div[@id='js-modal-delete-item']//div[@class='modal-dialog']//div[@class='modal-content']//div[@class='modal-body text-center']")
	  	WebElement RemoveItemModalContent;
	  	
	  	@FindBy(xpath = "//button[@type='button'][contains(text(),'Yes')]")
	  	WebElement RemoveItemModalConfirm;
	  	
	  	@FindBy(xpath = "//button[@type='button'][contains(text(),'No')]")
	  	WebElement RemoveItemModalDecline;
	  	
	  	@FindBy(xpath = "//span[@id='select2-_sctry-container']")
	  	WebElement SelectCountryDropDownInModal;
	  	
	  	@FindBy(xpath = "//input[@class='select2-search__field']")
	  	WebElement SearchInputFieldInModal;
	  	
	  	@FindBy(xpath = "//span[@id='select2-_slang-container']")
	  	WebElement SelectLanguageDropDownInModal;	
				
		/* Get Methods for WebElements */
		
	  	public WebElement getClickSubmitSaveModalSetting()
		{
			return ClickSubmitSaveModalSetting;
		}
	  	
	  	public WebElement getShareYourCartWindow()
		{
			return ShareYourCartWindow;
		}
	  	
	  	public WebElement getShareYourCartWindowClose()
		{
			return ShareYourCartWindowClose;
		}
	  	
	  	public WebElement getModalSuggestedHeader()
		{
			return ModalSuggestedHeader;
		}
	  	
	  	public WebElement getModalSuggestedWindowClose()
		{
			return ModalSuggestedWindowClose;
		}
	  	
	  	public WebElement getRemoveItemModalHeader()
		{
			return RemoveItemModalHeader;
		}

	  	public WebElement getRemoveItemModalHeaderClose()
		{
			return RemoveItemModalHeaderClose;
		}
	  	
	  	public WebElement getRemoveItemModalContent()
		{
			return RemoveItemModalContent;
		}
	  	
	  	public WebElement getRemoveItemModalConfirm()
		{
			return RemoveItemModalConfirm;
		}
	  	
	  	public WebElement getRemoveItemModalDecline()
		{
			return RemoveItemModalDecline;
		}
	  	
	  	public WebElement getSelectCountryDropDownInModal()
		{
			return SelectCountryDropDownInModal;
		}
	  	
	  	public WebElement getSearchCountryInModal()
		{
			return SearchInputFieldInModal;
		}
	  	
	  	public WebElement getSelectLanguageDropDownInModal()
		{
			return SelectLanguageDropDownInModal;
		}

}

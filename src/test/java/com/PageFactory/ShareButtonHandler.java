package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShareButtonHandler {
	
	public ShareButtonHandler (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
          /*LOGGED OUT USER */ 
	@FindBy(xpath="//a[contains(text(),'Shop All Products')]")
	WebElement ClickAllProductsMenu;
	
	@FindBy(xpath="//a[@id='l-pc-cat-1023-e00']")
	WebElement ClickAllProductsItem;
	
	@FindBy(xpath="//a[@id='l-pc-prod-1774-name-e0']")
	WebElement ClickProductItem;
	
	@FindBy(xpath="//button[@id='btn-cart-add-1774']")
	WebElement ClickAddToCart;
	
	@FindBy(xpath="//a[contains(text(),'Shop All Categories')]")
	WebElement ClickAllCategoriesMenu;
	
	@FindBy(xpath="//*[@id=\"l-pc-cat-2306-e00\"]")
	WebElement ClickCategoriesLink;
	
	//@FindBy(xpath="//A[@href=''][text()=' Share']")
	@FindBy(xpath="//a[@class='notranslate js-share share-panel js-ga-event']")
	WebElement ClickShareCartButton;
	
	@FindBy(xpath = "//*[@id=\"share-popup\"]/div/div/div")
	WebElement SharePopUpWindow;
	
	@FindBy(xpath = "//*[@id=\"close-btn\"]/span")
	WebElement SharePopUpClose;
	
	@FindBy(xpath = "//*[@id=\"copy-button\"]")
	WebElement CopyLinkButton;
	
	@FindBy(xpath = "//*[@id=\"rewardLink\"]")
	WebElement CopyRewardURL;
	
	@FindBy(xpath = "//*[@id=\"shorten\"]")
	WebElement CheckShortenUrl;
	
	@FindBy(xpath = "//*[@id=\"share-popup\"]/div/div/div[2]/table/tbody/tr[1]/td/p/b/a[2]")
	WebElement ClickSignInLink;
	
	@FindBy(xpath = "//strong[contains(text(),'Returning Customers')]")
	WebElement ConfirmLoginPage;
	
	@FindBy(xpath = "//*[@id=\"share-popup\"]/div/div/div[2]/table/tbody/tr[1]/td/p/b/a[1]")
	WebElement ClickLearnMoreLink;
	
	@FindBy(xpath = "//a[@class='logo-rewards']")
	WebElement RewardPageHeader;
	
	@FindBy(xpath = "//*[@id=\"atstbx\"]/div/a[1]/span[2]/svg")
	WebElement ClickWatsUpButton;
	
	@FindBy(css = "#atstbx > div > a.at-icon-wrapper.at-share-btn.at-svc-facebook > span.at-icon-wrapper > svg")
	WebElement ClickFbButton;
	
	@FindBy(css = "#atstbx > div > a.at-icon-wrapper.at-share-btn.at-svc-twitter > span.at-icon-wrapper > svg")
	WebElement ClickTwitterButton;
	
	@FindBy(xpath = "//*[@id=\"atstbx\"]/div/a[4]/span[2]/svg")
	WebElement ClickPrintButton;
	
	@FindBy(xpath = "//*[@id=\"atstbx\"]/div/a[5]/span[2]/svg")
	WebElement ClickEmailButton;
	
	@FindBy(xpath = "//*[@id=\"atstbx\"]/div/a[6]/span[2]/svg")
	WebElement ClickAddThisButton;
	
	@FindBy(xpath = "//*[@id=\"share-popup\"]/div/div/div[1]/div/a")
	WebElement ClickSharePopupLogo;
	
	
	/*LOGGED IN USER */ 
	
	@FindBy(xpath = "//*[@id=\"share-popup\"]/div/div/div/table/tbody/tr[1]/td/p/b/a")
	WebElement ClickEarnRewardLink;
	
	/* Get Methods for WebElements */
	
	public WebElement getClickShareCartButton() 
	{
		return ClickShareCartButton;
	}
	
	public WebElement getSharePopUpWindow() 
	{
		return SharePopUpWindow;
	}
	
	public WebElement getSharePopUpClose() 
	{
		return SharePopUpClose;
	}
	
	public WebElement getCopyLinkButton() 
	{
		return CopyLinkButton;
	}
	
	public WebElement getCopyRewardURL() 
	{
		return CopyRewardURL;
	}
	
	public WebElement getShortenUrl() 
	{
		return CheckShortenUrl;
	}
	
	public WebElement getClickSignInLink() 
	{
		return ClickSignInLink;
	}
	
	public WebElement getConfirmLoginPage() 
	{
		return ConfirmLoginPage;
	}
	
	public WebElement getClickLearnMoreLink() 
	{
		return ClickLearnMoreLink;
	}
	
	public WebElement getRewardPageHeader() 
	{
		return RewardPageHeader;
	}
	
	public WebElement getClickWatsUpButton() 
	{
		return ClickWatsUpButton;
	}
	
	public WebElement getClickFbButton() 
	{
		return ClickFbButton;
	}
	
	public WebElement getClickTwitterButton() 
	{
		return ClickTwitterButton;
	}
	
	public WebElement getClickPrintButton() 
	{
		return ClickPrintButton;
	}
	
	public WebElement getClickEmailButton() 
	{
		return ClickEmailButton;
	}
	
	public WebElement getClickAddThisButton() 
	{
		return ClickAddThisButton;
	}
	
	public WebElement getClickEarnRewardLink() 
	{
		return ClickEarnRewardLink;
	}
	
	public WebElement getClickSharePopupLogo() 
	{
		return ClickSharePopupLogo;
	}
	
	public WebElement getClickAllProductsMenu() 
	{
		return ClickAllProductsMenu;
	}
	
	public WebElement getClickAllProductsItem() 
	{
		return ClickAllProductsItem;
	}
	
	public WebElement getClickProductItem() 
	{
		return ClickProductItem;
	}
	
	public WebElement getClickAddToCart() 
	{
		return ClickAddToCart;
	}
	
	public WebElement getClickAllCategoriesMenu() 
	{
		return ClickAllCategoriesMenu;
	}
	
	public WebElement getClickCategoriesLink() 
	{
		return ClickCategoriesLink;
	}
}

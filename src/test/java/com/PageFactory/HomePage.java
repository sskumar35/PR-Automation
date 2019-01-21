package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage {
	
	WebDriver driver;

	/* Constructor to Initialize all WebElements */
	public HomePage (WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//div[@class='user-links']/div[1]/a[1]")
	//@FindBy(xpath = "//div[@class='col user-links']/div[1]")
	WebElement LogInBtn;
	
	@FindBy(xpath = "//A[@href='/logout'][text()='Logout']")
	WebElement LogOutBtn;
	
	@FindBy(xpath = "//a[@id='search-bar-checkout-btn']")
	WebElement CheckoutBtn;
	
	@FindBy(xpath = "//strong[contains(text(),'Crazy Deals')]")
	WebElement CrazyDealsNav;
	
	@FindBy(xpath = "//ul[@class='nav navbar-nav']//li[2]/a[1]")
	WebElement SupplementsNav;
	
	@FindBy(xpath = "//a[@class='js-ga-event'][contains(text(),'Essential Oils')]")
	WebElement EssentialOilsNav;
	
	@FindBy(xpath = "//a[@class='js-ga-event'][contains(text(),'Herbs')]")
	WebElement HerbsNav;
	
	@FindBy(xpath = "//a[@class='js-ga-event'][contains(text(),'Nuts & Seeds')]")
	WebElement NutsSeedsNav;
	
	@FindBy(xpath = "//strong[contains(text(),'Rewards')]")
	WebElement RewardsNav;
	
	@FindBy(xpath = "//div[@class='pp-breadcrumb notranslate']")
	WebElement BreadCrumb;
	
	@FindBy(xpath = "//button[@class='btn-cart-add pp-page__btn-cart-add notranslate']")
	WebElement AddToCartBtn;
	
	@FindBy(xpath = "//input[@id='search-box']")
	WebElement SearchProductsField;
	
	@FindBy(xpath = "//input[@id='search-submit']")
	WebElement SearchSubmitButton;
	
	@FindBy(xpath = "//span[@id='logo-header']")
	WebElement PipingRockLogoHeader;
	
	@FindBy (xpath = "//a[@class='notranslate js-share share-panel js-ga-event']")
	WebElement ShareCartLink;
	
	@FindBy (xpath = "//button[@id='copy-button']")
	WebElement ShareCopyBtn;
	
	@FindBy (xpath = "//input[@id='rewardLink']")
	WebElement ShareURLInput;
	
	@FindBy (xpath = "//input[@id='shorten']")
	WebElement ShortenURLCheckbox;
	
	@FindBy (xpath = "//div[@class='banner-banner']//a/span[1]")
	WebElement HomePageBannerSize;
	
	@FindBy (xpath = "//ul[@class='shop-cat-list']//li[1]/a[1]")
	WebElement ShopAllCategories;
	
	/* Get Methods for WebElements */
	
	public WebElement getPipingRockLogoHeader()
	{
		return PipingRockLogoHeader;
	}
	
	public WebElement getLogInBtn()
	{
		return LogInBtn;
	}
	
	public WebElement getLogOutBtn()
	{
		return LogOutBtn;
	}
	
	public WebElement getCheckoutBtn()
	{
		return CheckoutBtn;
	}
	
	public WebElement getCrazyDealsNav()
	{
		return CrazyDealsNav;
	}
	
	public WebElement getSupplementsNav()
	{
		return SupplementsNav;
	}
	
	public WebElement getEssentialOilsNav()
	{
		return EssentialOilsNav;
	}
	
	public WebElement getHerbsNav()
	{
		return HerbsNav;
	}
	
	public WebElement getNutsSeedsNav()
	{
		return NutsSeedsNav;
	}
	
	public WebElement getRewardsNav()
	{
		return RewardsNav;
	}
	
	public WebElement getBreadCrumb()
	{
		return BreadCrumb;
	}
	
	public WebElement getAddToCartBtn()
	{
		return AddToCartBtn;
	}
	
	public WebElement getSearchProductsField()
	{
		return SearchProductsField;
	}
	
	public WebElement getSearchSubmitButton()
	{
		return SearchSubmitButton;
	}
	
	public WebElement getShareCartLink()
	{
		return ShareCartLink;
	}
	
	public WebElement getShareCopyBtn()
	{
		return ShareCopyBtn;
	}
	
	public WebElement getShareURLInput()
	{
		return ShareURLInput;
	}
	
	public WebElement getShortenURLCheckbox()
	{
		return ShortenURLCheckbox;
	}
	
	public WebElement getHomePageBannerSize()
	{
		return HomePageBannerSize;
	}
	
	public WebElement getShopAllCategories()
	{
		return ShopAllCategories;
	}

}

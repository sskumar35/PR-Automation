package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	//private WebDriver driver;

		/* Constructor to Initialize all WebElements */
		public ShoppingCartPage (WebDriver driver) {
			//this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(xpath = "//a[@class='notranslate btn btn-success-bg btn-lg btn-block no-underline']")
		WebElement ContinueShoppingBtn;
				
		@FindBy(xpath = "//a[@id='search-bar-checkout-btn']")
		WebElement CheckoutBtn;
		
		@FindBy (xpath = "//div[@class='row rewards-code']//input[@class='form-control']")
		WebElement RewardsCodeInputField;
		
		@FindBy(xpath = "//input[@class='btn btn-default-st-bg font-bold']")
		WebElement RewardsApplyBtn;
		
		@FindBy (xpath = "//div[@class='user-messages-wrap']")
		WebElement InvalidRewardsCodeUserMessage;
		
		@FindBy (xpath = "//a[@class='user-message-close']")
		WebElement CloseUserMessage;
		
		@FindBy (xpath = "//table[@class='paypal-checkout btn btn-lg btn-default-st-bg font-bold']")
		WebElement CheckoutOutPayPalBtn;
		
		//@FindBy (xpath = "//a[@class='notranslate js-share-my-cart share-cart-panel']")
		@FindBy (xpath = "//a[@class='notranslate js-share share-panel js-ga-event']")
		WebElement ShareCartLink;

		@FindBy (xpath = "//a[@class='js-country-suggested-top']")
		WebElement ChangeLinkInShippingEstimator;
		
		@FindBy (xpath = "//input[@class='js-qty only-integers-input']")
		WebElement ItemQuantityField;
		
		@FindBy (xpath = "//span[@class='primary-link update-link js-update-link']")
		WebElement ItemUpdateLink;
		
		@FindBy (xpath = "//input[@class='page-cart__btn-cart-remove js-remove-item']")
		WebElement RemoveItemLink;
		
		@FindBy (xpath = "//div[@class='user-message success align-left']")
		WebElement UserMessageAfterRemovingFromCart;
		
		@FindBy (xpath = "//div[@id='pr-window-f-content']//div[@class='generate-share-cart']//table[@style='display: table;']//tbody//tr[@class='share-url']//td[@class='input-url']//a[@id='copy-button']")
		WebElement CopyLinkInShareYourCart;
		
		@FindBy (xpath = "//html//div[@class='col-xs-46 js-order-stick co-order-total']//div[3]")
		WebElement DiscountInCartSummaryPanel;
		
		@FindBy (xpath = "//div[@class='user-messages-wrap']")
		WebElement DiscountUserMessage;
		
		@FindBy (xpath = "//input[@id='zip-code-to-estimate']")
		WebElement ZipCodeField;
		
		@FindBy (xpath = "//input[@class='btn btn-block btn-default-st-bg unbold zip-code-to-estimate-btn']")
		WebElement ZipCodeCalculate;
		
		@FindBy (xpath = "//html//div[@class='shipping-estimator']//div[2]")
		WebElement ZipCodeSection;
		
		@FindBy (xpath = "//html//div[@id='js-cart-right-side']//div[4]")
		WebElement TaxSectionInCartSummary;
		
		@FindBy (xpath = "(//div[@class='row'])[8]")
		WebElement ShippingSectionInCartSummary;
		
		@FindBy (xpath = "//a[@id='pr-window-f-close']")
		WebElement ShareCartClose;
		
		@FindBy (xpath = "//div[@class='banner-banner banner-banner-full-main']//a/span[1]")
		WebElement CartPageBannerSize;
		
		/* Get Methods for WebElements */
		
		public WebElement getContinueShoppingBtn()
		{
			return ContinueShoppingBtn;
		}
		
		public WebElement getCheckoutBtn()
		{
			return CheckoutBtn;
		}
		
		public WebElement getRewardsCodeInputField()
		{
			return RewardsCodeInputField;
		}
		
		public WebElement getRewardsApplyBtn()
		{
			return RewardsApplyBtn;
		}
		
		public WebElement getInvalidRewardsCodeUserMessage()
		{
			return InvalidRewardsCodeUserMessage;
		}
		
		public WebElement getCloseUserMessage()
		{
			return CloseUserMessage;
		}
		
		public WebElement getCheckoutOutPayPalBtn()
		{
			return CheckoutOutPayPalBtn;
		}
		
		public WebElement getShareCartLink()
		{
			return ShareCartLink;
		}
		
		public WebElement getChangeLinkInShippingEstimator()
		{
			return ChangeLinkInShippingEstimator;
		}
		
		public WebElement getItemQuantityField()
		{
			return ItemQuantityField;
		}
		
		public WebElement getItemUpdateLink()
		{
			return ItemUpdateLink;
		}
		
		public WebElement getRemoveItemLink()
		{
			return RemoveItemLink;
		}
		
		public WebElement getUserMessageAfterRemovingFromCart()
		{
			return UserMessageAfterRemovingFromCart;
		}
		
		public WebElement getCopyLinkInShareYourCart()
		{
			return CopyLinkInShareYourCart;
		}
		
		public WebElement getDiscountInCartSummaryPanel()
		{
			return DiscountInCartSummaryPanel;
		}
		
		public WebElement getDiscountUserMessage()
		{
			return DiscountUserMessage;
		}
		
		public WebElement getZipCodeField()
		{
			return ZipCodeField;
		}
		
		public WebElement getZipCodeCalculate()
		{
			return ZipCodeCalculate;
		}
		
		public WebElement getZipCodeSection()
		{
			return ZipCodeSection;
		}
		
		public WebElement getTaxSectionInCartSummary()
		{
			return TaxSectionInCartSummary;
		}
		
		public WebElement getShippingSectionInCartSummary()
		{
			return ShippingSectionInCartSummary;
		}
		
		public WebElement getShareCartClose()
		{
			return ShareCartClose;
		}
		
		public WebElement getCartPageBannerSize()
		{
			return CartPageBannerSize;
		}
		
}

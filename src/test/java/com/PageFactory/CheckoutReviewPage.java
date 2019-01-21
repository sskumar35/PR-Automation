package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutReviewPage {

	public CheckoutReviewPage (WebDriver driver) {
		
		/* Constructor to Initialize all WebElements */
		
		PageFactory.initElements(driver, this);
	}
	/*REVIEW SHIPPING ADDRESS SECTION */
	
	@FindBy(xpath = "//a[contains(text(),'SHIPPING ADDRESS')]")
    WebElement ShippingAddressInContainer;
	
	@FindBy(xpath = "//a[contains(text(),'BILLING & PAYMENT')]")
    WebElement BillingAndPaymentInContainer;
	
	@FindBy(xpath = "//a[@class='btn-primary-bg js-return-cart'][text()='Return to Cart']")
    WebElement ReturnToCartFromCheckout;
	
	@FindBy(xpath = "//td[@class='logo-img']")
    WebElement PipingRockImageInCheckout;
	
	@FindBy(xpath = "//H3[@class='panel-title collapse in'][text()='Shipping Address']")
    WebElement ShippingAddressSection;
	
	@FindBy(linkText = "Change")
    WebElement ChangeShippingAddressLink;
	
	@FindBy(xpath = "//a[@class='pull-right primary-link js-collapse-link co-close-info']")
    WebElement CancelChoosingShippingAddress;
	
	@FindBy(xpath = "//a[@class='primary-link js-modal-address'][contains(text(),'+ Add New Shipping Address')]")
    WebElement AddNewShippingAddressLink;
	
	@FindBy(xpath = "//html//div[@class='col-xs-46 js-shipping-address-container']//button[1]")
    WebElement UseThisShippingAddressButton;
	
	/*REVIEW PAYMENT METHOD SECTION */
	
	@FindBy(xpath = "//h3[@class='panel-title'][contains(text(),'Payment Method')]")
    WebElement PaymentMethodSection;
	
	@FindBy(xpath = "//div[@class='panel-body js-default-payment-method js-step']//div[@class='js-current-cc']//table[@width='100%']//tbody//tr//td[@rowspan='2']//a[@class='primary-link js-change-payment js-edit-mode-link']")
    WebElement ChangePaymentMethodLink;
	
	@FindBy(linkText = "+ Add a payment method")
    WebElement AddNewPaymentMethodLink;
	
	@FindBy(xpath = "//div[@class='collapse in co-all-cards-box']//div[@class='col-xs-46 panel-buttons']//button[@type='button']")
    WebElement UseThisPaymentMethodButton;
	
	@FindBy(xpath = "//div[@class='panel-body js-default-payment-method js-step']//div[@class='js-current-cc']//div[contains(@class,'js-cc-assigned-billing word-wrap')]//a[@class='primary-link js-change-billing js-address-current js-billing-address-link']")
    WebElement BillingAddressLink;
	
	@FindBy(xpath = "//a[@class='primary-link js-modal-address'][contains(text(),'+ Add New Billing Address')]")
    WebElement AddNewBillingAddressLink;
	
	@FindBy(xpath = "//html//div[@class='col-xs-46 js-billing-address-container js-step']//button[2]")
    WebElement CancelChoosingBillingAddress;
	
	@FindBy(xpath = "//html//div[@class='col-xs-46 js-billing-address-container js-step']//button[1]")
    WebElement UseThisBillingAddressButton;
	
	/*REVIEW SHIPPING METHOD SECTION */
	
	@FindBy(xpath = "//div[@class='panel panel-default co-panel co-shipping-method']//div[@class='panel-heading']//h3[@class='panel-title collapse in']")
    WebElement ShippingMethodSection;
	
	@FindBy(xpath = "//span[contains(@class,'black-bullet')][contains(text(),'Standard')]")
    WebElement ChooseStandardDelivery;
	
	@FindBy(xpath = "//span[contains(@class,'black-bullet')][contains(text(),'2nd Day Air')]")
    WebElement Choose2ndDayAirDelivery;
	
	@FindBy(xpath = "//span[contains(@class,'black-bullet')][contains(text(),'Next Day Air')]")
    WebElement ChooseNextDayDelivery;
	
	/*REVIEW ORDER SUMMARY SECTION */
	
	@FindBy(xpath = "//div[@class='panel panel-default co-prod-box co-panel']//div[@class='panel-heading']//h3[@class='panel-title collapse in']")
    WebElement OrderSummarySection;
	
	@FindBy(xpath = "//div[@class='col-xs-23'][contains(text(),'Items')]")
    WebElement ItemsTitleOrderSummarySection;
	
	@FindBy(xpath = "//div[@class='col-xs-9 text-center']")
    WebElement PriceTitleOrderSummarySection;
	
	@FindBy(xpath = "//div[@class='col-xs-8 text-left']")
    WebElement QuantityTitleOrderSummarySection;
	
	@FindBy(xpath = "//div[@class='col-xs-6 text-center']")
    WebElement SubtotalTitleOrderSummarySection;
	
	@FindBy(xpath = "//td[@width='60%']//div[@class='co-place-order-btn js-place-order-text']//button[@type='button']")
    WebElement PlaceOrderButton;
	
	/*REVIEW ORDER SUMMARY RIGHT SIDE SECTION */
	
	@FindBy(xpath = "//div[@class='panel panel-default co-order-total co-panel js-order-stick co-stick']//div[@class='panel-heading']")
    WebElement OrderSummarySectionRightSide;
	
	@FindBy(xpath = "//html//div[@class='col-xs-12']//div[@class='panel-body']/div[1]")
    WebElement SubtotalOrderSummarySectionRightSide;
	
	@FindBy(xpath = "//div[@class='pull-left'][contains(text(),'Shipping')]")
    WebElement ShippingCost;
	
	@FindBy(xpath = "//div[@class='pull-left']//b[contains(text(),'Order Total:')]")
    WebElement OrderTotal;
	
	@FindBy(xpath = "//div[@class='co-place-order-btn js-place-order-text']//button[@type='button']")
    WebElement PlaceOrderButtonRightSide;
	
	/* Product Restrictions */
	
	/* Total Product Restrictions */
	
	@FindBy(xpath = "//h4[@class='modal-title text-center']")
    WebElement ModalTitleTextCenter;
	
	@FindBy(xpath = "//div[@id='COUNTRY_QUANTITY_TOTAL']//div[@class='modal-dialog']//div[@class='modal-content']//div[@class='modal-header']//button[@type='button']//span[@aria-hidden='true']")
    WebElement ModalDismissCloseIcon;
	
	@FindBy(xpath = "//button[@type='button'][contains(text(),'Continue Checkout')]")
    WebElement ContinurCheckoutBtn;
	
	//@FindBy(xpath = "//div[@id='COUNTRY_QUANTITY_TOTAL']//div[@class='modal-dialog']//div[@class='modal-content']//div[@class='modal-body']")
	@FindBy(xpath = "//div[@id='COUNTRY_QUANTITY_TOTAL']//div[@class='modal-body']")
    WebElement ModalBody;
	
	 @FindBy(xpath = "//div[contains(@id, 'cart-plist-')]//div[@class='restriction-item']//div[@class='col-xs-46']")
     WebElement ErrorMessageInOrderSummary;
	 
	 /* Maximum Qty Restrictions */
	 
	 @FindBy(xpath = "//input[@id='quantity']")
     WebElement QtyInOrderSummary;
	
	 /* Prop 65 Restrictions */
	 
	 @FindBy(xpath = "//div[@class='modal-dialog modal-lg']//div[@class='modal-content']//div[@class='modal-header']//button[@type='button']//span[@aria-hidden='true']")
	 WebElement ModalDismissCloseIconForProp65;
	 
	 @FindBy(xpath = "//div[@class='modal-dialog modal-lg']//div[@class='modal-content']//div[@class='modal-body text-left']")
	 WebElement ModalBodyForProp65;
	 
	 @FindBy(xpath = "//button[@type='button'][contains(text(),'I Accept')]")
	 WebElement IAcceptBtnForProp65;
	 
	 @FindBy(xpath = "//div[@class='prop65-error']")
	 WebElement Prop65ErrorMessageInOrderSummary;
	 
	 @FindBy(xpath = "//input[@id='am-accept-p65']")
	 WebElement IAcceptInOrderSummary;
	 
	/* Get Methods for WebElements */
	
	public WebElement getShippingAddressInContainer()
	{
		return ShippingAddressInContainer;
	}
	
	public WebElement getBillingAndPaymentInContainer()
	{
		return BillingAndPaymentInContainer;
	}
	
	public WebElement getReturnToCartFromCheckout()
	{
		return ReturnToCartFromCheckout;
	}
	
	public WebElement getPipingRockImageInCheckout()
	{
		return PipingRockImageInCheckout;
	}
    
    public WebElement getShippingAddressSection()
		{
			return ShippingAddressSection;
		}
    
    public WebElement getChangeShippingAddressLink()
	{
		return ChangeShippingAddressLink;
	}
    
    public WebElement getCancelChoosingShippingAddress()
	{
		return CancelChoosingShippingAddress;
	}
    
    public WebElement getAddNewShippingAddressLink()
	{
		return AddNewShippingAddressLink;
	}
    
    public WebElement getUseThisShippingAddressButton()
	{
		return UseThisShippingAddressButton;
	}
    
    public WebElement getPaymentMethodSection()
	{
		return PaymentMethodSection;
	}

    public WebElement getChangePaymentMethodLink()
	{
		return ChangePaymentMethodLink;
	}
    
    public WebElement getAddNewPaymentMethodLink()
	{
		return AddNewPaymentMethodLink;
	}
    
    public WebElement getUseThisPaymentMethodButton()
	{
		return UseThisPaymentMethodButton;
	}
    public WebElement getBillingAddressLink()
	{
		return BillingAddressLink;
	}
    
    public WebElement getAddNewBillingAddressLink()
	{
		return AddNewBillingAddressLink;
	}
    
    public WebElement getCancelChoosingBillingAddress()
	{
		return CancelChoosingBillingAddress;
	}
    
    public WebElement getUseThisBillingAddressButton()
	{
		return UseThisBillingAddressButton;
	}
    public WebElement getShippingMethodSection()
	{
		return ShippingMethodSection;
	}
    
    public WebElement getChooseStandardDelivery()
	{
		return ChooseStandardDelivery;
	}
    
    public WebElement getChoose2ndDayAirDelivery()
	{
		return Choose2ndDayAirDelivery;
	}
    
    public WebElement getChooseNextDayDelivery()
	{
		return ChooseNextDayDelivery;
	}
    
    public WebElement getOrderSummarySection()
	{
		return OrderSummarySection;
	}
    
    public WebElement getPriceTitleOrderSummarySection()
	{
		return PriceTitleOrderSummarySection;
	}
    
    public WebElement getItemsTitleOrderSummarySection()
	{
		return ItemsTitleOrderSummarySection;
	}
    
    public WebElement getSubtotalTitleOrderSummarySection()
	{
		return SubtotalTitleOrderSummarySection;
	}
    
    public WebElement getQuantityTitleOrderSummarySection()
	{
		return QuantityTitleOrderSummarySection;
	}
    
    public WebElement getPlaceOrderButton()
	{
		return PlaceOrderButton;
	}
    
    public WebElement getOrderSummarySectionRightSide()
	{
		return OrderSummarySectionRightSide;
	}
    
    public WebElement getShippingCost()
	{
		return ShippingCost;
	}
    
    public WebElement getOrderTotal()
	{
		return OrderTotal;
	}
    
    public WebElement getSubtotalOrderSummarySectionRightSide()
	{
		return SubtotalOrderSummarySectionRightSide;
	}
    public WebElement getPlaceOrderButtonRightSide()
	{
		return PlaceOrderButtonRightSide;
	}
    
    /* Product Restrictions */
	
	/* Total Product Restrictions */
	
	public WebElement getModalTitleTextCenter()
	{
		return ModalTitleTextCenter;
	}
	
	public WebElement getModalDismissCloseIcon()
	{
		return ModalDismissCloseIcon;
	}
	
	public WebElement getContinurCheckoutBtn()
	{
		return ContinurCheckoutBtn;
	}
	
	public WebElement getModalBody()
	{
		return ModalBody;
	}
	
	public WebElement getErrorMessageInOrderSummary()
	{
		return ErrorMessageInOrderSummary;
	}
	
	public WebElement getQtyInOrderSummary()
	{
		return QtyInOrderSummary;
	}
	
	/* Prop 65 Restrictions */
	
	public WebElement getModalDismissCloseIconForProp65()
	{
		return ModalDismissCloseIconForProp65;
	}
	
	public WebElement getModalBodyForProp65()
	{
		return ModalBodyForProp65;
	}
	
	public WebElement getIAcceptBtnForProp65()
	{
		return IAcceptBtnForProp65;
	}
	
	public WebElement getProp65ErrorMessageInOrderSummary()
	{
		return Prop65ErrorMessageInOrderSummary;
	}
	
	public WebElement getIAcceptInOrderSummary()
	{
		return IAcceptInOrderSummary;
	}
    
    }
    
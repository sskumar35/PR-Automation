package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutConfirmationPage {
	
	public CheckoutConfirmationPage(WebDriver driver) {
		/* Constructor to Initialize all WebElements */
		PageFactory.initElements(driver, this);
	}

    @FindBy(xpath="//*[@id=\"gcr-logo\"]")
    WebElement GoogleCustomerReviewsPopup;
    
    @FindBy(xpath="/html/body/c-wiz/div/div/div[2]/div[4]/span[1]/div/content/span")
    WebElement GoogleCustomerReviewsPopupClose;
    
    @FindBy(xpath="//h1[@class='pull-left']")
    WebElement OrderConfirmationSection;
    
    @FindBy(xpath="///h3[@class='panel-title'][contains(text(),'Shipping Details')]")
    WebElement ShippingDetailSection;
    
    @FindBy(xpath="//h3[@class='panel-title'][contains(text(),'Payment Details')]")
    WebElement PaymentDetailSection;
    
    @FindBy(xpath="//h3[@class='panel-title'][contains(text(),'Order Summary')]")
    WebElement OrderSummarySection;
    
    @FindBy(xpath="//a[@id='referandearn']")
    WebElement ReferAndEarnSection;
    
    /* Get Methods for WebElements */
    
    public WebElement getGoogleCustomerReviewsPopup() 
    {
    	
    	return GoogleCustomerReviewsPopup;
    }
    
    public WebElement getGoogleCustomerReviewsPopupCLose() 
    {
    	
    	return GoogleCustomerReviewsPopupClose;
    }
    
    
    public WebElement getOrderConfirmationSection() 
    {
    	
    	return OrderConfirmationSection;
    }
    
    public WebElement getShippingDetailSection() 
    {
    	
    	return ShippingDetailSection;
    }
    
    public WebElement getPaymentDetailSection() 
    {
    	
    	return PaymentDetailSection;
    }
    
    public WebElement getOrderSummarySection() 
    {
    	
    	return OrderSummarySection;
    }
    
    public WebElement getReferAndEarnSection() 
    {
    	
    	return ReferAndEarnSection;
    }
}    
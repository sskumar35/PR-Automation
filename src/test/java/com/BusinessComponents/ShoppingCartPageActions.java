package com.BusinessComponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.PageFactory.ModalPopUpHandler;
import com.PageFactory.ShoppingCartPage;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class ShoppingCartPageActions extends CommonUtils {
	
	static ShoppingCartPage ShoppingCartPage = PageFactory.initElements(driver, ShoppingCartPage.class);
	static ModalPopUpHandler handlerActions = PageFactory.initElements(driver, ModalPopUpHandler.class);
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void ClickContinueShoppingButton() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Continue Shopping Button Is Found");				
			ShoppingCartPage.getContinueShoppingBtn().click();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Continue Shopping Button Is Not Found" + e);
		}			
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void ClickCheckoutButton() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Checkout Button Is Found");				
			ShoppingCartPage.getCheckoutBtn().click();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Checkout Button Is Not Found" + e);
		}			
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void TypeRewardsCode(String code) throws Exception{
		try {			
			TestLogger.testLoggerInfo("Rewards Code Field Is Found");				
			ShoppingCartPage.getRewardsCodeInputField().sendKeys(code);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Rewards Code Field Is Not Found" + e);
		}			
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void ClickApplyButton() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Rewards Code Button Is Found");				
			ShoppingCartPage.getRewardsApplyBtn().click();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Rewards Code Button Is Not Found" + e);
		}			
	}
	
	/**
	 * 
	 * @return 
	 * @throws Exception
	 */

	public static String GetInvalidRewardsCodeErrorMessage() throws Exception{
		String errorMessage = null;
		try {			
			TestLogger.testLoggerInfo("Invalid Rewards Code Error Msg Is Found");
			errorMessage = ShoppingCartPage.getInvalidRewardsCodeUserMessage().getText();
			Thread.sleep(2000);
			ShoppingCartPage.getCloseUserMessage().click();	
			Thread.sleep(2000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Invalid Rewards Code Error Msg Is Not Found" + e);
		}
		return errorMessage;
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void ClickCheckoutWithPayPalBtn() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Checkout with PayPal Button Is Found");				
			ShoppingCartPage.getCheckoutOutPayPalBtn().click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Checkout with PayPal Button Is Not Found" + e);
		}			
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void ClickShareCartLink() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Share Link Is Found");				
			ShoppingCartPage.getShareCartLink().click();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Share Link Is Not Found" + e);
		}			
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void HandleShareCartWindow() throws Exception{
		//String shareCartTitle = null;
		try {			
			TestLogger.testLoggerInfo("Share Your Cart Window Is Found");				
			//shareCartTitle = handlerActions.getShareYourCartWindow().getText();
			Thread.sleep(2000);
			handlerActions.getShareYourCartWindowClose().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Share Your Cart Window Is Not Found" + e);
		}
		//return shareCartTitle;			
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void ClickChangeLink() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Change Link In Shipping Estimator Is Found");
			ShoppingCartPage.getChangeLinkInShippingEstimator().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Change Link In Shipping Estimator Is Found" + e);
		}			
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static String ModalSuggestedWindowHeader() throws Exception{
		String modalHeaderTitle= null;
		try {			
			TestLogger.testLoggerInfo("Modal Suggested Window Is Opened");
			modalHeaderTitle = handlerActions.getModalSuggestedHeader().getText();
			Thread.sleep(2000);
			handlerActions.getModalSuggestedWindowClose().click();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Modal Suggested Window Is Not Opened" + e);
		}
		return modalHeaderTitle;			
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void SetItemQuantityField(Integer itemVal) throws Exception{
		try {			
			TestLogger.testLoggerInfo("Item Quantity Field Is Found");
			ShoppingCartPage.getItemQuantityField().clear();
			ShoppingCartPage.getItemQuantityField().sendKeys(String.valueOf(itemVal));
			Thread.sleep(2000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Item Quantity Field Is Not Found" + e);
		}
				
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void SetItemQtyField(String itemVal) throws Exception{
		try {			
			TestLogger.testLoggerInfo("Item Quantity Field Is Found");			
			ShoppingCartPage.getItemQuantityField().sendKeys(String.valueOf(itemVal));
			Thread.sleep(2000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Item Quantity Field Is Not Found" + e);
		}
				
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void SetItemQuantityFieldToZero() throws Exception{
		try {
			Integer itemVal = 0;
			TestLogger.testLoggerInfo("Item Quantity Field Is Found");
			ShoppingCartPage.getItemQuantityField().clear();
			ShoppingCartPage.getItemQuantityField().sendKeys(String.valueOf(itemVal));
			ShoppingCartPage.getItemQuantityField().sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Item Quantity Field Is Not Found" + e);
		}
				
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static String GetItemQuantityField() throws Exception{
		String itemQtyVal = null;
		try {			
			TestLogger.testLoggerInfo("Item Quantity Field Is Found");
			itemQtyVal= ShoppingCartPage.getItemQuantityField().getAttribute("data-qty");
			Thread.sleep(2000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Item Quantity Field Is Not Found" + e);
		}
		return itemQtyVal;				
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void ClickUpdateLink() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Update Link Is Found");
			ShoppingCartPage.getItemUpdateLink().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Update Link Is Found" + e);
		}		
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void ClickRemoveLink() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Remove Item Link Is Found");
			ShoppingCartPage.getRemoveItemLink().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Remove Item Link Is Found" + e);
		}		
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static String GetRemoveItemHeader() throws Exception{
		String HeaderText = null;
		try {			
			TestLogger.testLoggerInfo("Remove From Cart Modal Is Found");
			HeaderText = handlerActions.getRemoveItemModalHeader().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Remove From Cart Modal Is Found" + e);
		}
		return HeaderText;		
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void ClickRemoveModalClose() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Remove From Cart Modal Close Icon Is Found");
			handlerActions.getRemoveItemModalHeaderClose().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Remove From Cart Modal Close Icon Is Found" + e);
		}		
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void ConfirmRemoveItem() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Yes Button in Remove Cart Modal Is Found");
			handlerActions.getRemoveItemModalConfirm().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Yes Button in Remove Cart Modal Is Not Found" + e);
		}		
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void DeclineRemoveItem() throws Exception{
		try {			
			TestLogger.testLoggerInfo("No Button in Remove Cart Modal Is Found");
			handlerActions.getRemoveItemModalDecline().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("No Button in Remove Cart Modal Is Not Found" + e);
		}		
	}
	
	/**
	 * 
	 * @return 
	 * @throws Exception
	 */

	public static String GetUserMessageAfterRemovingFromCart() throws Exception{
		String UserMsg = null;
		try {			
			TestLogger.testLoggerInfo("User Message After Removing From Cart Is Found");
			UserMsg = ShoppingCartPage.getUserMessageAfterRemovingFromCart().getText();
			Thread.sleep(1000);
			ShoppingCartPage.getCloseUserMessage().click();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("User Message After Removing From Cart Is Not Found" + e);
		}
		return UserMsg;
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static String CopyLinkInShareCart() throws Exception{
		String itemQtyVal = null;
		try {			
			TestLogger.testLoggerInfo("Copy Button In Share Your Cart Is Found");
			itemQtyVal= ShoppingCartPage.getCopyLinkInShareYourCart().getAttribute("data-clipboard-text");
			Thread.sleep(2000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Copy Button In Share Your Cart Is Not Found" + e);
		}
		return itemQtyVal;				
	}
	
	/**
	 * 
	 * @return 
	 * @throws Exception
	 */

	public static String GetCartSummaryDiscountValue() throws Exception{
		String errorMessage = null;
		try {			
			TestLogger.testLoggerInfo("Discount In Cart Summary Is Found");
			errorMessage = ShoppingCartPage.getDiscountInCartSummaryPanel().getText();
			Thread.sleep(2000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Discount In Cart Summary Is Not Found" + e);
		}
		return errorMessage;
	}
	
	/**
	 * 
	 * @return 
	 * @throws Exception
	 */

	public static String GetUserMessageForNewCustomerDiscount() throws Exception{
		String errorMessage = null;
		try {			
			TestLogger.testLoggerInfo("New Customer Discount Message Is Found");
			errorMessage = ShoppingCartPage.getDiscountUserMessage().getText();
			Thread.sleep(2000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("New Customer Discount Message Is Not Found" + e);
		}
		return errorMessage;
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void SelectCountryDropDownInModalWindow() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Country Drop Down In Modal Windows Is Found");
			handlerActions.getSelectCountryDropDownInModal().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Country Drop Down In Modal Windows Is Found" + e);
		}		
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void SearchCountryDropDownInModalWindow(String CountryName) throws Exception{
		try {			
			TestLogger.testLoggerInfo("Search Field In Country Drop Down In Modal Windows Is Found");
			handlerActions.getSearchCountryInModal().sendKeys(CountryName);
			handlerActions.getSearchCountryInModal().sendKeys(Keys.ENTER);
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Search Field In Country Drop Down In Modal Windows Is Not Found" + e);
		}		
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void EnterZipCodeField(String ZipCode) throws Exception{
		try {			
			TestLogger.testLoggerInfo("Zip Code Field Is Found");
			ShoppingCartPage.getZipCodeField().clear();
			ShoppingCartPage.getZipCodeField().sendKeys(ZipCode);			
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Zip Code Field Is Not Found" + e);
		}		
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void ClickZipCodeCalculate() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Calculate Button Is Found");
			ShoppingCartPage.getZipCodeCalculate().click();			
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Calculate Button Is Not Found" + e);
		}		
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static String GetZipCode() throws Exception{
		String codeVal = null;
		try {			
			TestLogger.testLoggerInfo("Zip Code Field Is Found With Prepopulated Zip Code");
			codeVal = ShoppingCartPage.getZipCodeField().getAttribute("value");
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Zip Code Field Is Not Found With Prepopulated Zip Code" + e);
		}
		return codeVal;		
	}
	
	/**
	 * 
	 * @return 
	 * @throws Exception
	 */

	public static Boolean IsZipCodeSectionPresent() throws Exception{
		Boolean isPresent = null;
		try {
			isPresent = driver.findElements(By.xpath("//html//div[@class='shipping-estimator']//div[2]")).size() > 0;
			if (isPresent) {
				TestLogger.testLoggerInfo("Zip Code Field Is Present");
			}
			else {
				TestLogger.testLoggerInfo("Zip Code Field Is Not Present");
			}	
		} catch (Exception e) {
			
		}
		return isPresent;			
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void SelectLanguageDropDownInModalWindow() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Country Drop Down In Modal Windows Is Found");
			handlerActions.getSelectLanguageDropDownInModal().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Country Drop Down In Modal Windows Is Found" + e);
		}		
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void SearchLanguageDropDownInModalWindow(String Language) throws Exception{
		try {			
			TestLogger.testLoggerInfo("Search Field In Country Drop Down In Modal Windows Is Found");
			handlerActions.getSearchCountryInModal().sendKeys(Language);
			handlerActions.getSearchCountryInModal().sendKeys(Keys.ENTER);
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Search Field In Country Drop Down In Modal Windows Is Not Found" + e);
		}		
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static Boolean IsTextPresentInCurrentPageSource(String TestString) throws Exception{
		Boolean checkText = null;
		try {			
			TestLogger.testLoggerInfo("Test String Is Found In Page Source");
			checkText = driver.getPageSource().contains(TestString);			
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Test String Is Not Found In Page Source" + e);
		}
		return checkText;		
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static String GetTaxSectionInCartSummary() throws Exception{
		String taxVal = null;
		try {			
			TestLogger.testLoggerInfo("Tax Row Value Is Found");
			taxVal = ShoppingCartPage.getTaxSectionInCartSummary().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Tax Row Value Is Found" + e);
		}
		return taxVal;		
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static String GetShippingSectionInCartSummary() throws Exception{
		String shipVal = null;
		try {			
			TestLogger.testLoggerInfo("Shipping Row Value Is Found");
			shipVal = ShoppingCartPage.getShippingSectionInCartSummary().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Shipping Row Value Is Found" + e);
		}
		return shipVal;		
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static void ClickShareCartCloseInShareCartWindow() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Share Cart Close Option In Share Cart Window Is Found");				
			ShoppingCartPage.getShareCartClose().click();
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Share Cart Close Option In Share Cart Window Is Found" + e);
		}			
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static String GetCartPageBannerSize() throws Exception{
		String bannerSize = null;
		try {			
			TestLogger.testLoggerInfo("Banner In Shopping Cart Page Is Found");
			Thread.sleep(1000);
			bannerSize = ShoppingCartPage.getCartPageBannerSize().getAttribute("class");
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Banner In Shopping Cart Page Is Not Found" + e);
		}
		return bannerSize;
	}
	
	/**
	 * 
	 * @throws Exception
	 */

	public static String GetHurryTextInBanner() throws Exception{
		String bannerSize = null;
		try {			
			TestLogger.testLoggerInfo("Hurry Up Text In Banner Inside Shopping Cart Page Is Found");
			Thread.sleep(1000);
			bannerSize = ShoppingCartPage.getCartPageBannerSize().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Hurry Up Text In Banner Inside Shopping Cart Page Is Not Found" + e);
		}
		return bannerSize;
	}
	
}

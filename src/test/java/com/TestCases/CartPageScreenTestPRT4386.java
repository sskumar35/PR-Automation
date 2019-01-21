package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;
import com.BusinessComponents.*;


public class CartPageScreenTestPRT4386 extends CommonUtils{
	
		@BeforeTest
		public void setUp() throws Exception {
			init();		
		}
		
		@Test (priority=1)
		public void PrerequisteTest() throws Exception{
			try {
				TestLogger.testLoggerTCStart("Prerequiste Test Case");
				String emailAddress = "vishnm.216@gmail.com";
				String password = "1234567890";
				HomePageActions.HandlingModalSuggestedBox();
				Thread.sleep(1000);
				HomePageActions.LoginAction();			
				LoginPageAction.TypeUserEmailAddress(emailAddress);			
				LoginPageAction.TypeUserPassword(password);
				LoginPageAction.clickSignInButton();
				takeSnapShot();
				TestLogger.testLoggerTCEnd("Prerequiste Test Case");
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Prerequiste Test Case FAILS" + e);
			}
		}
		
		@Test (priority=2)
		public void ButtonsAndLinksTest() throws Exception{	
			try {
				TestLogger.testLoggerTCStart("Button and Links Test Case");
				String prodId = "4761";
				String code = "CPU737";
				String codeInvalid = "ASDFGHJKL";
				HomePageActions.SearchForAProduct(prodId);
				HomePageActions.ClickSearchButton();
				String PageTitleBefore = driver.getTitle();				
				HomePageActions.ClickAddToCartButton();
				takeSnapShot();
				ShoppingCartPageActions.ClickContinueShoppingButton();
				String PageTitleAfter = driver.getTitle();
				takeSnapShot();
				Assert.assertEquals(PageTitleBefore, PageTitleAfter);
				HomePageActions.ClickCheckoutButton();
				ShoppingCartPageActions.ClickCheckoutButton();
				takeSnapShot();
				driver.navigate().back();
				ShoppingCartPageActions.TypeRewardsCode(code);
				ShoppingCartPageActions.ClickApplyButton();
				takeSnapShot();
				ShoppingCartPageActions.TypeRewardsCode(codeInvalid);
				ShoppingCartPageActions.ClickApplyButton();
				takeSnapShot();
				String errorMessage = ShoppingCartPageActions.GetInvalidRewardsCodeErrorMessage();
				Assert.assertTrue(errorMessage.contains("Coupon Code \"ASDFGHJKL\" is invalid, please verify."));
				String PageTitleBeforePPChckout = driver.getTitle();				
				ShoppingCartPageActions.ClickCheckoutWithPayPalBtn();
				takeSnapShot();
				driver.navigate().refresh();
				driver.navigate().back();
				driver.navigate().refresh();
				String PageTitleAfterPPChckout = driver.getTitle();
				Assert.assertEquals(PageTitleBeforePPChckout, PageTitleAfterPPChckout);
				ShoppingCartPageActions.ClickShareCartLink();
				takeSnapShot();
				Thread.sleep(3000);
				ShoppingCartPageActions.HandleShareCartWindow();
				Thread.sleep(1000);
				Integer itemVal = 10;
				ShoppingCartPageActions.SetItemQuantityField(itemVal);
				Thread.sleep(1000);
				takeSnapShot();
				ShoppingCartPageActions.ClickUpdateLink();
				takeSnapShot();
				String ItemQtyVal = ShoppingCartPageActions.GetItemQuantityField();
				Assert.assertTrue(ItemQtyVal.contains(String.valueOf(itemVal)));
				ShoppingCartPageActions.ClickRemoveLink();
				takeSnapShot();
				String removeItemModalHeader = ShoppingCartPageActions.GetRemoveItemHeader();				
				ShoppingCartPageActions.ClickRemoveModalClose();
				takeSnapShot();
				Assert.assertTrue(removeItemModalHeader.contains("Remove from Cart"));
				ShoppingCartPageActions.ClickRemoveLink();
				ShoppingCartPageActions.ConfirmRemoveItem();
				TestLogger.testLoggerTCEnd("Button and Links Test Case");
			} catch (Exception e) {
				Assert.fail("Test" + e);
			}			
		}
		
		@Test (priority=3)
		public void UpdateItemQtyTest() throws Exception{	
			try {
				TestLogger.testLoggerTCStart("Update Item Qty Test Case");
				String prodId1 = "4756";
				HomePageActions.SearchForAProduct(prodId1);
				HomePageActions.ClickSearchButton();						
				HomePageActions.ClickAddToCartButton();				
				driver.navigate().refresh();		
				String beforeQtyStr = ShoppingCartPageActions.GetItemQuantityField();
				ShoppingCartPageActions.SetItemQtyField("asdfg");
				ShoppingCartPageActions.ClickUpdateLink();
				takeSnapShot();
				String aftrQtyStr = ShoppingCartPageActions.GetItemQuantityField();
				Assert.assertEquals(beforeQtyStr, aftrQtyStr);
				String beforeQtySym = ShoppingCartPageActions.GetItemQuantityField();
				ShoppingCartPageActions.SetItemQtyField("@#$%^&");
				ShoppingCartPageActions.ClickUpdateLink();
				takeSnapShot();
				String aftrQtySym = ShoppingCartPageActions.GetItemQuantityField();
				Assert.assertEquals(beforeQtySym, aftrQtySym);
				driver.navigate().refresh();
				ShoppingCartPageActions.SetItemQuantityField(12);				
				ShoppingCartPageActions.ClickUpdateLink();
				takeSnapShot();
				String aftrQtyInt = ShoppingCartPageActions.GetItemQuantityField();				
				Assert.assertTrue(aftrQtyInt.contains(String.valueOf(12)));
				ShoppingCartPageActions.ClickRemoveLink();
				ShoppingCartPageActions.ConfirmRemoveItem();
				TestLogger.testLoggerTCEnd("Update Item Qty Test Case");
			} catch (Exception e) {
				Assert.fail("Test" + e);
			}			
		}
		
		@Test (priority=4)
		public void DeleteItemTest() throws Exception{	
			try {
				TestLogger.testLoggerTCStart("Delete Item Test Case");
				String prodId1 = "1150";
				HomePageActions.SearchForAProduct(prodId1);
				HomePageActions.ClickSearchButton();						
				HomePageActions.ClickAddToCartButton();
				driver.navigate().refresh();				
				ShoppingCartPageActions.SetItemQuantityFieldToZero();
				Thread.sleep(1000);
				takeSnapShot();
				ShoppingCartPageActions.DeclineRemoveItem();
				ShoppingCartPageActions.SetItemQuantityFieldToZero();
				takeSnapShot();
				ShoppingCartPageActions.ConfirmRemoveItem();
				String userMessage1 = ShoppingCartPageActions.GetUserMessageAfterRemovingFromCart();
				Thread.sleep(1000);
				Assert.assertTrue(userMessage1.contains("Product #1150 \"Methylcobalamin B-12 (Sublingual)\" has been removed from your Cart"));				
				String prodId2 = "8352";
				HomePageActions.SearchForAProduct(prodId2);
				HomePageActions.ClickSearchButton();						
				HomePageActions.ClickAddToCartButton();	
				driver.navigate().refresh();
				Thread.sleep(2000);
				ShoppingCartPageActions.ClickRemoveLink();
				takeSnapShot();
				ShoppingCartPageActions.ConfirmRemoveItem();
				String userMessage2 = ShoppingCartPageActions.GetUserMessageAfterRemovingFromCart();
				Thread.sleep(1000);
				Assert.assertTrue(userMessage2.contains("Product #8352 \"Amla Fruit (Indian Gooseberry)\" has been removed from your Cart"));				
				TestLogger.testLoggerTCEnd("Delete Item Test Case");
			} catch (Exception e) {
				Assert.fail("Test" + e);
			}			
		}
		
		@Test (priority=5)
		public void ShareCartTest() throws Exception{	
			try {
				TestLogger.testLoggerTCStart("Share Cart Functionality Test Case");
				String prodId1 = "1150";
				HomePageActions.SearchForAProduct(prodId1);
				HomePageActions.ClickSearchButton();						
				HomePageActions.ClickAddToCartButton();
				driver.navigate().refresh();
				ShoppingCartPageActions.ClickShareCartLink();
				Thread.sleep(2000);
				//String ShareCartUrl = ShoppingCartPageActions.CopyLinkInShareCart();
				takeSnapShot();
				//System.out.print("ShareCartUrl" + ShareCartUrl);
				ShoppingCartPageActions.HandleShareCartWindow();
				//ShoppingCartPageActions.ClickShareCartCloseInShareCartWindow();
				ShoppingCartPageActions.ClickRemoveLink();
				ShoppingCartPageActions.ConfirmRemoveItem();
				TestLogger.testLoggerTCEnd("Share Cart Functionality Test Case");
			} catch (Exception e) {
				Assert.fail("Test" + e);
			}			
		}
		
		@Test (priority=6)
		public void RewardsCodeTest() throws Exception{	
			try {
				TestLogger.testLoggerTCStart("Rewards Code TestCase");
				LoginPageAction.UserLogout();
				LoginPageAction.CreateNewUserAcc("test@5as3344534564567890oiytre456789pojk67890ok8iuhjk5498765fgh8.com", "1234567890");
				String prodId = "2881";
				String code = "CPU737";
				HomePageActions.SearchForAProduct(prodId);
				HomePageActions.ClickSearchButton();						
				HomePageActions.ClickAddToCartButton();
				Integer itemVal = 10;
				ShoppingCartPageActions.SetItemQuantityField(itemVal);				
				ShoppingCartPageActions.ClickUpdateLink();
				Thread.sleep(1000);
				ShoppingCartPageActions.TypeRewardsCode(code);
				ShoppingCartPageActions.ClickApplyButton();
				takeSnapShot();
				String DiscoutText = ShoppingCartPageActions.GetCartSummaryDiscountValue();				
				Assert.assertTrue(DiscoutText.contains("Discount"));
				String DiscountUserMsg = ShoppingCartPageActions.GetUserMessageForNewCustomerDiscount();
				System.out.print("DiscountUserMsg: " + DiscountUserMsg);
				Assert.assertTrue(DiscountUserMsg.contains("FIRST-TIME CUSTOMER DISCOUNT: Save $10 USD on orders $40 USD or more OR save $5 USD on orders under $40 USD"));
				ShoppingCartPageActions.ClickRemoveLink();
				ShoppingCartPageActions.ConfirmRemoveItem();
				LoginPageAction.UserLogout();
				TestLogger.testLoggerTCEnd("Rewards Code TestCase");
			} catch (Exception e) {
				Assert.fail("Test" + e);
			}			
		}
		
		/*@Test (priority=1)
		public void ShareFeatureTest() throws Exception{	
			try {
				TestLogger.testLoggerTCStart("Share Feature Test CaseW");
				HomePageActions.HandlingModalSuggestedBox();
				HomePageActions.ClickPipingRockLogoHeader();
				HomePageActions.ClickShareCartLink();
				//String Url = HomePageActions.GetShareURLFromInputBox();
				//System.out.print(Url);
				HomePageActions.PresenceOfSocialShareButton();
				//HomePageActions.ValidateShortenURLCheckBox();
				
				HomePageActions.HandleShareCartWindow();
				
				TestLogger.testLoggerTCEnd("Share Feature Test Case");
			} catch (Exception e) {
				Assert.fail("Test" + e);
			}			
		}*/
		
		@AfterTest
		public void driverClose() {
			closeDriver();
		}
}

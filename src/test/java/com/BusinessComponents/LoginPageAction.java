package com.BusinessComponents;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.PageFactory.LoginPage;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class LoginPageAction extends CommonUtils {
	static LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);	
	
		/**
		 * 
		 * @throws Exception
		 */
 
		public static void TypeUserEmailAddress(String message) throws Exception{
			try {				
				TestLogger.testLoggerInfo("Email Address Field Is Found");				
				loginPage.getEmailAddressInputField().sendKeys(message);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Email Address Field Is Not Found" + e);
			}			
		}
		
		/**
		 * 
		 * @throws Exception
		 */
		
		public static void TypeUserPassword(String message) throws Exception{
			try {				
				TestLogger.testLoggerInfo("Password Field Is Found");				
				loginPage.getPasswordInputField().sendKeys(message);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Password Field Is Not Found" + e);
			}			
		}
		
		/**
		 * 
		 * @throws Exception
		 */
		
		public static void clickSignInButton() throws Exception{
			try {				
				TestLogger.testLoggerInfo("Sign In Btn Is Found");				
				loginPage.getSignInBtn().click();
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Sign In Btn Is Not Found" + e);
			}			
		}
		
		/**
		 * 
		 * @throws Exception
		 */
 
		public static void NewCustTypeUserEmailAddress(String message) throws Exception{
			try {				
				TestLogger.testLoggerInfo("New Customer Email Address Field Is Found");				
				loginPage.getNewCustEmailAddressField().sendKeys(message);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("New Customer Email Address Field Is Found" + e);
			}			
		}
		
		/**
		 * 
		 * @throws Exception
		 */
		
		public static void NewCustTypeUserPassword(String message) throws Exception{
			try {				
				TestLogger.testLoggerInfo("New Customer Password Field Is Found");				
				loginPage.getNewCustPasswordField().sendKeys(message);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("New Customer Password Field Is Not Found" + e);
			}			
		}
		
		/**
		 * 
		 * @throws Exception
		 */
		
		public static void NewCustConfirmPassword(String message) throws Exception{
			try {				
				TestLogger.testLoggerInfo("New Customer Confirm Password Field Is Found");				
				loginPage.getNewCustCOnfirmPasswordField().sendKeys(message);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("New Customer Confirm Password Field Is Not Found" + e);
			}			
		}
		
		/**
		 * 
		 * @throws Exception
		 */
		
		public static void NewCustCreateAccButton() throws Exception{
			try {				
				TestLogger.testLoggerInfo("Create Account Btn Is Found");				
				loginPage.getNewCustCreatAccBtn().click();
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Create Account Btn Is Found" + e);
			}			
		}
		
		/**
		 * 
		 * @throws Exception
		 */
		
		public static void UserLogout() throws Exception{
			try {				
				TestLogger.testLoggerInfo("Logout Btn Is Found");	
				Actions userAction = new Actions(driver);
				userAction.moveToElement(loginPage.getMyAccount()).build().perform();
				Thread.sleep(500);
				loginPage.getLogoutLink().click();
				Thread.sleep(500);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Logout Btn Is Found" + e);
			}			
		}
		
		/**
		 * 
		 * @throws Exception
		 */
		
		public static void CreateNewUserAcc(String emailAddress, String Password) throws Exception{
			try {	
				NewCustTypeUserEmailAddress(emailAddress);
				NewCustTypeUserPassword(Password);
				NewCustConfirmPassword(Password);
				NewCustCreateAccButton();
				TestLogger.testLoggerInfo("New User Account Is Created");
			} catch (Exception e) {
				TestLogger.testLoggerInfo("New User Account Is Not Created" + e);
			}			
		}
		
		/**
		 * 
		 * @throws Exception
		 */

		public static String GetLoginPageBannerSize() throws Exception{
			String bannerSize = null;
			try {			
				TestLogger.testLoggerInfo("Banner In Login Page Is Found");
				Thread.sleep(700);
				bannerSize = loginPage.getLoginPageBannerSize().getAttribute("class");
				Thread.sleep(700);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Banner In Login Page Is Not Found" + e);
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
				TestLogger.testLoggerInfo("Hurry Up Text In Banner Login Page Is Found");
				Thread.sleep(700);
				bannerSize = loginPage.getLoginPageBannerSize().getText();
				Thread.sleep(700);
			} catch (Exception e) {
				TestLogger.testLoggerInfo("Hurry Up Text In Banner Login Page Is Not Found" + e);
			}
			return bannerSize;
		}
 
}

package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//WebDriver driver;

	/* Constructor to Initialize all WebElements */
	  	public LoginPage (WebDriver driver) {
	  		//this.driver = driver;
	  		PageFactory.initElements(driver, this);		
	    }
	
		@FindBy(xpath = "//input[@id='login-email']")
		WebElement EmailAddressInputField;
				
		@FindBy(xpath = "//input[@id='login-pwd']")
		WebElement PasswordInputField;
		
		@FindBy(xpath = "//button[@type='submit']")
		WebElement SignInBtn;
		
		@FindBy(xpath = "//input[@id='userEmail']")
		WebElement NewCustEmailAddressField;
		
		@FindBy(xpath = "//input[@id='password']")
		WebElement NewCustPasswordField;
		
		@FindBy(xpath = "//input[@id='confirmationPassword']")
		WebElement NewCustCOnfirmPasswordField;
		
		@FindBy(xpath = "//button[@type='submit'][contains(text(),'Create Account')]")
		WebElement NewCustCreatAccBtn;
		
		@FindBy(xpath = "//div[@class='my-account']")
		WebElement MyAccount;
		
		@FindBy(xpath = "//div[@class='my-account']//div//menu//a[3]")
		WebElement LogoutLink;
		
		@FindBy(xpath = "//div[@class='banner-banner banner-banner-full-main']//a[1]/span[1]")
		WebElement LoginPageBannerSize;
		
		/*@FindBy(xpath = "//A[@href='//demo-in.testpipingrock.com/logout'][text()='Logout']")
		WebElement LogoutLink;*/
		
		/* Get Methods for WebElements */
		
		public WebElement getEmailAddressInputField()
		{	
			return EmailAddressInputField;
		}
		
		public WebElement getPasswordInputField()
		{
			return PasswordInputField;
		}
		
		public WebElement getSignInBtn()
		{
			return SignInBtn;
		}
		
		public WebElement getNewCustEmailAddressField()
		{
			return NewCustEmailAddressField;
		}
		
		public WebElement getNewCustPasswordField()
		{
			return NewCustPasswordField;
		}
		
		public WebElement getNewCustCOnfirmPasswordField()
		{
			return NewCustCOnfirmPasswordField;
		}
		
		public WebElement getNewCustCreatAccBtn()
		{
			return NewCustCreatAccBtn;
		}
		
		public WebElement getMyAccount()
		{
			return MyAccount;
		}
		
		public WebElement getLogoutLink()
		{
			return LogoutLink;
		}
		
		public WebElement getLoginPageBannerSize()
		{
			return LoginPageBannerSize;
		}
}

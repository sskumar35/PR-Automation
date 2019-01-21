package com.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BusinessComponents.HomePageActions;
import com.BusinessComponents.LoginPageAction;
import com.PageFactory.HomePage;
import com.PageFactory.LoginPage;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class CommonTC extends CommonUtils {
	
	HomePage homePg = PageFactory.initElements(driver, HomePage.class);
	LoginPage loginPg = PageFactory.initElements(driver, LoginPage.class);
	
	@BeforeTest
	public void setUp() throws Exception {
		init();		
	}
	
	@Test (priority=1)
	public void PrerequisteTest() throws Exception{
		try {
			TestLogger.testLoggerTCStart("Prerequiste Test Case");
			/*driver.findElement(By.xpath("//span[@id='select2-_sctry-container']")).click();
			Select select  = new Select(driver.findElement(By.xpath("//span[@id='select2-_sctry-container']")));*/
			WebElement dropdown = driver.findElement(By.xpath("//span[@id='select2-_sctry-container']"));
			dropdown.click();
			List<WebElement> options = dropdown.findElements(By.xpath("//ul[@id='select2-_sctry-results']//li[@class='select2-results__option']"));
			System.out.print("OPTIONS" + options);
			options.get(12).click();
			Thread.sleep(1000);	
			//HomePageActions.HandlingModalSuggestedBox();
			Thread.sleep(1000);			
			takeSnapShot();
			TestLogger.testLoggerTCEnd("Prerequiste Test Case");
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Prerequiste Test Case FAILS" + e);
		}
	}

	/* Method for SignIn 
	
	
	//String userName="vishnm.216@gmail.com";
	//String passWord="1234567890";
	
	@Test
	public void UserSignIn() throws InterruptedException {
		String userName="vishnm.216@gmail.com";
		
		    Thread.sleep(4000);
			if (driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed())
			{
				System.out.println("Element is Visible");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[@href='/login'][text()='Sign In / Join']")).click();
				Thread.sleep(4000);
				if (loginPg.getEmailAddressInputField().isDisplayed())
				{
					System.out.println("Yes");
				}
				loginPg.getEmailAddressInputField().sendKeys(userName);
				loginPg.getPasswordInputField().sendKeys("1234567890");
				loginPg.getSignInBtn().click();
				/*driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("vishnm.216@gmail.com");
				driver.findElement(By.xpath("//input[@id='login-pwd']")).sendKeys("1234567890");
				driver.findElement(By.xpath("//button[@type='submit'][contains(text(),'Sign In')]")).click();
				driver.findElement(By.xpath("//a[@class='js-ga-event'][contains(text(),'Skin Care')]")).click();
				String titleBefore = driver.getTitle();				
				System.out.println(titleBefore);
				String urlBefore = driver.getCurrentUrl();				
				System.out.println(urlBefore);
				driver.findElement(By.xpath("//button[@id='btn-cart-add-6387']")).click();								
				driver.findElement(By.xpath("//a[@class='notranslate btn btn-success-bg btn-lg btn-block no-underline'][text()='Continue Shopping']")).click();
				String titleAftr = driver.getTitle();				
				System.out.println(titleAftr);
				String urlAftr = driver.getCurrentUrl();				
				System.out.println(urlAftr);
				boolean Result = new String(titleBefore).equals(titleAftr);
				System.out.println(Result);	
			}
			
			
			/*homePage.getLogInBtn().click()
			loginPage.getEmailAddressInputField().sendKeys("vishnm.216@gmail.com");
			loginPage.getPasswordInputField().sendKeys("1234567890");
			loginPage.getSignInBtn().click();
			System.out.println("PASS");	
	}	*/
}

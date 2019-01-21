package com.Utilities;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonUtils {
	
	
	/* Initialize */
	public void init() {
		SelectBrowser(browser);
		getURL(url);
	}
	
	public static WebDriver driver; 
	String browser = "chrome";
	//String url = "https://demo-www.testpipingrock.com/";
	String url = "https://www.pipingrock.com/";
	//String demoUrl = "https://demo-www.testpipingrock.com/";
	//String stagingUrl = "https://staging-www.testpipingrock.com/";
	
	/* Method to Select Browser */
	public void SelectBrowser(String browser) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
		driver = new ChromeDriver();
	}
	
	/* Method to get URL */
	public void getURL(String url)
	{
		driver.get(url);
		driver.manage().window().maximize(); // Maximize Window
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // Implicit Wait
		//if (url.equals(demoUrl) || url.equals(stagingUrl)) {
			TestLogger.testLoggerInfo("Authentication Is Required");
			try {
				driver.findElement(By.xpath("//input[@id='gba-user']")).sendKeys("skumar@pipingrock.com");
				driver.findElement(By.xpath("//input[@id='gba-pass']")).sendKeys("omsairam35#");
				driver.findElement(By.xpath("//input[@id='submit']")).click();
				TestLogger.testLoggerInfo("Authentication Is Successful");
			} catch (Exception e) {
				 TestLogger.testLoggerInfo("Authentication Is Not Successful");
			}
		}
	//}
	
	/**

     * This function will take screenshot

     * @throws Exception

     */
	
	public static void takeSnapShot() throws Exception{
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        
        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File DestFile=new File("C:\\Users\\skumar\\eclipse-workspace\\PR-ECOMMERCE\\src\\Screenshot"+dateTimeStamp()+".png");

        //Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
    }
	
	public static String dateTimeStamp() {
		 
		 // Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy-HH-mm-ss");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 String timeStamp = dateFormat.format(date);
		 
		 return timeStamp;
		
	}
	
	/*public static String  makeDirectory() {
		 
		 // Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 String timeStamp = dateFormat.format(date);
		 File dir = new File(timeStamp);
		 dir.mkdir();
		return timeStamp;
	 } */
	
	public void closeDriver() {
		driver.close();
	}
		 
}

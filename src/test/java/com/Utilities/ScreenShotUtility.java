package com.Utilities;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtility {
	
	/**

     * This function will take screenshot

     */
	public static WebDriver driver; 
	
	public static void takeSnapShot() throws Exception{
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        
        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File DestFile=new File("./src\\Screenshots\\screenshot_"+dateTimeStamp()+".png");

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

}

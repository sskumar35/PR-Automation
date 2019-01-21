package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoriesAndSubCategoriesPage {
	
	WebDriver driver;

	/* Constructor to Initialize all WebElements */
	public CategoriesAndSubCategoriesPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//div[contains(@id, 'BVRRInlineRating-')]//button[@type='button']")
	WebElement AvgRatingValue;
	
	@FindBy(xpath = "//div[@class='bv_numReviews_component_container']//button[@type='button']")
	WebElement NumberOfReviews;
	
		
	/* Get Methods for WebElements */
	
	public WebElement getAvgRatingValue()
	{
		return AvgRatingValue;
	}
	
	public WebElement getNumberOfReviews()
	{
		return NumberOfReviews;
	}	
	
}

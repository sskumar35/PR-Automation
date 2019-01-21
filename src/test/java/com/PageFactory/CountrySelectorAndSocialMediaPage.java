package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CountrySelectorAndSocialMediaPage {
	
	public CountrySelectorAndSocialMediaPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@id='select2-_sctry-container']")
	WebElement ClickCountryDropDownMenu;
	
	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//Input[@class='select2-search__field']")
	WebElement MoveToCountrySearchField;
	
	@FindBy(xpath = "//*[@id=\"select2-_slang-container\"]")
	WebElement ClickLanguageDropDownMenu;
	
	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//Input[@class='select2-search__field']")
	WebElement MoveToLanguageSearchField;
	
	@FindBy(xpath = "//*[@id=\"modal-suggested-header\"]/h1")
	WebElement CountrySelectorPageHeader;
	
	@FindBy(xpath = "/html/body/header/div[1]/div/div[2]/div/span[1]")
	WebElement ClickCountrySelector;
	
	
	public WebElement getClickCountryDropDownMenu() 
	{
		return ClickCountryDropDownMenu;	
	}
	
	public WebElement getMoveToCountrySearchField() 
	{
		return MoveToCountrySearchField;
	}
	
	public WebElement getClickLanguageDropDownMenu()
	{
		return ClickLanguageDropDownMenu;
	}
	
	public WebElement getMoveToLanguageSearchField() 
	{
		return MoveToLanguageSearchField;
	}
	
	public WebElement getCountrySelectorPageHeader()
	{
		return CountrySelectorPageHeader;
	}
	
	public WebElement getClickCountrySelector()
	{
		return ClickCountrySelector;
	}
	
}

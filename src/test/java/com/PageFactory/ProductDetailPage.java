package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {
	
	//private WebDriver driver;

		/* Constructor to Initialize all WebElements */
		public ProductDetailPage (WebDriver driver) {
			//this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy (xpath = "//*[@id=\"tab-nav-plabel\"]/span")
		WebElement ProductLabelTab;
		
		@FindBy (xpath = "//*[@id=\"tab-nav-more\"]/span")
		WebElement MoreInfoTab;
		
		@FindBy (xpath = "//a[@id='tab-nav-reviews']/span")
		WebElement ViewReviewsTab;
		
		@FindBy (xpath = "//*[@id=\"tab-nav-healthEncyclopedia\"]/span")
		WebElement HealthEncyclopediaTab;
		
		/*Write a New Review Pop up Elements*/
		
		@FindBy (xpath = "//*[@id=\"BVRRContainer\"]/div/div/div/div/div[1]/div[1]/div/button")
		WebElement WriteReviewButton;
		
		@FindBy (xpath = "//input[@id='bv-text-field-title']")
		WebElement ReviewTitleInReviewPopUP;
		
		@FindBy (xpath = "//textarea[@id='bv-textarea-field-reviewtext']")
		WebElement ReviewDescriptionInReviewPopUP;
		
		@FindBy (xpath = "//input[@id='bv-email-field-hostedauthentication_authenticationemail']")
		WebElement EmailInReviewPopUp;
		
		@FindBy (xpath = "//input[@id='bv-text-field-usernickname']")
		WebElement NickNameInReviewPopUp;
		
		@FindBy (xpath = "//button[@name='bv-submit-button']")
		WebElement PostReviewBtnInReviewPopUp;
		
		@FindBy (xpath = "//input[@id='bv-checkbox-reviews-termsAndConditions']")
		WebElement IAgreeCheckBoxInReviewPopUp;
		
		@FindBy (xpath = "//a[@id='bv-radio-rating-5']//span[@aria-hidden='true']")
		WebElement FiveStartOverallRatingInReviewPopUp;
		
		@FindBy (xpath = "//a[@id='bv-radio-rating-4']//span[@aria-hidden='true'][contains(text(),'★')]")
		WebElement FourStarOverallRatingInReviewPopUp;
		
		@FindBy (xpath = "//a[@id='bv-radio-rating-3']//span[@aria-hidden='true'][contains(text(),'★')]")
		WebElement ThreeStartOverallRatingInReviewPopUp;
		
		@FindBy (xpath = "//a[@id='bv-radio-rating-2']//span[@aria-hidden='true'][contains(text(),'★')]")
		WebElement TwoStartOverallRatingInReviewPopUp;
		
		@FindBy (xpath = "//a[@id='bv-radio-rating-1']//span[@aria-hidden='true'][contains(text(),'★')]")
		WebElement OneStartOverallRatingInReviewPopUp;
		
		@FindBy (xpath = "//select[@id='bv-select-field-contextdatavalue_Gender']")
		WebElement GenderDropDownInReviewPopUp;
		
		@FindBy (xpath = "//select[@id='bv-select-field-contextdatavalue_Age']")
		WebElement AgeDropDownInReviewPopUp;
		
		@FindBy (xpath = "//a[@id='bv-radio-rating_Quality-5']//span[@aria-hidden='true'][contains(text(),'★')]")
		WebElement FiveStarQualityRatingInReviewPopUp;
		
		@FindBy (xpath = "//a[@id='bv-radio-rating_Quality-4']//span[@aria-hidden='true'][contains(text(),'★')]")
		WebElement FourStarQualityRatingInReviewPopUp;
		
		@FindBy (xpath = "//a[@id='bv-radio-rating_Quality-3']//span[@aria-hidden='true'][contains(text(),'★')]")
		WebElement ThreeStarQualityRatingInReviewPopUp;
		
		@FindBy (xpath = "//a[@id='bv-radio-rating_Quality-2']//span[@aria-hidden='true'][contains(text(),'★')]")
		WebElement TwoStarQualityRatingInReviewPopUp;
		
		@FindBy (xpath = "//a[@id='bv-radio-rating_Quality-1']//span[@aria-hidden='true'][contains(text(),'★')]")
		WebElement OneStarQualityRatingInReviewPopUp;
		
		@FindBy (xpath = "//a[@id='bv-radio-rating_Value-5']//span[@aria-hidden='true'][contains(text(),'★')]")
		WebElement FiveStarValueRatingInReviewPopUp;
		
		@FindBy (xpath = "//a[@id='bv-radio-rating_Value-4']//span[@aria-hidden='true'][contains(text(),'★')]")
		WebElement FourStarValueRatingInReviewPopUp;
		
		@FindBy (xpath = "//a[@id='bv-radio-rating_Value-3']//span[@aria-hidden='true'][contains(text(),'★')]")
		WebElement ThreeStarValueRatingInReviewPopUp;
		
		@FindBy (xpath = "//a[@id='bv-radio-rating_Value-2']//span[@aria-hidden='true'][contains(text(),'★')]")
		WebElement TwoStarValueRatingInReviewPopUp;
		
		@FindBy (xpath = "//a[@id='bv-radio-rating_Value-1']//span[@aria-hidden='true'][contains(text(),'★')]")
		WebElement OneStarValueRatingInReviewPopUp;
		
		@FindBy (xpath = "//button[@class='bv-mbox-close bv-focusable']//span[@aria-hidden='true'][contains(text(),'✘')]")
		WebElement ReviewCloseBtnInReviewPopUp;
		
		@FindBy (xpath = "//div[@class='bv-mbox-injection-container-mbox-lightbox-list']//div[@class='bv-mbox-injection-target bv-mbox-current']")
		WebElement ReviewPopUpThankYouMBox;
		
		/*Old Review Panel Elements*/
		
		@FindBy (xpath = "//div[@class='bv-secondary-rating-summary-header']//h3[@class='bv-content-title']")
		WebElement AvgCustRatingsTitle;
		
		@FindBy (xpath = "//tr[@class='bv-secondary-rating-summary-stars']//td[@class='bv-secondary-rating-summary-id bv-td']")
		WebElement AvgCustOverallRatingsTitle;
		
		@FindBy (xpath = "//table[@class='bv-secondary-rating-summary-list']/tbody[1]/tr[2]/td[1]")
		WebElement AvgCustOverallQualityRatingsTitle;
		
		@FindBy (xpath = "//table[@class='bv-secondary-rating-summary-list']/tbody[1]/tr[3]/td[1]")
		WebElement AvgCustOverallValueRatingsTitle;
		
		@FindBy (xpath = "//div[@class='bv-inline-histogram-header']//h3[@class='bv-content-title']")
		WebElement RatingSnapshotTitle;
		
		@FindBy (xpath = "//caption[@class='bv-histogram-filter-helper']")
		WebElement RatingSnapshotFilterTitle;
		
		@FindBy (xpath = "//h2[@class='bv-action-bar-header']")
		WebElement ReviewPanelHeader;
		
		@FindBy (xpath = "//table[@role='presentation']/tbody[1]/tr[1]/td[2]")
		WebElement RatingSnapShot5Star;
		
		@FindBy (xpath = "//table[@role='presentation']/tbody[1]/tr[2]/td[2]")
		WebElement RatingSnapShot4Star;
		
		@FindBy (xpath = "//table[@role='presentation']/tbody[1]/tr[3]/td[2]")
		WebElement RatingSnapShot3Star;
		
		@FindBy (xpath = "//table[@role='presentation']/tbody[1]/tr[4]/td[2]")
		WebElement RatingSnapShot2Star;
		
		@FindBy (xpath = "//table[@role='presentation']/tbody[1]/tr[5]/td[2]")
		WebElement RatingSnapShot1Star;
		
		@FindBy (xpath = "//*[@id=\"BVRRContainer\"]/div/div/div/div/div[1]/div[3]/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td[2]/span")
		WebElement Filter5StarRatings;
		
		@FindBy (xpath = "//*[@id=\"BVRRContainer\"]/div/div/div/div/div[1]/div[3]/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td[2]/span")
		WebElement Filter4StarRatings;
		
		@FindBy (xpath = "//*[@id=\"BVRRContainer\"]/div/div/div/div/div[1]/div[3]/table/tbody/tr/td[1]/div/table/tbody/tr[3]/td[2]/span")
		WebElement Filter3StarRatings;
		
		@FindBy (xpath = "//*[@id=\"BVRRContainer\"]/div/div/div/div/div[1]/div[3]/table/tbody/tr/td[1]/div/table/tbody/tr[4]/td[2]/span")
		WebElement Filter2StarRatings;
		
		@FindBy (xpath = "//*[@id=\"BVRRContainer\"]/div/div/div/div/div[1]/div[3]/table/tbody/tr/td[1]/div/table/tbody/tr[5]/td[2]/span")
		WebElement Filter1StarRatings;
		
		@FindBy (xpath = "//*[@id=\"BVRRContainer\"]/div/div/div/div/div[2]/div[2]/ul/li[1]/button[5]")
		WebElement ActiveFilter5StarRatings;
		
		@FindBy (xpath = "//*[@id=\"BVRRContainer\"]/div/div/div/div/div[2]/div[2]/ul/li[1]/button[4]")
		WebElement ActiveFilter4StarRatings;
		
		@FindBy (xpath = "//*[@id=\"BVRRContainer\"]/div/div/div/div/div[2]/div[2]/ul/li[1]/button[3]")
		WebElement ActiveFilter3StarRatings;
		
		@FindBy (xpath = "//*[@id=\"BVRRContainer\"]/div/div/div/div/div[2]/div[2]/ul/li[1]/button[2]")
		WebElement ActiveFilter2StarRatings;
		
		@FindBy (xpath = "//*[@id=\"BVRRContainer\"]/div/div/div/div/div[2]/div[2]/ul/li[1]/button[1]")
		WebElement ActiveFilter51StarRatings;
		
		@FindBy (xpath = "//*[@id=\"BVRRContainer\"]/div/div/div/div/div[2]/div[2]/ul/li[5]/button")
		WebElement ClearAllActiveFilters;
		
		@FindBy (xpath = "//*[@id=\"BVRRContainer\"]/div/div/div/div/div[1]/div[3]/table/tbody/tr/td[2]/div/h3")
		WebElement AverageCustomerRatingsTitle;
		
		@FindBy (xpath = "//tr[@class='bv-secondary-rating-summary-stars']//td[@class='bv-rating-ratio bv-td']//span[@class='bv-secondary-rating-summary-rating']")
		WebElement AvgOverallBVRatings;
		
		@FindBy (xpath = "//table[@class='bv-secondary-rating-summary-list']//tbody[1]//tr[2]//td[2]//span[2]")
		WebElement AvgOverallQualityRatings;
		
		@FindBy (xpath = "//table[@class='bv-secondary-rating-summary-list']//tbody[1]//tr[3]//td[2]//span[2]")
		WebElement AvgOverallValueRatings;
		
		@FindBy (xpath = "//div[@class='bv-author-avatar-nickname']//div[@class='bv-content-author-name']//button[@type='button']/h3")
		WebElement ReviewerName;
		
		@FindBy (xpath = "//span[contains(@class,'bv-author-userstats-value')]")
		WebElement NumberOfReviewerReviews;
		
		@FindBy (xpath = "//*[@id=\"BVRRContainer\"]/div/div/div/div/ol/li[1]/div[1]/div/dl/dd[2]/ul/li[2]/span[1]")
		WebElement ReviewerVotes;
		
		@FindBy (xpath = "//li[contains(@class,'bv-author-cdv bv-first')]//span[@class='bv-author-userinfo-value']")
		WebElement ReviewerGender;
		
		@FindBy (xpath = "//li[contains(@class,'bv-author-cdv  bv-last')]//span[@class='bv-author-userinfo-value']")
		WebElement ReviewerAge;
		
		@FindBy (xpath = "//li[contains(@data-bv-v,'stubRemainderContentItem:')]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//h4[1]")
		WebElement RatingOnlyReviews;
		
		@FindBy (xpath = "//li[contains(@data-bv-v,'stubRemainderContentItem:')]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//h4[1]")
		WebElement ReviewsInOtherLanguages;
		
		@FindBy (xpath = "//button[@id='WAR']")
		WebElement WriteReviewLink;
		
		@FindBy (xpath = "//*[@id=\"BVRRSearchContainer\"]/div/div/div/div/div/div[1]/div/dl/dd[3]/a")
		WebElement ReviewsCountLink;
		
		@FindBy (xpath = "//*[@id=\"BVRRSearchContainer\"]/div/div/div/div/div/div[1]/div/dl/dd[1]/a/span[2]")
		WebElement ReviewsStarRating;
		
		@FindBy (xpath = "//*[@id=\"BVRRContainer\"]/div/div/div/div/div[2]/a")
		WebElement FirstToReviewItemLink;
			
		@FindBy (xpath = "//input[contains(@id, 'btn-cart-qty-')]")
		WebElement QtyInputField;
		
		@FindBy (xpath = "//div[@class='bv-content-summary-body-text']")
		WebElement ReviewSummary;
		
		@FindBy (xpath = "//span[contains(@class,'bv-rating-stars-container')]//abbr[2]")
		WebElement ReviewerBVRating;
		
		@FindBy (xpath = "//h4[@class='bv-content-title']")
		WebElement ReviewerTitle;
		
		/* Get Methods for WebElements */
		
		public WebElement getProductLabelTab()
		{
			return ProductLabelTab;
		}
		
		public WebElement getMoreInfoTab()
		{
			return MoreInfoTab;
		}
		
		public WebElement getViewReviewsTab()
		{
			return ViewReviewsTab;
		}
		
		public WebElement getHealthEncyclopediaTab()
		{
			return HealthEncyclopediaTab;
		}
		
		/*Getter Setter for Write a New Review Pop up Elements*/
		
		public WebElement getWriteReviewButton()
		{
			return WriteReviewButton;
		}
		
		public WebElement getReviewTitleInReviewPopUP()
		{
			return ReviewTitleInReviewPopUP;
		}
		
		public WebElement getReviewDescriptionInReviewPopUP()
		{
			return ReviewDescriptionInReviewPopUP;
		}
		
		public WebElement getEmailInReviewPopUp()
		{
			return  EmailInReviewPopUp;
		}
		
		public WebElement getNickNameInReviewPopUp()
		{
			return NickNameInReviewPopUp;
		}
		
		public WebElement getPostReviewBtnInReviewPopUp()
		{
			return PostReviewBtnInReviewPopUp;
		}
		
		public WebElement getIAgreeCheckBoxInReviewPopUp()
		{
			return IAgreeCheckBoxInReviewPopUp;
		}
		
		public WebElement getFiveStartOverallRatingInReviewPopUp()
		{
			return FiveStartOverallRatingInReviewPopUp;
		}
		
		public WebElement getFourStarOverallRatingInReviewPopUp()
		{
			return FourStarOverallRatingInReviewPopUp;
		}
		
		public WebElement getThreeStartOverallRatingInReviewPopUp()
		{
			return ThreeStartOverallRatingInReviewPopUp;
		}
		
		public WebElement getTwoStartOverallRatingInReviewPopUp()
		{
			return TwoStartOverallRatingInReviewPopUp;
		}
		
		public WebElement getOneStartOverallRatingInReviewPopUp()
		{
			return OneStartOverallRatingInReviewPopUp;
		}
		
		public WebElement getGenderDropDownInReviewPopUp()
		{
		    return GenderDropDownInReviewPopUp;
		}

		public WebElement getAgeDropDownInReviewPopUp()
		{
		    return AgeDropDownInReviewPopUp;
		}

		public WebElement getFiveStarQualityRatingInReviewPopUp()
		{
		     return FiveStarQualityRatingInReviewPopUp;
		}

		public WebElement getFourStarQualityRatingInReviewPopUp()
		{
		      return FourStarQualityRatingInReviewPopUp;
		}

		public WebElement getThreeStarQualityRatingInReviewPopUp()
		{
		     return ThreeStarQualityRatingInReviewPopUp;
		}

		public WebElement getTwoStarQualityRatingInReviewPopUp()
		{
		      return TwoStarQualityRatingInReviewPopUp;
		}

		public WebElement getOneStarQualityRatingInReviewPopUp()
		{
		     return OneStarQualityRatingInReviewPopUp;
		}

		public WebElement getFiveStarValueRatingInReviewPopUp()
		{
		      return FiveStarValueRatingInReviewPopUp;
		}

		public WebElement getFourStarValueRatingInReviewPopUp()
		{
		      return FourStarValueRatingInReviewPopUp;
		}

		public WebElement getThreeStarValueRatingInReviewPopUp()
		{
		     return ThreeStarValueRatingInReviewPopUp;
		}

		public WebElement getTwoStarValueRatingInReviewPopUp()
		{
		     return TwoStarValueRatingInReviewPopUp;
		}

		public WebElement getOneStarValueRatingInReviewPopUp()
		{
		    return OneStarValueRatingInReviewPopUp;
		}
		
		public WebElement getReviewCloseBtnInReviewPopUp()
		{
		    return ReviewCloseBtnInReviewPopUp;
		}
		
		public WebElement getReviewPopUpThankYouMBox()
		{
		    return ReviewPopUpThankYouMBox;
		}
		
		/*Old Review Panel getter setter*/
		
		public WebElement getWriteReviewLink()
		{
			return WriteReviewLink;
		}
		
		public WebElement getRatingSnapShot5Star()
		{
			return RatingSnapShot5Star;
		}
		
		public WebElement getRatingSnapShot4Star()
		{
			return RatingSnapShot4Star;
		}
		
		public WebElement getRatingSnapShot3Star()
		{
			return RatingSnapShot3Star;
		}
		
		public WebElement getRatingSnapShot2Star()
		{
			return RatingSnapShot2Star;
		}
		
		public WebElement getRatingSnapShot1Star()
		{
			return RatingSnapShot1Star;
		}
		
		public WebElement getFilter5StarRatings()
		{
			return Filter5StarRatings;
		}
		
		public WebElement getFilter4StarRatings()
		{
			return Filter4StarRatings;
		}
		
		public WebElement getFilter3StarRatings()
		{
			return Filter3StarRatings;
		}
		
		public WebElement getFilter2StarRatings()
		{
			return Filter2StarRatings;
		}
		
		public WebElement getFilter1StarRatings()
		{
			return Filter1StarRatings;
		}
		
		public WebElement getAverageCustomerRatingsTitle()
		{
			return AverageCustomerRatingsTitle;
		}
		
		public WebElement getAvgOverallBVRatings()
		{
			return AvgOverallBVRatings;
		}
		
		public WebElement getAvgOverallQualityRatings()
		{
			return AvgOverallQualityRatings;
		}
		
		public WebElement getAvgOverallValueRatings()
		{
			return AvgOverallValueRatings;
		}
		
		public WebElement getReviewerName()
		{
			return ReviewerName;
		}
		
		public WebElement getNumberOfReviewerReviews()
		{
			return NumberOfReviewerReviews;
		}
		
		public WebElement getReviewerVotes()
		{
			return ReviewerVotes;
		}
		
		public WebElement getReviewerGender()
		{
			return ReviewerGender;
		}
		
		public WebElement getReviewerAge()
		{
			return ReviewerAge;
		}
		
		public WebElement getRatingOnlyReviews()
		{
			return RatingOnlyReviews;
		}
		
		public WebElement getReviewsInOtherLanguages()
		{
			return ReviewsInOtherLanguages;
		}
		
		public WebElement getActiveFilter5StarRatings()
		{
			return ActiveFilter5StarRatings;
		}
		
		public WebElement getActiveFilter4StarRatings()
		{
			return ActiveFilter4StarRatings;
		}
		
		public WebElement getActiveFilter3StarRatings()
		{
			return ActiveFilter3StarRatings;
		}
		
		public WebElement getActiveFilter2StarRatings()
		{
			return ActiveFilter2StarRatings;
		}
		
		public WebElement getActiveFilter1StarRatings()
		{
			return ActiveFilter5StarRatings;
		}
		
		public WebElement getClearAllActiveFilters()
		{
			return ClearAllActiveFilters;
		}
		
		public WebElement getReviewsCountLink()
		{
			return ReviewsCountLink;
		}
		
		public WebElement getReviewsStarRating()
		{
			return ReviewsStarRating;
		}
		
		public WebElement getFirstToReviewItemLink()
		{
			return FirstToReviewItemLink;
		}
		
		public WebElement getQtyInputField()
		{
			return QtyInputField;
		}
		
		public WebElement getReviewSummary()
		{
			return ReviewSummary;
		}
		
		public WebElement getReviewerBVRating()
		{
			return ReviewerBVRating;
		}
		
		public WebElement getReviewerTitle()
		{
			return ReviewerTitle;
		}
		
		public WebElement getAvgCustRatingsTitle()
		{
			return AvgCustRatingsTitle;
		}
		
		public WebElement getAvgCustOverallRatingsTitle()
		{
			return AvgCustOverallRatingsTitle;
		}
		
		public WebElement getAvgCustOverallQualityRatingsTitle()
		{
			return AvgCustOverallQualityRatingsTitle;
		}
		
		public WebElement getAvgCustOverallValueRatingsTitle()
		{
			return AvgCustOverallValueRatingsTitle;
		}
		
		public WebElement getRatingSnapshotTitle()
		{
			return RatingSnapshotTitle;
		}
		
		public WebElement getRatingSnapshotFilterTitle()
		{
			return RatingSnapshotFilterTitle;
		}
		
		public WebElement getReviewPanelHeader()
		{
			return ReviewPanelHeader;
		}
		
}

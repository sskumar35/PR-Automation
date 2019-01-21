package com.BusinessComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.PageFactory.ProductDetailPage;
import com.Utilities.CommonUtils;
import com.Utilities.TestLogger;

public class ProductDetailPageActions extends CommonUtils {
	static ProductDetailPage ProductDetailPage = PageFactory.initElements(driver, ProductDetailPage.class);	
	
		/**
		 * 
		 * @throws Exception
		 */
 
	public static void SetItemQuantity(Integer itemVal) throws Exception{
		try {			
			TestLogger.testLoggerInfo("Item Quantity Field Is Found");
			ProductDetailPage.getQtyInputField().clear();
			ProductDetailPage.getQtyInputField().sendKeys(String.valueOf(itemVal));
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Item Quantity Field Is Not Found" + e);
		}
				
	}
	
	public static void ClickProductLabelTab() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Product Label Tab Is Found");
			ProductDetailPage.getProductLabelTab().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Product Label Tab Is Not Found" + e);
		}
				
	}
	
	public static void ClickMoreInfoTab() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Get More Info Tab Is Found");
			ProductDetailPage.getMoreInfoTab().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Get More Info Tab Is Not Found" + e);
		}
				
	}
	
	public static void ClickViewReviewsTab() throws Exception{
		try {			
			TestLogger.testLoggerInfo("View Reviews Tab Is Found");
			ProductDetailPage.getViewReviewsTab().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("View Reviews Tab Is Not Found" + e);
		}
				
	}
	
	public static void ClickHealthEncyclopediaTab() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Health Encyclopedia Tab Is Found");
			ProductDetailPage.getHealthEncyclopediaTab().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Health Encyclopedia Tab Is Not Found" + e);
		}
				
	}
	
	public static void ClickWriteReviewButton() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Write Review Button Is Found");
			ProductDetailPage.getWriteReviewButton().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Write Review Button Is Not Found" + e);
		}
				
	}
	
	public static void ClickWriteReviewLink() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Write Review Link Is Found");
			ProductDetailPage.getWriteReviewLink().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Write Review Link Is Not Found" + e);
		}
				
	}
	
	public static void ReviewsCountLink() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Reviews Count Link Is Found");
			ProductDetailPage.getReviewsCountLink().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Reviews Count Link Is Not Found" + e);
		}
				
	}
	
	public static void ReviewsStarRating() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Reviews Star Rating Is Found");
			ProductDetailPage.getReviewsStarRating().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Reviews Star Rating Is Not Found" + e);
		}
				
	}
	
	public static void FirstToReviewItemLink() throws Exception{
		try {			
			TestLogger.testLoggerInfo("First To Review Item Link Is Found");
			ProductDetailPage.getFirstToReviewItemLink().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("First To Review Item Link Is Not Found" + e);
		}
				
	}
	
	/* Actions In Write New Review Pop Up */
	
	public static void SelectFiveStarOverallRating() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Five Star Overall Rating Is Found");
			ProductDetailPage.getFiveStartOverallRatingInReviewPopUp().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Five Star Overall Rating Is Not Found" + e);
		}
				
	}
	
	public static void SelectFourStarOverallRating() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Four Star Overall Rating Is Found");
			ProductDetailPage.getFourStarOverallRatingInReviewPopUp().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Four Star Overall Rating Is Not Found" + e);
		}
				
	}
	
	public static void SelectThreeStarOverallRating() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Three Star Overall Rating Is Found");
			ProductDetailPage.getThreeStartOverallRatingInReviewPopUp().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Three Star Overall Rating Is Not Found" + e);
		}
				
	}
	
	public static void SelectTwoStarOverallRating() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Two Star Overall Rating Is Found");
			ProductDetailPage.getTwoStartOverallRatingInReviewPopUp().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Two Star Overall Rating Is Not Found" + e);
		}
				
	}
	
	public static void SelectOneStarOverallRating() throws Exception{
		try {			
			TestLogger.testLoggerInfo("One Star Overall Rating Is Found");
			ProductDetailPage.getOneStartOverallRatingInReviewPopUp().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("One Star Overall Rating Is Not Found" + e);
		}
				
	}
	
	public static void EnterReviewTitle(String message) throws Exception{
		try {
		     TestLogger.testLoggerInfo("Review Title Field In Review Pop Up Is Found");
		     ProductDetailPage.getReviewTitleInReviewPopUP().clear();
		     ProductDetailPage.getReviewTitleInReviewPopUP().sendKeys(message);
		     Thread.sleep(1000);
			} catch (Exception e) {
		     TestLogger.testLoggerInfo("Review Title Field In Review Pop Up Is Found");
			}	
		}
	
	public static void EnterReviewDescription(String message) throws Exception{
		try {
		     TestLogger.testLoggerInfo("Review Description Field In Review Pop Up Is Found");
		     ProductDetailPage.getReviewDescriptionInReviewPopUP().clear();
		     ProductDetailPage.getReviewDescriptionInReviewPopUP().sendKeys(message);
		     Thread.sleep(1000);
			} catch (Exception e) {
		     TestLogger.testLoggerInfo("Review Description Field In Review Pop Up Is Found");
			}	
		}
	
	public static void EnterReviewerNickName(String message) throws Exception{
		try {
		     TestLogger.testLoggerInfo("Nick Name Field In Review Pop Up Is Found");
		     ProductDetailPage.getNickNameInReviewPopUp().clear();
		     ProductDetailPage.getNickNameInReviewPopUp().sendKeys(message);
		     Thread.sleep(1000);
			} catch (Exception e) {
		     TestLogger.testLoggerInfo("Nick Name Field In Review Pop Up Is Found");
			}	
		}
	
	public static void EnterReviewerEmail(String message) throws Exception{
		try {
		     TestLogger.testLoggerInfo("Email Id Field In Review Pop Up Is Found");
		     ProductDetailPage.getEmailInReviewPopUp().clear();
		     ProductDetailPage.getEmailInReviewPopUp().sendKeys(message);
		     Thread.sleep(1000);
			} catch (Exception e) {
		     TestLogger.testLoggerInfo("Email Id Field In Review Pop Up Is Found");
			}	
		}
	
	public static void SelectGenderDropDown() throws Exception{
		try {
		     TestLogger.testLoggerInfo("Gender Drop Down In Review Pop Up Is Found");
		     ProductDetailPage.getGenderDropDownInReviewPopUp().click();
		     Select countryInDropDown = new Select(driver.findElement(By.id("bv-select-field-contextdatavalue_Gender")));
		     countryInDropDown.selectByIndex(1);
		     Thread.sleep(1000);
			} catch (Exception e) {
		     TestLogger.testLoggerInfo("Gender Drop Down In Review Pop Up Is Found");
			}	
		}
	
	public static void SelectAgeDropDown() throws Exception{
		try {
		     TestLogger.testLoggerInfo("Age Drop Down In Review Pop Up Is Found");
		     ProductDetailPage.getAgeDropDownInReviewPopUp().click();
		     Select countryInDropDown = new Select(driver.findElement(By.name("contextdatavalue_Age")));
		     countryInDropDown.selectByIndex(2);
		     Thread.sleep(1000);
			} catch (Exception e) {
		     TestLogger.testLoggerInfo("Age Drop Down In Review Pop Up Is Found");
			}	
		}
	
	public static void SelectFiveStarQualityRating() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Five Star Quality Rating Is Found");
			ProductDetailPage.getFiveStarQualityRatingInReviewPopUp().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Five Star Quality Rating Is Not Found" + e);
		}				
	}
	
	public static void SelectFourStarQualityRating() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Four Star Quality Rating Is Found");
			ProductDetailPage.getFourStarQualityRatingInReviewPopUp().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Four Star Quality Rating Is Not Found" + e);
		}				
	}
	
	public static void SelectThreeStarQualityRating() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Three Star Quality Rating Is Found");
			ProductDetailPage.getThreeStarQualityRatingInReviewPopUp().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Three Star Quality Rating Is Not Found" + e);
		}				
	}
	
	public static void SelectTwoStarQualityRating() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Two Star Quality Rating Is Found");
			ProductDetailPage.getTwoStarQualityRatingInReviewPopUp().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Two Star Quality Rating Is Not Found" + e);
		}				
	}
	
	public static void SelectOneStarQualityRating() throws Exception{
		try {			
			TestLogger.testLoggerInfo("One Star Quality Rating Is Found");
			ProductDetailPage.getOneStarQualityRatingInReviewPopUp().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("One Star Quality Rating Is Not Found" + e);
		}				
	}
	
	public static void SelectFiveStarValueRating() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Five Star Value Rating Is Found");
			ProductDetailPage.getFiveStarValueRatingInReviewPopUp().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Five Star Value Rating Is Not Found" + e);
		}				
	}
	
	public static void SelectFourStarValueRating() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Four Star Value Rating Is Found");
			ProductDetailPage.getFourStarValueRatingInReviewPopUp().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Four Star Value Rating Is Not Found" + e);
		}				
	}
	
	public static void SelectThreeStarValueRating() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Three Star Value Rating Is Found");
			ProductDetailPage.getThreeStarValueRatingInReviewPopUp().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Three Star Value Rating Is Not Found" + e);
		}				
	}
	
	public static void SelectTwoStarValueRating() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Two Star Value Rating Is Found");
			ProductDetailPage.getTwoStarValueRatingInReviewPopUp().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Two Star Value Rating Is Not Found" + e);
		}				
	}
	
	public static void SelectOneStarValueRating() throws Exception{
		try {			
			TestLogger.testLoggerInfo("One Star Value Rating Is Found");
			ProductDetailPage.getOneStarValueRatingInReviewPopUp().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("One Star Value Rating Is Not Found" + e);
		}				
	}
	
	public static void ClickPostReviewBtn() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Post Review Button In Review Pop Up Is Found");
			ProductDetailPage.getPostReviewBtnInReviewPopUp().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Post Review Button In Review Pop Up Is Not Found" + e);
		}				
	}
	
	public static void ClickTermsAndConditionsCheckBox() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Terms And Conditions Check Box In Review Pop Up Is Found");
			ProductDetailPage.getIAgreeCheckBoxInReviewPopUp().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Terms And Conditions Check Box In Review Pop Up Is Not Found" + e);
		}				
	}
	
	public static void ClickReviewPopUpCloseBtn() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Close Btn In Review Pop Up Is Found");
			ProductDetailPage.getReviewCloseBtnInReviewPopUp().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Close Btn In Review Pop Up Is Not Found" + e);
		}				
	}
	
	public static String GetRatingSnapshotTitle() throws Exception{
		String rating = null;
		try {			
			TestLogger.testLoggerInfo("Rating Snapshot Title Is Found");
			rating = ProductDetailPage.getRatingSnapshotTitle().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Rating Snapshot Title Is Not Found" + e);
		}
		return rating;
	}
	
	public static String GetReviewPanelHeaderTitle() throws Exception{
		String rating = null;
		try {			
			TestLogger.testLoggerInfo("Review Panel Title Is Found");
			rating = ProductDetailPage.getReviewPanelHeader().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Review Panel Title Is Not Found" + e);
		}
		return rating;
	}
	
	public static String GetRatingSnapshotFilterTitle() throws Exception{
		String rating = null;
		try {			
			TestLogger.testLoggerInfo("Rating Snapshot Filter Message Is Found");
			rating = ProductDetailPage.getRatingSnapshotFilterTitle().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Rating Snapshot Filter Message Is Not Found" + e);
		}
		return rating;
	}
	
	public static String GetAvgCustOverallValueRatingsTitle() throws Exception{
		String rating = null;
		try {			
			TestLogger.testLoggerInfo("Avg Cust Overall Value Title Is Found");
			rating = ProductDetailPage.getAvgCustOverallValueRatingsTitle().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Avg Cust Overall Value Title Is Not Found" + e);
		}
		return rating;
	}
	
	public static String GetAvgCustOverallQualityRatingsTitle() throws Exception{
		String rating = null;
		try {			
			TestLogger.testLoggerInfo("Avg Cust Overall Quality Title Is Not Found");
			rating = ProductDetailPage.getAvgCustOverallQualityRatingsTitle().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Avg Cust Overall Quality Title Is Not Found" + e);
		}
		return rating;
	}
	
	public static String GetAvgCustOverallRatingsTitle() throws Exception{
		String rating = null;
		try {			
			TestLogger.testLoggerInfo("Avg Cust Overall Ratings Title Is Found");
			rating = ProductDetailPage.getAvgCustOverallRatingsTitle().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Avg Cust Overall Ratings Title Is Not Found" + e);
		}
		return rating;
	}
	
	public static String GetAvgCustRatingsTitleInPanel() throws Exception{
		String rating = null;
		try {			
			TestLogger.testLoggerInfo("Avg Cust Overall Ratings Title In Panel Is Found");
			rating = ProductDetailPage.getAvgCustRatingsTitle().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Avg Cust Overall Ratings Title In Panel Is Not Found" + e);
		}
		return rating;
	}
	
	public static String GetRatingSnapShot5Star() throws Exception{
		String R5star = null;
		try {			
			TestLogger.testLoggerInfo("Snapshot for 5StarRatings Is Found");
			R5star = ProductDetailPage.getRatingSnapShot5Star().getAttribute("data-bv-histogram-rating-count");
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Snapshot for 5StarRatings Is Not Found" + e);
		}	
		return R5star;
	}
	
	public static String GetRatingSnapShot4Star() throws Exception{
		String R4star = null;
		try {			
			TestLogger.testLoggerInfo("Snapshot for 4StarRatings Is Found");
			R4star = ProductDetailPage.getRatingSnapShot4Star().getAttribute("data-bv-histogram-rating-count");
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Snapshot for 4StarRatings Is Not Found" + e);
		}	
		return R4star;
	}
	
	public static String GetRatingSnapShot3Star() throws Exception{
		String R3star = null;
		try {			
			TestLogger.testLoggerInfo("Snapshot for 5StarRatings Is Found");
			R3star = ProductDetailPage.getRatingSnapShot3Star().getAttribute("data-bv-histogram-rating-count");
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Snapshot for 5StarRatings Is Not Found" + e);
		}	
		return R3star;
	}
	
	public static String GetRatingSnapShot2Star() throws Exception{
		String R2star = null;
		try {			
			TestLogger.testLoggerInfo("Snapshot for 2StarRatings Is Found");
			R2star = ProductDetailPage.getRatingSnapShot2Star().getAttribute("data-bv-histogram-rating-count");
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Snapshot for 2StarRatings Is Not Found" + e);
		}	
		return R2star;
	}
	
	public static String GetRatingSnapShot1Star() throws Exception{
		String R1star = null;
		try {			
			TestLogger.testLoggerInfo("Snapshot for 1StarRatings Is Found");
			R1star = ProductDetailPage.getRatingSnapShot1Star().getAttribute("data-bv-histogram-rating-count");
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Snapshot for 1StarRatings Is Not Found" + e);
		}	
		return R1star;
	}
	
	public static float ValidateAvgOverallRatingFromStar() throws Exception{
		float overallStarCalculation = (float) 0.0;
		float fiveStar = Integer.parseInt(GetRatingSnapShot5Star());
		float fourStar = Integer.parseInt(GetRatingSnapShot4Star());
		float threeStar = Integer.parseInt(GetRatingSnapShot3Star());
		float twoStar = Integer.parseInt(GetRatingSnapShot2Star());
		float oneStar = Integer.parseInt(GetRatingSnapShot1Star());
		float totalStar = (fiveStar + fourStar + threeStar + twoStar + oneStar);
		try {
			overallStarCalculation = (float) ((fiveStar * 5 + fourStar * 4 + threeStar * 3 + twoStar * 2 + oneStar * 1) / totalStar);
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Snapshot for 1StarRatings Is Not Found" + e);
		}	
		return overallStarCalculation;
	}
	
	public static void ClickFilter5StarRatings() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Filter for 5StarRatings Is Found");
			ProductDetailPage.getFilter5StarRatings().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Filter for 5StarRatings Is Not Found" + e);
		}				
	}
	
	public static void ClickFilter4StarRatings() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Filter for 4StarRatings Is Found");
			ProductDetailPage.getFilter4StarRatings().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Filter for 4StarRatings Is Not Found" + e);
		}				
	}
	
	public static void ClickFilter3StarRatings() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Filter for 3StarRatings Is Found");
			ProductDetailPage.getFilter3StarRatings().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Filter for 3StarRatings Is Not Found" + e);
		}				
	}
	
	public static void ClickFilter2StarRatings() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Filter for 2StarRatings Is Found");
			ProductDetailPage.getFilter2StarRatings().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Filter for 2StarRatings Is Not Found" + e);
		}				
	}
	
	public static void ClickFilter1StarRatings() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Filter for 1StarRatings Is Found");
			ProductDetailPage.getFilter1StarRatings().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Filter for 1StarRatings Is Not Found" + e);
		}				
	}
	
	public static String GetAverageCustomerRatingsTitle() throws Exception{
		String avgRatings = null;
		try {			
			TestLogger.testLoggerInfo("Average Customer Ratings Title Is Found");
			avgRatings = ProductDetailPage.getAverageCustomerRatingsTitle().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Average Customer Ratings Title Is Not Found" + e);
		}
		return avgRatings;
	}
	
	public static String GetAvgOverallBVRatings() throws Exception{
		String OverallSummary = null;
		try {			
			TestLogger.testLoggerInfo("Overall Average Customer Ratings Is Found");
			OverallSummary = ProductDetailPage.getAvgOverallBVRatings().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Overall Average Customer Ratings Is Not Found" + e);
		}	
		return OverallSummary;
	}
	
	public static String GetAvgOverallQualityRatings() throws Exception{
		String Quality = null;
		try {			
			TestLogger.testLoggerInfo("Overall Average Customer Quality Ratings Is Found");
			Quality = ProductDetailPage.getAvgOverallQualityRatings().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Overall Average Customer Quality Ratings Is Not Found" + e);
		}	
		return Quality;
	}
	
	public static String GetAvgOverallValueRatings() throws Exception{
		String Value = null;
		try {			
			TestLogger.testLoggerInfo("Overall Average Customer Value Ratings Is Found");
			Value = ProductDetailPage.getAvgOverallValueRatings().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Overall Average Customer Value Ratings Is Not Found" + e);
		}	
		return Value;
	}
	
	public static String GetReviewerName() throws Exception{
		String Rname = null;
		try {			
			TestLogger.testLoggerInfo("Reviewer Name Under Review Tab Is Found");
			Rname = ProductDetailPage.getReviewerName().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Reviewer Name Under Review Tab Is Not Found" + e);
		}	
		return Rname;
	}
	
	public static String GetNumberOfReviewerReviews() throws Exception{
		String Rnumber = null;
		try {			
			TestLogger.testLoggerInfo("Number Of Reviewer Reviews Under Review Tab Is Found");
			Rnumber = ProductDetailPage.getNumberOfReviewerReviews().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Number Of Reviewer Reviews Under Review Tab Is Not Found" + e);
		}
		return Rnumber;
	}
	
	public static String GetReviewerVotes() throws Exception{
		String Votes = null;
		try {			
			TestLogger.testLoggerInfo("Number Of Reviewer Votes Under Review Tab Is Found");
			Votes = ProductDetailPage.getReviewerVotes().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Number Of Reviewer Votes Under Review Tab Is Not Found" + e);
		}
		return Votes;
	}
	
	public static String GetReviewerGender() throws Exception{
		String Gender = null;
		try {			
			TestLogger.testLoggerInfo("Reviewer Gender Under Review Tab Is Found");
			Gender = ProductDetailPage.getReviewerGender().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Reviewer Gender Reviews Under Review Tab Is Not Found" + e);
		}
		return Gender;
	}
	
	public static String GetReviewerAge() throws Exception{
		String Age = null;
		try {			
			TestLogger.testLoggerInfo("Reviewer Age Under Review Tab Is Found");
			Age = ProductDetailPage.getReviewerAge().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Reviewer Age Under Review Tab Is Not Found" + e);
		}
		return Age;
	}
	
	public static String GetRatingOnlyReviews() throws Exception{
		String RatingOnly = null;
		try {			
			TestLogger.testLoggerInfo("Rating Only Reviews Under Review Tab Is Found");
			RatingOnly = ProductDetailPage.getRatingOnlyReviews().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Rating Only Reviews Under Review Tab Is Not Found" + e);
		}
		return RatingOnly;
	}
	
	public static String GetReviewsInOtherLanguages() throws Exception{
		String OtherLang = null;
		try {			
			TestLogger.testLoggerInfo("Reviews In OtherLanguages Under Review Tab Is Found");
			OtherLang = ProductDetailPage.getReviewsInOtherLanguages().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Reviews In OtherLanguages Under Review Tab Is Not Found" + e);
		}
		return OtherLang;
	}
	
	public static void ClickActiveFilter5StarRatings() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Active Filter for 5StarRatings Is Found");
			ProductDetailPage.getActiveFilter5StarRatings().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Active Filter for 5StarRatings Is Not Found" + e);
		}				
	}
	
	public static void ClickActiveFilter4StarRatings() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Active Filter for 4StarRatings Is Found");
			ProductDetailPage.getActiveFilter4StarRatings().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Active Filter for 4StarRatings Is Not Found" + e);
		}				
	}
	
	public static void ClickActiveFilter3StarRatings() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Active Filter for 3StarRatings Is Found");
			ProductDetailPage.getActiveFilter3StarRatings().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Active Filter for 3StarRatings Is Not Found" + e);
		}				
	}
	
	public static void ClickActiveFilter2StarRatings() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Active Filter for 2StarRatings Is Found");
			ProductDetailPage.getActiveFilter2StarRatings().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Active Filter for 2StarRatings Is Not Found" + e);
		}				
	}
	
	public static void ClickActiveFilter1StarRatings() throws Exception{
		try {			
			TestLogger.testLoggerInfo("Active Filter for 1StarRatings Is Found");
			ProductDetailPage.getActiveFilter1StarRatings().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Active Filter for 1StarRatings Is Not Found" + e);
		}				
	}
	
	public static void ClickClearAllActiveFilters() throws Exception{
		try {			
			TestLogger.testLoggerInfo("ClearAll Active Filters Tab Is Found");
			ProductDetailPage.getClearAllActiveFilters().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("ClearAll Active Filters Tab Is Not Found" + e);
		}				
	}
	
	public static String GetReviewSummary() throws Exception{
		String RSummary = null;
		try {			
			TestLogger.testLoggerInfo("Review Summary Is Found");
			RSummary = ProductDetailPage.getReviewSummary().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Review Summary Is Not Found" + e);
		}	
		return RSummary;
	}
	
	public static String GetReviewerBVRating() throws Exception{
		String RSummary = null;
		try {			
			TestLogger.testLoggerInfo("Reviewer BV Rating Is Found");
			RSummary = ProductDetailPage.getReviewerBVRating().getAttribute("title");
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Reviewer BV Rating Is Not Found" + e);
		}	
		return RSummary;
	}
	
	public static String GetReviewerTitle() throws Exception{
		String RTitle = null;
		try {			
			TestLogger.testLoggerInfo("Reviewer Title Is Found");
			RTitle = ProductDetailPage.getReviewerTitle().getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			TestLogger.testLoggerInfo("Reviewer Title Is Not Found" + e);
		}	
		return RTitle;
	}
	
	
 
}

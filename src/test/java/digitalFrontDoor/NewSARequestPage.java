package digitalFrontDoor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewSARequestPage {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"txtSAPID\"]")
	WebElement opportIDField;

	@FindBy(xpath = "//*[@id=\"MainContent_pnlUpdate\"]/div[1]/div/div[2]/div[1]/div[2]/div/img[1]")
	WebElement searchBtn;

	@FindBy(xpath = "//*[@id=\"MainContent_ddlSellingRegion\"]")
	WebElement geoUnitDrpdwn;

	@FindBy(xpath = "//*[@id=\"MainContent_ddlRegion\"]")
	WebElement regionDrpdwn;

	@FindBy(xpath = "//*[@id=\"MainContent_ddlAMSOffering\"]")
	WebElement specialityDrpdwn;

	@FindBy(xpath = "//*[@id=\"txtEndDate\"]")
	WebElement submissionDateField;

	@FindBy(xpath = "//*[@id=\"MainContent_txtWBS\"]")
	WebElement wbsField;

	@FindBy(xpath = "//*[@id=\"MainContent_txtAMSContactDetailsEmail\"]")
	WebElement digitalSalesLeadField;

	@FindBy(xpath = "//*[@id=\"peoplePickerID\"]/div/div[1]")
	WebElement digitalSalesLeadList1;

	@FindBy(xpath = "//*[@id=\"MainContent_txtContactDetailsEmail\"]")
	WebElement clientTeamField;

	@FindBy(xpath = "//*[@id=\"peoplePickerID\"]/div/div[1]")
	WebElement clientTeamList1;

	@FindBy(xpath = "//*[@id=\"txtTechPlatform\"]")
	WebElement technologyArea;

	@FindBy(xpath = "//*[@id=\"txtOppLongDesc\"]")
	WebElement opportDescArea;
	
	@FindBy(xpath = "//*[@id=\"txtDesc\"]")
	WebElement excJustifyArea;

	@FindBy(xpath = "//*[@id=\"MainContent_btnSubmit\"]")
	WebElement submitBtn;

	public NewSARequestPage(WebDriver driver) {

		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);

	}

	// Choose geoUnit type
	public void chooseGeoUnit() {

		Select selectGU = new Select(geoUnitDrpdwn);
		selectGU.selectByIndex(2);

	}

	// Choose Region type
	public void chooseRegion() {

		Select selectR = new Select(regionDrpdwn);
		selectR.selectByIndex(2);

	}
	
	// Choose Speciality type
		public void chooseSpeciality() {

			Select selectS = new Select(specialityDrpdwn);
			selectS.selectByIndex(12);

		}
		
		

}

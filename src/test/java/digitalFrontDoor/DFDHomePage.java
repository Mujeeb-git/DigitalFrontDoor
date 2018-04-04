package digitalFrontDoor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DFDHomePage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"BanQuickLinks\"]/div/a[1]/p")
	WebElement solArchBtn;
	
	@FindBy(xpath = "//*[@id=\"BanQuickLinks\"]/div/a[2]/p")
	WebElement SMEBtn;
	
	@FindBy(xpath = "//*[@id=\"BanQuickLinks\"]/div/a[3]/p")
	WebElement pSpecialistBtn;
	
	//Menu Options
	@FindBy(xpath = "//*[@id=\"siteMenu\"]/ul/li[2]/span")
	WebElement submitRequestLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:3\"]/li[1]/a")
	WebElement mSolArchLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:3\"]/li[2]/a")
	WebElement mpSpecialistLnkn;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:3\"]/li[3]/a")
	WebElement mSMELnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:3\"]/li[4]/a")
	WebElement mEditSolArchLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu\"]/ul/li[3]/a")
	WebElement mNewSalesSRecordLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu\"]/ul/li[4]/span")
	WebElement mManageAllocationLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:10\"]/li[1]/a")
	WebElement mSIAllocLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:10\"]/li[2]/a")
	WebElement mPropSplAllocLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:10\"]/li[3]/a")
	WebElement mSMEAllocLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:10\"]/li[4]/a")
	WebElement mMngExcepReqLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu\"]/ul/li[5]/span")
	WebElement mMyHmeLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:16\"]/li[1]/a")
	WebElement mSDbwUpdateLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:16\"]/li[2]/a")
	WebElement mMySolLnk;
		
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:16\"]/li[3]/a")
	WebElement mMySalesSRecLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu\"]/ul/li[6]/span")
	WebElement mReportLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:21\"]/li[1]/a")
	WebElement mSIMasterReportLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:21\"]/li[2]/a")
	WebElement mSolTrackReportLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:21\"]/li[3]/a")
	WebElement mGDNTrackReportLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:21\"]/li[4]/a")
	WebElement mBWReportLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:21\"]/li[5]/a")
	WebElement mPropReqReportLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:21\"]/li[6]/a")
	WebElement mSMEReportLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:21\"]/li[7]/a")
	WebElement mTime2SolReportLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:21\"]/li[8]/a")
	WebElement mSalesSRecReportLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu:submenu:21\"]/li[9]/a")
	WebElement mSolcomplReportLnk;
		
	@FindBy(xpath = "//*[@id=\"siteMenu\"]/ul/li[7]/a")
	WebElement mDocSearchLnk;
	
	@FindBy(xpath = "//*[@id=\"siteMenu\"]/ul/li[8]/span")
	WebElement mUtilitiesLnk;
	
	public DFDHomePage(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}

}

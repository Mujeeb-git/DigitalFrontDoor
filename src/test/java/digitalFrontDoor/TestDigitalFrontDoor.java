package digitalFrontDoor;

import java.util.ArrayList;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDigitalFrontDoor {

	WebDriver driver;
	WebDriverWait wait;
	DFDHomePage objDFDHomePage;
	LoginPage objLoginPage;
	NewSARequestPage objNewSARequestPage;
	Utility objUtility;
	String decryptedPassword, encryptedPassword, userName, dateStr;

	@BeforeClass
	public void setUp() throws Exception {

		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Mujeeb\\Jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dfdtest.accenture.com");
		Thread.sleep(20000);

		// UserCreds
		userName = "mujeeb.mohammed";
		encryptedPassword = "TmV3bGlmZUA3";
		byte[] decryptedPasswordBytes = Base64.getDecoder().decode(encryptedPassword);
		decryptedPassword = new String(decryptedPasswordBytes);

		wait = new WebDriverWait(driver, 120);
		// Login Page - Enter credentials
		objLoginPage = new LoginPage(driver);
		objLoginPage.userName.sendKeys(userName);
		objLoginPage.password.sendKeys(decryptedPassword);
		objLoginPage.submit.click();
		Thread.sleep(10000);
		objLoginPage.confirmYourIdentity();

		// 30s timeout
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"BanQuickLinks\"]/div/a[1]/p")));
		objUtility = new Utility();
		Reporter.log("Entering into the test execution", true);
	}

	@Test(priority = 0)
	public void testSARequest() throws Exception {
		// DFD Home Page
		objDFDHomePage = new DFDHomePage(driver);
		objDFDHomePage.solArchBtn.click();
		Thread.sleep(10000);
		
		//Switch to the other tab
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));

		// New SA Request Page
		objNewSARequestPage = new NewSARequestPage(driver);
		objNewSARequestPage.opportIDField.sendKeys(Integer.toString(objUtility.generateRandomNumber(660000, 690000)));
		objNewSARequestPage.searchBtn.click();
		Thread.sleep(5000);
		// If Geography Unit drop down is enable then select the value
		if (objNewSARequestPage.geoUnitDrpdwn.isEnabled()) {
			objNewSARequestPage.chooseGeoUnit();
		}
		// If Region drop down is enable then select the value
		if (objNewSARequestPage.regionDrpdwn.isDisplayed() && objNewSARequestPage.regionDrpdwn.isEnabled()) {
			objNewSARequestPage.chooseRegion();
		}
		objNewSARequestPage.chooseSpeciality();
		objNewSARequestPage.submissionDateField.sendKeys(objUtility.addDays(10));
		objNewSARequestPage.wbsField.sendKeys("WBSE1234");
		objNewSARequestPage.digitalSalesLeadField.sendKeys("d.kumar.kathuroju");
		Thread.sleep(5000);
		objNewSARequestPage.digitalSalesLeadList1.click();
		objNewSARequestPage.clientTeamField.sendKeys("mujeeb.mohammed");
		Thread.sleep(5000);
		objNewSARequestPage.clientTeamList1.click();
		objNewSARequestPage.technologyArea.sendKeys("This is the Technology Area");
		objNewSARequestPage.opportDescArea.sendKeys("This is the Opportunity description Area");
		if (objNewSARequestPage.excJustifyArea.isDisplayed()) {
			objNewSARequestPage.excJustifyArea.sendKeys("This is the exception justification Area");
		}
		objNewSARequestPage.submitBtn.click();
		
		

	}
}

package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.edge.EdgeDriver;

public class CreateAccount {

	public static void main(String[] args) {

		// launch Chrome browser
		ChromeDriver driver = new ChromeDriver();

		// EdgeDriver driver = new EdgeDriver();

		// Navigate to the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		// maximize the browser window
		driver.manage().window().maximize();

		// Enter the user name
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		// Enter the pwd
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click the login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click the accounts tab
		driver.findElement(By.linkText("Accounts")).click();

		// Click the Create Account option
		driver.findElement(By.linkText("Create Account")).click();

		// Enter the value in accountName field
		driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");

		// Enter the description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		// Enter the value in LocalName Field

		// Enter the value in SiteName Field

		// Enter the value for AnnualRevenue Field

		// Select "ComputerSoftware" value for Industry dropdown

		WebElement industryDropdownField = driver.findElement(By.name("industryEnumId"));
		industryDropdownField.click();

		Select industryDropdownValue = new Select(industryDropdownField);
		industryDropdownValue.selectByValue("IND_SOFTWARE");

		// Select "S-Corporation" value for OwnerShip dropdown

		WebElement ownershipDropdownField = driver.findElement(By.name("ownershipEnumId"));
		ownershipDropdownField.click();

		Select ownershipDropdownValue = new Select(ownershipDropdownField);
		ownershipDropdownValue.selectByVisibleText("S-Corporation");

		// Select "Employee" value for Source dropdown

		WebElement sourceDropdownField = driver.findElement(By.id("dataSourceId"));
		sourceDropdownField.click();

		Select sourceDropdownValue = new Select(sourceDropdownField);
		sourceDropdownValue.selectByValue("LEAD_EMPLOYEE");

		// Select "eCommerce Site Internal Campaign" value from Marketing Campaign
		// dropdown

		WebElement marketingCampaignField = driver.findElement(By.id("marketingCampaignId"));
		marketingCampaignField.click();

		Select marketingCampaignValue = new Select(marketingCampaignField);
		marketingCampaignValue.selectByIndex(6);

		// Select "Texas" value from State/Province dropdown

		WebElement stateProvinceField = driver.findElement(By.id("generalStateProvinceGeoId"));
		stateProvinceField.click();

		Select stateProvinceValue = new Select(stateProvinceField);
		stateProvinceValue.selectByValue("TX");

		// Click the Create Account button

		// close the browser
		// driver.close();

	}

}

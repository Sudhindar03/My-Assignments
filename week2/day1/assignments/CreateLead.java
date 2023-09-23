package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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

		// Click the Leads tab
		driver.findElement(By.linkText("Leads")).click();

		// Click the Create Lead option
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter the Company Name, First Name and Last Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestCompanyName");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TestFirstName");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("TestLastName");

		// Select "Employee" value for Source dropdown

		WebElement sourceDropdownField = driver.findElement(By.id("createLeadForm_dataSourceId"));
		sourceDropdownField.click();

		Select sourceDropdownValue = new Select(sourceDropdownField);
		sourceDropdownValue.selectByIndex(4);

		// Select "Automobile" value for Marketing Campaign dropdown

		WebElement marketingCampaignDropdownField = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		marketingCampaignDropdownField.click();

		Select marketingCampaignDropdownValue = new Select(marketingCampaignDropdownField);
		marketingCampaignDropdownValue.selectByVisibleText("Automobile");

		// Select "Corporation" value for Ownership dropdown

		WebElement ownershipDropdownField = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		ownershipDropdownField.click();

		Select ownershipDropdownValue = new Select(ownershipDropdownField);
		ownershipDropdownValue.selectByValue("OWN_CCORP");

		// Click the Create Lead button

		driver.findElement(By.name("submitButton")).click();

		// Verify the web page title

		String createLeadPageTitle = driver.getTitle();
		System.out.println(createLeadPageTitle);

		// Click the logout button

		driver.findElement(By.linkText("Logout")).click();

		// Close the browser
		driver.close();

	}

}

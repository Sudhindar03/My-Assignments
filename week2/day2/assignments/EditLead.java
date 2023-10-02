package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		// launch Chrome browser
		ChromeDriver driver = new ChromeDriver();

		// EdgeDriver driver = new EdgeDriver();

		// Navigate to the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		// maximize the browser window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Enter the user name
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");

		// Enter the pwd
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		// Click the login button
		driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();

		// Click the CRM/SFA link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/')]")).click();

		// Click the Leads tab
		driver.findElement(By.linkText("Leads")).click();

		// Click the Find Leads option
		WebElement clickFindLeadsOption = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		clickFindLeadsOption.click();

		// Enter first name
		driver.findElement(By.xpath("(//div[@class='x-form-element'])[19]/input")).sendKeys("S");

		// Click find leads button
		WebElement findLeadsButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeadsButton.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Click on first resulting lead
		WebElement firstLeadIDLink = driver
				.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));

		String firstLeadID = firstLeadIDLink.getText();
		System.out.println(firstLeadID);

		firstLeadIDLink.click();

		// Verify title of the page

		String existingViewLeadPageTitle = driver.getTitle();
		System.out.println(existingViewLeadPageTitle);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Click Edit
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();

		// Change the company name
		WebElement existingCompanyName = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		existingCompanyName.clear();

		existingCompanyName.sendKeys("Test Company Name");

		// Click Update
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();

		// Confirm the changed name appears
		WebElement newOrgName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String viewLead = newOrgName.getText();
		System.out.println(viewLead);

		if (viewLead.contains("Test Company Name")) {
			System.out.println("The company Name for the existing Lead is updated as expected");
		} else {
			System.out.println("he company Name for the existing Lead is NOT updated as expected");
		}

		// Close the browser (Do not log out)
		driver.close();
	}

}

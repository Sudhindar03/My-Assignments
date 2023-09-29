package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class DupicateLead {

	public static void main(String[] args) {
		// launch Chrome browser
		ChromeDriver driver = new ChromeDriver();

		// EdgeDriver driver = new EdgeDriver();

		// Navigate to the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		// maximize the browser window
		driver.manage().window().maximize();

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

		// Click the Create Lead option
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter the Company Name, First Name and Last Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestCompanyName");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TestFirstName");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("TestLastName");

		// Enter FirstName(Local) Field Using id Locator

		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("TestFirstNameLocal");

		// Enter Department Field Using any Locator of Your Choice

		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Test Department");

		// Enter Description Field Using any Locator of your choice

		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Test Description");

		// Enter your email in the E-mail address Field using the locator of your choice

		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("testemail@testleaf.com");

		// Click on Create Lead Button

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		// Get the Title of Resulting Page using driver.getTitle()

		String viewLeadPageTitle = driver.getTitle();
		System.out.println(viewLeadPageTitle);

		// Click on Duplicate button

		driver.findElement(By.xpath("//a[text() = 'Duplicate Lead']")).click();

		// Clear the CompanyName Field using .clear() And Enter new CompanyName

		WebElement companyNameField = driver.findElement(By.id("createLeadForm_companyName"));
		companyNameField.clear();

		companyNameField.sendKeys("Test Company Name 2");

		// Clear the FirstName Field using .clear() And Enter new FirstName

		WebElement firstNameField = driver.findElement(By.id("createLeadForm_firstName"));
		firstNameField.clear();

		firstNameField.sendKeys("Test First Name 2");

		// Click on Create Lead Button

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		// Get the Title of Resulting Page using driver.getTitle()

		System.out.println(viewLeadPageTitle);
	}

}

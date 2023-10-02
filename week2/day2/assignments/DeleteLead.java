package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// launch Chrome browser
		ChromeDriver driver = new ChromeDriver();

		// EdgeDriver driver = new EdgeDriver();

		// Navigate to the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		// maximize the browser window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

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

		// Click the Phone tab
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();

		// Enter the Phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(" ");

		// Click find leads button
		WebElement findLeadsButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeadsButton.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Capture lead ID of First Resulting lead
		WebElement firstLeadIDLink = driver
				.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));

		String firstLeadID = firstLeadIDLink.getText();
		System.out.println(firstLeadID);

		// Click First Resulting lead
		firstLeadIDLink.click();

		// Click Delete
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Delete']")).click();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		// Enter captured lead ID
		driver.findElement(By.xpath("(//div[@class='x-form-element'])/input[@name='id']")).sendKeys(firstLeadID);

		// Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// Verify message "No records to display" in the Lead List. This message
		// confirms the successful deletion

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement noRecordsToDisplayElement = driver.findElement(By.xpath("//div[@class='x-paging-info']"));

		String noRecordsToDisplayMessage = noRecordsToDisplayElement.getText();
		System.out.println(noRecordsToDisplayMessage);

		if (noRecordsToDisplayMessage.equalsIgnoreCase("No records to display")) {
			System.out.println("The Lead record successfully got deleted");
		} else {
			System.out.println("The Lead record is not deleted");
		}

		// Close the browser (Do not log out)
		driver.close();
	}

}

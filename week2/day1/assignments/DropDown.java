package week2.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		// launch Chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Navigate to the URL
		driver.get("https://www.leafground.com/select.xhtml");

		// maximize the browser window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Select favorite UI automation tool from the dropdown

		WebElement uiAutomationToolDropdownField = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		uiAutomationToolDropdownField.click();

		Select uiAutomationToolDropdownValue = new Select(uiAutomationToolDropdownField);
		uiAutomationToolDropdownValue.selectByVisibleText("Selenium");

		// Select preferred Country from the dropdown

		driver.findElement(By.xpath("//label[contains(text(),'Select Country')]")).click();

		driver.findElement(By.xpath("//li[@data-label='India']")).click();

		// Choose the City from the dropdown

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//label[contains(text(),'Select City')]")).click();

		driver.findElement(By.xpath("//li[@data-label='Chennai']")).click();

		// Choose a Course from the dropdown

		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();

		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();

		// Choose a language from the dropdown

		driver.findElement(By.xpath("//label[text()='Select Language']")).click();

		driver.findElement(By.xpath("//li[text()='English']")).click();

		// select 2 irrespective of the language chosen

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//label[text()='Select Values']")).click();

		driver.findElement(By.xpath("//li[text()='Two']")).click();
	}

}

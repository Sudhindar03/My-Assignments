package week2.day2;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.Select;

public class LearnXpaths {

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
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");

		// Click the login button
		driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();

		// Click the CRM/SFA link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/')]")).click();

		// Click the logout button
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

	}
}
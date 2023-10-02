package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Navigate to the facebook URL
		driver.get("https://en-gb.facebook.com/");

		// maximize the browser window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Click on Create New Account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		// Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Sudhindar");

		// Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("K M");

		// Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1593574560");

		// Enter the password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("skpassword01");

		// Handle all the three drop downs

		WebElement dobDay = driver.findElement(By.xpath("//select[@id='day']"));

		Select dobDaySelect = new Select(dobDay);
		dobDaySelect.selectByVisibleText("6");

		WebElement dobMonth = driver.findElement(By.xpath("//select[@id='month']"));

		Select dobMonthSelect = new Select(dobMonth);
		dobMonthSelect.selectByIndex(1);

		WebElement dobYear = driver.findElement(By.xpath("//select[@id='year']"));

		Select dobYearSelect = new Select(dobYear);
		dobYearSelect.selectByValue("1990");

		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();

		// close the browser
		// driver.close();
	}

}

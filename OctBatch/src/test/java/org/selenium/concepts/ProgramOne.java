package org.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramOne {

	public static void main(String[] args) {
		// 1.set the property-->key -->driver -->value --> location of driver
		// webdriver.ie.driver
		// webdriver.gecko.driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\OctBatch2021\\OctBatch\\Drivers\\chromedriver.exe");
		// 2. launch the browser-->InternetExploreDriver,FireFoxDriver
		WebDriver driver = new ChromeDriver();// webdriver->interface, obj cant be created,so for chromedriver class we
												// are creating obj as driver
		// 3. get the url
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		// 4.maximize the browser
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl: " + currentUrl);

		// find the locatr of username--> WebElement(I)
		driver.findElement(By.name("firstname")).sendKeys("Manivannan");// insert value

		// find the locatr of lastName--> WebElement(I)
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Thamilselvan");// insert value

		// find the locatr of emailID--> WebElement(I)
		WebElement emailID = driver.findElement(By.name("reg_email__"));
		emailID.sendKeys("t.manier404@gmail.com");// insert value

		// find the locatr of passWord--> WebElement(I)
		WebElement passWord = driver.findElement(By.id("password_step_input"));
		passWord.sendKeys("asdfadASDA988");// insert value

		// find the locatr of submit--> WebElement(I)
		WebElement submitButton = driver.findElement(By.name("websubmit"));
		submitButton.click();// click the button

		driver.close();// close the browser
		driver.quit();// chromedriver.exe
	}

}

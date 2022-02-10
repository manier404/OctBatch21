package stepdefintion;

import resource.BaseClass1;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AddCustomerSteps extends BaseClass1 {
	static WebDriver driver;

	@Given("the user is in telecom home page")
	public void the_user_is_in_telecom_home_page() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\JanBatch2021\\org.Cucumber\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/telecom/");
		Thread.sleep(20000);

	}

	@Given("the user click on Add Customer")
	public void the_user_click_on_Add_Customer() throws InterruptedException {
		try {

//		Thread.sleep(3000);
//		driver.findElement(By.xpath("details-button")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
//		Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();

		} catch (Exception e) {
			throw new cucumber.api.PendingException();
		}

	}

	@When("the user should enter all the details")
	public void the_user_should_enter_all_the_details() {
		try {
			driver.findElement(By.xpath("//label[text()='Done']")).click();
			driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Manivannan");
			driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Thamilselvan");
			driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("t.manier404@gmail.com");
			driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Chennai");
			driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("9894738299");

		} catch (Exception e) {
			throw new cucumber.api.PendingException();
		}
	}

	@When("the user clicks submit button")
	public void the_user_clicks_submit_button() {
		try {
			driver.findElement(By.xpath("//input[@type='submit']")).click();

		} catch (Exception e) {
			throw new cucumber.api.PendingException();
		}
	}

	@When("the user shloud displayed with customer id")
	public void the_user_shloud_displayed_with_customer_id() {
			Assert.assertTrue(driver.findElement(By.xpath("//b[text()='Customer ID']")).isDisplayed());
			System.out.println("Customer ID");
			System.out.println("before screenshot");
//			BaseClass1 u = new BaseClass1();
//			u.screenshot("_Register");
			System.out.println("after screenshot");
	
	}
	
	
	@Given("user is in facebok page")
	public void user_is_in_facebok_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\JanBatch2021\\org.Cucumber\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("user enter {string} and {string} and click login button")
	public void user_enter_and_and_click_login_button(String userName, String passWord) {
	   driver.findElement(By.xpath("//input[@name='email']")).sendKeys(userName);
	   driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(passWord);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}

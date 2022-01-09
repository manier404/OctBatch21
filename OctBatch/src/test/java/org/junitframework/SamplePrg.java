package org.junitframework;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class SamplePrg {
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
		System.out.println("************");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\Localrepository4\\OctBatch\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();// --> webdriver interface --> we cant create obj
		 driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		 driver.manage().window().maximize();
//		 String title = driver.getTitle();
//		 System.out.println("Title : "+title);
//		 String currentUrl = driver.getCurrentUrl();
//		 System.out.println("currentUrl : "+currentUrl);
//		 Assert.assertEquals("verify Title", driver.getTitle().contains("Sign up"));
//		 Assert.assertTrue(true, "title");
//		 Assert.assertEquals("verify Current URL", driver.getCurrentUrl().contains("facebook"));
	}
	@Before
	public void beforeMethod() {
		System.out.println("Before Method");
		System.out.println("************");
		Date d = new Date();
		System.out.println("Execution date :"+d);
	}
	
	@Test
	public void TestOne() {
		System.out.println("Test one method");
		System.out.println("************");
		driver.findElement(By.name("firstname")).sendKeys("Mani");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Vannan");
//		Assert.assertTrue(true, "Vannan");
//		Assert.assertEquals("Vannan", lastname.getAttribute("Value"));
		
	}
	
	@After
	public void afterMethod() throws IOException {
		System.out.println("After Method");
		System.out.println("************");
//		TakesScreenshot tk = (TakesScreenshot)driver;
//		File src = tk.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\Dell\\git\\Localrepository4\\OctBatch\\Drivers\\screenshot\\Screenshot.jpg"); 
//		FileUtils.copyDirectory(src, dest);
		Date d = new Date();
		System.out.println("Execution date :"+d);
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
		System.out.println("************");
		driver.quit();
	}
	
	@Test 
	@Ignore
	public void TestTwo() {
		System.out.println("Test Two method");
		System.out.println("************");
		driver.findElement(By.name("reg_email__")).sendKeys("Mani@sadf");
		driver.findElement(By.name("reg_passwd__")).sendKeys("adsfklaslfd");
		
	}
	
}


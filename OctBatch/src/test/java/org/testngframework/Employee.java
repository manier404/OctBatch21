package org.testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Employee {
	static WebDriver driver;
@Parameters ({"username","Userpassword"})
@Test(groups= {"Regression","Smoke"})
private void testone(@Optional("Selenium")String username,@Optional("hello") String userpassword) {
	System.out.println("Before Class");
	System.out.println("************");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\Localrepository4\\OctBatch\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();// --> webdriver interface --> we cant create obj
	 driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	 driver.manage().window().maximize();
	 driver.findElement(By.name("firstname")).sendKeys(username);
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys(userpassword);
}
@Parameters ({"username","Userpassword"})
@Test(groups= {"Regression","Sanity"})
private void testTwo(String username,String userpassword) {
	System.out.println("Before Class");
	System.out.println("************");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\Localrepository4\\OctBatch\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();// --> webdriver interface --> we cant create obj
	 driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	 driver.manage().window().maximize();
	 driver.findElement(By.name("firstname")).sendKeys(username);
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys(userpassword);
}
@Test(groups= {"Regression"})
private void testThree(@Optional("Selenium")String username,@Optional("hello") String userpassword) {
	System.out.println("Before Class");
	System.out.println("************");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\Localrepository4\\OctBatch\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();// --> webdriver interface --> we cant create obj
	 driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	 driver.manage().window().maximize();
	 driver.findElement(By.name("firstname")).sendKeys(username);
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys(userpassword);
}
}

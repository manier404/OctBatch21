package org.selenium.concepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\OctBatch2021\\\\OctBatch\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		String titlePage = driver.getTitle();
		System.out.println("Title of Page :"+titlePage);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url :"+currentUrl);
		//set the value for send keys
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement emailText = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','Manivannan')", emailText);
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", emailText);
		String userName = executeScript.toString();
		System.out.println("UserName entered using js : "+userName);
		WebElement passText = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','asdfasFSDFS345')", passText);
		Object executeScriptpass = js.executeScript("return arguments[0].getAttribute('value')", passText);
		String userName1 = executeScriptpass.toString();
		System.out.println("password entered using js : "+userName1);
//		driver.findElement(By.name("login")).click();
		//Scroll down
		WebElement downScroll = driver.findElement(By.xpath("//a[text()='Help']"));
		js.executeScript("arguments[0].scrollIntoView(true)", downScroll);
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		// % temp location of screenshot file
		File source = tk.getScreenshotAs(OutputType.FILE);
		
		//destination for specific location
		File dest = new File("C:\\Users\\Dell\\Desktop\\screenshot\\screenshot1.jpg");
		
		FileUtils.copyFile(source, dest);
	}

}

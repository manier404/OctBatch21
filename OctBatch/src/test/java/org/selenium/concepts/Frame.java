package org.selenium.concepts;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\OctBatch2021\\\\OctBatch\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		String titlePage = driver.getTitle();
		System.out.println("Title of Page :"+titlePage);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url :"+currentUrl);
//		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		WebElement frameID = driver.findElement(By.id("a077aa5e"));// frame id from dom structure
//		frameID.click();
		driver.switchTo().frame(frameID);
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		System.out.println("size of web elements:  "+ findElements.size());
//		implicit wait		
//Syntax:
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
//explicit wait:--> if locate the webelement in 2 sec, it will move to next line of code.
//
//		--> for specific / particular locator
//Syntax:

WebDriverWait w = new WebDriverWait(driver,1000);
 WebElement element = w.until(ExpectedConditions.elementToBeClickable(By.tagName("iframe")));

//fluent wait--> similar to explicit wait
//
//ignore exception(--> pooling time every 5 sec try to locate the element)

//Syntax:
Wait w1 = new FluentWait(driver).withTimeout(100,TimeUnit.SECONDS).pollingEvery(10,TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
		
	}

}

package org.selenium.concepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\OctBatch2021\\\\OctBatch\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		String titlePage = driver.getTitle();
		System.out.println("Title of Page :"+titlePage);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url :"+currentUrl);
		
		WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		String parentwindowHandle = driver.getWindowHandle();// control will be in parent window
		System.out.println("Parent Window id : "+parentwindowHandle);
		Set<String> ChildwindowHandles = driver.getWindowHandles();// control will move to child window
		System.out.println("Child Window id : "+ChildwindowHandles);
		//moving control from parent to child based on windowid
		for (String X : ChildwindowHandles) {
			if (!X.equals(parentwindowHandle)) {
				driver.switchTo().window(X);
			}
		}
		driver.findElement(By.xpath("//a[text()='Agile Project']")).click();
		
		
	}

}

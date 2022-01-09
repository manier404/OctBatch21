package org.selenium.concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\OctBatch2021\\\\OctBatch\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String titlePage = driver.getTitle();
		System.out.println("Title of Page :"+titlePage);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url :"+currentUrl);
		
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Actions act = new Actions(driver);
		act.contextClick(findElement).perform();
		
		Robot r = new Robot();
		//down key
		for (int i = 0; i <= 2; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		// enter key
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}

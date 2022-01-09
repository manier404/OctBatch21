package org.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\OctBatch2021\\\\OctBatch\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		String titlePage = driver.getTitle();
		System.out.println("Title of Page :"+titlePage);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url :"+currentUrl);
		Actions act = new Actions(driver);
		// moving webElelemt bank to specific location
		WebElement sourceElement = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement destElement = driver.findElement(By.id("bank"));
		act.dragAndDrop(sourceElement, destElement).perform();
		// moving webElelemt sales to specific location
		WebElement sourElement = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement destinElement = driver.findElement(By.id("loan"));
		act.dragAndDrop(sourElement, destinElement).perform();
		// moving webElelemt amt to specific location
		WebElement sourceamtElement = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement destamtElement = driver.findElement(By.id("amt7"));
		act.dragAndDrop(sourceamtElement, destamtElement).perform();
		// moving webElelemt amt to specific location
		WebElement sourceamElement = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement destamElement = driver.findElement(By.id("amt8"));
		act.dragAndDrop(sourceamElement, destamElement).perform();
		System.out.println(driver.findElement(By.xpath("//a[text()='Perfect!']")).getText());
		driver.quit();
	}

}

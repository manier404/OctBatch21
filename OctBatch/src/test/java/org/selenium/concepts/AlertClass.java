package org.selenium.concepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\OctBatch2021\\\\OctBatch\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		String titlePage = driver.getTitle();
		System.out.println("Title of Page :"+titlePage);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url :"+currentUrl);
		//simple alert
		driver.findElement(By.id("alertButton")).click();
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println("Simple alert Text: "+text);
		a.accept();//ok button
		//Confirm alert
		driver.findElement(By.id("confirmButton")).click();
		String text2 = a.getText();
		System.out.println("Confirm alert Text: "+text2);
		a.dismiss();//cancel button
		//prompt alert
		driver.findElement(By.id("promtButton")).click();
		String text3 = a.getText();
		System.out.println("prompt alert Text: "+text3);
		a.sendKeys("Boss");
		a.accept();// ok button
		// typecase the interface
		TakesScreenshot tk = (TakesScreenshot)driver;
		// % temp location of screenshot file
		File source = tk.getScreenshotAs(OutputType.FILE);
		//destination for specific location
		File dest = new File("C:\\Users\\Dell\\Desktop\\screenshot\\screenshot.jpg");
		FileUtils.copyFile(source, dest);
		
		}

}

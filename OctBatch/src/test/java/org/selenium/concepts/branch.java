package org.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.*;

public class branch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\OctBatch2021\\\\OctBatch\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.iitm.ac.in/");
		driver.manage().window().maximize();
		
		String titlePage = driver.getTitle();
		System.out.println("Title of Page :"+titlePage);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url :"+currentUrl);
		
		Actions act = new Actions(driver);
		//MouseHover action
		WebElement Acad = driver.findElement(By.xpath("(//a[text()='Academics'])[1]"));
		act.moveToElement(Acad).perform();
		
		WebElement depart = driver.findElement(By.xpath("(//a[text()='Departments'])[1]"));
		act.moveToElement(depart).perform();
		
		driver.findElement(By.xpath("(//a[text()='Biotechnology'])[1]")).click();
		
		WebElement bioTec = driver.findElement(By.xpath("//p[contains(text(),'The Department of Biotechnology was ')]"));
		System.out.println("Bio : "+bioTec.getText());
	}

}

package org.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class GmailSleep {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "C:\\\\Users\\\\Dell\\\\OctBatch2021\\\\OctBatch\\\\Drivers\\\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("t.manier404@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("asdf&^*&^");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		WebElement errorMsG = driver.findElement(By.xpath("//span[contains(text(),'Wrong')]"));
		System.out.println(errorMsG.getText());
		
		
	}

}

package org.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPrg {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\OctBatch2021\\\\OctBatch\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Manivannan");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Thamilselvan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9894738299");
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("asdfasdfJKGK^&*^&");
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		WebElement textBelow = driver.findElement(By.xpath("//p[contains(text(),'By')]"));
		System.out.println(textBelow.getText());
		driver.quit();
	}

}

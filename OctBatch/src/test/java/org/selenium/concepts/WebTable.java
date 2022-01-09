package org.selenium.concepts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.proj.BaseClass;

public class WebTable extends BaseClass {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\OctBatch2021\\\\OctBatch\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		launchUrl("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		maxWin();
		String titlePage = driver.getTitle();
		WebElement findElement = driver.findElement(By.xpath(""));
		textBox(findElement,"Boss");
		System.out.println("Title of Page :"+titlePage);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url :"+currentUrl);
		//find the table row
		List<WebElement> tableRows = driver.findElements(By.tagName("tr"));
		System.out.println("Size of table row: "+tableRows.size());
		ScreenshotSaving("WebTable");
		
		//iterationg of table rows
		
		for (WebElement TableRow : tableRows) {
			WebElement row = tableRows.get(0);// each table row iteration
			System.out.println("Table Row: "+ TableRow.getText());
			
		//table data 
			List<WebElement> tableDatas = driver.findElements(By.tagName("td"));
			System.out.println("Size of table data: "+tableDatas.size());
		
		// iterating the table data
			
			for (WebElement TableData  : tableDatas) {
				WebElement data = tableDatas.get(0);// each table data iteration
				System.out.println("Table Data: "+TableData.getText());
			}
		}
		
	}

}

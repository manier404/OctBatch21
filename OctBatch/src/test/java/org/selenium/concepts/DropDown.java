package org.selenium.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\OctBatch2021\\\\OctBatch\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		String titlePage = driver.getTitle();
		System.out.println("Title of Page :"+titlePage);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url :"+currentUrl);
		WebElement dayDrop = driver.findElement(By.id("day"));
		Select sDay = new Select(dayDrop);
		sDay.selectByIndex(3); //-->index starts from zero
		List<WebElement> options = sDay.getOptions();
		for (WebElement X : options) {
			System.out.println("Value of Day: "+X.getText());
		}
		WebElement monthDrop = driver.findElement(By.id("month"));
		Select sMonth = new Select(monthDrop);
		sMonth.selectByValue("4"); // --> value starts from one
		List<WebElement> optionsMonth = sMonth.getOptions();
		for (WebElement X : optionsMonth) {
			System.out.println("Value of Month: "+X.getText());
		}
		WebElement yearDrop = driver.findElement(By.id("year"));
		Select sYear = new Select(yearDrop);
		sYear.selectByVisibleText("2021");
		List<WebElement> optionsYear = sYear.getOptions();
		for (WebElement X : optionsYear) {
			System.out.println("Value of Year: "+X.getText());	}
		//Checkbox--> findElements--> return type list of webElement
		driver.get("http://demo.automationtesting.in/Register.html");
		List<WebElement> allHobbies = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Count of the check Box: "+allHobbies.size());
		
		for (WebElement CHK : allHobbies) {
			String attribute = CHK.getAttribute("value");
			System.out.println("Hobbies :"+attribute); //"Cricket" .equals("Cricket") .contains("Cri")
			if (!attribute.equals("Cricket")&&!attribute.equals("Hockey")) {
				CHK.click();
			}
		} 
		
		
	}

}

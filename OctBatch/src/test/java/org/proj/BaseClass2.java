package org.proj;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass2 {
	static WebDriver driver;

	// 1. chromedriver
	public void getChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dell\\\\OctBatch2021\\\\OctBatch\\\\Drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	// 2. internetExplorere
	public void getInternetExplorerDriver() {
		System.setProperty("webdriver.ie.driver",
				"C:\\\\Users\\\\Dell\\\\OctBatch2021\\\\OctBatch\\\\Drivers\\\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	//3. url launch
	public static void launchUrl(String Url) {
		driver.get(Url);
	}
	//4.textbox
	public static void textBox(WebElement Element,String Name) {
		Element.sendKeys(Name);
	}
	//5.screenshot
	public static void ScreenshotSaving(String Name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\desktop\\screenshot"+Name+".jpg");
		FileUtils.copyFile(src, desc);
	}
	//6.btn click
		public static void btnClick(WebElement Element) {
			Element.click();
		}
		//7. maxwind
		public static void maxWin() {
			driver.manage().window().maximize();
		}
		// 1. chromedriver
		public void getChromeDrivernew() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\Dell\\\\OctBatch2021\\\\OctBatch\\\\Drivers\\\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
}

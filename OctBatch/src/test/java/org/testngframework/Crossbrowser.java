package org.testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
static WebDriver driver;

@Parameters({"browser"})
@Test
private void TestOne(String browser) {
	
if (browser.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\Localrepository4\\OctBatch\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
} else if (browser.equals("ff")) {
	System.setProperty("webdriver.gecko.driver", "");
	driver = new FirefoxDriver();
}else {
	System.setProperty("webdriver.ie.driver", "C:\\Users\\Dell\\git\\Localrepository4\\OctBatch\\Drivers\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
}
}
}

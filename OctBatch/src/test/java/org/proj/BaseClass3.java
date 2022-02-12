package org.proj;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass3 {

public static WebDriver driver;
//1
public WebDriver getChromeDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\Jan2021_batch-\\Jan_Batch\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	return driver;
}
//2
public WebDriver getInternetDriver() {
	System.setProperty("webdriver.ie.driver", "C:\\Users\\Dell\\JanBatch2021\\Jan_Batch\\Drivers\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	return driver;
}
//3
public void loadUrl(String Url) {
	driver.get(Url);
}
//4
public void textBox(WebElement e, String Name) {
	e.sendKeys(Name);
}
//5 
public void btnClick(WebElement clickaction) {
	clickaction.click();
}
//6
public void chooseVisibleText(WebElement e , String text) {
	Select s = new Select(e);
	s.selectByVisibleText(text);
	// TODO Auto-generated method stub
}

//7
public void quitBrowser() {
	driver.quit();

}
//8
public void closeBrowser() {
	driver.close();
}
//9
public void screenshot(String name) {
TakesScreenshot ts = (TakesScreenshot)driver;
try {
	FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File ("C:\\Users\\Dell\\Desktop\\screenshot1"+name+".jpg"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 
}
}

package resource;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseClass1 {

protected static WebDriver driver;

//1
public WebDriver getChromeDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\JanBatch2021\\Jan_Batch\\Drivers\\chromedriver.exe");
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
public void textBox(WebElement element, String Name) {
	
	element.sendKeys(Name);
}
//5 
public void btnClick(WebElement clickaction) {
	
	clickaction.click();
}
public void screenshot(String name) {
	TakesScreenshot ts = (TakesScreenshot)driver;
	try {
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File ("C:\\Users\\Dell\\Desktop\\screenshot"+name+".jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}
//6
public void quitBrowser() {
	driver.quit();

}
//7
public void closeBrowser() {
	driver.close();

}
}

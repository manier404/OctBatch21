package stepdefintion;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import resource.BaseClass1;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks  {
	
	@Before
	public void beforeCla() {
		System.out.println(new Date());
	}
	
	
	@After
	public void afterCla() throws InterruptedException {
		System.out.println(new Date());
//		BaseClass1 u = new BaseClass1();
		Thread.sleep(5000);
		System.out.println("before quit");
//		u.quitBrowser();
		System.out.println("before c");
//		u.closeBrowser();
	
}
}

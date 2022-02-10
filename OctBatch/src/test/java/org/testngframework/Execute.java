package org.testngframework;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Execute implements IRetryAnalyzer {
int min=0,max=3;
	@Override
	public boolean retry(ITestResult result) {

		if (min<max) {
			min++;
			return true;
		}
		return false;
	}

}

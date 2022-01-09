package org.junitframework;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
public class FailureStatus {

	public static void main(String[] args) {

		Result runClasses = JUnitCore.runClasses(SamplePrg.class);
		System.out.println("Total run count"+runClasses.getRunCount());
		System.out.println("Total ignore count"+runClasses.getIgnoreCount());
		System.out.println("Time : "+runClasses.getRunTime());
		System.out.println("Total failed count"+runClasses.getFailureCount());
		
	}

}

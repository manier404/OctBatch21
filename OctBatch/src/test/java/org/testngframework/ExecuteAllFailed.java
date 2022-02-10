package org.testngframework;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class ExecuteAllFailed implements IAnnotationTransformer {
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(Execute.class);
		IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
	}
	
	

}

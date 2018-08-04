package testNG;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class TestNGListeners implements IAnnotationTransformer, IRetryAnalyzer {
	int iMaxRetry=1;

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
	annotation.setRetryAnalyzer(this.getClass());	
	annotation.setInvocationCount(1);
	if(!testMethod.getName().equalsIgnoreCase("login")) {
	annotation.setEnabled(false);
	}
	}

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(!result.isSuccess() && iMaxRetry <2) {
		return true;	
		}
		else {
		return false;
		}
	}
}

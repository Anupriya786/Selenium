package week5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class testNGListerners implements IAnnotationTransformer,IRetryAnalyzer {
	int iretry=1;
	@Override
	public void transform(ITestAnnotation ann, Class classname, Constructor cons, Method meth) {
		// TODO Auto-generated method stub
		ann.setRetryAnalyzer(this.getClass());
		ann.setInvocationCount(1);
	}


@Override
public boolean retry(ITestResult result) {
	
	// TODO Auto-generated method stub
	if(!result.isSuccess() && iretry<2)
	{
		iretry++;
		return true;
	}
		else
		{
	return false;
}
}
	
}

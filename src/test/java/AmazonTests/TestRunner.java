package AmazonTests;

import org.testng.ITestNGListener;
import org.testng.TestNG;

import Listeners.ExtentReportListener;


public class TestRunner {
	
	static TestNG testNg;

	public static void main(String[] args) {
		
		ExtentReportListener ext = new ExtentReportListener();

		testNg = new TestNG();
		
		testNg.setTestClasses(new Class[] {AmazonTestBM.class});
		testNg.addListener((ITestNGListener)ext);
		testNg.run();
		
		
	}

}
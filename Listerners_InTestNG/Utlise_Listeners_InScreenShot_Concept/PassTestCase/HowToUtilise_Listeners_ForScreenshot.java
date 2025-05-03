package Listeners_In_TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

/*
 * step 1--> 
  jab screenshot code add kiya pass or fail test case mai toh 
  yeh line mai 
 TakesScreenshot t1=driver;
 driver error de raha hai 
 
  step2----->
  isliyi humne inheritnece concept lagaya 
  so humne yeh wali class extend kardi "TakeScreenshot_WhenTestCase_Pass" class se 
  isliyi 
  TakeScreenshot_WhenTestCase_Pass extends HowToUtilise_Listeners_ForScreenshot  line add ki 
  "TakeScreenshot_WhenTestCase_Pass" class mai 

step3---->
 After that "Driver" variable is made as public in "TakeScreenshot_WhenTestCase_Pass" class 
 but still we can see driver is still showing the error
 
 Step4---->
  isliyi humne 
  yha bhi(iss class) mai bhi hum add kar sakte hai 
  ChromeDriver driver;
 

Step5----> 
 Ab run kiya test case so 
 yeh error aa rha hai
java.lang.NullPointerException: Cannot invoke "org.openqa.selenium.TakesScreenshot.getScreenshotAs(org.openqa.selenium.OutputType)" because "t1" is null
 
 Ilsiyi humne static  ChromeDriver driver;
 add kiya and usse ab sahi se run hua code 
 "HowToUtilise_Listeners_ForScreenshot" class mai 
 and "TakeScreenshot_WhenTestCase_Pass" class mai 
 "ChromeDriver driver; ko comment kardiya"
 */

public class HowToUtilise_Listeners_ForScreenshot implements ITestListener {
	
	//Part of Step4---> Yha bhi add kardo ChromeDriver driver;
	//ChromeDriver driver;
	
	//Part i) of Step5---> 
	static  ChromeDriver driver;
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		Reporter.log("Test is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test is passed");
		TakesScreenshot t1=driver; 
		File source =t1.getScreenshotAs(OutputType.FILE); 
		File destination =new File("C:\\Users\\UFL IT 2\\eclipse-workspace\\MavenProject\\src\\test\\java\\Listeners_In_TestNG"+ Math.random() +"Pass.png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		/*
		 Statemented added to take a screenshort when my testcase is passed 
		 */
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test is failed");
		TakesScreenshot t1=driver; 
		File source =t1.getScreenshotAs(OutputType.FILE); 
		File destination =new File("C:\\Users\\UFL IT 2\\eclipse-workspace\\MavenProject\\src\\test\\java\\Listeners_In_TestNG"+ Math.random() +"Failed.png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		/*
		 Statemented added to take a screenshort when my testcase is failed
		 */
	}

	
	
	

}

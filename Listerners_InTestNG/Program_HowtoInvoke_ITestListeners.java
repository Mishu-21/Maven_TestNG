package Listeners_In_TestNG;

import org.testng.ITestContext;
import  org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


//step 1--> Create a class 
//Step 2--> Create a relation with ITestListener
//Step 3--> Add all its unimplemented method
      /* now we can see hower overe karke humko option nhi mil rahe isliyi
   right click-->Source --> override/implemented methods--> than click on all methods--> Click on Ok
       */



public class Program_HowtoInvoke_ITestListeners implements ITestListener
//step 1 and 2 and in second step when we create a relation with class by doing implements ITestListener--------> we will get import option so import----------->import org.testng.ITestListener;
{

	
	/* 
	 step 3--> Add all unimplemented method
	and reporter.log("print anything ")--> this line is enetered by us to see what menthods do 
	
	*/
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		
		//lets print something to see how it works 
		Reporter.log("Test is started");
		
		/*
		 OnTesrStart()
                     if anything we need to do in the starting we use this method
		 */
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		//lets print something to see how it works 
				Reporter.log("Test is Pass");
				
		
		/*
		 onTestSuccess()
	                  If anything we want to do if ur testcase is successfully passed 	 
		 */
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test is fail");
		
		
		/*
		 onTestFailure()
	                  If anything we want to do if ur testcase is failed 	 
		 */
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		Reporter.log("Test is skipped");
		
		
		/*
		 onTestSkipped()
	                  If anything we want to do if ur testcase is skipped 	 
		 */
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
		Reporter.log("Test is failed due to timeout");
		
		
		/*
		 onTestFailedWithTimeout()
	                  If anything we want to do if ur testcase is failed due to timeout we can do here  	 
		 */
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
		
		Reporter.log("Test is yet to start ");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		Reporter.log("Test is finished ");
	}
	
	

}

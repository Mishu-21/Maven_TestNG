/*only retry those testcases which are failed because of some environment issue,network issue etc.--->because agr xpath galat hui toh retry ka fayda nhi hai 
means if my testcase if pass my IRetryAnalyzer wont work  as its only for failed testcases

*/
package Test_Annotaion_1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

//Step1: Create a class and implements IRetryAnalyzer interface and it must come from org.testng.IRetryAnalyzer
public class HowToRetryTheFailedTestCases implements IRetryAnalyzer {

	
	
//Step2: Add Unimplemented method which is only 1 method  and that comes from org.testng.ITestResult
	
	
	/* original this is implemented
	 * @Override public boolean retry(ITestResult result)
	 *  { 
	 * return false; //when return false which means don't retry anything
	 *  }
	 *  
	 *  //so for this reason only step 3 comed into play 
	 */
	
	//step 3: Write ur own logic,how many times you wish to retry the test case
	
	int initial_count=0;
	int retry_count=3; //ie we are trying for 3 times
	
	@Override
	public boolean retry(ITestResult result) {
		
		//means we check jb tk initial value less hai retry se tab tk try karo nd initail value ++ krte raho and jaise he ho jaye return true 
		 while(initial_count<retry_count) //can use for loop too
		 {
			 initial_count++;
			 return true;
		 }
		return false;
	}
	
	//Step 4 write a test case where we want to use it just the package must be same 
	//so we are utilising here only -->ie create a class and inside that @testAnnotation and use it
}	

 class LaunchGoogle_ClickonGmail
	{
	 //its one of the paramter retryAnalyzer which accepts the packagename.className.class
		@Test(retryAnalyzer =Test_Annotaion_1.HowToRetryTheFailedTestCases.class )
		public void LaunchGoogle_ClickonGmail_Method()
		{
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.com/");
			
			driver.manage().window().maximize();
			
			//so now by purpose fail the testcase as we cant bring environment issue now 
			driver.findElement(By.linkText("GmMail")).click();
			
			/*
			 * now as we have purposely failed the test cases 
			 * we will see taht 
			 * it try for 3 times as per my condition
			 * and now go to emailable-report.html and we will see that 
			 * in retrieved column it tried for 3 times
			 */
		}
	}
 
 //console output-->Default suite
// Total tests run: 4, Passes: 0, Failures: 1, Skips: 0, Retries: 3



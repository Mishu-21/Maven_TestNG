/*
 It doenot matter how we declare ie where we declare it but order of execution of annotation are:
 @BeforeSuite
 @BeforeTest
 @BeforeClass
 @BeforeMethod
 @Test
 @AfterMethod
 @AfterClass
 @AfterTest
 @AfterSuite
*/

package TestngPackage;
import org.testng.annotations.*;


public class AllAnnotation_OrderOfExcecution {
	
	 @BeforeSuite
	 public void BeforeSuite()
	 {
		 System.out.println("BS");
	 }
	 
	 @AfterSuite
	 public void AfterSuite()
	 {
		 System.out.println("AS");
	 }
	 
	 @BeforeTest
	 public void BeforeTest()
	 {
		 System.out.println("Bt");
	 }
	 
	 @AfterTest
	 public void AfterTest()
	 {
		 System.out.println("At");
	 }
	 
	 
	 @BeforeClass
	 public void BeforeClass()
	 {
		 System.out.println("Bc");
	 }
	 
	 @AfterClass
	 public void AfterClass()
	 {
		 System.out.println("Ac");
	 }
	 
	 
	 @BeforeMethod
	 public void BeforeMethod()
	 {
		 System.out.println("BM");
	 }
	 
	 @AfterMethod
	 public void AfterMethod()
	 {
		 System.out.println("AM");
	 }
	 
	 //@Test 1 he define kiya hai so it means testcase 1 he run hoga ie 1 he testcases available hai 
		
		  @Test 
		  public void Test() 
		  { 
			  System.out.println("Test"); 
		  
		  }
}


/*
    ORDER OF EXECUTION 
 
BS
Bt
Bc
BM
Test
AM
Ac
At
PASSED: TestngPackage.AllAnnotation_OrderOfExcecution.Test

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================

AS
*/

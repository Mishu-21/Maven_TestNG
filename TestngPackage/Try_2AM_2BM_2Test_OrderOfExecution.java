/*Try if my class have 
2@AM
2@BM
2@Test
so is it possible and if possible whats the order of execution??

Yes its possible 
and order of execution is

BM
BM1
Test1
AM
AM1
BM
BM1
Test2
AM
AM1



*/


package TestngPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Try_2AM_2BM_2Test_OrderOfExecution {

	@BeforeMethod
	 public void BeforeMethod1()
	 {
		 System.out.println("BM1");
	 }
	 
	 @AfterMethod
	 public void AfterMethod1()
	 {
		 System.out.println("AM1");
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
	 
	 @Test 
    public void Test1() 
    { 
		 System.out.println("Test1"); 
	 }
	 
	 @Test 
    public void Test2() 
    { 
		 System.out.println("Test2"); 
	 }
	
}

/*
 OUTPUT---------------------------------
 [RemoteTestNG] detected TestNG version 7.4.0
BM
BM1
Test1
AM
AM1
BM
BM1
Test2
AM
AM1
PASSED: Test1
PASSED: Test2

===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 2, Passes: 2, Failures: 0, Skips: 0
===============================================


 */

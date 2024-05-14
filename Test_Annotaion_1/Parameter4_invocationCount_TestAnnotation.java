package Test_Annotaion_1;

import org.testng.annotations.Test;

//By default invocationCount will be 1
//want to run my testcase 1000 times withoit making use of for loop we can do it with help of invocationCount 


public class Parameter4_invocationCount_TestAnnotation  {

	
	
	@Test(invocationCount=5)
	public void Login()
	{
		System.out.println("Login method");
	}
	
	
	@Test //by default can run invocationCount=1 so will execute 1 time
	public void Registration ()
	{
		System.out.println("Registration method");
	}
}

/*
Order of execution: 
	
Login method
Login method
Login method
Login method
Login method
Registration method
*/
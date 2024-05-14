package Test_Annotaion_1;

import org.testng.annotations.Test;

//By Default enabled=True
//if enabled=true test case will run and if enabled=false will not run 

public class Parameter2_enabled_TestAnnotation  {

	@Test(enabled=false)   //as we have enabled=false so it will not execute
	public void Login()
	{
		System.out.println("Login method");
	}
	
	
	@Test //by default (enabled=true) only so even we dont declare it will run
	public void Registration ()
	{
		System.out.println("Registration method");
	}
	
	

	@Test(enabled=true)   //as we have enabled=true so it will not execute
	public void Logout()
	{
		System.out.println("Logout method");
	}
	
}


/*ORDER OF EXECUTION:
 as bs enabled wala parameter use kiya hai so it will execute in this way as its alphabetic 
 
Logout method
Registration method
 */

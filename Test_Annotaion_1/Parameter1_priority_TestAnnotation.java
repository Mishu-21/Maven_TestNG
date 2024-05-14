

//By default priority of @Test is 0
//so when we set the priority order of execution is --->@test whose proiriry is less will execeute 1st and than the bigger number 


//we can define -ve no. priority too
package Test_Annotaion_1;

import org.testng.annotations.Test;

public class Parameter1_priority_TestAnnotation {

	
	@Test(priority=3)
	public void Login()
	{
		System.out.println("Login method");
	}

	@Test(priority=2)
	public void Logout()
	{
		System.out.println("logout method");
	}

	@Test(priority=1)
	public void Registration ()
	{
		System.out.println("Registration method");
	}
}


/*

Order of Execution:
Registration method
Logout method
Login method
*/

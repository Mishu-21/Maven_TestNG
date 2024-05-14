package Test_Annotaion_1;

import org.testng.annotations.Test;



//we can define -ve no. priority too
public class NegativePriority {
	
	
	@Test  //bydefault priority is 0 
	public void Login()
	{
		System.out.println("Login method");
	}

	@Test(priority=-1)
	public void Logout()
	{
		System.out.println("logout method");
	}
}


/*

Order of Execution
logout method
Login method
*/

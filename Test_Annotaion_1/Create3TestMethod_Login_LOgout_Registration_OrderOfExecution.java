/*In a class create 3 @test methid and see its order of execution 
Method name ---> login,logout,registration */


//order of execution is based on alpahabetic order of method name 
package Test_Annotaion_1;

import org.testng.annotations.Test;

public class Create3TestMethod_Login_LOgout_Registration_OrderOfExecution {
	
	@Test
	public void Login()
	{
		System.out.println("Login method");
	}

	@Test
	public void Logout()
	{
		System.out.println("Logout method");
	}

	@Test
	public void Registration ()
	{
		System.out.println("Registration method");
	}

	
	
	/*ORDER OF EXECUTION 
	 
	  Login method
Logout method
Registration method
	 */
	
}

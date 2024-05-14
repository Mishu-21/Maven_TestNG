/*dependsOnMethod--->means a particular testcase depends on another testcase 
so if another test case fail ,that particular testcase will skip */

package Test_Annotaion_1;

import org.testng.Assert;

import org.testng.annotations.Test;

;

public class Parameter5_dependsOnMethods_UsedToSkipTestCase{

	/*created 2 methods--> 
	login() and logout() and
	 logout depends on login only so mainly we must do that if login() fail my logout() must skip
	 so to do this we use  "dependsOnMethods"  Parameter
	 and we also do this as in my emailable-html report we have skip option so we can skip any testcase using dependsOnMethods()
	 */
	
	@Test
	public void login()
	{
		//khud se we are trying to fail the test case as yeh expect krta hai to equal hua toh it will pass lekin dono alg hai so it will fail 
		Assert.assertEquals(false, true);
	//now logout () will skip and run it and see the emailable report -html vha ki mai 1 show hoga 
	}
	

	@Test(dependsOnMethods="login")
	public void logout()
	{
		
	}
	
	
}

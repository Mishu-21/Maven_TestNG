/*
 * 
 * Method 
 * 
 * and its case sensitive 
1.sytax:------------Assert.assertEquals(boolean actual , boolean expected);
  so anything which we are expected must be hand written and anything which is actual must be coming from the method 

Now assertEquals can be use with int expected and actual value .............,same with double expected and actual value  and so on .... 
can be used with string expected and string actual 


We also have  use assertEquals with 3 parameter
Assert.assertEquals(boolean actual , boolean expected,String message);
        which means --->Asserts that two booleans are equal. 
                         If they are not, an AssertionError, with the givenmessage, is thrown.
                         Parameters:
                                       actual the actual value
                                       expected the expected value
                                       message the assertion error message
                                       
                                       
and can be used with 
Assert.assertEquals(int  actual , int  expected,String message);


and also we have 
Assert.assertEquals(Object[]  actual , Object[]  expected,String message);
Asserts that two arrays contain the same elements in the same order. 
If they do not, anAssertionError, with the given message, is thrown.
Parameters:
                  actual the actual valueexpected
                  the expected valuemessage 
                  the assertion error message
                  
                  
                  
      and so on ie. bahut saare assertEquals ke different parameter hai  
*/
package Assertion_InTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Problem2_assertEquals {

	@Test
	public void testcase1() //fail the testcase
	{
		Assert.assertEquals(false, true);
	}
	
	
	@Test
	public void testcase2() //pass the testcase
	{
		Assert.assertEquals(false, false);
	}
	
	@Test
	public void testcase3() //pass the testcase
	{
		Assert.assertEquals(true, true);
	}
	
	

	@Test
	public void testcase4() //pass the testcase
	{
		Assert.assertEquals(0, 0);
	}
	
	
	@Test
	public void testcase5() //fail the testcase
	{
		Assert.assertEquals(123, 0);
	}
	
	//most important Method ---->		Assert.assertEquals(String actual, String expected);
	@Test
	public void testcase6() //fail the testcase
	{
		Assert.assertEquals("hima", "Himans");
	}
	
	
	@Test
	public void testcase7() //fail the testcase  and this message will only be thrown if my testcase fails if it pass my msg will not be thrown 
	{
		Assert.assertEquals(0, 1, "Fail TestCase");
		
	}
	
	

	@Test
	public void testcase8() //pass the testcase
	{
		Assert.assertEquals(false, false,"My Testcase pass");
	}
	
	
}

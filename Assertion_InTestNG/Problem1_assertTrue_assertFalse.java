/*Assertion means comparison between expected and actual result


To pass or fail any test case we can use 
Assert.assertTrue(boolean condition)
Assert.assertFalse(boolean condition)

as we know in selenium we have few methids which return true or false like 
isDisplayed(),isSelected(),isEnabled()
so we use asset with these methods mainly 


Assertion can be declared in the starting or end of the test case or as many times in the testcase


*/


package Assertion_InTestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Problem1_assertTrue_assertFalse {

	@Test
	public void testcase1() //fail the testcase
	{
		Assert.assertTrue(false);
	}
	
	@Test
	public void testcase2() //pass the testcase
	{
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void testcase3() //pass the testcase
	{
		Assert.assertFalse(false);
	}
	
	
	@Test
	public void testcase4() //fail the testcase
	{
		Assert.assertFalse(true);
	}
	
}

//Create a class having 10 @Test Annotation and group them according to different testing types

package Grouping_Package;

import org.testng.annotations.Test;

public class grouping_Concept {

	@Test(groups= {"smoke"})
	public void testcase1()
	{
		System.out.println("TestCase1");
	}
	
	@Test(groups= {"smoke","regression"})
	public void testcase2()
	{
		System.out.println("TestCase2");
	}
	
	@Test(groups= {"system","regression"})
	public void testcase3()
	{
		System.out.println("TestCase3");
	}
	
	@Test(groups= {"regression"})
	public void testcase4()
	{
		System.out.println("TestCase4");
	}
	
	@Test(groups= {"system","integration"})
	public void testcase5()
	{
		System.out.println("TestCase5");
	}
	
	@Test(groups= {"integration"})
	public void testcase6()
	{
		System.out.println("TestCase6");
	}
	
	@Test(groups= {"system","smoke"})
	public void testcase7()
	{
		System.out.println("TestCase7");
	}
	
	@Test(groups= {"smoke","integration"})
	public void testcase8()
	{
		System.out.println("TestCase8");
	}
	
	@Test(groups= {"regression","integration"})
	public void testcase9()
	{
		System.out.println("TestCase9");
	}
	
	@Test(groups= {"system","integration"})
	public void testcase10()
	{
		System.out.println("TestCase10");
	}
	
	
}

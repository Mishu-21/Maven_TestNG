/*
 we can declare 2 paaremter at a same time

  
 */



package Test_Annotaion_1;

import org.testng.annotations.Test;

public class CanPass2Parameter {

	
	@Test(priority=1,invocationCount=2)
	public void method1()
	{
		System.out.println("Method1");
	}
	
	
	@Test
	public void method2()
	{
		System.out.println("Method2");
	}
	
	
	
	@Test
	public void method3()
	{
		System.out.println("Method3");
	}
	
	/*
	Order of execution ----
	
	Method2
	Method3
	Method1
	Method1
	
	
	
	method 1 baad mai print hua bcz method 1 ki priority 1 hai define n or sbki 0 hui as default priority is 0 
	*/
}

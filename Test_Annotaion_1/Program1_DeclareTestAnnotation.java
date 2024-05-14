package Test_Annotaion_1;

import org.testng.annotations.Test;   //import this one

//import org.junit.Test; dont import junit 

public class Program1_DeclareTestAnnotation {

	/*
	 * Never declare @Test Annotation without method name 
	 * @Test {
	 * 
	 * }
	 */
	
	
	
	//declare @Test annotation with method name 
	/*
	 * method name will have access specifier(public ,private,protected ,default) ,
	 * modifier(static /non static), 
	 * return type(int,void etc), but practically  hum void he rkhte hai return time 
	 * method name , 
	 * and
	 * can be parameterized or non parameterized
	 * 
	 * 
	 */
	
	
	/*Important points --->
	 1.every class must have @Test annotation
	 2.one @Test indicates one scenaerio and 1 scenerios = 1 test case 
	 3.My class can have 'n' @Test also
	 4. order of execution is --->alpahabetic order of method name not fcfs
	 */
	@Test    //1 @Test=1Scenerio =1TestCase
	public  void method1()
	{
		System.out.println("Method1");
	}
	
	
	@Test
	public  void method3()
	{
		System.out.println("Method3");
		//method4();
	}
	
	@Test
	public  void abc()
	{
		System.out.println("abc");
	}
	
	
	@Test
	public static void method2()
	{
		System.out.println("Method2");
		
		
	}
	
	
	//when return type is int not getting executed like this  and also officially kabhi aisa hoga nhi ki  return keyword use hoga @Test Annotation ke sath 
	public static int method4()
	{
		System.out.println("Method2");
		return 0;
		
		
	}
	
	//when we run it we get console report to see testng report go to test-output --> emailable -report html
}


/*

Order of Execution
abc
Method1
Method2
Method3
*/

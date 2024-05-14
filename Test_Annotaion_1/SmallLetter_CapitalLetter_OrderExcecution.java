//My class have 2 @Test with method anme as LOGIN and login ie small and capital letter so which will execute first??



package Test_Annotaion_1;

import org.testng.annotations.Test;

public class SmallLetter_CapitalLetter_OrderExcecution {

	@Test
	public void LOGIN()
	{
		System.out.println("LOGIN");
	}
	
	@Test
	public void login()
	{
		System.out.println("login");
	}
}


/*
 capital letter method will execute first as ascii code of capita;l letter is less than small letter 
 
Order of Execution
LOGIN
login
*/
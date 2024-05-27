//test fb login with 5 set of data 

package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Problem4_WithMultipleDimensionalDataOrObject {

	
	@DataProvider(name="data3")
	//as we are declaring inputs  for fb login so pass 1 set of input which will  be having username and password
	public Object method1()
	{
		
		// Step1 declare 2 dimensional object input
		
		Object l1[][]=new Object[5][2];
		//as we have 5 input  therefore 5 ie row which will decide ki kitne input lene hai and--->ie 1st number indicate set of value ie row
		//and 2 ie column which tell 2 user field ie username and password  ----> ie 2nd number indicate set of column ie field
	
	  
		
		//Step 2-->now declare value mainly think its a table  and than declare it 
		
		//so row 0 and column 0 i.e username  and 1 i.e pwd
		l1[0][0]= "ramsing@gmail.com";
		l1[0][1]="ramsing123";
	
		
		//so row 1 and column 0 i.e username  and 1 i.e pwd
				l1[1][0]= "Himang@gmail.com";
				l1[1][1]="ram 19y";
			
				
				
				//so row 2 and column 0 i.e username  and 1 i.e pwd
				l1[2][0]= "Kavitasing@gmail.com";
				l1[2][1]="ramsing123@@@";
			
				
				//so row 3 and column 0 i.e username  and 1 i.e pwd
				l1[3][0]= "singal@gmail.com";
				l1[3][1]="ram$sing12";
			
				
				//so row 4 and column 0 i.e username  and 1 i.e pwd
				l1[4][0]= "029798ng@gmail.com";
				l1[4][1]="ram79g123";
				
				//Step 3: as we have used object return type of method 1 so we need to return and return statement last mai he hoti hai 
	return l1;		
	}
	
	
	@Test(dataProvider="data3")  
	//as we are login to fb so now we need 2 input ie login nmae and pswd 
	public void Login_Fb(String UN,String PWD)
	{
ChromeDriver driver=new ChromeDriver();
		
		//Launch facebook
		driver.get("https://www.facebook.com/");
		
		//send keys on email field
		driver.findElement(By.id("email")).sendKeys(UN);
		
		//send keys on password field
				driver.findElement(By.id("pass")).sendKeys(PWD);
				
		//click on login button
				driver.findElement(By.name("login")).click();
	
				
				//we need to validate also so now lets add assertion
				
				
				driver.close();
				//now this will be runned 5 times
	}
}


/*
OUTPUT-------------->

as no assertion is declared there all my testcases are passed  
PASSED: Login_Fb("ramsing@gmail.com", "ramsing123")
PASSED: Login_Fb("Kavitasing@gmail.com", "ramsing123@@@")
PASSED: Login_Fb("singal@gmail.com", "ram$sing12")
PASSED: Login_Fb("029798ng@gmail.com", "ram79g123")
PASSED: Login_Fb("Himang@gmail.com", "ram 19y")
*/
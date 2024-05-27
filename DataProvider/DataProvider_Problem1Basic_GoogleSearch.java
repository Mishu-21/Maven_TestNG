//data provider in testng can be used in thpse places where we want to run same testcases with multiple data /inputs.

package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//its public so that anone can utilise it 
public class DataProvider_Problem1Basic_GoogleSearch {

	/*add DataProvider notation
	and dataprovider return type is a object class so that class will return something 
	
	so as return type of manish class is new manish 
	similarly return type of object class is new object 
	*/
	@DataProvider(name="search_result")
	public Object method1() //return type of this class is object class
	{
		return new Object[][]   //and this object is 2d therefore [][] and than set the value 
				{{"India"},{"School"},{"Pencil"}};		
				
				//means now we are going to search google with these 2 inputs which is defined in data provider class
	}
	 
	//now write the @test 
	
	//to utilise data provider pass this way in the test 
	@Test(dataProvider="search_result")
	public void Google_search(String input) //this method will accept input from data provider like value india ,school ,pencil therefore added string input in method name so that it accept 3 input
	{
		ChromeDriver driver=new ChromeDriver();
		
		   driver.get("https://www.google.com/");
		
	    	driver.manage().window().maximize();
	    	WebElement search=driver.findElement(By.className("gLFyf"));
			search.sendKeys(input);
			search.sendKeys(Keys.ENTER);
	}
}

/*
 now we will see that my chrome is launched 3 times and tested all the inputs defined in data provider class

 Output:
 PASSED: Google_search("India")
PASSED: Google_search("Pencil")
PASSED: Google_search("School")
 */

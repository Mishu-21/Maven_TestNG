package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Problem3_Defined2DataProvider_WithSingleData{

	
	@DataProvider(name="data1")
	public Object test_data1()
	{
		return new Object[][] {{"shoe"},{"mobile"},{"Laptop"},{"Webcamera"},{"kurta set"},{"pencil"},{"pen"},{"tablet"}};
	}
	
	//we can define more than 1 data provider
	@DataProvider(name="data2")
	public Object test_data2()
	{
		return new Object[][] {{11},{12},{13},{15},{19},{90},{80},{10}};
	}
	
	
	
@Test(dataProvider="data2") 
//pass in camel case
public void amazon_search(int input) //now as i am accepting data 2 so my input return type should be int 
{
	
	System.out.println(input);
	/*
ChromeDriver driver =new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();

WebElement search_box=driver.findElement(By.id("twotabsearchtextbox"));
search_box.sendKeys(input); //error agr yeh likha bcz search_Box is of webElement type which consist only of string value and we are passing int datatype value
search_box.sendKeys(Keys.ENTER);

*/
}
}


/*
 * OUTPUT---------------------->
 11
12
13
15
19
90
80
10
PASSED: amazon_search(90)
PASSED: amazon_search(11)
PASSED: amazon_search(80)
PASSED: amazon_search(19)
PASSED: amazon_search(15)
PASSED: amazon_search(10)
PASSED: amazon_search(13)
PASSED: amazon_search(12)
 */

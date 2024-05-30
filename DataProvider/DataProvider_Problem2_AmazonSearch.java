

package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Problem2_AmazonSearch
{

	@DataProvider(name="data1")
	public Object test_data1()
	{
		return new Object[][] {{"shoe"},{"mobile"},{"Laptop"},{"Webcamera"},{"kurta set"},{"pencil"},{"pen"},{"tablet"}};
	}
	
	
	
	@Test(dataProvider="data1") //this @test will test with inputs defined in data provider 1
          //pass in camel case
	public void amazon_search(String input)
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement search_box=driver.findElement(By.id("twotabsearchtextbox"));
		search_box.sendKeys(input);
		search_box.sendKeys(Keys.ENTER);
		
	}
}

/*

  OUTPUT----------------->
 PASSED: amazon_search("shoe")
PASSED: amazon_search("Laptop")
PASSED: amazon_search("mobile")
PASSED: amazon_search("kurta set")
PASSED: amazon_search("Webcamera")
PASSED: amazon_search("pen")
PASSED: amazon_search("tablet")
PASSED: amazon_search("pencil")

 */

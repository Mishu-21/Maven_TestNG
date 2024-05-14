//this class will be having @BeforeMethod and @AfterMethod annotaion and all another 5 test cases will inherit this class  ---->This is know as hieraricial inheritance 

package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchQuit {

	WebDriver driver;
	
	
	//Paramter used for parallel and cross browser testing is parameters
	
	@Parameters("nameOfBrowser")
	@BeforeMethod
	public void launch(String which_Browser)
	{
		if(which_Browser.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		if(which_Browser.equals("Firefox"))
		{
			driver= new FirefoxDriver();
		}
		if(which_Browser.equals("edge"))
		{
			driver= new EdgeDriver();
		}
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void Quit()
	{
		
	}
}

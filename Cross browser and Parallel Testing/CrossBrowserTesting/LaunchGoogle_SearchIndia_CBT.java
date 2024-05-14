//Launch google and search india and do cross browser testing /paralleltesting

package CrossBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchGoogle_SearchIndia_CBT{

	WebDriver driver;
	@Test
	@Parameters("browser") // step3--import using import org.testng.annotations.Parameters;   ie testng
	//step---6 @Paramter mai koi bhi value pass kar skte hai himamshi anything
	//public void launch_Google()  //step---6 jo value humne value field ko di hai woh yeh method accept kare for that make this method as parameterized agar paramter pass nhi kiya toh program kbhi run nhi hoga  
	public void launch_Google(String nameOfBrowser)  
	//in futre we can see humne xml file mai value field mai more than 2 value pass ki hogi so tab yha method will we accepting 2 values so tab aise comma krke we can use 
	{
		//Step-7--Now to see on which browser it must run we can use "if" statment concept 
	
		if(nameOfBrowser.equals("chrome"))//it will check jo bhi value apne apni value paramter mai pass ki hai xml file mai so uske according kaunsa chrome launch ho 
		{
			driver=new ChromeDriver();
		}
		
		//step --8now my value field can have more option too so to make it more generic define another browser too 
		if(nameOfBrowser.equals("edge"))  //to launch edge browser
		{
			 driver = new EdgeDriver();
		}

		if(nameOfBrowser.equals("firefox")) //to launch firefox
		{
			 driver = new FirefoxDriver();
		} 
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //define implicit wait 
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		//driver.close();
	}
}

/* Launch browser quite and search on google using @BM, @AM and  @Test Annotation
 
 */


package TestngPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticalProblem_UsingBM_AM_Test_Annotation {
	ChromeDriver driver;
	@BeforeMethod
	public void launch_browser()
	{
		//now as scope of driver is inside launch_browser only so we cant use driver in quit method  so to use it make driver as gloabal
		//ChromeDriver driver=new ChromeDriver(); dont define like this bcez than this driver and above driver will be differemt
		driver=new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//declare implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void Test1()
	{
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Sachin");
		search.sendKeys(Keys.ENTER);
	}
	
	@Test
	public void Test2()
	{
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Himanshi");
		search.sendKeys(Keys.ENTER);
	}
	
	@AfterMethod
	public void Quit() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}

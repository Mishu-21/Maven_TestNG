package RunMultipleTestCase_WithProperWorkflow;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenerio3_TwoTestCases {

	
	
	@Test
	public void LaunchGoogle_GmailLink()
	{
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
	}
	
	@Test
	public void LaunchGoogle_ClickImageLink()
	{
		  ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			//click on image link 
			driver.findElement(By.className("lnXdpd")).click();
	}
}

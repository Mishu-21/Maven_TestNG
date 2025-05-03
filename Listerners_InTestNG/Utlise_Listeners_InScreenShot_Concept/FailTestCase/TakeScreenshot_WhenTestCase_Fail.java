package Listeners_In_TestNG;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(HowToUtilise_Listeners_ForScreenshot.class)

public class TakeScreenshot_WhenTestCase_Fail extends HowToUtilise_Listeners_ForScreenshot
{

@Test

	
	public void DragAndDrop_GroTechWebsite()
	{
	driver=new ChromeDriver();
	driver.get("https://grotechminds.com/drag-and-drop/");
	driver.manage().window().maximize();
	
	//jo elemnet drag krna hai uski xpath likho 
	WebElement dragableElement=driver.findElement(By.xpath("(//div[@id='container-6'])"));
	
	//jaha drop krna hai vha ki location ki  xpath likhi
	WebElement dropableElement=driver.findElement(By.xpath("(//div[@id='div2'])"));

	//now to drag and drop use action class
	Actions a1=new Actions(driver);  //as it is parameterized constructor so to invoke driver pass driver in action class   
	
	
	a1.dragAndDrop(dragableElement,dropableElement).perform();
	Assert.assertTrue(false); //explicitly tried to fail the testcase
	
	}
}

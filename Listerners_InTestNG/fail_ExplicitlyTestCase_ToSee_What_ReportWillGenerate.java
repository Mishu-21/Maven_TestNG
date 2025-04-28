package Listeners_In_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import org.testng.asserts.*;



@Listeners(Program_HowtoInvoke_ITestListeners.class)
public class fail_ExplicitlyTestCase_ToSee_What_ReportWillGenerate {
 @Test
	public void DragAndDrop_GroTechWebsite()
		{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement dragableElement=driver.findElement(By.xpath("(//div[@id='container-6'])"));
		WebElement dropableElement=driver.findElement(By.xpath("(//div[@id='div2'])"));

		 Actions a1=new Actions(driver);  
		 a1.dragAndDrop(dragableElement,dropableElement).perform();
		 
		 //excplicity fail the testcase with the help of assertion
		 Assert.assertTrue(false);
		
		}
	}



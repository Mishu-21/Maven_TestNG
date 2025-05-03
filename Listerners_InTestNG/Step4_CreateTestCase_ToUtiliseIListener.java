package Listeners_In_TestNG;

import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;

/*
 Whenever you want to heard any test case by the listensers use 
 "Listeners annotation" with the "s"
 so add
       import org.testng.annotations.Listeners;
 */


/*
 Now if you want your listeners to listen the testcase so it needs to be added above the testcase ie above the class also 
 Syntax--> 
               @Listeners(classname_WhereTheListenersIsThere.class)
 */



@Listeners(Program_HowtoInvoke_ITestListeners.class)
public class Step4_CreateTestCase_ToUtiliseIListener {

	
	/*
	 lets utilise ITestListeners with this testcase ie step 4
	 and also 
	 we added any testcase but with @Test annotation  not main bcz we are using testng concept here 
	 
	*/
	
	@Test
	
	public void DragAndDrop_GroTechWebsite()
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/drag-and-drop/");
	driver.manage().window().maximize();
	
	//jo elemnet drag krna hai uski xpath likho 
	WebElement dragableElement=driver.findElement(By.xpath("(//div[@id='container-6'])"));
	
	//jaha drop krna hai vha ki location ki  xpath likhi
	WebElement dropableElement=driver.findElement(By.xpath("(//div[@id='div2'])"));

	//now to drag and drop use action class
	Actions a1=new Actions(driver);  //as it is parameterized constructor so to invoke driver pass driver in action class   
	
	
	a1.dragAndDrop(dragableElement,dropableElement).perform();
	
	}
}

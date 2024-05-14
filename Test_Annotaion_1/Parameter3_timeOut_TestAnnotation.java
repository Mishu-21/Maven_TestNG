package Test_Annotaion_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


//The maximum number of milliseconds this test should take. If it hasn't returned after thistime, it will be marked as a FAIL.
public class Parameter3_timeOut_TestAnnotation {

	
	
	
//when testcase fail we get -->"org.testng.internal.thread.ThreadTimeoutException"  Exception 
	@Test(timeOut=1) //this fail
	public static void method2()
	{
ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//launch amazon.in
		driver.get("https://www.amazon.in/");
		
		//select dropdown and choose Books option 
		WebElement dd =driver.findElement(By.id("searchDropdownBox"));
		
		//use select class to choose the drop-down
		Select s=new Select(dd);
		
		//select book from dropdown by using selectbyvalue option
		s.selectByValue("search-alias=stripbooks");
		
		//type world war book in search text tab
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("World war");
		
		//click on search button 
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
	
	@Test(timeOut=1)  //this pass
	public static void method1()
	{
		System.out.println("Method2");
		
		
	}
	
	
}

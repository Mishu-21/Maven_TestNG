package Test_Annotaion_1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class practicalProblemOn__dependsOnMethods_WhichisUsedToSkipTestCase {

	WebDriver driver;
	@Test
	public void login() throws InterruptedException
	{
		//fail testcase 
		driver=new ChromeDriver();
        driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		WebElement Login_Button=driver.findElement(By.linkText("Login"));
		Login_Button.click();
		
		//Enter user name and password
		driver.findElement(By.name("user_login")).sendKeys("mishachauhan41@gmail.com");
		driver.findElement(By.name("user_password")).sendKeys("Himanshi21@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='masterstudy-button__title'])[1]")).click();
		Thread.sleep(5000);
		//WebElement find_element= driver.findElement(By.linkText("Enrolled Courses"));
	//	System.out.println(driver.findElement(By.linkText("Enrolled Courses")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.linkText("Enrolled Courses")).isDisplayed());
	}
	
	@Test(dependsOnMethods="login")
	public void logout()
	{
		
	}
}

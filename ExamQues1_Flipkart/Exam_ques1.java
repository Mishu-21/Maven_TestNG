/*
 Automate the below scenario
1) Launch any browser
2) Navigate to www.flipkart.com
3) In the search text field type mouse and select second option from it
4) From the list of mouse select the 2nd mouse and close the parent tab.
5) Take  a screenshot of child tab before closing the browser.
6) Save the image name with grotechminds.png and upload it here
Note:
1) you need to write code in eclipse
2) Here you need to upload the code + Screenshot
3) Do above task in TestNG only
 
 */


package TestngPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Exam_ques1 {

	WebDriver driver;
	@Test
	public void flipkart_Scenerio() throws InterruptedException, IOException
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		WebElement searchbar= driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		searchbar.sendKeys("mouse");
		Thread.sleep(1000);
		 searchbar.sendKeys(Keys.ARROW_DOWN); 
		 Thread.sleep(1000);
		 searchbar.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 searchbar.sendKeys(Keys.ENTER);
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//div[@class='_4WELSP'])[2]")).click();
		 
		 Thread.sleep(1000);
		 //move control
		 Set<String> p_cId=driver.getWindowHandles();
		 Iterator<String> pc =p_cId.iterator();
		 String Parent_Id=pc.next();
		 String Child_Id=pc.next();
		 driver.switchTo().window(Child_Id); 
		 
		 Thread.sleep(2000);
		 //take ss
		 TakesScreenshot t1=(TakesScreenshot) driver; 
		    File source =t1.getScreenshotAs(OutputType.FILE); 
		    
		    
		    File destination =new File("C:\\Users\\UFL IT 2\\eclipse-workspace\\MavenProject\\src\\test\\java\\TestngPackage\\grotechminds.png");
		    FileHandler.copy(source, destination);
		    
		    Thread.sleep(2000);
		    
		    //as we need to close the parent tab after taking the ss --> so now my child tab is my parent tab
		    driver.close();
	}
}

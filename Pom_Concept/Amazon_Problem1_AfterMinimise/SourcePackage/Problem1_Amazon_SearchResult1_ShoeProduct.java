//given as SearchResult1 because as part of this project we can search for many products so for each searching product my search result will be different

package Maven_Pom_Concept_package.Maven_Pom_Concept_Project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Problem1_Amazon_SearchResult1_ShoeProduct {

	//select 1 search result of shoe

			WebDriver driver;
			
			//Step 1
			@FindBy(xpath="(//div[@class='s-image-padding']/span/a)[5]")
			WebElement search_Result1;
		
			@FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
            WebElement star4;
			
			@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[3]")
            WebElement Within2Days;
			//Step 2
			public void Click_SearchedProduct(WebDriver driver)
			{
				search_Result1.click();
				//as soon as we click on any product new window is getting launched so we need to handle it here only as after clicking the product new window is launched
				//to navigate my control from parent to child window
				
				Set<String> pancid=driver.getWindowHandles();
				System.out.println(pancid);
				Iterator<String> pc=pancid.iterator();
				String parentId=pc.next();
				String childId=pc.next();
				System.out.println(parentId);
				System.out.println(childId);
				driver.switchTo().window(childId);
				
			}
			
			public void Sort_Using_4star() throws InterruptedException
			{
				Thread.sleep(1000);
				star4.click();
			}
			
			
			public void Sort_Using_GetWithin2Days() throws InterruptedException
			{
				Thread.sleep(1000);
				Within2Days.click();
			}
			
			
			
		//Step 3	
	   public Problem1_Amazon_SearchResult1_ShoeProduct (WebDriver driver)
					{
		              PageFactory.initElements(driver, this);
					}
			
			
	
}

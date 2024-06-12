package Maven_Pom_Concept_package.Maven_Pom_Concept_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Problem1_Amazon_ManageAddressPage {

	//step 1
	
		@FindBy(xpath="//span[@id='shipToThisAddressButton']")  //yeh xpath uski hai jo address ke niche aa raha hai na ki likha hua use this address na ki jo side mai aa raha hai woh 
		WebElement UseThisAddress;
		
		
		//Step 2
		public void Use_This_Address() throws InterruptedException
		{
			Thread.sleep(1000);
			UseThisAddress.click();
		}
		
		//step 3
		public Problem1_Amazon_ManageAddressPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
}

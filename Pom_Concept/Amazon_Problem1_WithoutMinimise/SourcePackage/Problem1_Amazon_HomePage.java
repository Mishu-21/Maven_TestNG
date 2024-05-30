//home page is used o search the product


package Maven_Pom_Concept_package.Maven_Pom_Concept_Project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Problem1_Amazon_HomePage {

	WebDriver driver;
	//Step 1
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
	//Step 2
	public void searchBox_Shoe()
	{
		searchbox.sendKeys("Shoe");
		searchbox.sendKeys(Keys.ENTER);
	}
	

	//Step 3
	public Problem1_Amazon_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

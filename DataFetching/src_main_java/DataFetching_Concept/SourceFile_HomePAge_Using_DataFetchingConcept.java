package DataFetching_Concept;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SourceFile_HomePAge_Using_DataFetchingConcept {

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
	public SourceFile_HomePAge_Using_DataFetchingConcept(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

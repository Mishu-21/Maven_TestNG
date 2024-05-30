package Maven_Pom_Concept_package.Maven_Pom_Concept_Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Problem1_Amazon_SignInClick {

WebDriver driver;
	//step 1
	@FindBy(id="nav-link-accountList")
	WebElement Hover_Account;
	
	@FindBy(linkText="Sign in")
	WebElement signIn;
	
	
	//step 2
	
	
	public Problem1_Amazon_SignInClick(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// Step 2
	public void LaunchAmazon_ClickOnSignIn(WebDriver driver) {
		// TODO Auto-generated method stub
		//Thread.sleep(1000);
		 Actions a1=new Actions( driver);
	        
	        a1.moveToElement(Hover_Account).perform();
	        signIn.click();
	}
}

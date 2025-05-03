package DataFetching_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Step 4--> PART 2----> Make a relation between both the classes
public class SourceFile_LoginPAge_Using_ValuesFrom_DataFetchingClass extends DataFetching {

	WebDriver driver;
	
	@FindBy(id="ap_email")
	WebElement un_tf;
	
	
	@FindBy(id="continue")
	WebElement continue_Button;
	
	@FindBy(id="ap_password")
	WebElement pwd_tf;
	
	@FindBy(id="signInSubmit")
	WebElement signin_Button;
	
	@FindBy(id="nav-link-accountList")
	WebElement Hover_Account;
	
	public void username()
	{
		// un_tf.sendKeys("+917834898482");   --> so now by passing hardcode value we can pass username variable which is present in data fetching so that it can fetch value from the execel sheet 
	    
		//Step 4--> PART 1(ii)----> pass the variable "username" which is defined in datafetching class
		un_tf.sendKeys(username);
	}
	
	@FindBy(linkText="Sign Out")
	WebElement signOut;
	
	public void ContinueButton()
	{
		continue_Button.click();
	}
	
	public void Password()
	{
		// pwd_tf.sendKeys("Himanshi21@Chauhan");  --> so now by passing hardcode value we can pass pswd variable which is present in data fetching so that it can fetch value from the execel sheet 
	
		//Step 4--> PART 1(ii)----> pass the variable "password" which is defined in datafetching class
		pwd_tf.sendKeys(password);
	}

	
	public void SignInButton()
	{
		signin_Button.click();
	}
	
	//so to logout first we need to hover over account and than click on sign-out
	public void logout(WebDriver driver)
	{
		Actions a1=new Actions( driver);
        
        a1.moveToElement(Hover_Account).perform();
        signOut.click();
	}
	
	public SourceFile_LoginPAge_Using_ValuesFrom_DataFetchingClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

package Maven_Pom_Concept_package.Maven_Pom_Concept_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Problem1_Amazon_LoginPage {

	WebDriver driver;
	//Step 1
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
	//Step 2
	public void username()
	{
		un_tf.sendKeys("+917834898482");
	}
	
	@FindBy(linkText="Sign Out")
	WebElement signOut;
	
	public void ContinueButton()
	{
		continue_Button.click();
	}
	
	public void Password()
	{
		pwd_tf.sendKeys("Himanshi21@Chauhan");
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
	//Step 3
	public Problem1_Amazon_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}

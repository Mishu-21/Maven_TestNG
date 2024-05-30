/*
 * 
 *      ----------------------Everytime u run the testcase ,make sure the cart is empty------------------------------------ 

 Scenario: 

   login-->Search the product-->Click on 1st product-->Cart-->Reach till payment page
 
 Source Page Needed:
   login,home,searchResultPage,productPage,manage address,payment page
 */



package Maven_Pom_Concept_package.Maven_Pom_Concept_Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase3_Login_To_Payement {

	
	@Test
	public void login_To_Payment() throws InterruptedException
	{
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
	    driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		 
		//login 
		Problem1_Amazon_LoginPage l1=new Problem1_Amazon_LoginPage(driver);
		
		l1.username();
        l1.ContinueButton();
        l1.Password();
        l1.SignInButton();
		
        //search for the product--->Done in Home Page
        Problem1_Amazon_HomePage h1=new Problem1_Amazon_HomePage(driver);
        h1.searchBox_Shoe();
        
        //click on first product
        Problem1_Amazon_SearchResult1_ShoeProduct s1=new Problem1_Amazon_SearchResult1_ShoeProduct(driver);
		s1.Click_SearchedProduct(driver);
		
		
		//now on product page --->Add to wish list and cart
		Problem1_Amazon_ProductPage1 p1=new Problem1_Amazon_ProductPage1(driver);
		
		p1.add_To_Cart();
		p1.Proceed_To_Buy();
		
		//now on manage address page--->Choose any address and move to payment page
		Problem1_Amazon_ManageAddressPage a1=new Problem1_Amazon_ManageAddressPage(driver);
		a1.Use_This_Address();
	}
}


/*
Working as fine 
*/

/*
 * 
     ----------------------Everytime u run the testcase ,make sure the cart is empty------------------------------------ 
 Scenario:

 
   login-->Search the product-->Click on 1st product--->Wishlist--->Cart
 
 Source Page Needed:
   login,home,searchResultPage,productPage
 */

package Maven_Pom_Concept_package.Maven_Pom_Concept_Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase1_Login_To_Cart {

	//problem can occur 1-------->mainly jab cart mai products hai toh catapche option aa raha hai so keep our cart as empty while login  ---> Tb bhi aa raha hai toh  try with firefox not with chrome --->still issue occur
	@Test
	public void login_till_Cart() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		//driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//problem can occur 2 which will solve the issue-------->kabhi kbhi jab first time launch kar rahe hai toh capatache and otp ke liye bol raha hai first time enter kardo woh manually than firse run karo it will work 
		
		//problem can occur 3 -------->launch amazon and click on signin ---> to check ki capatche ja rah ahai jisse ya nhi --->still it is coming so we can do follow problem 2 approach 
		
		//hover over account and than click on signin when launched through amazon.in
		Problem1_Amazon_SignInClick sign1=new Problem1_Amazon_SignInClick(driver);
		 sign1.LaunchAmazon_ClickOnSignIn(driver);
		 
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
		
		//new window is launched so now window handle concept comes in picture but this will be done in Click_SearchedProduct() method only as after clicking the product only new window is launched
		
		//now on product page --->Add to wish list and cart
		Problem1_Amazon_ProductPage1 p1=new Problem1_Amazon_ProductPage1(driver);
		p1.add_To_WishList();
		p1.add_To_Cart();
	}
}


/*
 Working as fine 
 */

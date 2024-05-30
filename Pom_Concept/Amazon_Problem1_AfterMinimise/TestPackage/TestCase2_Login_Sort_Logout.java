/*
 * 
 *      ----------------------Everytime u run the testcase ,make sure the cart is empty------------------------------------ 

 Scenario: 
   login-->Search the product--Sort the products(using 4 star and get it within 2 days)--->Logout
 
 Source Page Needed:
   login,home,searchResultPage,Any Page we can do logout so written code in login page only
 */



package Maven_Pom_Concept_package.Maven_Pom_Concept_Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase2_Login_Sort_Logout extends LaunchQuit {
	
	@Test
	public void Login_Sort_Logout() throws InterruptedException
	
	{
		
		
		      //login 
				Problem1_Amazon_LoginPage l1=new Problem1_Amazon_LoginPage(driver);
				
				l1.username();
		        l1.ContinueButton();
		        l1.Password();
		        l1.SignInButton();
				
		        //search for the product--->Done in Home Page
		        Problem1_Amazon_HomePage h1=new Problem1_Amazon_HomePage(driver);
		        h1.searchBox_Shoe();
		       
		        //sort the product --->Done in searchresult1 page
		        Problem1_Amazon_SearchResult1_ShoeProduct s1=new Problem1_Amazon_SearchResult1_ShoeProduct(driver);
		        s1.Sort_Using_4star();
		        s1.Sort_Using_GetWithin2Days();
		        
		        
		        //logout -> it can be done from any page ---> so logout ka method,login page mai he likha hai 
		        
		        l1.logout(driver);
	}
	

}
/*
Working as fine 
*/
//for each product my product page will be different

package Maven_Pom_Concept_package.Maven_Pom_Concept_Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Problem1_Amazon_ProductPage1 {

	WebDriver driver;
	
	// this product page is for shoe---> in this add the product to wishlist and add to cart 
	
	//step 1
	
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement wishlist;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-close'])[2]")
	WebElement popup_WhenClickOnWishList;
	
	@FindBy(id="add-to-cart-button")
	WebElement addCart;
	
	@FindBy(xpath="//span[@id='sc-buy-box-ptc-button']/span/input")
	WebElement proceed_To_Buy;
	
	
	//Step-2
	
	public void add_To_WishList()
	{
		wishlist.click();
		//once clicked on wishlist a popup occur so close it here only 
		
		popup_WhenClickOnWishList.click();
		
	}
	
	public void add_To_Cart() throws InterruptedException
	{
		Thread.sleep(1000);
		
		addCart.click();
	}
	
	public void Proceed_To_Buy() throws InterruptedException
	{
		Thread.sleep(1000);
		
		proceed_To_Buy.click();
	}
	
	//step 3
	public Problem1_Amazon_ProductPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

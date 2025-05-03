package DataFetching_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SourceFile_ProductPage1_Using_DataFetchingConcept {

WebDriver driver;
	
	
	
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement wishlist;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-close'])")
	WebElement popup_WhenClickOnWishList;
	
	@FindBy(id="add-to-cart-button")
	WebElement addCart;
	
	@FindBy(xpath="//span[@id='sc-buy-box-ptc-button']/span/input")
	WebElement proceed_To_Buy;
	
	
	
	
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
	
	
	public SourceFile_ProductPage1_Using_DataFetchingConcept(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

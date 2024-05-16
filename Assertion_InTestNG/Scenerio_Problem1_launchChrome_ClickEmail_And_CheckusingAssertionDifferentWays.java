package Assertion_InTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenerio_Problem1_launchChrome_ClickEmail_And_CheckusingAssertionDifferentWays {

	WebDriver driver;

	@Test
	public void launchChrome_ClickEmail() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement Gmail_Select = driver.findElement(By.partialLinkText("Gma"));
		Gmail_Select.click();
		
		WebElement present_element = driver.findElement(By.xpath("(//div[@class='dropdown__label'])[1]"));
		Assert.assertEquals(present_element.isDisplayed(), true);
		/*
		 * we can now use Assert.assertEquals(String actual,string expected) and can
		 * check email title is coming as expected or not and expected must be hand
		 * written so take this through inspect email page and take the title which is
		 * present in head so title is
		 * "Gmail: Private and secure email at no cost | Google Workspace" and actual
		 * must be coming from method so usko getTitle ki help se lelo
		 * 
		 * 
		 * ways we can use assertion------->with title ,url also
		 * Assert.assertEquals(driver.getTitle()
		 * ,"Gmail: Private and secure email at no cost | Google Workspace"); this will
		 * mainly pass the test case
		 * 
		 * 
		 * now to explicitly fail the test case lets remove something from email and
		 * than run now our testcase will fail
		 * 
		 * 
		 * //1st way //Assert.assertEquals(driver.getTitle()
		 * ,": Private and secure email at no cost | Google Workspace"); fail
		 * 
		 * 
		 * video--23:20 now to get the url we can use getCurrentUrl() but humesha url
		 * cant use mainly use jb we see only end point like / slash but jb url mai
		 * params ho like & & tb mt use karo
		 * 
		 * //2nd way
		 * 
		 * //
		 * Assert.assertEquals(driver.getCurrentUrl(),"https://google.com/gmail/about/")
		 * ; //pass
		 * 
		 * 
		 * //
		 * Assert.assertEquals(driver.getCurrentUrl(),"ht://google.com/gmail/about/");
		 * //fail
		 * 
		 * 
		 * //3rd way
		 * 
		 * WebElement present_element
		 * =driver.findElement(By.xpath("(//div[@class='dropdown__label'])[1]"));
		 * Assert.assertEquals(present_element.isDisplayed(), true);
		 * 
		 * 
		 //4th way 
		  * clickable or not 
		 */
	}
}

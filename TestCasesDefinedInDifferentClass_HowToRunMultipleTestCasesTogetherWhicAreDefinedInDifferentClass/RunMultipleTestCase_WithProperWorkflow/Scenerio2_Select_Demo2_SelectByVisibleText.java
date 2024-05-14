package RunMultipleTestCase_WithProperWorkflow;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Scenerio2_Select_Demo2_SelectByVisibleText {

	@Test
	public void Select_Demo2_SelectByVisibleText()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		WebElement Choice=driver.findElement(By.id("Choice1"));
		Select s=new Select(Choice);
		s.selectByVisibleText("Demo2");

	}
}

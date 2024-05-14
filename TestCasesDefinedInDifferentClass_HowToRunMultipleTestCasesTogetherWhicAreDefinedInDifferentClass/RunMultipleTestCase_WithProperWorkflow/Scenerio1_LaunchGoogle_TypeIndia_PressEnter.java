package RunMultipleTestCase_WithProperWorkflow;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scenerio1_LaunchGoogle_TypeIndia_PressEnter {

	@Test
	public void LaunchGoogle_TypeIndia_PressEnter()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);

	}
}

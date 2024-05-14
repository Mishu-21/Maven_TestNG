package MavenProject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWay_ToLaunchBrowser {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();  //generic way 
	driver.get("https://www.google.com/");
	
	}

}

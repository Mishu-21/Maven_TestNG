/*
Steps to follow to scroll down/up
   1.find x and y coordinates 
   2.upcaste ur driver to JavascriptExecutor 
   3.utilise its method executeScript
   4.writing ur own script like window.scrollBy(X,Y) 

*/

package MavenProject.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class scroll_FindCooridinates {

	public static <WebeElement> void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		
		//now i want to scroll down till last element is covid-19 is found
		
		
		//so first find the the element 
		WebElement e1=driver.findElement(By.linkText("COVID-19 and Amazon"));
		
		
		/*Step 1
		 * now i need to find x and y of this elemnet so we use
		 *  getLocation() and its return type is Point 
		 *  so after we can use getX() and getY() to find the coordinates  and these method return type is int 
		
		getlocation() is one of the abstarct method of Webelement(I)
		*/
		
		
		Point p1 = e1.getLocation();
		int x=p1.getX();
		int y=p1.getY();
		System.out.println(x);
		System.out.println(y);
		
		
		// Step 2:Upcaste
		JavascriptExecutor js1=driver;
		
		//step 3 and 4 
		//js1.executeScript("window.scrollBy(1000,1000)");ye thoda karega scroll
		//but humko scroll down till COVID-19 and Amazon  tk cahhiye so usko humne y coordinate mai rkha hai isliyi pass y 
	//	js1.executeScript("window.scrollBy(0,y)");//but aise pass kiya toh recoignise nhi kar rha hai yeh so isliyi y aise pass karo 
		//js1.executeScript("window.scrollBy(0,"+y+")");
	//ab humko x 0 nhi rkhna so can we pass x value its big yes we can do it 
		
		
		js1.executeScript("window.scrollBy("+x+","+y+")");
		
		
		//now as we have done scroll done,now  we can do scroll up too
		Thread.sleep(1000);
		js1.executeScript("window.scrollBy(0,-1000)");
	}
}

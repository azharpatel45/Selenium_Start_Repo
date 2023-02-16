package selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MicrosofrEdgeTest {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver ();
	
	driver.get("https://www.microsoft.com/en-us/edge?form=MA13FJ");
	
	driver.manage().window().maximize();
	
	Actions a = new Actions (driver);

	/*WebElement Resource = driver.findElement(By.xpath("(//span[contains(text(),'Resources')])[1]"));
	Resource.click();
	WebElement Help = driver.findElement(By.xpath("(//span[contains(text(),'Help & Support')])[2]"));
	a.moveToElement(Resource).moveToElement(Help).click().build().perform();
	
	a.dragAndDrop(Resource, Help).build().perform();*/
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("window.scrollBy(0,6000)");
	js.executeScript("window.scrollBy(0,-3000)");
	
	Thread.sleep(3000);
	
	js.executeScript("window.scrollBy(100,0)");
	js.executeScript("window.scrollBy(-100,0)");
	
	WebElement TryEdge = driver.findElement(By.xpath("(//span[contains(text(),'Try Edge')])[2]"));
	
	
	js.executeScript("arguments[0].scrollIntoView(true);",TryEdge);
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,-500);");
	
	TryEdge.click();
	
	
	}

}

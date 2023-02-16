package selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MahavitranTestCase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.mahadiscom.in/en/home/");
		driver.manage().window().maximize();
		driver.navigate().refresh();

		Thread.sleep(5000);

		WebElement Cross = driver.findElement(By.xpath("(//button[@aria-label='Close'])[3]"));
		Cross.click();

		Thread.sleep(2000);

		WebElement About = driver.findElement(By.xpath("//a[text() ='ABOUT MSEDCL ']"));

		// WebElement Account = driver.findElement(By.xpath("//a[text()='Statements of
		// Accounts']"));

		Actions a = new Actions(driver);

		// a.moveToElement(About).moveToElement(Account).click().build().perform();

		WebElement Drag = driver.findElement(By.xpath("//input[@id='cse-search-input-box-id']"));

		Thread.sleep(2000);

		a.dragAndDrop(About,Drag).build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-3000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(1000,0)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(-1000,0)");
		Thread.sleep(3000);
		 
		WebElement Img = driver.findElement(By.xpath("(//img[@class='alignnone size-full wp-image-29572 aligncenter'])[1]"));
		
		
		js.executeScript("arguments[0].scrollIntoView(true);", Img);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-100);");
		
		Img.click();
		
		
	}

}

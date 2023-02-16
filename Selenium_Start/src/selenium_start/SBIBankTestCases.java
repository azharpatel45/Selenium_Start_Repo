package selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SBIBankTestCases {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.onlinesbi.sbi/");
		Thread.sleep(5000);
		driver.get("https://www.onlinesbi.sbi/");
		Thread.sleep(5000);
		driver.get("https://www.onlinesbi.sbi/");
		Thread.sleep(5000);
		driver.get("https://www.onlinesbi.sbi/");
		Thread.sleep(5000);
		driver.get("https://www.onlinesbi.sbi/");
		Thread.sleep(5000);
		
		Actions a = new Actions (driver);
		
		WebElement Service = driver.findElement(By.xpath("//a[text()='Services ']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(-500,0)");
		Thread.sleep(5000);
		 
		js.executeScript("window.scrollBy(-250,0)");
		Thread.sleep(5000);
		
		
		/*WebElement Personal = driver.findElement(By.xpath("//a[text()='Personal Internet Banking']"));
		
		a.moveToElement(Service).moveToElement(Personal).click().build().perform();
		
		
	WebElement SignIn = driver.findElement(By.xpath("(//a[@aria-expanded='false'])[1]"));

		WebElement LogIn = driver.findElement(By.xpath("//span[text()='LOGIN']"));
		LogIn.clear();*/
	}

}

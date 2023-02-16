package selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class RedBusTestCases {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement From = driver.findElement(By.xpath("//label[text()='FROM']"));
		Thread.sleep(1000);

		
		WebElement ToIt = driver.findElement(By.xpath("//input[@id='dest']"));
		Thread.sleep(1000);
		
		WebElement Date = driver.findElement(By.xpath("//label[@class='db text-trans-uc']"));
		Date.click();
		
		
		
		

	}

}

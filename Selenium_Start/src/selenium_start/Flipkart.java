package selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		WebElement cross = driver.findElement(By.xpath("//button[text()='✕']"));
		cross.click();

		Thread.sleep(5000);

		/*
		 * WebElement cross = driver.findElement(By.xpath("//button[text()='✕']"));
		 * cross.click(); WebElement search =
		 * driver.findElement(By.xpath("//input[@type='text']")); search.click();
		 * search.sendKeys("samsung mobile"); WebElement tick =
		 * driver.findElement(By.xpath("(//div[@class='_24_Dny'])[1]")); tick.click();
		 */

		WebElement Account = driver.findElement(By.xpath("//div[text()='Fashion']"));
		WebElement Kids = driver.findElement(By.xpath("//a[text()='Kids']"));

		Actions a = new Actions(driver);

		a.moveToElement(Account).moveToElement(Kids).click().build().perform();

		/*a.moveToElement(Account).perform();
		a.moveToElement(Kids).perform();
		
		Thread.sleep(3000);
		
		a.click().perform();*/

	}

}

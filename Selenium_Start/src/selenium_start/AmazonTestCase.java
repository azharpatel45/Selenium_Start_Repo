package selenium_start;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonTestCase {

	public static void main(String[] args) throws InterruptedException {

		/*System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		Thread.sleep(5000);
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement signInAcc = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(signInAcc).build().perform();
		
		WebElement orderd = driver.findElement(By.xpath("//span[text()='Your Orders']"));
		
		orderd.click();
		
		WebElement emailOrPhone = driver.findElement(By.xpath("//input[@id='ap_email']"));
		
		emailOrPhone.sendKeys("123456");
		
		WebElement continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
		
		continueButton.click();
		
		WebElement createNewAcc = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		
		createNewAcc.click();*/
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		Thread.sleep(5000);
		
		driver.get("https://www.rediff.com/");
		
		WebElement createAcc = driver.findElement(By.xpath("//a[text()='Create Account']"));
		
		createAcc.click();
		
		WebElement cheakBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		boolean result = cheakBox.isSelected();
		
		System.out.println(result);
		
		if(result==true) {
		System.out.println("selected");
		}
		else {
		System.out.println("NotSelected");
		cheakBox.click();
		}
		boolean result1 = cheakBox.isSelected();
		System.out.println(result1);
		
	
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		//WebElement day = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='DOB_Day09ca4c09']")));
		
		WebElement day = driver.findElement(By.xpath("//select[@id='country']"));
		Select s = new Select(day);
		s.selectByValue("Argentina");
		
		
		
		}
		
		
		
		
		

	}

 
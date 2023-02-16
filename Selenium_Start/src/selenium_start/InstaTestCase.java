package selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaTestCase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.instagram.com/");
		
		WebElement Username = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		WebElement Pass = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		
		String AttributrValue = Username.getAttribute("aria-label");
		System.out.println(AttributrValue);

		String Attr = Pass.getAttribute(AttributrValue);
		
		String S = Pass.getText();
		Pass.getTagName();
		
		if(AttributrValue.equals("Phone number, username, or email")) {
			System.out.println("TEST CASE PASS");
		}
		else {
			System.out.println("TEST CASE FAIL");
		}
		
		
		
		/*driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		Thread.sleep(5000);

		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//div[text()='Log in']"));

		boolean result = login.isEnabled();
		if (result == false) {
			System.out.println("Button is Disabled");
			username.sendKeys("9767134345");
			password.sendKeys("azhar6945@");
		} else {
			System.out.println("Button is Enabled");
		}
		result = login.isEnabled();
		System.out.println(result);  */
		
		
		

	}

}

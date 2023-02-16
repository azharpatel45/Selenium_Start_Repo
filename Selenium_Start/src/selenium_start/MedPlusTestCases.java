package selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MedPlusTestCases {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.medplusmart.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();

		Thread.sleep(5000);

		WebElement Signup = driver.findElement(By.xpath("//span[text()='Login / Sign up']"));
		Signup.click();
		//WebElement Mob = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		//Mob.sendKeys("9767134345");
		WebElement Otp = driver.findElement(By.xpath("//button[text()='Send OTP']"));
		Otp.click();
		
		Boolean OTP = Otp.isEnabled();
		System.out.println(OTP);
		
		String text = Otp.getText();
		System.out.println(text);
		
		String Crete = Otp.getTagName();
		System.out.println(Crete);
		
		/*WebElement Enter = driver.findElement(By.xpath("//input[@name='OTP']"));
		WebElement Verify = driver.findElement(By.xpath("//button[text()='Verify OTP']"));
		WebElement Fullname = driver.findElement(By.xpath("//input[@id='fullName']"));
		
		String Attrvalue=Fullname.getAttribute("id");*/
		
		
		
	}

}

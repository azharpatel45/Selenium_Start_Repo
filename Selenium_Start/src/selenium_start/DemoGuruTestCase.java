package selenium_start;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuruTestCase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Automation\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().window().maximize();

		Thread.sleep(5000);
		
	List<WebElement> cell =driver.findElements(By.xpath("//table[@id='customers']//td"));
	
	int size = cell.size();
	System.out.println(size);
	
	for(int i=0;i<cell.size();i++)
	{
		String text = cell.get(i).getText();
		System.out.println(text);
		
		
		//OR
		//System.out.println(cell.get(i).getText());
	}
		
		
		
		
		
		/*String Mainpage = driver.getWindowHandle();
		System.out.println(Mainpage);

		// Set<String> a =driver.getWindowHandles();

		ArrayList<String> adr = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(adr.get(1));
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(frame);
		
		WebElement Clickme = driver.findElement(By.xpath("//button[@type='button']"));
		
		Clickme.click();
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		WebElement Try1 = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		
		Try1.click();
		
		String Mainpage = driver.getWindowHandle();
		System.out.println(Mainpage);
		
		ArrayList<String> adr = new	ArrayList<String>(driver.getWindowHandles());
		
		String a1 = adr.get(0);
		Thread.sleep(2000);
		System.out.println(a1);
		
		String a2 = adr.get(1);
		Thread.sleep(2000);
		System.out.println(a2);
		
		driver.switchTo().window(a1); 
		System.out.println(driver.getCurrentUrl());
		
		
		WebElement Try2 = driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
		Try2.click();
		
		/*
		 * //WebElement Submitt =
		 * driver.findElement(By.xpath("//input[@value='Submit']"));
		 * 
		 * //Submitt.click();
		 * 
		 * WebElement Selenium =
		 * driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		 * 
		 * Alert alt = driver.switchTo().alert(); String Text = alt.getText();
		 * System.out.println(Text);
		 * 
		 * Thread.sleep(3000); alt.dismiss();
		 * 
		 * //driver.switchTo().alert().accept();
		 * 
		 * Thread.sleep(5000);
		 * 
		 * Text = alt.getText(); System.out.println(Text); alt.accept();
		 */
	
	

		/*WebElement Try1 = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		WebElement Try2 = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		WebElement Try3 = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		WebElement Try4 = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		WebElement Try5 = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[5]"));

		Try1.click();
		Thread.sleep(2000);
		Try2.click();
		Thread.sleep(2000);
		Try3.click();
		Thread.sleep(2000);
		Try4.click();
		Thread.sleep(2000);
		Try5.click();
		Thread.sleep(2000);

		String Mainpage = driver.getWindowHandle();
		System.out.println(Mainpage);

		// Set<String> a =driver.getWindowHandles();

		ArrayList<String> adr = new ArrayList<String>(driver.getWindowHandles());

		String a1 = adr.get(0);
		Thread.sleep(2000);
		System.out.println(a1);

		String a2 = adr.get(1);
		Thread.sleep(2000);
		System.out.println(a2);

		String a3 = adr.get(2);
		Thread.sleep(2000);
		System.out.println(a3);

		String a4 = adr.get(3);
		Thread.sleep(2000);
		System.out.println(a4);

		String a5 = adr.get(4);
		Thread.sleep(2000);
		System.out.println(a5);

		String a6 = adr.get(5);
		Thread.sleep(2000);
		System.out.println(a6);

		driver.switchTo().window(a1); 
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(a2);
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(a3);
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(a4);
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(a5);
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(a6);
		System.out.println(driver.getCurrentUrl());*/
	}

}

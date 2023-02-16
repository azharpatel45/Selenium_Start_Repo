package selenium_start;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RediffmailTestCases {

	public static void main(String[] args) throws IOException, InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rediff.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.manage().window().minimize();

		driver.navigate().to("https://www.rediff.com/");

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		driver.close();
		driver.quit();

		WebElement Rediffmail = driver.findElement(By.xpath("//a[text()='Rediffmail']"));
		WebElement Username = driver.findElement(By.xpath("//input[@id='login1']"));
		WebElement Pass = driver.findElement(By.xpath("//input[@name='passwd']"));
		WebElement Signin = driver.findElement(By.xpath("//input[@title='Sign in']"));

		Rediffmail.click();
		Username.sendKeys("AZHAR PATEL");
		Pass.sendKeys("123456987");
		Signin.click();

		// FOR SELECTION OF DROP DOWN EX. DATE,MONITH,YEAR,STATE,COUNTRY.

		WebElement Createnew = driver.findElement(By.xpath("//a[@title='Create new Rediffmail account']"));
		Createnew.click();

		WebElement DropDown = driver.findElement(By.xpath("//select[@id='country']"));
		DropDown.click();

		Select Country = new Select(DropDown);
		Country.selectByIndex(99);
		Country.selectByValue("99");
		Country.selectByVisibleText("India");

		// TO CHEAK THE TAB IS SELECTED OR NOT

		WebElement Male = driver.findElement(By.xpath("//input[@checked='checked']"));

		boolean result = Male.isSelected();
		System.out.println(result);

		if (result == true) {
			System.out.println(result);
			System.out.println("Tab is Selected");
		} else {
			System.out.println(result);
			System.out.println("Tab is Not Selected");
			Male.click();
		}

		result = Male.isSelected();
		System.out.println(result);

		WebElement FeMale = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		boolean Result = FeMale.isSelected();
		System.out.println(Result);

		// USED TO VERIFY HIDDEN ELEMENT ID DISPLAYED OR NOT.ISDISPLYAED METHOD

		driver.get("https://www.facebook.com/");

		WebElement Username1 = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement Passs = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
		WebElement Createnewacc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		Createnewacc.click();
		WebElement Custom = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		WebElement Poronum = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));

		boolean result1 = Poronum.isDisplayed();
		System.out.println(result1);

		if (result1 == false) {
			System.out.println("ELEMENT IS NOT DISPLAYED");
			Custom.click();
		} else {
			System.out.println("ELEMENT IS DISPLAYED");
		}

		result1 = Poronum.isDisplayed();
		System.out.println(result1);

		// USED TO VERIFY THE ELEMENT IS ENABLED OR DISABLED

		driver.get("https://www.instagram.com/");

		WebElement Usernameinsta = driver
				.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		WebElement Passinsta = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		WebElement LoginButton = driver.findElement(By.xpath("//div[text()='Log in']"));

		boolean result2 = LoginButton.isEnabled();
		System.out.println(result2);

		if (result2 == false) {
			System.out.println("ELEMENT IS DISABLE");
			Usernameinsta.sendKeys("9767134345");
			Passinsta.sendKeys("123456789");
		} else {
			System.out.println("ELEMENT IS ENABLED");
		}
		result2 = LoginButton.isEnabled();
		System.out.println(result2);

		// USE OF GET ATTRIBUTE,GET TEXT,GET TAGNAME AND CLEAR METHOD

		driver.get("https://www.facebook.com/");
		WebElement UsernameFace = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement PassFace = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement LoginFace = driver.findElement(By.xpath("//button[@type='submit']"));

		String attributevalue = UsernameFace.getAttribute("text");
		System.out.println(attributevalue);

		if (attributevalue.equals("Email address or phone number")) {
			System.out.println("TEST CASE PASS");
		} else {
			System.out.println("TEST CASE FAIL");
		}

		String text = LoginFace.getText();
		System.out.println(text);

		if (text.equals("Create New Account")) {
			System.out.println("TEST CASE PASS");
		} else {
			System.out.println("TEST CASE FAIL");
		}

		String Tagname = UsernameFace.getTagName();
		System.out.println(Tagname);

		UsernameFace.sendKeys("Azhar");
		UsernameFace.clear();
		UsernameFace.sendKeys("Patel");

		// HOW TO PERFORM THE MOUSE ACTION

		Actions a = new Actions(driver);

		a.click(); // FOR CLICK
		a.doubleClick(); // FOR DOUBLE CLICK
		a.contextClick(); // FOR RIGHT CLICK
		a.moveToElement(LoginFace); // FOR MOUSE POINTER
		a.dragAndDrop(PassFace, LoginFace);// FOR DRAF AND DROP
		a.build(); // FOR COMBINE THE MULTIPLE ACTION
		a.perform(); // FOR PERFORM THE MOUSE ACTION

		driver.get("https://www.amazon.in/");

		WebElement AccandList = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		WebElement Yourorderd = driver.findElement(By.xpath("//span[text()='Your Orders']"));

		Actions act = new Actions(driver);
		act.moveToElement(AccandList).perform();
		Thread.sleep(5000);
		act.moveToElement(Yourorderd).perform();
		act.click().perform();

		// OR

		act.moveToElement(AccandList).moveToElement(Yourorderd).build().perform();

		// HOW TO PERFORM DRAG AND DROP

		driver.get("https://www.amazon.in/");

		WebElement Link = driver.findElement(By.xpath("//img[@alt='Amazon App']"));
		WebElement Search = driver.findElement(By.xpath("//label[text()='Search']"));

		Actions act1 = new Actions(driver);

		act1.dragAndDrop(Link, Search).build().perform();

		// HOW TO PERFORM THE SCROLL DOWN,UP,LEFT AND RIGHT

		driver.get("https://www.amazon.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("window.scrollBy(0,-500)");
		js.executeScript("window.scrollBy(100,0)");
		js.executeScript("window.scrollBy(-50,0)");

		// FOR TARGET ELEMENT

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		WebElement Search1 = driver.findElement(By.xpath("//label[text()='Search']"));

		js.executeScript("arguments[0].scrollIntoView(true);", Search);
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-100);", args);
		

		// HOW TO HANDLE ALERT POP UP
		
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		WebElement Submitt = driver.findElement(By.xpath("//input[@value='Submit']"));

		// Submitt.click();

		WebElement Selenium = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));

		Alert alt = driver.switchTo().alert();
		String Text = alt.getText();
		System.out.println(Text);

		Thread.sleep(3000);
		alt.dismiss();

		// driver.switchTo().alert().accept();

		Thread.sleep(5000);

		Text = alt.getText();
		System.out.println(Text);
		alt.accept();
		
		//HANDLING OF CHILD OF CHILD BROWSER
		
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().window().maximize();

		Thread.sleep(5000);
		
		WebElement Try1 = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
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
		System.out.println(driver.getCurrentUrl());
		
		//HOW TO HANDLE IFRAME
		
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().window().maximize();

		Thread.sleep(5000);
		
		
        ArrayList<String> adr1 = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(adr.get(1));
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(frame);
		
		WebElement Clickme = driver.findElement(By.xpath("//button[@type='button']"));
		
		Clickme.click();
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		
		//HOW TO HANDLE HTML TABLE >  BY USING RELATIVE X PATH AND FIND ELEMENTS METHOD
		
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().window().maximize();

		Thread.sleep(5000);
		
	List<WebElement> cell =driver.findElements(By.xpath("//table[@id='customers']//td"));
	
	int size = cell.size();
	System.out.println(size);
	
	for(int i=0;i<cell.size();i++)
	{
		String text1 = cell.get(i).getText();
		System.out.println(text1);
		
		
		//OR
		//System.out.println(cell.get(i).getText());
		
		// FOR TABLE ASSIGNMENT FOR PASS FAIL GIVEN BY AKASH SIR
		
				//System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");

				//WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.naukri.com/learning/articles/html-tables-tutorial-with-examples/");
				Thread.sleep(5000);
				
				List<WebElement> actList=driver.findElements(By.xpath("//table//td"));
				int actSize=actList.size();

				System.out.println("Actual size of data is "+ actSize);
				String[] explist={"HTML Table Tag","Description","<table>", "defines a table","<tr>","represents rows","<td>","to create data cells","<th>","to add table headings","<caption>","used to insert captions"};
				System.out.println("expected size of data is "+ explist);
				
				List<WebElement> rows=driver.findElements(By.xpath("//table//tr"));
				int rowSize=rows.size();
				System.out.println(rowSize);
				
				List<WebElement> col=driver.findElements(By.xpath("//table//tr[1]//td"));
				int colSize=col.size();
				System.out.println(colSize);
				
				for(int r=1;r<=rowSize;r++)
				{
					for(int c=1;c<=colSize;c++)
					{
						String data=driver.findElement(By.xpath("//table//tr["+ r +"]//td["+ c +"]")).getText();
						System.out.print(data+" , ");
						
					}
					
					System.out.println();	
				}
				
		//	for(int i=0;i<actSize;i++) 
			{
				//String text=actList.get(i).getText();
				
				if(text.equals(explist[i]))
				{
					System.err.println("Pass");
				}
				else
				{
					System.out.println("Fail");
				}
				
			}
			driver.quit();
			
			
			// FOR TABLE ASSIGNMENT FOR DATA GIVEN BY AKASH SIR
			
			/*driver.get("https://www.naukri.com/learning/articles/html-tables-tutorial-with-examples/");
			Thread.sleep(5000);
			
			int rowSize=driver.findElements(By.xpath("//table//tr")).size();
			System.out.println(rowSize);
			
			int colSize=driver.findElements(By.xpath("//table//tr[1]//td")).size();
			System.out.println(colSize);
			
			for(int r=1;r<=rowSize;r++)
			{
				for(int c=1;c<=colSize;c++)
				{
					String data=driver.findElement(By.xpath("//table//tr["+ r +"]//td["+ c +"]")).getText();
					System.out.print(data+" , ");
					
				}
				//Thread.sleep(3000);
				System.out.println();
			}
			
			driver.quit();*/
			
		
		// HOW TO CAPTURE SCREENSHOT WITH CURRENT DATE
		
		Date CurrentDate = new Date();
		System.out.println(CurrentDate);
		String Image = CurrentDate.toString().replace(":", "-").replace(" ", "-");
		System.out.println(Image);
		
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		 TakesScreenshot t = (TakesScreenshot)driver ;
		 
		File src = t.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Automation\\New folder\\"+ Image +".jpg");//FOR RANDOM NUMBER USE RANDOM.METHOD 
		
		FileHandler.copy(src, dest);
		
		
		
		//HOW TO EXTRACT DATA FROM EXECLE SHEET
		
		String Path = "C:\\Automation\\Excel Sheet.xlsx";
		
		InputStream file = new FileInputStream (Path);
		
		String Data = WorkbookFactory.create(file).getSheet("Group11").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(Data);
		
		// FOR TABLE ASSIGNMENT FOR PASS FAIL GIVEN BY AKASH SIR
		
				/*System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.naukri.com/learning/articles/html-tables-tutorial-with-examples/");
				Thread.sleep(5000);
				
				List<WebElement> actList=driver.findElements(By.xpath("//table//td"));
				int actSize=actList.size();

				System.out.println("Actual size of data is "+ actSize);
				String[] explist={"HTML Table Tag","Description","<table>", "defines a table","<tr>","represents rows","<td>","to create data cells","<th>","to add table headings","<caption>","used to insert captions"};
				System.out.println("expected size of data is "+ explist);
				
				List<WebElement> rows=driver.findElements(By.xpath("//table//tr"));
				int rowSize=rows.size();
				System.out.println(rowSize);
				
				List<WebElement> col=driver.findElements(By.xpath("//table//tr[1]//td"));
				int colSize=col.size();
				System.out.println(colSize);
				
				for(int r=1;r<=rowSize;r++)
				{
					for(int c=1;c<=colSize;c++)
					{
						String data=driver.findElement(By.xpath("//table//tr["+ r +"]//td["+ c +"]")).getText();
						System.out.print(data+" , ");
						
					}
					
					System.out.println();	
				}
			for(int i=0;i<actSize;i++) 
			{
				String text=actList.get(i).getText();
				if(text.equals(explist[i]))
				{
					System.err.println("Pass");
				}
				else
				{
					System.out.println("Fail");
				}
				
			}
			driver.quit();*/
		
		// WAIT...IMPLICIT WAITING TIME IS THROUGHTOUT THE BROWESER SO APPLID BELOW THE BROWESER OBJECT
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // DEPRECATED METHOD
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		WebElement user = driver.findElement(By.xpath("xpath123"));
		WebElement password = driver.findElement(By.xpath("xpath1234"));
		WebElement login = driver.findElement(By.xpath("xpath12345"));
		
		// WAIT...Explicit WAITING TIME+CONDITION(FREQ IS FIX 500 MLS.
		//IS ONLY ON ONE ELEMENT APPLID ABOVE THE BROWESER INSPECT ELEMENT
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(25));
		
		WebElement login1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath1234567")));
		
		// Fluent Wait to CREATE OBJECT OF FLUENT WAIT AND APPLY METHOD
		// OF WITH TIME OUT/POLLING EVERY/INGORING ELEMNET
		
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(NoSuchElementException.class);
			
		
		
		
	}
	}

}

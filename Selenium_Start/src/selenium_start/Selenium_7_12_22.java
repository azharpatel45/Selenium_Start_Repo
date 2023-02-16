package selenium_start;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Selenium_7_12_22 {

	public static void main(String [] args) throws InterruptedException, IOException {
		
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
	driver.quit();
	

		//driver.get("https://www.facebook.com/");
		//Thread.sleep(5000);

		//driver.manage().window().maximize();
		
		//Thread.sleep(3000);
	
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
		
		//FOR EXTRACT DATA FROM EXCEL SHEET 
		
		String Path = "C:\\Users\\Azhar Patel\\OneDrive\\Desktop\\ExcelSheet.xlsx";
		
		InputStream file = new FileInputStream (Path);
		
		//String Data = WorkbookFactory.create(file).getSheet("Group11").getRow(1).getCell(1).getStringCellValue();
		
		//System.out.println(Data);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Group11");
		
		//cell.getStringCellValue(); // for string values
		//cell.getNumericCellValue(); // for numeric values
		//cell.getBooleanCellValue(); // for boolean values

		
		//for(Row row:sheet) {
			//for(Cell cell:row) {
				
			}
		//}
		
		//FOR SCREENSHOT FOR NAME CURRENT DATE
		 
		/*Date CurrentDate = new Date();
		System.out.println(CurrentDate);
		String Image = CurrentDate.toString().replace(":", "-").replace(" ", "-");
		System.out.println(Image);
		
		
		WebElement Login = driver.findElement(By.xpath("//button[text()='Log in']"));
		
		Login.click();
		
		driver.navigate().back();
		
		WebElement Createnew = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		Createnew.click();
		
		
		/*
		TakesScreenshot t = (TakesScreenshot)driver ;
		 
		File src = t.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Automation\\New folder\\"+ Image +".jpg");
		
		FileHandler.copy(src, dest);*/
		
		
		

		/*WebElement username = driver.findElement(By.xpath("//input[@type='text']"));

		WebElement Pass = driver.findElement(By.xpath("//input[@id='pass']"));
		
		WebElement Submitt = driver.findElement(By.xpath("//button[@name='login']"));
		Submitt.click();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		WebElement creatnew = driver.findElement(By.xpath("//a[contains(text(),'New Account')]"));
		creatnew.click();
		
		WebElement month = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		Select s = new Select(month);
		s.selectByIndex(10);
		
		/*
		 * WebElement signIn = driver.findElement(By.xpath("//input[@type='text']"));
		 * signIn.sendKeys("9767134345");
		 * 
		 * WebElement Pass = driver.findElement(By.xpath("//input[@id='pass']"));
		 * Pass.sendKeys("azhar6945@");
		 * 
		 * WebElement Submitt = driver.findElement(By.xpath("//button[@name='login']"));
		 * Submitt.click();
		 * 
		 * Thread.sleep(5000);
		 * 
		 * driver.navigate().back();
		 * 
		 * WebElement creatnewacc =
		 * driver.findElement(By.xpath("//a[text()='Create New Account']"));
		 * creatnewacc.click();
		 * 
		 * driver.navigate().back();
		 * 
		 * WebElement firstname =
		 * driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		 * firstname.sendKeys("Azhar");
		 * 
		 * WebElement lastname =
		 * driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		 * lastname.sendKeys("Patel");
		 * 
		 * WebElement mobname =
		 * driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		 * mobname.sendKeys("9767134345");
		 * 
		 * WebElement passname =
		 * driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		 * passname.sendKeys("azhar6945@");
		 * 
		 * Thread.sleep(5000);
		 * 
		 * WebElement day =
		 * driver.findElement(By.xpath("//select[@name='birthday_day']"));
		 * 
		 * Select s = new Select(day); s.deselectByIndex(20);
		 * 
		 * WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		 * Select m = new Select(month); m.deselectByValue("12");
		 * 
		 * WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		 * Select y = new Select(year); y.deselectByVisibleText("1994");
		 * 
		 * 
		 * Thread.sleep(5000);
		 * 
		 * WebElement Custom =
		 * driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		 * 
		 * boolean result = Custom.isSelected();
		 * 
		 * if (result == true) { System.out.println("result");
		 * System.out.println("selected"); } else { System.out.println(result);
		 * System.out.println("Not Selected"); Custom.click(); } result =
		 * Custom.isSelected(); System.out.println(result);
		 * 
		 * 
		 * Thread.sleep(5000);
		 * 
		 * WebElement Custom =
		 * driver.findElement(By.xpath("(//input[@type='radio'])[3]")); WebElement
		 * poronum =
		 * driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
		 * 
		 * boolean result = poronum.isDisplayed();
		 * 
		 * if (result == false) { System.out.println("ELEMENT IS NOT DISPLAYED");
		 * Custom.click(); } else { System.out.println("ELEMENT IS DISPLAYED"); } result
		 * = poronum.isDisplayed();
		 

		String AttributeValue = signIn.getAttribute("type");
		System.out.println(AttributeValue);

		if (AttributeValue.equals("Email address or phone number")) {
			System.out.println("TEST CASE PASS");
		} else {
			System.out.println("TESTR CASE FAIL");
		}
		String Avalue = Pass.getAttribute("d");
		System.out.println(Avalue);

		if (Avalue.equals("pass")) {
			System.out.println("Test Case Pass");
		} else {
			System.out.println("Test Case Fail");*/
		
		
		}


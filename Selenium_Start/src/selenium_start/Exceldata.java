package selenium_start;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class Exceldata {

		public static void main(String [] args) throws InterruptedException, IOException {
	
	
	    	
	        // Load the Excel workbook
			
	        FileInputStream file = new FileInputStream(new File("C:\\Users\\Azhar Patel\\OneDrive\\Desktop\\ExcelSheet.xlsx"));
	        XSSFWorkbook workbook = new XSSFWorkbook(file);

	        // Get the sheet you want to read from
	        
	        XSSFSheet sheet = workbook.getSheetAt(0); // get the first sheet

	        // Iterate through the rows and cells of the sheet
	        
	        for (Row row : sheet) {
	            for (Cell cell : row) 
	            {
	                // do something with the cell value
	                System.out.println(cell.getStringCellValue());
	            }
	        }

	        // Remember to close the workbook and the FileInputStream when you are done
	        
	        workbook.close();
	        file.close();
	    }
	}


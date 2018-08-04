package week6;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public void readExcel(String string) throws IOException {
		// open workbook
		XSSFWorkbook wBook = new XSSFWorkbook("./Data/login.xlsx");
		// Go to the sheet using sheet name
		XSSFSheet sheet = wBook.getSheet("login");
		// Go to sheet using sheet index
		// XSSFSheet sheet = wBook.getSheet(0);
		// Find row count
		int rowCount = sheet.getLastRowNum();
		//int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		//System.out.println(physicalNumberOfRows);
		// Find cell count(columns)
		short columnCount = sheet.getRow(0).getLastCellNum();
		// read data
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
		}
		wBook.close();
	}
}
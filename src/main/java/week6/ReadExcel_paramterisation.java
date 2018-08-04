package week6;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel_paramterisation {

	public Object[][] readExcel(String filename) throws IOException {
		// open workbook
		XSSFWorkbook wBook = new XSSFWorkbook("./Data/"+filename+".xlsx");
		// Go to the sheet using sheet name
		XSSFSheet sheet = wBook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		//int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		//System.out.println(physicalNumberOfRows);
		// Find cell count(columns)
		short columnCount = sheet.getRow(0).getLastCellNum();
		// read data
		Object[][] data = new Object[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				try {
					XSSFCell cell = row.getCell(j);
					 data[i-1][j] = cell.getStringCellValue();
				} catch (Exception e) {
					 data[i-1][j] = "";
				}
				//System.out.println(data);
			}
		}
		wBook.close();
		return data;
	}
}
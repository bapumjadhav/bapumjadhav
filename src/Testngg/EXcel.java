package Testngg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class EXcel {
	 
		@SuppressWarnings("resource")
		@Test
		public void Find_File() throws IOException {
		FileInputStream salary = new FileInputStream("E://Excel file//salary.xlsx");//pravin
		XSSFWorkbook workbook = new XSSFWorkbook(salary);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int row = sheet.getLastRowNum();
	    int cola=sheet.getRow(0).getLastCellNum();
		for (int i = 0; i < row; i++) {
			XSSFRow currentrow = sheet.getRow(i);
			for (int j = 0; j < cola; j++) {
				String value = currentrow.getCell(j).toString(); 
				System.out.print("      " + value);
			}
			System.out.println();
		}
	}
}

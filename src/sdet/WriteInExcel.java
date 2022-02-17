package sdet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteInExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file=new FileOutputStream("D:\\excelfiles\\Book.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet Sheet=workbook.createSheet("Data");
		
		for(int i=0;i<=5;i++){
			XSSFRow row=Sheet.createRow(i);
			for(int j=0;j<=3;j++) {
				row.createCell(j).setCellValue("abc");
			
			}
			
			
		}
		workbook.write(file);
		file.close();
		System.out.println("written data into excel completed");

	}

}

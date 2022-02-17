package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class classex {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 FileInputStream file=new FileInputStream("E:\\excelfiles\\Bookclass.xlsx");//point to excelsheet
		    XSSFWorkbook workbook=new XSSFWorkbook(file);
		    
		  //  XSSFSheet sheet=workbook.getSheetAt(0);//provide sheet by number
		    XSSFSheet sheet=workbook.getSheet("dataclass");//provide sheet by  name
		    
		    int rowcount=sheet.getLastRowNum();//returns row count
		    int colcount=sheet.getRow(0).getLastCellNum();//returns column/cell count
		    
		    for(int i=0;i<rowcount;i++) 
		    {
		    XSSFRow currentrow =	sheet.getRow(i);//focussed on current number
		    
		         for(int j=0;j<colcount;j++) 
		        {
		          String value= currentrow.getCell(j).toString();//read value from cell
		          System.out.print("                       "+value);
		        }
		         System.out.println();
		    }
		    
		    
		    
	}

}

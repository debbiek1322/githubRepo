package Lib;
//in any changes i'll update the library NOT the test case
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	//global variables
	XSSFWorkbook wb;
	XSSFSheet sheet1;
public 	ExcelDataConfig(String excelPath) throws Exception{
	
	
	try {
		File src=new File(excelPath);
		FileInputStream fils = new FileInputStream(src);
		 wb= new XSSFWorkbook(fils);

	} catch (Exception e) {
		
	System.out.println(e.getMessage());
	}
	
}
//read data from excel	
public String getData(int sheetNumber,int row,int column){
	//in which sheet and col/row 
	sheet1 = wb.getSheetAt(sheetNumber);
	String data=sheet1.getRow(row).getCell(column).getStringCellValue();
	
	return data;
	
}

//return number of rows
public int getRowCount(int sheetIndex){
	
	int row= wb.getSheetAt(sheetIndex).getLastRowNum();
	row=row+1;

	return row;

}



}

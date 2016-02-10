package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File src=new File("C:\\Users\\dmpasd\\workspace\\LearnAutomation\\src\\Excel_Data\\DDT.xlsx");
		FileInputStream fils = new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fils);
		
		//in which sheet and col/row 
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		//read the number of rows
	int rowCount=sheet1.getLastRowNum();
	System.out.println("Total rows"+ rowCount+1);
	
	for(int i=0;i<rowCount;i++){
		
	String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
	System.out.println("Test data from excel is"+ data0);	
		
		
	}
	
	
	
			wb.close();
		
	}

}

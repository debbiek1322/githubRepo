package Excel;

import Lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		
		ExcelDataConfig excel= new ExcelDataConfig("C:\\Users\\dmpasd\\workspace\\LearnAutomation\\src\\Excel_Data\\DDT.xlsx");
		
//		System.out.println(excel.getData(sheetNumber, row, column));
		System.out.println(excel.getData(1, 0, 1));
	
		
		
		
	}
}

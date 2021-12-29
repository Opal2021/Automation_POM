package testCases;

import utilities.ConstantsPaths;
import utilities.ExcelMethods;

public class ExcelExcercise {

	public static void main(String[] args) throws Exception {
		
		ExcelMethods.setExcelFile(ConstantsPaths.Path_TestData, "Sheet1");//Open the gate way
		ExcelMethods.setExcelFileSheet("Sheet1");
		
		
//		System.out.println(ExcleMethods.getCellData(0, 0));
//		
//		ExcleMethods.setCellData("Techcircle Batch8", 0, 1);
//		
//		int rowNumber = ExcleMethods.getRowData(0).getPhysicalNumberOfCells();
//		
//		//System.out.println(rowNumber);
//		
//		for(int i = 0; i < rowNumber; i++) {
//			
//			System.out.println(ExcleMethods.getRowData(0).getCell(i));
//			
//		}
		
		ExcelMethods.getWholeRowData(2);
		
		ExcelMethods.setCellData("StockMarket", 1, 1);
		
	}

}

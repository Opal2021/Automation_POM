package testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel {

	public static void main(String[] args) throws IOException  {
		
		
		String ExcelFilePath = "src/test/resources/testData/OpalExcelSheet.xlsx";
		
		FileInputStream fs = new FileInputStream(ExcelFilePath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		
		Sheet sheet1 = wb.getSheetAt(0);
		
		int lastRow = sheet1.getLastRowNum();
		
		System.out.println("last Row Number == " + lastRow);
		
		for(int i = 0 ; i <= lastRow; i++) {
			Row row = sheet1.getRow(i);
			Cell cell = row.createCell(2);
			
			cell.setCellValue("Pass");
			
			
		}
		
		FileOutputStream fos = new FileOutputStream(ExcelFilePath);
		
		wb.write(fos);
		fos.close();
		
		
	}

}

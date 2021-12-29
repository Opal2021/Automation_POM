package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import utilities.ConstantsPaths;

public class ExcelTest {

	public static void main(String[] args) throws IOException {
		
		
        FileInputStream fs = new FileInputStream(ConstantsPaths.Path_TestData);
		
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		
		Sheet sheet = wb.getSheetAt(0);
		
	//======================HOW TO WRITE FROM EXCEL================================	
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println("1 - "+ sheet.getRow(0).getCell(0));
		System.out.println("2 - "+ sheet.getRow(0).getCell(1));
		System.out.println("3 - "+ sheet.getRow(1).getCell(0));
		System.out.println("4 - "+ sheet.getRow(1).getCell(1));
		
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(3);
		String cellval = cell.getStringCellValue();
		System.out.println("5 - "+ cellval);
		
		
		
		//====================HOW TO  READ FROM EXCEL===============================
		
		DataFormatter objDefaultFormat = new DataFormatter();
		
		System.out.println("\n\nIterating over Rows and Columns using for=each loop\n");
		
		for(Row row1: sheet) {
			for(Cell cell1: row1) {
				String cellvalue = objDefaultFormat.formatCellValue(cell1);
				System.out.println(cellvalue + "\t");
			}
			System.out.println(" ");
		}
	}

}

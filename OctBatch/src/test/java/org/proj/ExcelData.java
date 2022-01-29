package org.proj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static void main(String[] args) throws IOException {
File loc = new File("C:\\Users\\Dell\\git\\Localrepository4\\OctBatch\\TestData\\TestData.xlsx");
		
		// file to object conversion
		FileInputStream inputFile = new FileInputStream(loc);
		
		// to specific sheet
		
		Workbook work = new XSSFWorkbook(inputFile);
		Sheet sheet = work.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(1);
		System.out.println("Cell Value :"+cell);
		String stringCellValue = cell.getStringCellValue();
		if (stringCellValue.equals("bombay")) {
			cell.setCellValue("mumbai");
			System.out.println("updated Excel :"+cell);
		}
		FileOutputStream FileOut = new FileOutputStream("C:\\\\Users\\\\Dell\\\\git\\\\Localrepository4\\\\OctBatch\\\\TestData\\\\TestData2.xlsx");
		work.write(FileOut);
	}

}

package org.proj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {

		// location of the excel
		
		File loc = new File("C:\\Users\\Dell\\git\\Localrepository4\\OctBatch\\TestData\\TestData.xlsx");
		
		// file to object conversion
		FileInputStream inputFile = new FileInputStream(loc);
		
		// to specific sheet
		
		Workbook work = new XSSFWorkbook(inputFile);
		Sheet sheet = work.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(1);
		System.out.println("Cell Value :"+cell);
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Physical number f rows :"+physicalNumberOfRows);
		
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		System.out.println("Physical number f cell :"+physicalNumberOfCells);
		
		for (int i = 0; i < physicalNumberOfCells; i++) {
			Cell cell2 = row.getCell(i);
			System.out.println("cell values :"+cell2);
		}
		
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row2 = sheet.getRow(i);
//			System.out.println("Row values :"+row2);
		}
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row2 = sheet.getRow(i);
//			System.out.println("Row values :"+row2);
		}
		for (int j = 0; j <row.getPhysicalNumberOfCells() ;j++) {
			Cell cell2 = row.getCell(j);
			System.out.println("Cell values :"+cell2);
		}
		
	}

}

package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\PattonAdmin\\eclipse-workspce selenium task\\SampleMaven\\Excel\\excel.xlsx");
	//Workbook w = new XSSFWorkbook();
	//Sheet s = w.createSheet("New Data");
	//Row r = s.createRow(0);
	 //Cell c = r.createCell(0);
	 //c.setCellValue("greens tech");
	// FileOutputStream stream = new FileOutputStream(f);
	 //w.write(stream);
	//System.out.println("create a sheet and write");
	FileInputStream stream = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(stream);
	Sheet s = w.getSheet("New Data");
	Row r = s.getRow(0);
	Cell c = r.getCell(0);
	String name = c.getStringCellValue();
	if(name.equals("greens tech")) {
		c.setCellValue("Selenium");
		FileOutputStream o = new FileOutputStream(f);
		w.write(o);
		System.out.println("updated");
		
		
		
	}
	
}

}

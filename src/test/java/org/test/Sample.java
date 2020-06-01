package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\PattonAdmin\\eclipse-workspce selenium task\\SampleMaven\\Excel\\excel.xlsx");
		
		FileInputStream stream = new FileInputStream(f);
		
	    Workbook  w = new XSSFWorkbook(stream);
	    Sheet s = w.getSheet("Sheet1");
		//Row r = s.getRow(2);
		//Cell c = r.getCell(0);
		//System.out.println(c);
	    
	    int rc = s.getPhysicalNumberOfRows();
	    for(int i =0;i<rc;i++) {
	    	Row r = s.getRow(i);
	    for(int j =0;j<r.getPhysicalNumberOfCells();j++) {
	    	Cell c = r.getCell(j);
	    	//System.out.println(c);
	    	
	    	int type = c.getCellType();
	    	if(type==1) {
	    		String name= c.getStringCellValue();
	    		System.out.println(name);
	    				
	    	}
	    	else {
	    		if(DateUtil.isCellDateFormatted(c)) {
	             Date d = c.getDateCellValue();
	             //typecasting for fomate
	             SimpleDateFormat sim = new SimpleDateFormat("dd-mmm-yyyy");
	             String name = sim.format(d);
	             System.out.println(name);
	            }
	    		else {double bo = c.getNumericCellValue();
	    		//double change to long
	    		long la = (long) bo;
	    		String name = String.valueOf(la);
	    		System.out.println(name);
	    		
	    		
	    		}
	    	}
	    }
	    	
	    	
	    	
	    }
		
		
		
		
	}
	
	
	

}

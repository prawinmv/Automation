package com.web.app;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.junit.*;

public class ExcelRead {
	public static int i =0;
	public static int j=0;


@Test
public void homePage() throws Throwable, IOException {
	
	Workbook workbook = WorkbookFactory.create(new File("C:\\Users\\PRAWIN\\Desktop\\Test.xls"));	
	workbook.getNumberOfSheets();	
	for (Sheet sheet: workbook) {
		System.out.println("Sheetname: "+sheet.getSheetName());				
		}
	Sheet sheet = workbook.getSheetAt(0);
	//System.out.println("Sheetname: "+sheet.getSheetName());
	
	String text1 = sheet.getRow(4).getCell(3).getStringCellValue();
	System.out.println("Instant value:"+text1);
	
	for (Row row : sheet) {
		//if (row.getRowNum()==0)
		for(Cell cell: row) {
				String text = cell.getStringCellValue();
				if(text.contains("Select")){
				System.out.println("Cell Value: "+cell.getStringCellValue() + " ==> (Row number: "+row.getRowNum()+" & Colum number: "+cell.getColumnIndex()+")");			
			}	

//System.out.println("Row number: "+row.getRowNum()+" & Colum number: "+cell.getColumnIndex());
}
}
}

//public static Object[][] getTestData() throws EncryptedDocumentException, IOException{
	

	public void getTestData() throws EncryptedDocumentException, IOException{
		
	
	Workbook workbook = WorkbookFactory.create(new File("C:\\\\Users\\\\PRAWIN\\\\Desktop\\\\Test.xls"));
	
	Sheet sheet =workbook.getSheetAt(0);

	Object [][] data = new Object[sheet.getLastRowNum()][sheet.getRow(i).getLastCellNum()];

	for (i=0; i<sheet.getLastRowNum();i++) {		
		for (j=0; j<sheet.getRow(i).getLastCellNum();j++) {
			data[i][j]= sheet.getRow(i).getCell(j).toString();
		System.out.println(data[i][j]);
		}
	}
	
	
	
}




}

	


	
	
	
	
	
	
	
	

		
		
	
	
	
	
	
	
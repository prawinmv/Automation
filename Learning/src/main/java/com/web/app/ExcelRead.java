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
	


@Test
public void homePage() throws Throwable, IOException {
	
	Workbook workbook = WorkbookFactory.create(new File("C:\\Users\\PRAWIN\\Desktop\\Test.xls"));
	
	workbook.getNumberOfSheets();
	
	for (Sheet sheet: workbook) {

		System.out.println("Sheetname: "+sheet.getSheetName());	

			
		}
	
	
	Sheet sheet = workbook.getSheetAt(0);
	//System.out.println("Sheetname: "+sheet.getSheetName());	
	

	for (Row row : sheet) {
		
		//if (row.getRowNum()==0)
		for(Cell cell: row) {

			String text = cell.getStringCellValue();
			if(text.contains("Select")){
			System.out.println("Cell Value: "+cell.getStringCellValue() + " ==> (Row number: "+row.getRowNum()+" & Colum number: "+cell.getColumnIndex()+")");
			
		}	
	
}
		

}
	
	
	
	
	
	
	
}
}

	


	
	
	
	
	
	
	
	

		
		
	
	
	
	
	
	
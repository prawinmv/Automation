package com.web.app;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
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

public class ExcelWrite {
	


@Test
public void homePage() throws Throwable, IOException {
	
		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet("Test");
		
		for(int i=0; i<2;i++) {
			Row row = sheet.createRow(i);			
		for(int j=0; j<3;j++) {		
		Cell cell =row.createCell(0);
		cell.setCellValue(i+1);
		
		row.createCell(1).setCellValue(1.2);
		row.createCell(2).setCellValue("This is a string");
		row.createCell(3).setCellValue(true);
		}
		
		}
		
		FileOutputStream fileout= new FileOutputStream("C:\\\\Users\\\\PRAWIN\\\\Desktop\\\\Testwrite.xls");
		workbook.write(fileout);
		workbook.close();
		
		
	
}
}

	


	
	
	
	
	
	
	
	

		
		
	
	
	
	
	
	
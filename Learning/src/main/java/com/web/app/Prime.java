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

public class Prime {
	
	@Test
	public void test() {
		
		int num =29; boolean flag = false;
		
		for(int i=2; i< num/2; i++) {
			
			if(num % i ==0) {				
			flag=true;	
			break;
			}
			
		}
			if(!flag) {
				System.out.println("Number " + num +" is prime number");
			}else {
				System.out.println("Number " + num +" is not prime number");
			}
			
	
	
		
		
		
		
	}
		
}
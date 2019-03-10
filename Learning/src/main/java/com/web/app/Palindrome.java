package com.web.app;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

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

public class Palindrome {
	
	 public static void test1()
	  {
	    String inputString;
	    Scanner in = new Scanner(System.in);
	 
	    System.out.println("Input a string");
	    inputString = in.nextLine();
	 
	    int length  = inputString.length();
	    int i, begin, end, middle;
	 
	    begin  = 0;
	    end    = length - 1;
	    middle = (begin + end)/2;
	 
	    for (i = begin; i <= middle; i++) {
	      if (inputString.charAt(begin) == inputString.charAt(end)) {
	        begin++;
	        end--;
	      }
	      else {
	        break;
	      }
	    }
	    if (i == middle + 1) {
	      System.out.println("Palindrome");
	    }
	    else {
	      System.out.println("Not a palindrome");
	    }  
	  }
	 
	 
	 
	 @Test
		public void test2()
		{
	 
			int lastDigit,sum=0,a;    
			int inputNumber=171; //It is the number  to be checked for palindrome 
	 
			a=inputNumber; 
	        
	        // Code to reverse a number
			while(a>0)
			{   
				lastDigit=a%10; //getting remainder  
				sum=(sum*10)+lastDigit;  
				a=a/10;
				
			}    
	 
			// if given number equal to sum than number is palindrome otherwise not palindrome
			if(sum==inputNumber)    
				System.out.println("Number is palindrome ");    
			else    
				System.out.println("Number is not palindrome");    
	 
		}
	 
	}
	 
	 
	 

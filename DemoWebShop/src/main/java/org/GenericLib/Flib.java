package org.GenericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.stream.IntStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import static org.GenericLib.FrameWorkConstants.*;
/**
 * The class Flib is mainly used to interact with the file and fetch the 
 * test data needed for Automating Application
 * @author GAURAV
 */
public class Flib {
	/**
	 * This method accepts the key and it will fetch the value of the respective key
	 * in the given properties file 
	 * @param key[String]
	 * @return value[String]
	 */
public static String getPropertyValue(String probpath,String key) {
	File file=new File(probpath);
	FileInputStream fis=null;
	try {
	 fis = new FileInputStream(file);
	}
	catch(FileNotFoundException e) {
    e.printStackTrace();
	}
	Properties prop=new Properties();
	try {
	prop.load(fis);
	}
	catch(IOException e)
	{
    e.printStackTrace();
    }
	String value = prop.getProperty(key);
	return value;
	}
/**
 * This method accept the sheetName,rowIndex,cellIndex to fetch the cell value from the given workbook itself
 * @param sheetName[String]
 * @param rowIndex[int]
 * @param cellIndex[int]
 * @return[String]
 */
public static String getWorkbookCellValue(String excelPath,String sheetName,int rowIndex,int cellIndex) {
	File file=new File(excelPath);
	FileInputStream fis =null;
	Workbook wb=null;
	try {
	fis= new FileInputStream(file);
	wb=WorkbookFactory.create(fis);
	}
	catch(FileNotFoundException e)
	{
		e.getStackTrace();
	}
	catch(IOException e) 
	{
		e.getStackTrace();
	}
	catch(EncryptedDocumentException e) 
	{
		e.getStackTrace();
	}
	String value=wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).toString();
	return value;
}
public static String getnumericcellvaluemethod(String excelPath,String sheetName,int rowno,int cellno)  {
	Workbook wb=null;
	try{FileInputStream fis = new FileInputStream(excelPath);
	 wb = WorkbookFactory.create(fis);}
	catch(IOException e) 
	{
		e.getStackTrace();
	}
	catch(EncryptedDocumentException e) 
	{
		e.getStackTrace();
	}
	Sheet sheet = wb.getSheet(sheetName);
	Row row = sheet.getRow(rowno);
	Cell cell = row.getCell(cellno);
	double data = cell.getNumericCellValue();
	int data1=(int)data;
	String value = String.valueOf(data1);
	return value;
	}
public static int generateRandomNo() {
	Random random=new Random();
	 int rn = random.nextInt(1000, 9999);
	 return rn;
	 }

}

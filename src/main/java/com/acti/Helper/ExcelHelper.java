package com.acti.Helper;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.acti.Base.DriverScript;

public class ExcelHelper extends DriverScript {

	XSSFWorkbook wb;
	
	public ExcelHelper(String xlPath)
	{
		try
		{
			File src = new File(xlPath);
			FileInputStream fis = new FileInputStream(src);
			 wb = new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			System.out.println("Excel File Not Found"+e.getMessage());
		}
	
	}
	
	public int getRowCount(int sheetIndex)
	{
		int rowCount = wb.getSheetAt(sheetIndex).getLastRowNum()+1;
		return rowCount;
				
	}
	
	public String getCellData(int sheetIndex,int row, int col)
	{
		String data = wb.getSheetAt(sheetIndex).getRow(row).getCell(col).toString();
		return data;
	}
	

}

package com.company;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWrite {
	
	
	XSSFWorkbook workbook=new XSSFWorkbook();
	XSSFSheet sheet = workbook.createSheet("Product data");
	
	XSSFRow row=sheet.createRow(0);
	row.createCell(0).setCellValue("ProductID");
	row.createCell(1).setCellValue("ProductName");
	row.createCell(2).setCellValue("ProductPrice");
	row.createCell(3).setCellValue("ProductUpdateDate");
	
	int r=1;
	while(rs.next())
	{	
		int productid= resultSet.getInt("ProductID");
		String productName= resultSet.getString("ProductName");
		float productPrice=resultSet.getFloat("ProductPrice");
		String date=resultSet.getString("ProductUpdateDate");
	
		row=sheet.createRow(r++);
		
		row.createCell(0).setCellValue(productid);
		row.createCell(0).setCellValue(productName);
		row.createCell(0).setCellValue(productPrice);
		row.createCell(0).setCellValue(date);
		
	}
	
	FileOutputStream fos=new FileOutputStream(".\\datafiles\\products.xlsx");
	workbook.write(fos);
	
	workbook.close();	
	fos.close();
	con.close();
	
	System.out.println("Done");

}

package com.company.ReportWriteFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UserWrite {
	
	 public static void main(ResultSet resultSet) throws SQLException, IOException, ClassNotFoundException {

	        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
	        XSSFSheet xssfSheet = xssfWorkbook.createSheet("User Data");

	        XSSFRow xssfRow = xssfSheet.createRow(0);
	        xssfRow.createCell(0).setCellValue("User_Id");
	        xssfRow.createCell(1).setCellValue("User_Email");
	        xssfRow.createCell(2).setCellValue("User_Password");
	        xssfRow.createCell(3).setCellValue("User_name");
	        xssfRow.createCell(4).setCellValue("User_City");
	        xssfRow.createCell(5).setCellValue("User_Phone");

	        int i = 1;
	        while (resultSet.next()){
	            String u_id = resultSet.getString(1);
	            String u_email = resultSet.getString(2);
	            String u_pass = resultSet.getString(3);
	            String u_name = resultSet.getString(4);
	            String u_city = resultSet.getString(5);
	            String u_phone = resultSet.getString(6);

	            xssfRow = xssfSheet.createRow(i++);
	            xssfRow.createCell(0).setCellValue(u_id);
	            xssfRow.createCell(1).setCellValue(u_email);
	            xssfRow.createCell(2).setCellValue(u_pass);
	            xssfRow.createCell(3).setCellValue(u_name);
	            xssfRow.createCell(4).setCellValue(u_city);
	            xssfRow.createCell(5).setCellValue(u_phone);
	        }

	        FileOutputStream fileOutputStream = new FileOutputStream("./ResultSheet.xlsx") ;
	        xssfWorkbook.write(fileOutputStream);
	        xssfWorkbook.close();
	        fileOutputStream.close();

	    }

}

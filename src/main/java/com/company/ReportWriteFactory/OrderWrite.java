package com.company.ReportWriteFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OrderWrite {
	
	public static void main(ResultSet resultSet) throws SQLException, IOException, ClassNotFoundException {

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        XSSFSheet xssfSheet = xssfWorkbook.createSheet("Order Data");

        XSSFRow xssfRow = xssfSheet.createRow(0);
        xssfRow.createCell(0).setCellValue("Order_Id");
        xssfRow.createCell(1).setCellValue("Order_User_Id");
        xssfRow.createCell(2).setCellValue("Order_Amount");
        xssfRow.createCell(3).setCellValue("Order_Ship_Address");
        xssfRow.createCell(4).setCellValue("Order_City");
        xssfRow.createCell(5).setCellValue("Order_Phone");
        xssfRow.createCell(6).setCellValue("Order_Email");
        xssfRow.createCell(7).setCellValue("Order_Date");

        int i = 1;
        while (resultSet.next()){
        	String o_id = resultSet.getString(1);
        	String ou_id = resultSet.getString(2);
        	String o_amount = resultSet.getString(3);
            String  o_ship = resultSet.getString(4);
            String o_city = resultSet.getString(5);
            String o_phone = resultSet.getString(6);
            String o_email = resultSet.getString(7);
            String o_date = resultSet.getString(8);
            

            xssfRow = xssfSheet.createRow(i++);
            xssfRow.createCell(0).setCellValue(o_id);
            xssfRow.createCell(1).setCellValue(ou_id);
            xssfRow.createCell(2).setCellValue(o_amount);
            xssfRow.createCell(3).setCellValue(o_ship);
            xssfRow.createCell(4).setCellValue(o_city);
            xssfRow.createCell(5).setCellValue(o_phone);
            xssfRow.createCell(6).setCellValue(o_email);
            xssfRow.createCell(7).setCellValue(o_date);
            
        }

        FileOutputStream fileOutputStream = new FileOutputStream("./ResultSheet.xlsx") ;
        xssfWorkbook.write(fileOutputStream);
        xssfWorkbook.close();
        fileOutputStream.close();

    }

}

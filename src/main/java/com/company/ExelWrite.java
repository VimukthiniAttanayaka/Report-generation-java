package com.company;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExelWrite {
    public static void main(ResultSet resultSet) throws SQLException, IOException, ClassNotFoundException {

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        XSSFSheet xssfSheet = xssfWorkbook.createSheet("Proction Data");

        XSSFRow xssfRow = xssfSheet.createRow(0);
        xssfRow.createCell(0).setCellValue("Product_Id");
        xssfRow.createCell(1).setCellValue("Product_Name");
        xssfRow.createCell(2).setCellValue("Product_Price");
        xssfRow.createCell(3).setCellValue("Date");

        int i = 1;
        while (resultSet.next()){
            String p_id = resultSet.getString(1);
            String p_name = resultSet.getString(2);
            String p_price = resultSet.getString(3);
            String date = resultSet.getString(4);

            xssfRow = xssfSheet.createRow(i++);
            xssfRow.createCell(0).setCellValue(p_id);
            xssfRow.createCell(1).setCellValue(p_name);
            xssfRow.createCell(2).setCellValue(p_price);
            xssfRow.createCell(3).setCellValue(date);
        }

        FileOutputStream fileOutputStream = new FileOutputStream("./ResultSheet.xlsx") ;
        xssfWorkbook.write(fileOutputStream);
        xssfWorkbook.close();
        fileOutputStream.close();

    }
}
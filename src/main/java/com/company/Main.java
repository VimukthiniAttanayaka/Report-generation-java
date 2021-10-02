package com.company;

import com.company.reportsend.ReportSendMail;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.mail.MessagingException;
		


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException, MessagingException {

       String emailReceipient = "vimukthinia@gmail.com";
		String FilePath = "C:\\Users\\attanaya-se18006\\Desktop\\shopping.xlsx";

		ReportSendMail reportSendMail = new ReportSendMail();
		reportSendMail.sendReportMain(emailReceipient, FilePath);


    	//Data read and write
    	
    	DatabaseTableDataRepository databaseTableDataRepository = new DatabaseTableDataRepository("2021-06-13", "2021-06-23", "products");
        ResultSet resultSet = databaseTableDataRepository.getTableData();
        
      		Connection con= DriverManager.getConnection("jdbc:mysql://locathost:3306/e-comece");
      		
      		//statement
      		Statement stmt= con.createStatement();
      		ResultSet rs= stmt.executeQuery("select * from products");
      		
      		//Excel
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
      			int productid= rs.getInt("ProductID");
      			String productName= rs.getString("ProductName");
      			float productPrice=rs.getFloat("ProductPrice");
      			String date=rs.getString("ProductUpdateDate");
      		
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
      		
      	//Data read and write

        //display options for user

        System.out.println("Hello, Welcome !");
        System.out.println("Please choose the type of report that you want");
        System.out.println("1 for Monthly Sales report");
        System.out.println("2 for User Signup report");
        System.out.println("3 for Available Stock report");
        System.out.println("4 for User feedback report");

        //get input option from user

        Scanner typeOfReport = new Scanner(System.in);
        int reportNum = typeOfReport.nextInt();
        System.out.println("You choose :" + reportNum);
        //need to show what he has chosen

        //Ask next input option time period
        System.out.println("Please enter time Duration ex : DD/MM/YY-DD/MM/YY");
        Scanner timePeriodOfReport = new Scanner(System.in);
        String timeDuration = timePeriodOfReport.next();
        System.out.println("You choose :" + timeDuration);

        //ask for output doc type
        System.out.println("Please enter Output type ");
        System.out.println("1 for save as excel file");
        System.out.println("2 for save as excel file & email");

        Scanner getOutputType = new Scanner(System.in);
        int outputMethod = getOutputType.nextInt();

        if(outputMethod == 2) {

            System.out.println("Please enter email address");
            Scanner getEmail = new Scanner(System.in);
            String email = getEmail.next();

            System.out.println("the email that you entered :" + email);

        } else {

            System.out.println("Your file is Successfully generated");

        }



    }
}

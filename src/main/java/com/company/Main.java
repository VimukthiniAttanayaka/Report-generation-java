package com.company;
import com.company.reportsend.ReportSendMail;
import com.company.ui.UserInstruction;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.mail.MessagingException;
/*
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
*/

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, MessagingException, IOException {


        UserInstruction userInstruction = new UserInstruction();
        int reportType = userInstruction.UserInstruction();//get input option from user
        String reportStartDate = userInstruction.reportTimeDurationStart();  //get start date
        String reportEndDate = userInstruction.reportTimeDurationEnd();  //get sed date

        DatabaseTableDataRepository databaseTableDataRepository = new DatabaseTableDataRepository(reportStartDate, reportEndDate, "products");
        ResultSet resultSet = databaseTableDataRepository.getTableData();

        System.out.println(resultSet);

        //ask for output doc type
        int outputMethod = userInstruction.outputType();
        if(outputMethod == 2) {

            System.out.println("Please enter email address");
            Scanner getEmail = new Scanner(System.in);
            String email = getEmail.next();

            String emailReceipient = email;
            String FilePath = "C:\\Users\\Poornajith\\Desktop\\1.pdf";

            ReportSendMail reportSendMail = new ReportSendMail();
            reportSendMail.sendReportMain(emailReceipient, FilePath);

        } else {

            System.out.println("Your file is Successfully generated");

        }



    }
}
package com.company;
import com.company.ReportWriteFactory.OrderWrite;
import com.company.ReportWriteFactory.ProductsWrite;
import com.company.ReportWriteFactory.UserWrite;
import com.company.databasRead.DatabaseTableDataRepository;
import com.company.reportsend.ReportSendMail;
import com.company.ui.UserInstruction;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.mail.MessagingException;


public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, MessagingException, IOException, ParseException {


        UserInstruction userInstruction = new UserInstruction();
        int reportType = userInstruction.UserInstruction();//get input option from user
        Date reportStartDate = userInstruction.reportTimeDurationStart();  //get start date
        Date reportEndDate = userInstruction.reportTimeDurationEnd();  //get sed date




        String repoStartDate = new SimpleDateFormat("yyyy-MM-dd").format(reportStartDate);
        String repoEndDate = new SimpleDateFormat("yyyy-MM-dd").format(reportEndDate);

        DatabaseTableDataRepository databaseTableDataRepository = new DatabaseTableDataRepository("2021-06-13", "2021-06-18", "products");
        ResultSet resultSet = databaseTableDataRepository.getTableData();

        ProductsWrite pw = new ProductsWrite();
        pw.main(resultSet);

        UserWrite uw=new UserWrite();
        uw.main(resultSet);

        OrderWrite ow=new OrderWrite();
        ow.main(resultSet);
        
        //ask for output doc type
        int outputMethod = userInstruction.outputType();
        if(outputMethod == 2) {

            System.out.println("Please enter email address");
            Scanner getEmail = new Scanner(System.in);
            String emailReceipient = getEmail.next();

            String FilePath = "./ResultSheet.xlsx";

            ReportSendMail reportSendMail = new ReportSendMail();
            reportSendMail.sendReportMain(emailReceipient, FilePath);

        } else {

            System.out.println("Your file is Successfully generated");

        }



    }
}

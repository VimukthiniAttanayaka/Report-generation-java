package com.company;
import com.company.databasRead.DatabaseTableDataRepository;
import com.company.reportsend.ReportSendMail;
import com.company.ui.UserInstruction;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import javax.mail.MessagingException;


public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, MessagingException, IOException, ParseException {


        UserInstruction userInstruction = new UserInstruction();
        int reportType = userInstruction.UserInstruction();//get input option from user
        Date reportStartDate = userInstruction.reportTimeDurationStart();  //get start date
        Date reportEndDate = userInstruction.reportTimeDurationEnd();  //get sed date

        DatabaseTableDataRepository databaseTableDataRepository = new DatabaseTableDataRepository("2021-06-13", "2021-06-18", "products");
        ResultSet resultSet = databaseTableDataRepository.getTableData();

        ExelWrite exelWrite = new ExelWrite();
        exelWrite.main(resultSet);


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
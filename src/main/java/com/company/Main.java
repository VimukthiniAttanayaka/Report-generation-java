package com.company;
import com.company.ReportWriteFactory.ExcelWriteFactory;
import com.company.UserInputChecker.CheckReportName;
import com.company.databasRead.DatabaseTableDataRepository;
import com.company.reportsend.ReportSendException;
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

    public static void main(String[] args) throws SQLException, ClassNotFoundException, MessagingException, IOException, ParseException, ReportSendException {


        UserInstruction userInstruction = new UserInstruction();
        int reportType = userInstruction.UserInstruction();//get input option from user

        CheckReportName checkReportName = new CheckReportName();
        String reportName = checkReportName.getReportName(reportType);

        Date reportStartDate = userInstruction.reportTimeDurationStart();  //get start date
        Date reportEndDate = userInstruction.reportTimeDurationEnd();  //get sed date

        String repoStartDate = new SimpleDateFormat("yyyy-MM-dd").format(reportStartDate);
        String repoEndDate = new SimpleDateFormat("yyyy-MM-dd").format(reportEndDate);

        DatabaseTableDataRepository databaseTableDataRepository = new DatabaseTableDataRepository(repoStartDate, repoEndDate, reportName);
        ResultSet resultSet = databaseTableDataRepository.getTableData();

        //ask for output doc type
        int outputMethod = userInstruction.outputType();
        if (outputMethod ==1 || outputMethod ==2) {

            ExcelWriteFactory excelWriteFactory =new ExcelWriteFactory();
            excelWriteFactory.reportGenerate(reportType, resultSet);

            if(outputMethod == 2) {

                System.out.println("Please enter email address");
                Scanner getEmail = new Scanner(System.in);
                String emailReceipient = getEmail.next();

                String FilePath = "./ResultSheet.xlsx";

                ReportSendMail reportSendMail = new ReportSendMail();
                reportSendMail.sendReportMain(emailReceipient, FilePath);

            }else{

                System.out.println("Report saved successfully");

            }
        }

         else {

            System.out.println("Wrong Input");

        }


    }
}

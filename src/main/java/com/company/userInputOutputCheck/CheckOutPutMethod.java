package com.company.userInputOutputCheck;

import com.company.ReportWriteFactory.ExcelWriteFactory;
import com.company.consoleOutPut.ConsoleOutPut;
import com.company.reportsend.ReportSendMail;

import javax.mail.MessagingException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CheckOutPutMethod {
    public void getOutPut(int outputMethod, int reportType, ResultSet resultSet) throws MessagingException, IOException, SQLException, ClassNotFoundException {

        ConsoleOutPut consoleOutPut = new ConsoleOutPut();

        if (outputMethod == 1 || outputMethod == 2) {

            ExcelWriteFactory excelWriteFactory = new ExcelWriteFactory();
            excelWriteFactory.reportGenerate(reportType, resultSet);

            if(outputMethod == 2) {

               consoleOutPut.ConsoleOutPutMessage("Please enter email address");

                Scanner getEmail = new Scanner(System.in);
                String emailReceipient = getEmail.next();

                String FilePath = "./ResultSheet.xlsx";

                ReportSendMail reportSendMail = new ReportSendMail();
                reportSendMail.sendReportMain(emailReceipient, FilePath);

            }else{

                consoleOutPut.ConsoleOutPutMessage("Report saved successfully");

            }
        }

        else {

            consoleOutPut.ConsoleOutPutMessage("Wrong Input");

        }
    }
}

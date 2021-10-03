package com.company;

import com.company.databaseRead.DatabaseTableDataRepository;
import com.company.reportsend.ReportSendException;
import com.company.ui.UserInstruction;
import com.company.userInputOutputCheck.CheckOutPutMethod;
import com.company.userInputOutputCheck.CheckReportName;

import javax.mail.MessagingException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


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

        CheckOutPutMethod checkOutPutMethod = new CheckOutPutMethod();
        checkOutPutMethod.getOutPut(outputMethod, reportType, resultSet);

    }
}

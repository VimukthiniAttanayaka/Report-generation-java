package com.company.ui;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class UserInstruction {

    public int UserInstruction() {
        System.out.println("Hello, Welcome !");
        System.out.println("Please choose the type of report that you want");
        System.out.println("1 for Monthly Sales report");
        System.out.println("2 for User Signup report");
        System.out.println("3 for Available Stock report");
        System.out.println("4 for User feedback report");

        Scanner typeOfReport = new Scanner(System.in);
        int reportNum = typeOfReport.nextInt();

        return(reportNum);

    }

    public Date reportTimeDurationStart() throws ParseException {
        System.out.println("Please enter Start date ex : YYYY-MM-DD");

        Scanner timePeriodOfReport = new Scanner(System.in);
        String timeDurationStartDate = timePeriodOfReport.next();

        Date reportStartDate =new SimpleDateFormat("yyyy-MMM-dd").parse(timeDurationStartDate);
        return(reportStartDate);

    }
    public Date reportTimeDurationEnd() throws ParseException {
        System.out.println("Please enter EndDate ex : YYYY-MM-DD");

        Scanner timePeriodOfReport = new Scanner(System.in);
        String timeDurationEndDate = timePeriodOfReport.next();

        Date reportEndDate =new SimpleDateFormat("yyyy-MMM-dd").parse(timeDurationEndDate);
        return(reportEndDate);
    }

    public int outputType(){
        System.out.println("Please enter Output type ");
        System.out.println("1 for save as excel file");
        System.out.println("2 for save as excel file & email");

        Scanner getOutputType = new Scanner(System.in);
        int outputMethod = getOutputType.nextInt();
        return(outputMethod);

    }




}


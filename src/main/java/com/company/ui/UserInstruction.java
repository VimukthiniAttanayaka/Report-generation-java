package com.company.ui;

import java.util.Scanner;

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

    public String reportTimeDurationStart(){
        System.out.println("Please enter Start date ex : YYYY-MM-DD");

        Scanner timePeriodOfReport = new Scanner(System.in);
        String timeDurationStartDate = timePeriodOfReport.next();

        return(timeDurationStartDate);

    }
    public String reportTimeDurationEnd(){
        System.out.println("Please enter EndDate ex : YYYY-MM-DD");

        Scanner timePeriodOfReport = new Scanner(System.in);
        String timeDurationEndDate = timePeriodOfReport.next();

        return(timeDurationEndDate);
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


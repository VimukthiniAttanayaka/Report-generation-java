package com.company.ui;

import com.company.consoleOutPut.ConsoleOutPut;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class UserInstruction implements UI{
<<<<<<< HEAD

    ConsoleOutPut consoleOutPut = new ConsoleOutPut();
=======
>>>>>>> 575bd5903f36475cffa134a2842e87080936851e

    public int UserInstruction() {

        consoleOutPut.ConsoleOutPutMessage("Hello, Welcome !");
        consoleOutPut.ConsoleOutPutMessage("Please choose the type of report that you want");
        consoleOutPut.ConsoleOutPutMessage("1 for Monthly Sales report");
        consoleOutPut.ConsoleOutPutMessage("2 for User Signup report");
        consoleOutPut.ConsoleOutPutMessage("3 for Available Stock report");

        Scanner typeOfReport = new Scanner(System.in);
        int reportNum = typeOfReport.nextInt();

        return(reportNum);

    }

    public Date reportTimeDurationStart() throws ParseException {

        consoleOutPut.ConsoleOutPutMessage("Please enter report Start date ex : yyyy-MM-dd");

        Scanner timePeriodOfReport = new Scanner(System.in);
        String timeDurationStartDate = timePeriodOfReport.next();

        Date reportStartDate =new SimpleDateFormat("yyyy-MM-dd").parse(timeDurationStartDate);

        return(reportStartDate);
    }

    public Date reportTimeDurationEnd() throws ParseException {

        consoleOutPut.ConsoleOutPutMessage("Please enter report EndDate ex : yyyy-MM-dd");

        Scanner timePeriodOfReport = new Scanner(System.in);
        String timeDurationEndDate = timePeriodOfReport.next();

        Date reportEndDate =new SimpleDateFormat("yyyy-MM-dd").parse(timeDurationEndDate);
        return(reportEndDate);
    }

    public int outputType(){

        consoleOutPut.ConsoleOutPutMessage("Please enter Output type ");
        consoleOutPut.ConsoleOutPutMessage("1 for save as excel file");
        consoleOutPut.ConsoleOutPutMessage("2 for save as excel file & email");

        Scanner getOutputType = new Scanner(System.in);
        int outputMethod = getOutputType.nextInt();
        return(outputMethod);

    }
}


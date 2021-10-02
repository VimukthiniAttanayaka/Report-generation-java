package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DatabaseTableDataRepository databaseTableDataRepository = new DatabaseTableDataRepository("2021-06-13", "2021-06-23", "products");
        ResultSet resultSet = databaseTableDataRepository.getTableData();


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
package com.company.UserInputChecker;

public class CheckReportName{

    public String getReportName(int reportType){
        String reportName = " ";
        if(reportType == 1) {
            reportName = "orders";
        }else if (reportType == 2){
            reportName = "users";
        }else if(reportType == 3){
            reportName = "products";
        }else{
            System.out.println("Wrong Input");
            System.exit(0);
        }

       return reportName;
    }

}

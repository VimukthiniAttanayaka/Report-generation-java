package com.company.reportsend;

public class ReportSendException extends Exception {
    public ReportSendException(Exception e, String message)
    {
        super(message,e);
    }
}

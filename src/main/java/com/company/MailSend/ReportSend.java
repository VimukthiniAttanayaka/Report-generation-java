package com.company.MailSend;

import javax.mail.MessagingException;
import java.io.IOException;

public interface ReportSend {

    void sendReportMain(String emailReceipient,String FilePath) throws MessagingException, IOException;
}
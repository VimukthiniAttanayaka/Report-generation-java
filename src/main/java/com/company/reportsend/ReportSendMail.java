package com.company.reportsend;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;

public class ReportSendMail implements ReportSend
{
    Session newSession = null;
    MimeMessage mimeMessage = null;

    public void sendReportMain(String emailReceipient,String FilePath) throws MessagingException, IOException {
        setupServerProperties();
        draftEmail(emailReceipient,FilePath);
        sendEmail();
    }

    //SEND EMAIL
    private void sendEmail() throws MessagingException {
        String fromUser = "etextile2021@gmail.com";
        String fromUserPassword = "2021EText@$";
        String emailHost = "smtp.gmail.com";
        Transport transport = newSession.getTransport("smtp");
        transport.connect(emailHost, fromUser, fromUserPassword);
        transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
        transport.close();
        System.out.println("Email successfully sent!!!");
    }

    //DRAFT AN EMAIL
    private MimeMessage draftEmail(String emailReceipient,String FilePath) throws MessagingException, IOException {

        String emailSubject = "Report send using email";
        String emailBody = "This a report, What you ask:";
        mimeMessage = new MimeMessage(newSession);

        mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(emailReceipient));
        mimeMessage.setSubject(emailSubject);

        MimeBodyPart bodyPart = new MimeBodyPart();
        bodyPart.setContent(emailBody,"text/html");

        MimeBodyPart attachmentBodyPart = new MimeBodyPart();
        attachmentBodyPart.attachFile(new File(FilePath));

        MimeMultipart multiPart = new MimeMultipart();
        multiPart.addBodyPart(bodyPart);
        multiPart.addBodyPart(attachmentBodyPart);
        mimeMessage.setContent(multiPart);
        return mimeMessage;
    }

    //SETUP MAIL SERVER PROPERTIES
    private void setupServerProperties() {
        Properties properties = System.getProperties();
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        newSession = Session.getDefaultInstance(properties,null);
    }
}

package com.company;

import javax.mail.MessagingException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws MessagingException, IOException {

        Mail mail = new Mail();
        mail.setupServerProperties();
        mail.draftEmail();
        mail.sendEmail();
    }
}

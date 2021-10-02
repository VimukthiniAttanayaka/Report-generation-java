package com.company;

import javax.mail.MessagingException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws MessagingException, IOException {

        String emailReceipient = "vimukthinia@gmail.com";
        String FilePath = "C:\\Users\\attanaya-se18006\\Desktop\\shopping.xlsx";

        Mail mail = new Mail();
        mail.main(emailReceipient,FilePath);
    }
}

package com.company.app;

import java.sql.SQLException;
import java.text.ParseException;

public interface App {
    public void execute() throws ParseException, SQLException, ClassNotFoundException;
}

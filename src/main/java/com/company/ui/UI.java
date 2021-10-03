package com.company.ui;

import java.text.ParseException;
import java.util.Date;

public interface UI {
    int UserInstruction();
    Date reportTimeDurationStart() throws ParseException;
    Date reportTimeDurationEnd() throws ParseException;
    int outputType();

}

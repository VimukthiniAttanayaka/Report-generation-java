package com.company.UserInputChecker;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CheckReportNameTest {

    @Test
    public void should_return_report_name_as_orders(){

        CheckReportName checkReportName = new CheckReportName();
        String reportName = checkReportName.getReportName(1);

        assertThat(reportName,is("orders"));
    }
    @Test
    public void should_return_report_name_as_users(){

        CheckReportName checkReportName = new CheckReportName();
        String reportName = checkReportName.getReportName(2);

        assertThat(reportName,is("users"));

    }
    @Test
    public void should_return_report_name_as_products(){

        CheckReportName checkReportName = new CheckReportName();
        String reportName = checkReportName.getReportName(3);

        assertThat(reportName,is("products"));

    }


}
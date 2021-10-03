package com.company.ReportWriteFactory;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExcelWriteFactory {

    public void reportGenerate(int reportType, ResultSet resultSet) throws SQLException, IOException, ClassNotFoundException {

        if(reportType == 1) {
            OrderWrite ow=new OrderWrite();
            ow.main(resultSet);
        }else if (reportType == 2){
            UserWrite uw=new UserWrite();
            uw.main(resultSet);
        }else if(reportType == 3){
            ProductsWrite pw = new ProductsWrite();
            pw.main(resultSet);
        }

    }
}

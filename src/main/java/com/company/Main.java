package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DatabaseTableDataRepository databaseTableDataRepository = new DatabaseTableDataRepository("2021-06-13", "2021-06-23", "products");
        ResultSet resultSet = databaseTableDataRepository.getTableData();
    }
}

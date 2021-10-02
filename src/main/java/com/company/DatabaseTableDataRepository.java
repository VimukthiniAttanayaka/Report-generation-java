package com.company;

import java.sql.*;

public class DatabaseTableDataRepository implements TableDataRepository{

    String date1;
    String date2;
    String table;

    public DatabaseTableDataRepository(String date1, String date2, String table){
        this.date1 =  date1;
        this.date2 = date2;
        this.table = table;
    }

    public ResultSet getTableData() throws ClassNotFoundException, SQLException {

        ResultSet resultSet = null;
        String url = "jdbc:mysql://localhost:3306/e-commerce";
        String userName = "root";
        String password = "";


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM "+table+" WHERE date BETWEEN '"+date1+"' AND '"+date2+"'");

        return resultSet;

    }
}

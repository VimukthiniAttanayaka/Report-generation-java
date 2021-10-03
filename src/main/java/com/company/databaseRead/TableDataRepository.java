package com.company.databaseRead;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface TableDataRepository {
    public ResultSet getTableData() throws ClassNotFoundException, SQLException;
}

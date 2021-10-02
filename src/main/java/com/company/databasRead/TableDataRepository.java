package com.company.databasRead;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface TableDataRepository {
    public ResultSet getTableData() throws ClassNotFoundException, SQLException;
}

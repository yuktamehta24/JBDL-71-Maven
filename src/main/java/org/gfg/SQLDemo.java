package org.gfg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDemo {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JBDL_71", "root", "rootroot");
        connection.createStatement().execute("create table jbdl_71_table1 (name varchar(20), id int)");
        connection.close();
    }
}

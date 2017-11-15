package com.robby.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Robby
 */
public class DBUtil {

    public static Connection createMySQLConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oopl20171",
                "username", "password");
        connection.setAutoCommit(false);
        return connection;
    }
}

package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    public static final String userName= "postgres";
    public static final String password = "milana27112008";
    public static final String URL = "jdbc:postgresql://localhost:5432/first_db";

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);

        }
    }
    public static Connection getPostgresConnection () throws SQLException, ClassNotFoundException {

        return getPostgresConnection (URL, userName, password);
    }
    public static Connection getPostgresConnection (String URL, String userName, String password)throws
            SQLException {
        Connection conn = DriverManager.getConnection(URL, userName, password);
        conn.setAutoCommit(false);
        return conn;
    }
}
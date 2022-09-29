package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:MySQL://localhost/pp113";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Juu72epH";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection (){
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
        // реализуйте настройку соеденения с БД
}

package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
        private final static String URL = "jdbc:mysql://localhost:3306/my_db";
    private final static String USERNAME = "bestuser";
    private final static String PASSWORD = "bestuser";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Ошибка подключения");
        }
        return connection;
    }
}

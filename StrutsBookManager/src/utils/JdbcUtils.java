package utils;

import java.sql.*;

/**
 * Created by macbookair on 2017/12/2.
 */
public class JdbcUtils {
    private String url="jdbc:mysql://localhost:3306/BookManager?useSSL=false";
    private String username="root";
    private String password="123";
    public Connection getConnection() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void close(Connection connection, Statement statement, ResultSet resultSet) {
        try {
            if (connection != null)
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (statement != null)
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }finally {
                if (resultSet != null)
                    try {
                        resultSet.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
        }

    }
}

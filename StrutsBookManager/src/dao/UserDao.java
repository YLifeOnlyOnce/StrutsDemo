package dao;

import bean.User;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by macbookair on 2017/12/2.
 */
public class UserDao {

    PreparedStatement preparedStatement=null;
    ResultSet resultSet=null;
    JdbcUtils jdbcUtils=new JdbcUtils();

    public User regist(User user) throws ClassNotFoundException {
        System.out.println("registDao");
        String sql="INSERT INTO user(username,password) VALUES(?,?)";
        Connection connection = jdbcUtils.getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            preparedStatement.execute();

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return null;

    }


    public User login(User user) throws ClassNotFoundException {
        System.out.println("LoginDao");
        String loginsql = "select * from user where username=? and password=?";

        Connection connection = jdbcUtils.getConnection();
        try {
            preparedStatement = connection.prepareStatement(loginsql);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("查找到相应的user");
                return user;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

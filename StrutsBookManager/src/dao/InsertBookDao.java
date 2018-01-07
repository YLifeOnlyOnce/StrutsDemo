package dao;

import bean.Book;
import org.apache.struts2.dispatcher.Parameter;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by macbookair on 2017/12/9.
 */
public class InsertBookDao {
    PreparedStatement preparedStatement=null;
    ResultSet resultSet=null;
    JdbcUtils jdbcUtils = new JdbcUtils();

    public void insertBook(Book book) throws ClassNotFoundException {
        String sql = "INSERT INTO book(bid,bname,price,author,picurl,fileurl) VALUES(?,?,?,?,?,?)";
        Connection connection = jdbcUtils.getConnection();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,book.getBid());
            preparedStatement.setString(2,book.getBname());
            preparedStatement.setDouble(3,book.getPrice());
            preparedStatement.setString(4,book.getAuthor());
            preparedStatement.setString(5,book.getPicurl());
            preparedStatement.setString(6,book.getFileurl());
            preparedStatement.execute();
            System.out.println("录入信息"+book.getBname()+"成功");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("录入信息失败");
        }

    }
}

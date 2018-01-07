package dao;

import bean.Book;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by macbookair on 2017/12/9.
 */
public class DeleteDao {
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    JdbcUtils jdbcUtils=new JdbcUtils();

    public void delete(Book book) throws ClassNotFoundException, SQLException {
        String sql = "DELETE FROM book WHERE bid=?";

        Connection connection = jdbcUtils.getConnection();
        preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setInt(1,book.getBid());
        preparedStatement.execute();
        System.out.println("deleteDao执行完成");

    }
}

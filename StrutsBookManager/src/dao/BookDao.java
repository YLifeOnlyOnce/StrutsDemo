package dao;

import bean.Book;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by macbookair on 2017/12/4.
 */
public class BookDao {

    PreparedStatement preparedStatement=null;
    ResultSet resultSet=null;
    JdbcUtils jdbcUtils=new JdbcUtils();


//    ---------显示所有图书-----------

    public List<Book> showBooks() throws ClassNotFoundException {
        String sql= "SELECT * FROM book";


        List<Book> books= new ArrayList <>();

        Connection connection = jdbcUtils.getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet=preparedStatement.executeQuery();
             while (resultSet.next()){
                 Book book = new Book();
                book.setBid(resultSet.getInt("bid"));
                book.setBname(resultSet.getString("bname"));
                book.setPrice(resultSet.getDouble("price"));
                book.setAuthor(resultSet.getString("author"));
                book.setPicurl(resultSet.getString("picurl"));
                book.setFileurl(resultSet.getString("fileurl"));
                books.add(book);
            }
            System.out.println("查询到的books信息"+books);
            return books;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }
}

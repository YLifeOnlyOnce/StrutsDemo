package service;

import bean.Book;
import dao.BookDao;
import dao.DeleteDao;
import dao.InsertBookDao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by macbookair on 2017/12/4.
 */
public class BookService {
    BookDao bookDao= new BookDao();

    public List<Book> showBooks() throws ClassNotFoundException {

        return bookDao.showBooks();
    }
    public void insertBook(Book book) throws ClassNotFoundException {
        InsertBookDao insertBookDao= new InsertBookDao();

        insertBookDao.insertBook(book);

        System.out.println("insertBook成功");
    }

    public void delete(Book book) throws SQLException, ClassNotFoundException {
        DeleteDao deleteDao= new DeleteDao();

        deleteDao.delete(book);

        System.out.println("deleteService执行完成");
    }
}

package action;

import bean.Book;
import service.BookService;

/**
 * Created by macbookair on 2017/12/4.
 */
public class BookAction extends BaseAction {
    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    BookService bookService=new BookService();

//    -----------显示所有图书-----------------
    public String showBooks() throws ClassNotFoundException {

        session.put("books",bookService.showBooks());
        return SUCCESS;

    }



}

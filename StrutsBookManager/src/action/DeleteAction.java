package action;

import bean.Book;
import service.BookService;

/**
 * Created by macbookair on 2017/12/9.
 */
public class DeleteAction extends BaseAction{
    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String execute() throws Exception {
        BookService bookService=new BookService();
        bookService.delete(book);
        System.out.println("deleteAction");
        return SUCCESS;
    }
}

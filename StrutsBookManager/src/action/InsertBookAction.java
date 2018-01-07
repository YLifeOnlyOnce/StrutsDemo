package action;

import bean.Book;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import service.BookService;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.UUID;

/**
 * Created by macbookair on 2017/12/9.
 */
public class InsertBookAction extends ActionSupport{
    private Book book;
    private List<File> file;
    private List<String> fileFileName;
    private List<String> fileContentType;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List <File> getFile() {
        return file;
    }

    public void setFile(List <File> file) {
        this.file = file;
    }

    public List <String> getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(List <String> fileFileName) {
        this.fileFileName = fileFileName;
    }

    public List <String> getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(List <String> fileContentType) {
        this.fileContentType = fileContentType;
    }

    @Override
    public String execute() throws Exception {
        Book books= new Book();

        for (int i=0; i<file.size();i++){
            String realPath="";
            System.out.println(fileFileName.get(i));
            String newfileFileName = (UUID.randomUUID() + fileFileName.get(i).substring(fileFileName.get(i).lastIndexOf("."))).replace("-", "");
            System.out.println("新文件名字" + newfileFileName);

            if (fileContentType.get(i).equals("text/plain")) {
                realPath = ServletActionContext.getServletContext().getRealPath("books");
                System.out.println("上传文件保存的路径" + realPath);
                books.setFileurl("books/"+newfileFileName);
            }else {
                realPath = ServletActionContext.getServletContext().getRealPath("bookpics");
                System.out.println("图片上传中");
                books.setPicurl("bookpics/"+newfileFileName);
            }
                FileOutputStream fileOutputStream = new FileOutputStream(realPath + "/" + newfileFileName);
                FileInputStream fileInputStream = new FileInputStream(file.get(i));
                byte[] bytes = new byte[1024];
                while (fileInputStream.read(bytes) > 0) {
                    fileOutputStream.write(bytes);
                }

        }
        books.setBid(book.getBid());
        books.setBname(book.getBname());
        books.setPrice(book.getPrice());
        books.setAuthor(book.getAuthor());
        BookService bookService = new BookService();
        bookService.insertBook(books);
        return SUCCESS;
    }
}

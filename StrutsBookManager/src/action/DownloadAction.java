package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by macbookair on 2017/12/9.
 * 下载的action
 */
public class DownloadAction extends ActionSupport {
    String fileName;
    String filePath;
    InputStream fileInputStream;
    @Override
    public String execute() throws Exception {

        return SUCCESS;
    }

    public String getFileName() throws UnsupportedEncodingException {
        String encode = URLEncoder.encode(fileName, "UTF-8");
        return encode;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public InputStream getFileInputStream() {
        return ServletActionContext.getServletContext().getResourceAsStream(filePath);
    }

    public void setFileInputStream(InputStream fileInputStream) {
        this.fileInputStream = fileInputStream;
    }
}

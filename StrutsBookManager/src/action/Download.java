package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @Author hao
 * @Date 2017/11/13 12:03
 * @Description :下载
 */
public class Download extends ActionSupport {
    private String filePath;
    private String fileName;
    private InputStream fileInput;

    @Override
    public String execute() throws Exception {
//        String substring = filePath.substring(filePath.lastIndexOf(".") + 1);
//        fileName = fileName +"."+ substring;
//        System.out.println(fileName);
        return SUCCESS;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() throws UnsupportedEncodingException {
        String substring = filePath.substring(filePath.lastIndexOf(".") + 1);
        fileName = fileName +"."+ substring;
        System.out.println(fileName);
        String encode = URLEncoder.encode(fileName, "utf-8");
        System.out.println("获取到的文件名"+encode);
        return encode;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public InputStream getFileInput() {
        return ServletActionContext.getServletContext().getResourceAsStream(filePath);
    }

}

package action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.File;
import java.util.List;

/**
 * Created by macbookair on 2017/12/9.
 */
public class UploadTest extends ActionSupport {
    List<File> upload;
    List<String> uploadFileName;
    List<String> uploadContentType;

    @Override
    public String execute() throws Exception {
        System.out.printf("张鑫真牛逼");
        return SUCCESS;
    }

    public List <File> getUpload() {
        return upload;
    }

    public void setUpload(List <File> upload) {
        this.upload = upload;
    }

    public List <String> getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(List <String> uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public List <String> getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(List <String> uploadContentType) {
        this.uploadContentType = uploadContentType;
    }
}

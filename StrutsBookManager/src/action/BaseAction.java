package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by macbookair on 2017/11/5.
 */
public class BaseAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,SessionAware,ApplicationAware {
    protected Map<String,Object> session;
    protected HttpServletResponse response;
    protected HttpServletRequest request;
    protected Map<String,Object> application;

    public Map <String, Object> getSession() {
        return session;
    }

    @Override
    public void setSession(Map <String, Object> session) {
        this.session = session;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }


    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {

    }

    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {

    }

    @Override
    public void setApplication(Map <String, Object> map) {

    }
}
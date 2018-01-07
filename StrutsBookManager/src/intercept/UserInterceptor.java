package intercept;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

/**
 * Created by macbookair on 2018/1/2.
 */
public class UserInterceptor extends AbstractInterceptor {
    public UserInterceptor() {
        super();
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        ActionContext invocationContext=actionInvocation.getInvocationContext();
        Map<String,Object> session= invocationContext.getSession();
        if(session.get("logineduser")!=null){

        }
        return null;
    }
}

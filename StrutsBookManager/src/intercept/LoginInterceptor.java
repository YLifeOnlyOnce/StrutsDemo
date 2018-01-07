package intercept;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import service.UserService;

import java.util.Map;

/**
 * Created by macbookair on 2017/12/4.
 */
public class LoginInterceptor extends AbstractInterceptor {
    @Override
    public void init() {
        System.out.println("拦截器init();");
        super.init();
    }

    @Override
    public void destroy() {
        System.out.println("拦截器destroy();");
        super.destroy();
    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("自定义拦截器执行");
        ActionContext invocationContext = actionInvocation.getInvocationContext();
        Map <String, Object> session = invocationContext.getSession();
        if(session.get("logineduser")!=null){
            System.out.println("拦截器通过");
            return actionInvocation.invoke();
        }
        System.out.println("没登陆，滚去登陆～");
        session.put("message","您还未登陆");
        return Action.LOGIN;
    }
}

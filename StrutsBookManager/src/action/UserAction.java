package action;

import bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import service.UserService;

/**
 * Created by macbookair on 2017/12/3.
 */
public class UserAction extends BaseAction {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    UserService userService=new UserService();

//    -------------login--------------
    public String login() throws ClassNotFoundException {

        if(userService.login(user)!=null){
            System.out.println("登陆成功");
            return SUCCESS;
        }else {
            session.put("message","登陆失败");
            System.out.println("登陆失败");
            return ERROR;
        }

    }

    public String regist() throws ClassNotFoundException {

        userService.Regist(user);
        return SUCCESS;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}

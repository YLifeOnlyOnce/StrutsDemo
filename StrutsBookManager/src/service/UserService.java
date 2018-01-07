package service;

import bean.User;
import dao.UserDao;

/**
 * Created by macbookair on 2017/12/3.
 */
public class UserService {
    private UserDao userDao = new UserDao();

    public User login(User user) throws ClassNotFoundException {

        return userDao.login(user);

    }

    public void Regist(User user) throws ClassNotFoundException {

       userDao.regist(user);
    }
}

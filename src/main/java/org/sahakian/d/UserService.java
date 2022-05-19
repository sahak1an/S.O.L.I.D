package org.sahakian.d;

public class UserService {
    private final UserDao userDao;

    public UserService() {
        userDao = new UserDao();
    }

    public String find(int id){
        return userDao.findById(id);
    }
}

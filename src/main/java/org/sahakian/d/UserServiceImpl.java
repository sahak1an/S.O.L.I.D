package org.sahakian.d;

public class UserServiceImpl implements UserService {
    private final UserDaoService userDao;

    public UserServiceImpl() {
        userDao = new UserDao();
    }

    @Override
    public String findUserById(int id){
        return userDao.find(id);
    }
}

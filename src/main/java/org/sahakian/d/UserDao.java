package org.sahakian.d;

import java.sql.Driver;

public class UserDao implements UserDaoService{
    private Driver dbDriver;

    @Override
    public String find(int id) {
        return "TODO";
    }
}

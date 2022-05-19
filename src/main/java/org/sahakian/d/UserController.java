package org.sahakian.d;

public class UserController {
    private final UserService userService;

    public UserController() {
        userService = new UserServiceImpl();
    }

    public String find(int id) {
        return userService.findUserById(id);
    }
}

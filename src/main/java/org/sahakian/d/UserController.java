package org.sahakian.d;

public class UserController {
    private final UserService userService;

    public UserController() {
        userService = new UserService();
    }

    public String find(int id) {
        return userService.find(id);
    }
}

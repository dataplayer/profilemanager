package com.nicflores.app;

import java.util.List;

/**
 * Created by nicflores on 9/2/14.
 */
public interface UserService {

    public void createUser(String username, String password);
    public User getUserByUserName(String firstname);
    public List<User> getAllUsers();
}

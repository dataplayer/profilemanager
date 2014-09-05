package com.nicflores.app.user;

import com.nicflores.app.UserService;
import com.nicflores.app.User;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by nicflores on 9/3/14.
 */
public class UserDb implements UserService {

    HashMap<String,User> userdb;

    public UserDb() {
        userdb = new HashMap<String,User>();
    }

    @Override
    public synchronized void createUser(String username, String password) {
        this.userdb.put(username,new UserProfile(username, password));
    }

    @Override
    public synchronized User getUserByUserName(String username) {
        return this.userdb.get(username);
    }

    @Override
    public synchronized List<User> getAllUsers() {
        List<User> userlist = new LinkedList<User>();
        for (User user : userdb.values()) {
            userlist.add(user);
        }
        return userlist;
    }

}

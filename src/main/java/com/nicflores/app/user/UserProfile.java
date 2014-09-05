package com.nicflores.app.user;

import com.nicflores.app.User;

/**
 * Created by nicflores on 9/3/14.
 */
public class UserProfile implements User {

    private String username;
    private String password;

    public UserProfile(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    public String getUsername() {
        return this.username;
    }
}

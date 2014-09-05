package com.nicflores.app.user;

import com.nicflores.app.UserService;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by nicflores on 9/3/14.
 */
public class ApplicationListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Hello from application listener");
        // insert userservice into application scope
        // this is just a dictionary with key euqal to package + USER_SERVICE
        // and its value is the in memory userservice
        UserService us = new UserDb();
        // insert key and value into application scope
        sce.getServletContext().setAttribute("com.nicflores.app.USER_SERVICE", us);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("GoodBye from the application listener!");
    }

}

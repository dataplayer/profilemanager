package com.nicflores.app.listeners;

import com.nicflores.app.UserService;
import com.nicflores.app.user.UserDb;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by nicflores on 9/3/14.
 */
public class ApplicationListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        System.out.println("Hello from application listener");
        // insert userservice into application scope
        // this is just a dictionary with key euqal to package + USER_SERVICE
        // and its value is the in memory userservice
        UserService us = new UserDb();
        // insert key and value into application scope
        sc.setAttribute("com.nicflores.app.USER_SERVICE", us);
        // adding the context path to we can access it in jsp's using ${contextpath}/blah..
        sc.setAttribute("contextpath",sc.getContextPath());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("GoodBye from the application listener!");
    }

}

package com.nicflores.app.user;

import com.nicflores.app.User;
import com.nicflores.app.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by nicflores on 9/5/14.
 */
public class ListUsersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

        UserService us = (UserService) this.getServletContext().getAttribute("com.nicflores.app.USER_SERVICE");

        request.setAttribute("users",us.getAllUsers());

        String nextpage = "/jsp/listusers.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(nextpage);
        dispatcher.forward(request,response);

        //for (User user : us.getAllUsers()) {
        //    response.getWriter().println(user.getUsername() + "\n");
        //}
    }



}

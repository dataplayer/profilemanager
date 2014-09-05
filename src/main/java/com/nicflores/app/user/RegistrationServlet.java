package com.nicflores.app.user;

import com.nicflores.app.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by nicflores on 9/4/14.
 */
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        UserService us = (UserService) this.getServletContext().getAttribute("com.nicflores.app.USER_SERVICE");

        String email = request.getParameter("username");
        String password = request.getParameter("password");

        String nextpage = "/jsp/registered.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextpage);
        dispatcher.forward(request,response);
    }
}

package com.example.s_login;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        process(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        process(request, response);
    }

    protected void process(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        String id = request.getParameter("userId");
        String password = request.getParameter("password");

        if(id.equals("Ahmad") && password.equals("vu"))
        {
            response.sendRedirect("welcome.html");
        }
        else
        {
//            response.sendError(response.SC_PROXY_AUTHENTICATION_REQUIRED, "Send error Demo");
            response.sendRedirect("register.html");
        }
    }


}

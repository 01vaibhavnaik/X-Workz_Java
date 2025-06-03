package com.xworkz.Theft.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/crime", loadOnStartup = 1)
public class theftServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String mobile=servletRequest.getParameter("mobile");
        String age=servletRequest.getParameter("age");
        String address=servletRequest.getParameter("address");
        String location=servletRequest.getParameter("location");
        String item=servletRequest.getParameter("item");
        String date=servletRequest.getParameter("date");

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("TheftResult.jsp");

        servletRequest.setAttribute("Name:",name);
        servletRequest.setAttribute("Mobile Number:",mobile);
        servletRequest.setAttribute("Item:",item);
        servletRequest.setAttribute("Date:",date);
    }
}

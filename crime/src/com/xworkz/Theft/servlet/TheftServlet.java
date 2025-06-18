package com.xworkz.Theft.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/crime", loadOnStartup = 1)
public class TheftServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String mobile=servletRequest.getParameter("mobile");
        String age=servletRequest.getParameter("age");
        String address=servletRequest.getParameter("address");
        String location=servletRequest.getParameter("location");
        String item=servletRequest.getParameter("item");
        String date=servletRequest.getParameter("date");

        servletRequest.setAttribute("Name",name);
        servletRequest.setAttribute("MobileNumber",mobile);
        servletRequest.setAttribute("Item",item);
        servletRequest.setAttribute("Date",date);

        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("TheftResult.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);






    }
}

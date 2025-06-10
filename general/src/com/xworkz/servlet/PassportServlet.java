package com.xworkz.servlet;

import com.xworkz.dto.PassportDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/passport", loadOnStartup = 1)
public class PassportServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
        String name =  servletRequest.getParameter("nameName");
        String adharNo = servletRequest.getParameter("adharNo");
        String address = servletRequest.getParameter("address");
        String panNo = servletRequest.getParameter("panNo");
        String country =servletRequest.getParameter("country");
        String state =servletRequest.getParameter("state");
        String city =servletRequest.getParameter("city");
        String pinCode =servletRequest.getParameter("pinCode");
        String passportType =servletRequest.getParameter("passportType");
        String paymentRefNo =servletRequest.getParameter("paymentRefNo");

        long newAdar = Long.parseLong(adharNo);
        long newPan = Long.parseLong(panNo);
        long newPin = Long.parseLong(pinCode);
        long newRef = Long.parseLong(paymentRefNo);

        PassportDTO passportDTO=new PassportDTO(name,newAdar,address,newPan,country,state,city,newPin,passportType,newRef);
        servletRequest.setAttribute("pass",passportDTO);

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("PassportResult.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);


    }
}

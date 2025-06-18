package com.xworkz.page.servlet;

import com.xworkz.page.dto.TrailDTO;
import com.xworkz.page.service.TrailService;
import com.xworkz.page.service.TrailServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/trail", loadOnStartup = 2)
public class TrailServlet extends HttpServlet {

    public TrailServlet() {
        System.out.println("no-args constructor in TrailServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String username = req.getParameter("username");
       String password = req.getParameter("password");

       long passwordUpdated= Long.parseLong(password);

        TrailDTO trailDTO = new TrailDTO(username, passwordUpdated);
        System.out.println("TrailDTO created: " + trailDTO);

        TrailService trailService = new TrailServiceImp();
        trailService.validate(trailDTO);





        // You can add further processing logic here, such as validating the credentials
        // or redirecting to another page based on the input.


    }
}

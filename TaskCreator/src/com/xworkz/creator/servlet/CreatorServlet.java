package com.xworkz.creator.servlet;

import com.xworkz.creator.dto.CreatorDTO;
import com.xworkz.creator.service.CreatorService;
import com.xworkz.creator.service.CreatorServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (urlPatterns = "/creator" ,loadOnStartup = 1)
public class CreatorServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name= req.getParameter("nameName");
    String email= req.getParameter("emailName");
    String mobile= req.getParameter("mobileName");
    String address= req.getParameter("addressName");
    String typeName= req.getParameter("typeName");
    String dateName= req.getParameter("dateName");
    String inlineRadioOptions= req.getParameter("inlineRadioOptions");

    long mobileNumber = Long.parseLong(mobile);

    CreatorDTO creatorDTO = new CreatorDTO(name, email, mobileNumber, address, typeName, dateName, inlineRadioOptions);

        System.out.println("Creator details received: " + creatorDTO);

        CreatorService creatorService = new CreatorServiceImpl();
        creatorService.validateAndSave(creatorDTO);

    }
}

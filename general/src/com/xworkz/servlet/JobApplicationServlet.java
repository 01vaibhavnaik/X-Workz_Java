package com.xworkz.servlet;

import com.xworkz.dto.JobApplicationDTO;
import com.xworkz.service.JobService;
import com.xworkz.service.JobServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/jobapplication", loadOnStartup = 1)
public class JobApplicationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
        String name =  servletRequest.getParameter("nameName");
        String email = servletRequest.getParameter("emailName");
        String education = servletRequest.getParameter("educationName");
        String skill = servletRequest.getParameter("skillName");
        String salary =servletRequest.getParameter("salary");
        String experience =servletRequest.getParameter("experienceName");

        double newSalary = Double.parseDouble(salary);
        int newExperience = Integer.parseInt(experience);

        JobApplicationDTO jobApplicationDTO=new JobApplicationDTO(name, email, education, skill, newSalary, newExperience);
        servletRequest.setAttribute("job", jobApplicationDTO);

        JobService jobService = new JobServiceImp();
        String result = jobService.validate(jobApplicationDTO);
        System.out.println("Result from service: " + result);

        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("JobApplication.jsp");
        servletRequest.setAttribute("message", result);
        if(!result.equals("data is saved successfully")) {
            servletRequest.setAttribute("job", jobApplicationDTO);
        }
        requestDispatcher.forward(servletRequest, servletResponse);







    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String search = req.getParameter("searchName");

        int searchId = Integer.parseInt(search);

        JobService jobService = new JobServiceImp();
        JobApplicationDTO jobApplicationDTO=jobService.getJobApplicationById(searchId);

        if (jobApplicationDTO == null) {
            System.out.println("No job application found with ID: " );

        } else {
            System.out.println("Job application found: ");


        }



    }
}

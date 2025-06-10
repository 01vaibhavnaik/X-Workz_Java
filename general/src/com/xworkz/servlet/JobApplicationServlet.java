package com.xworkz.servlet;

import com.xworkz.dto.JobApplicationDTO;

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

        JobApplicationDTO jobApplicationDTO= new JobApplicationDTO();
        jobApplicationDTO.setName(name);
        jobApplicationDTO.setEmail(email);
        jobApplicationDTO.setEducation(education);
        jobApplicationDTO.setSkill(skill);
        jobApplicationDTO.setSalary(Double.parseDouble(salary));
        jobApplicationDTO.setExperience(Integer.parseInt(experience));

        servletRequest.setAttribute("job",jobApplicationDTO);

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("JobAppResult.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);


    }
}

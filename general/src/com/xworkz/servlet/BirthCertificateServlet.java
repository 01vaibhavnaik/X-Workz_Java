package com.xworkz.servlet;

import com.xworkz.dto.BirthCertificateDTO;
import com.xworkz.dto.JobApplicationDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/birthcertificate", loadOnStartup = 1)
public class BirthCertificateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
        String birthId =  servletRequest.getParameter("birth");
        String hospitalName = servletRequest.getParameter("hospitalName");
        String father = servletRequest.getParameter("father");
        String mother = servletRequest.getParameter("mother");
        String date =servletRequest.getParameter("date");
        String doctor =servletRequest.getParameter("doctor");
        String nurse =servletRequest.getParameter("nurse");
        String hospitalType =servletRequest.getParameter("hospitalType");

        BirthCertificateDTO birthCertificateDTO= new BirthCertificateDTO();
        birthCertificateDTO.setBirthId(Long.parseLong(birthId));
        birthCertificateDTO.setHospitalName(hospitalName);
        birthCertificateDTO.setFatherName(father);
        birthCertificateDTO.setMotherName(mother);
        birthCertificateDTO.setDate(LocalDate.parse(date));
        birthCertificateDTO.setDoctorName(doctor);
        birthCertificateDTO.setNurseName(nurse);
        birthCertificateDTO.setHospitalType(hospitalType);

        servletRequest.setAttribute("birth",birthCertificateDTO);

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("BirthResult.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);


    }
}

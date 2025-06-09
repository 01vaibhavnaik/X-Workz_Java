package com.xworkz.servler.weather;

import com.xworkz.servler.dto.WeatherDTO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/weather" , loadOnStartup = 1)
public class WeatherServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String location = servletRequest.getParameter("lacationName");
        String capture = servletRequest.getParameter("captureName");
        String temprature = servletRequest.getParameter("temprature");
        String date = servletRequest.getParameter("dateName");

        WeatherDTO weatherDTO = new WeatherDTO();
        weatherDTO.setLocation(location);
        weatherDTO.setCapture(capture);
        weatherDTO.setTemprature(Integer.parseInt(temprature));
        weatherDTO.setDate(LocalDate.parse(date));

        servletRequest.setAttribute("dto",weatherDTO);

        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("WeatherResult.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);
    }
}

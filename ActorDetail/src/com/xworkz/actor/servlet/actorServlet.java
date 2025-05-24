package com.xworkz.actor.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.sql.Wrapper;

@WebServlet(urlPatterns = "/actor",loadOnStartup = 1)
public class actorServlet extends GenericServlet {
    public actorServlet(){
        System.out.println("Running actorServlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("actorName");
        String language=servletRequest.getParameter("lang");
        String actorSalary=servletRequest.getParameter("salary");
        String blockBuster=servletRequest.getParameter("blockBuster");
        String flops=servletRequest.getParameter("flops");
        String upcommingMovie=servletRequest.getParameter("upcommingMovie");
        String upcommingMovieProducer=servletRequest.getParameter("upcommingMovieProducer");
        String upcommingMovieDirector=servletRequest.getParameter("upcommingMovieDirector");
        String upcommingMovieBudget=servletRequest.getParameter("upcommingMovieBudget");

        int wrapSalary = Integer.parseInt(actorSalary);
        int wrapBlockBuster = Integer.parseInt(blockBuster);
        int wrapFlops = Integer.parseInt(flops);
        int wrapMovie = Integer.parseInt(upcommingMovie);
        int wrapBudget = Integer.parseInt(upcommingMovieBudget);


        System.out.println("Actor name:"+name+" , Language:"+language+", Salary:"+wrapSalary+", Block Buster:"+wrapBlockBuster+", Flops:"+wrapFlops+", Upcomming Movie:"+wrapMovie+", Producer:"+upcommingMovieProducer+", Director:"+upcommingMovieDirector+", Budget:"+wrapBudget);

        PrintWriter writer= servletResponse.getWriter();

        writer.println("<html>");
        writer.println("<body>");
        writer.println(name+"Details Uploaded succesfully");
        writer.println("</body>");
        writer.println("</html>");





    }
}


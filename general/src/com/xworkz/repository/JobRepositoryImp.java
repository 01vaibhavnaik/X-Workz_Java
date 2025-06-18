package com.xworkz.repository;

import com.xworkz.dto.JobApplicationDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JobRepositoryImp implements JobRepository {
    @Override
    public void save(JobApplicationDTO jobApplicationDTO) {
        System.out.println("saving data");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/general";
            String name="root";
            String password="Vaibhav@01";
            Connection connection=DriverManager.getConnection(url,name,password);
            String sql="insert into job_details value(0,'"+jobApplicationDTO.getName()+"','"+jobApplicationDTO.getEmail()+"','"+jobApplicationDTO.getEducation()+"','"+jobApplicationDTO.getSkill()+"',"+jobApplicationDTO.getSalary()+","+jobApplicationDTO.getExperience()+")";
            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);

            System.out.println(connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

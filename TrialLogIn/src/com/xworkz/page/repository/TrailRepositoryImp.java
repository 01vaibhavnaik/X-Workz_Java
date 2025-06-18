package com.xworkz.page.repository;

import com.xworkz.page.dto.TrailDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TrailRepositoryImp implements TrailRepository {

    @Override
    public void save(TrailDTO trailDTO) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/general";
            String name="root";
            String password="Vaibhav@01";
            Connection connection= DriverManager.getConnection(url,name,password);
            String sql="insert into register value(0,'"+trailDTO.getUsername()+"','"+trailDTO.getPassword()+"')";
            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);

            System.out.println(connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

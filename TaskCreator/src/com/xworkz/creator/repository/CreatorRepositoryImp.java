package com.xworkz.creator.repository;

import com.xworkz.creator.dto.CreatorDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatorRepositoryImp implements CreatorRepository{
    @Override
    public void Save(CreatorDTO creatorDTO) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/general";
            String name="root";
            String password="Vaibhav@01";
            Connection connection= DriverManager.getConnection(url,name,password);
            String sql="insert into editor value(0,'"+creatorDTO.getName()+"','"+creatorDTO.getEmail()+"',"+creatorDTO.getMobile()+",'"+creatorDTO.getAddress()+"','"+creatorDTO.getType()+"','"+creatorDTO.getDate()+"','"+creatorDTO.getSchedule()+"')";
            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);

            System.out.println(connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

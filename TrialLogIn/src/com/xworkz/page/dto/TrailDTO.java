package com.xworkz.page.dto;

import java.io.Serializable;

public class TrailDTO implements Serializable {
    private String username;
    private long password;


    public TrailDTO(String username, long password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public long getPassword() {
        return password;
    }
}

package com.xworkz.external;

import com.xworkz.internal.UserAuthentication;

public class JWTLogin {
    private UserAuthentication userAuthentication;

    public JWTLogin(UserAuthentication userAuthentication) {
        this.userAuthentication = userAuthentication;
    }

    public void authenticate() {
        if (userAuthentication != null) {
            userAuthentication.authenticate();
        } else {
            System.err.println("Null");
        }
    }
}

package com.xworkz.internal;

public class OAuthLogin implements UserAuthentication {
    @Override
    public void authenticate() {
        System.out.println("Authenticating user using OAuth...");
    }

}

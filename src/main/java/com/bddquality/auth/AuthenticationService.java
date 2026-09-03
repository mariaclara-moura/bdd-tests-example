package com.bddquality.auth;

public class AuthenticationService {

    public boolean authenticate(String email, String password) {
        return "user@example.com".equals(email)
                && "correct-password".equals(password);
    }
}

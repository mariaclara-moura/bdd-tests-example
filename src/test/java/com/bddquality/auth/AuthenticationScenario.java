package com.bddquality.auth;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.tngtech.jgiven.Stage;

public class AuthenticationScenario extends Stage<AuthenticationScenario> {

    private final AuthenticationService authenticationService = new AuthenticationService();
    private String email;
    private String password;
    private boolean authenticated;

    public AuthenticationScenario a_user_with_valid_credentials() {
        email = "user@example.com";
        password = "correct-password";
        return self();
    }

    public AuthenticationScenario a_user_with_invalid_credentials() {
        email = "user@example.com";
        password = "wrong-password";
        return self();
    }

    public AuthenticationScenario the_user_attempts_to_log_in() {
        authenticated = authenticationService.authenticate(email, password);
        return self();
    }

    public AuthenticationScenario the_user_is_authenticated() {
        assertTrue(authenticated);
        return self();
    }

    public AuthenticationScenario authentication_is_rejected() {
        assertFalse(authenticated);
        return self();
    }
}
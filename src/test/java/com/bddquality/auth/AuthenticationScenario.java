package com.bddquality.auth;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthenticationScenario {

    private final AuthenticationService authenticationService = new AuthenticationService();
    private String email;
    private String password;
    private boolean authenticated;

    public AuthenticationScenario givenAUserWithValidCredentials() {
        email = "user@example.com";
        password = "correct-password";
        return this;
    }

    public AuthenticationScenario givenAUserWithInvalidCredentials() {
        email = "user@example.com";
        password = "wrong-password";
        return this;
    }

    public AuthenticationScenario whenTheUserAttemptsToLogIn() {
        authenticated = authenticationService.authenticate(email, password);
        return this;
    }

    public AuthenticationScenario thenTheUserIsAuthenticated() {
        assertTrue(authenticated);
        return this;
    }

    public AuthenticationScenario thenAuthenticationIsRejected() {
        assertFalse(authenticated);
        return this;
    }
}

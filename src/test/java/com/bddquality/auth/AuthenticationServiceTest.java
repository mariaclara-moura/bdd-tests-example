package com.bddquality.auth;

import org.junit.jupiter.api.Test;

class AuthenticationServiceTest {

    @Test
    void shouldAuthenticateUserWithValidCredentials() {
        AuthenticationScenario scenario = new AuthenticationScenario();

        scenario
                .givenAUserWithValidCredentials()
                .whenTheUserAttemptsToLogIn()
                .thenTheUserIsAuthenticated();
    }

    @Test
    void shouldRejectAuthenticationWithInvalidCredentials() {
        AuthenticationScenario scenario = new AuthenticationScenario();

        scenario
                .givenAUserWithInvalidCredentials()
                .whenTheUserAttemptsToLogIn()
                .thenAuthenticationIsRejected();
    }
}

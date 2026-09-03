package com.bddquality.auth;

import com.tngtech.jgiven.junit5.SimpleScenarioTest;
import org.junit.jupiter.api.Test;

class AuthenticationServiceTest extends SimpleScenarioTest<AuthenticationScenario> {

    @Test
    void shouldAuthenticateUserWithValidCredentials() {
        given().a_user_with_valid_credentials();

        when().the_user_attempts_to_log_in();

        then().the_user_is_authenticated();
    }

    @Test
    void shouldRejectAuthenticationWithInvalidCredentials() {
        given().a_user_with_invalid_credentials();

        when().the_user_attempts_to_log_in();

        then().authentication_is_rejected();
    }
}
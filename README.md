# BDD-Style Test Quality Evaluation

This repository contains a controlled Java project designed to support the evaluation of test quality using the proposed T1–T12 checklist instrument.

## Purpose

The project uses **JGiven** to write tests using an explicit **Given → When → Then** structure.

## Structure

- `AuthenticationService.java`: system under test
- `AuthenticationScenario.java`: single JGiven stage class containing all scenario steps
- `AuthenticationServiceTest.java`: test suite evaluated by participants

## Example

```java
@Test
void shouldAuthenticateUserWithValidCredentials() {
    given().a_user_with_valid_credentials();

    when().the_user_attempts_to_log_in();

    then().the_user_is_authenticated();
}
```

The project uses JGiven's `SimpleScenarioTest`, allowing all steps to remain in a single stage class. JGiven also provides `and()` when a scenario requires additional conditions, actions, or outcomes.

## Running the Tests

```bash
mvn test
```

## Evaluation

Participants should inspect the repository and evaluate if using the T1–T12 quality evaluation instrument is effective.

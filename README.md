# BDD-Style Test Quality Evaluation

This repository contains a small Java project designed to support the evaluation of automated tests using the proposed BDD-style test quality criteria (T1–T12).

## Purpose

The project provides a controlled test suite written using an explicit Given → When → Then structure without requiring a `.feature` file.

## Structure

- `src/main/java/com/bddquality/auth/AuthenticationService.java`: system under test
- `src/test/java/com/bddquality/auth/AuthenticationScenario.java`: Given/When/Then scenario helper
- `src/test/java/com/bddquality/auth/AuthenticationServiceTest.java`: test suite evaluated by participants

## Evaluation

Participants should inspect the test file and evaluate it according to the T1–T12 instrument.

## Running the tests

Run `mvn test`.

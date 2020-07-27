#Auto generated Octane revision tag
@TID4120175REV0.2.0
Feature: Test Sonar Gherkin Login Page

  Scenario: Login with valid credentials
    Given Browser is Open
    And user is on Sonarque home page
    When user clicks on login button
    Then user logins with valid admin and admin

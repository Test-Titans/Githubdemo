Feature: Registration
  This feature file contains multiple steps to Register to application
  @Regression @Registarionofacount
  Scenario: Register to Test Titans with valid Data
    Given Navigate to test titans website
    And click on Create account section and enter all the mandatory fields
    When user click on Register button
    Then user should be able to register
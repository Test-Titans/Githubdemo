Feature: :Dialling phone details
  This is the test steps to dial a phone number
  @Smoke @DiallingPhone
  Scenario: Dialing a 10 digit phone number
    Given Pick the dialer
    #This is a comment
    And enters the valid number 1234567890
    Then User should get connected
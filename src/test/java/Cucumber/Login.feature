Feature: User Login
  Registered user should be able to login to the account(Optional description if want to give)
  Scenario: Login with valid credential
    Given User open the application url
    And Navigate to the login page
    When user enter valid email address "amotooricap99@gmail.com"
    And enter valid password "12345"
    Then user should get login successfully
    Scenario: Login with Invalid credential
      Given User open the application url
      And Navigate to the login page
      When user enter valid email address "sunnyk503@gmail.com"
      And enter valid password "12345"
      Then user should get proper warning message
      And User should not get login

Feature: Login
 This feature file contains multiple steps to login to application
  Background:
    @Sanity
    Given Navigate to test titans website
 Scenario Outline: Login to Test Titans with valid credential
    And user enters the correct login id <email>
    And user enters the correct password <password>
    And users type something "abc"
    When user click on login button
    Then user should be able to login
   Examples:
   |email             |           password|
   |"sk@gmail.com"      |       "123455"  |
   |"sk12@gmail.com"      |       "1234"  |

   @Regression
  Scenario: Login to Test Titans with Invalid credential
    And user enters the incorrect login id "sk12@gmail.com "
    And user enters the incorrect password "146"

    When user click on login button
    Then user should not be able to login


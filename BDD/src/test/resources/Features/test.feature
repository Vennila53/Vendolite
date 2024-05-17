Feature: Login to Facebook
@tag1
  Scenario: Check login is successful with valid credentials
    Given Open the browser
    Then user is navigated to login page
    And user enters <username> and <password>
    Then click on the button
    Then user navigated to the home page

    Examples:
    |username|password|
    |loginuser@riota.in|12345678|

@tag2    
Scenario: Check login is failed with invalid credentials
    Given user is navigated to login page
    When user enters <username> and <password>
    And click on the button
    Then user is login failed

    Examples:
    |username|password|
    |Sam|abcde|
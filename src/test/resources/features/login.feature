@Login
  Feature: Login
    As a user i want to login to website sauce demo
  
  Scenario: Normal Login
    Given User open the web sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User clicked the login button

    Scenario Outline: Invalid login
      Given User open the web sauce demo
      When User input "<userName>" as userName and input "<password>" as password
      And User clicked the login button
      Then User see error "<errorMessage>" on login page
      Examples:
        | userName      | password     | errorMessage                                                              |
        | standard_user |              | Epic sadface: Password is required                                        |
        |               | secret_sauce | Epic sadface: Username is required                                        |
        |               |              | Epic sadface: Username is required                                        |
        | standard_user | invalidpass  | Epic sadface: Username and password do not match any user in this service |






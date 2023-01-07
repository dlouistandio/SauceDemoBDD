@CheckOut

  Feature: CheckOut
    As a User i want to chooose a item then checkout

  Scenario: End-To-End checkout proccess
    Given User already login
    When User choose sort option "Name (Z to A)"
    And User add "Test.allTheThings() T-Shirt (Red),Sauce Labs Onesie" to cart
    And User click the shopping cart
    And User item must be "Test.allTheThings() T-Shirt (Red)" and "Sauce Labs Onesie"
    And User Remove "Test.allTheThings() T-Shirt (Red)" in the shopping cart
    Then User click the Checkout Button
    And User input shipping information

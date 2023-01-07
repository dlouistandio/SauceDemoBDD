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
    And User click the Checkout Button
    And User input shipping information
    And User click the Continue Button
    And The Checkout summary must contains "Item total: $7.99","Tax: $0.64", and "Total: $8.63"
    And User clicked finish button
    Then User will see "THANK YOU FOR YOUR ORDER" message


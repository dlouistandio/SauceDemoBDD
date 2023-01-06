@CheckOut

  Feature: CheckOut
    As a User i want to chooose a item then checkout

  Scenario: Chose item with sort then checkout
    Given User already login
    When User choose sort option "Name (Z to A)"
    And User add an item and open the shopping cart
    And User item must be "Test.allTheThings() T-Shirt (Red)" and "Sauce Labs Onesie"
    And User Remove one of item in the shopping cart
    
    
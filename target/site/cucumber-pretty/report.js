$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/checkout.feature");
formatter.feature({
  "line": 3,
  "name": "CheckOut",
  "description": "As a User i want to chooose a item then checkout",
  "id": "checkout",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CheckOut"
    }
  ]
});
formatter.before({
  "duration": 5916249626,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "End-To-End checkout proccess",
  "description": "",
  "id": "checkout;end-to-end-checkout-proccess",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User already login",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User choose sort option \"Name (Z to A)\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User add \"Test.allTheThings() T-Shirt (Red),Sauce Labs Onesie\" to cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click the shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User item must be \"Test.allTheThings() T-Shirt (Red)\" and \"Sauce Labs Onesie\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Remove \"Test.allTheThings() T-Shirt (Red)\" in the shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User click the Checkout Button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User input shipping information",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User click the Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "The Checkout summary must contains \"Item total: $7.99\",\"Tax: $0.64\", and \"Total: $8.63\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User clicked finish button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User will see \"THANK YOU FOR YOUR ORDER\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "checkOutSteps.userLogin()"
});
formatter.result({
  "duration": 318020196,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z to A)",
      "offset": 25
    }
  ],
  "location": "checkOutSteps.sortItem(String)"
});
formatter.result({
  "duration": 5139144113,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test.allTheThings() T-Shirt (Red),Sauce Labs Onesie",
      "offset": 10
    }
  ],
  "location": "checkOutSteps.chooseItem(String)"
});
formatter.result({
  "duration": 5120397049,
  "status": "passed"
});
formatter.match({
  "location": "checkOutSteps.clickShoppingCart()"
});
formatter.result({
  "duration": 5058418028,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test.allTheThings() T-Shirt (Red)",
      "offset": 19
    },
    {
      "val": "Sauce Labs Onesie",
      "offset": 59
    }
  ],
  "location": "checkOutSteps.cartListItem(String,String)"
});
formatter.result({
  "duration": 106145553,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test.allTheThings() T-Shirt (Red)",
      "offset": 13
    }
  ],
  "location": "checkOutSteps.removeItemCart(String)"
});
formatter.result({
  "duration": 5051844393,
  "status": "passed"
});
formatter.match({
  "location": "checkOutSteps.clickCheckOut()"
});
formatter.result({
  "duration": 91423713,
  "status": "passed"
});
formatter.match({
  "location": "checkOutSteps.inputShipping()"
});
formatter.result({
  "duration": 191881860,
  "status": "passed"
});
formatter.match({
  "location": "checkOutSteps.clickContinueShipBtn()"
});
formatter.result({
  "duration": 5061419895,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Item total: $7.99",
      "offset": 36
    },
    {
      "val": "Tax: $0.64",
      "offset": 56
    },
    {
      "val": "Total: $8.63",
      "offset": 74
    }
  ],
  "location": "checkOutSteps.verifySummary(String,String,String)"
});
formatter.result({
  "duration": 99595386,
  "status": "passed"
});
formatter.match({
  "location": "checkOutSteps.clickFinishBtn()"
});
formatter.result({
  "duration": 5046237980,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "THANK YOU FOR YOUR ORDER",
      "offset": 15
    }
  ],
  "location": "checkOutSteps.getThankYouText(String)"
});
formatter.result({
  "duration": 3028604837,
  "status": "passed"
});
formatter.after({
  "duration": 607074278,
  "status": "passed"
});
});
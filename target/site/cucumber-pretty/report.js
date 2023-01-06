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
  "duration": 12890532929,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Chose item with sort then checkout",
  "description": "",
  "id": "checkout;chose-item-with-sort-then-checkout",
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
  "name": "User add an item and open the shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User item must be \"Test.allTheThings() T-Shirt (Red)\" and \"Sauce Labs Onesie\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Remove one of item in the shopping cart",
  "keyword": "And "
});
formatter.match({
  "location": "checkOutSteps.userLogin()"
});
formatter.result({
  "duration": 10231594480,
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
  "duration": 5189985995,
  "status": "passed"
});
formatter.match({
  "location": "checkOutSteps.chooseItem()"
});
formatter.result({
  "duration": 5209783752,
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
  "duration": 237614335,
  "status": "passed"
});
formatter.match({
  "location": "checkOutSteps.removeCartItem()"
});
formatter.result({
  "duration": 5097573961,
  "status": "passed"
});
formatter.after({
  "duration": 473940747,
  "status": "passed"
});
});
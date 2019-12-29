$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AdactinLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality for adactin application",
  "description": "",
  "id": "login-functionality-for-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Successfull login into the adactin application with valid credential",
  "description": "",
  "id": "login-functionality-for-adactin-application;successfull-login-into-the-adactin-application-with-valid-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enter application url",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user enter \"\u003cusername\u003e\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user enter \"\u003cpassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "goes to the landing page",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "login-functionality-for-adactin-application;successfull-login-into-the-adactin-application-with-valid-credential;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 17,
      "id": "login-functionality-for-adactin-application;successfull-login-into-the-adactin-application-with-valid-credential;;1"
    },
    {
      "cells": [
        "aarthyrajeev",
        "abc123"
      ],
      "line": 18,
      "id": "login-functionality-for-adactin-application;successfull-login-into-the-adactin-application-with-valid-credential;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user enter application url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter \"tamlmani\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter \"8B4J34\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "goes to the landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdifinition.user_enter_application_url()"
});
formatter.result({
  "duration": 8494031300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tamlmani",
      "offset": 12
    }
  ],
  "location": "Stepdifinition.user_enter_as_username(String)"
});
formatter.result({
  "duration": 1043326700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8B4J34",
      "offset": 12
    }
  ],
  "location": "Stepdifinition.user_enter_as_password(String)"
});
formatter.result({
  "duration": 194603900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.goes_to_the_landing_page()"
});
formatter.result({
  "duration": 2445212300,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Successfull login into the adactin application with valid credential",
  "description": "",
  "id": "login-functionality-for-adactin-application;successfull-login-into-the-adactin-application-with-valid-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enter application url",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user enter \"aarthyrajeev\" as username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user enter \"abc123\" as password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "goes to the landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdifinition.user_enter_application_url()"
});
formatter.result({
  "duration": 432672400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aarthyrajeev",
      "offset": 12
    }
  ],
  "location": "Stepdifinition.user_enter_as_username(String)"
});
formatter.result({
  "duration": 189535100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 12
    }
  ],
  "location": "Stepdifinition.user_enter_as_password(String)"
});
formatter.result({
  "duration": 93350601,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.goes_to_the_landing_page()"
});
formatter.result({
  "duration": 765249900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user enter application url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter \"tamlmani\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter \"8B4J34\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "goes to the landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdifinition.user_enter_application_url()"
});
formatter.result({
  "duration": 377190800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tamlmani",
      "offset": 12
    }
  ],
  "location": "Stepdifinition.user_enter_as_username(String)"
});
formatter.result({
  "duration": 115841400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8B4J34",
      "offset": 12
    }
  ],
  "location": "Stepdifinition.user_enter_as_password(String)"
});
formatter.result({
  "duration": 102881900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.goes_to_the_landing_page()"
});
formatter.result({
  "duration": 691709800,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Search for location, hotel,room availability",
  "description": "",
  "id": "login-functionality-for-adactin-application;search-for-location,-hotel,room-availability",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@searchhotel"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user select the location",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user select the hotel",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user select the roomtype",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user select the no of rooms",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user select the adults per room",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user select the children per room",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user verify the valid search details have passed",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user select the hotel name",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user verify the valid select details have passed",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user enter the firstname",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user enter the lastname",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user enter the billing address",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user enter the creditcard number",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user enter the creditcard type",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user enter the creditcard expiry date",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user enter the creditcard cvv number",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user verify the booking details have passed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdifinition.user_select_the_location()"
});
formatter.result({
  "duration": 738992300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.user_select_the_hotel()"
});
formatter.result({
  "duration": 337040700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.user_select_the_roomtype()"
});
formatter.result({
  "duration": 140173600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.user_select_the_no_of_rooms()"
});
formatter.result({
  "duration": 143976700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.user_select_the_adults_per_room()"
});
formatter.result({
  "duration": 140207800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.user_select_the_children_per_room()"
});
formatter.result({
  "duration": 148898899,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.user_verify_the_valid_search_details_have_passed()"
});
formatter.result({
  "duration": 1073933400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.user_select_the_hotel_name()"
});
formatter.result({
  "duration": 158587800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.user_verify_the_valid_select_details_have_passed()"
});
formatter.result({
  "duration": 971107599,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.user_enter_the_firstname()"
});
formatter.result({
  "duration": 223180099,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.user_enter_the_lastname()"
});
formatter.result({
  "duration": 98978500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.user_enter_the_billing_address()"
});
formatter.result({
  "duration": 144207100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.user_enter_the_creditcard_number()"
});
formatter.result({
  "duration": 163425599,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.user_enter_the_creditcard_type()"
});
formatter.result({
  "duration": 149752400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.user_enter_the_creditcard_expiry_date()"
});
formatter.result({
  "duration": 295706600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.user_enter_the_creditcard_cvv_number()"
});
formatter.result({
  "duration": 86599001,
  "status": "passed"
});
formatter.match({
  "location": "Stepdifinition.user_verify_the_booking_details_have_passed()"
});
formatter.result({
  "duration": 75424499,
  "status": "passed"
});
});
Feature: Login functionality for adactin application

Background:
When user enter application url
Then go to landing page

@login
Scenario: Successfull login into the adactin application with valid credential 
When user enter application url
And user enter "<tamlmani>" as username
And user enter "<8B4J34>" as password
Then user verify the username in the homepage


@searchhotel
Scenario: Successfull Search into the adactin application with valid credential 
And user select the location
And user select the hotel
And user select the roomtype
And user select the no of rooms
And user select the adults per room
And user select the children per room
Then user verify the valid search details have passed

@selecthotel
Scenario: Successfull Select hotel into the adactin application with valid credential 
And user select the hotel name
Then user verify the valid select details have passed

@payment
Scenario: Successfull book hotel into the adactin application with valid credential 
And user enter the firstname
And user enter the lastname
And user enter the billing address
And user enter the creditcard number
And user enter the creditcard type
And user enter the creditcard expiry date
And user enter the creditcard cvv number
Then user verify the booking  details have passed







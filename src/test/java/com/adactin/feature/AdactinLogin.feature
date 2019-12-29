Feature: Login functionality for adactin application 

Background: 
Given user enter application url
When user enter "tamlmani" as username 
And user enter "8B4J34" as password  
Then goes to the landing page 
	
@login 
Scenario Outline: Successfull login into the adactin application with valid credential 
Given user enter application url 
When user enter "<username>" as username 
And user enter "<password>" as password 
Then goes to the landing page 
	
Examples: 
|username|password|
|aarthyrajeev|abc123|
		
@searchhotel 
Scenario: Search for location, hotel,room availability 
When user select the location 
And user select the hotel 
And user select the roomtype 
And user select the no of rooms 
And user select the adults per room 
And user select the children per room 
Then user verify the valid search details have passed 
When user select the hotel name 
Then user verify the valid select details have passed 
When user enter the firstname 
And user enter the lastname 
And user enter the billing address 
And user enter the creditcard number 
And user enter the creditcard type 
And user enter the creditcard expiry date 
And user enter the creditcard cvv number 
Then user verify the booking details have passed
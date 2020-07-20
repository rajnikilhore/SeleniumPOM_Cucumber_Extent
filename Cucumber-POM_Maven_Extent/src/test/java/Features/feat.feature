Feature: Free CRM Login Feature


#without Examples Keyword
Scenario: Free CRM Login Test Scenario

Given user is on Home Page
When he search for "dress"
Then choose to buy the first item
Then moves to checkout from mini cart
Then enter personal details on checkout page
Then place the order
Then verify the order details
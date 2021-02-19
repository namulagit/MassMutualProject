Feature: Calculate the Total balance for the multiple values

Background: User should naviagate to Total Balance page
Given I am at home page Total Balance


Scenario: verify the right count of values appear on the screen
When value1 is not null
Then Value1 field value should be equal to 122365.24
When value2 is not null
Then Value2 field value should be equal to 599.00
When value3 is not null
Then Value3 field value should be equal to 850139.99
When value4 is not null
Then Value4 field value should be equal to 23329.50
When value5 is not null
Then Value5 field value should be equal to 566.27

Scenario: verify the values on the screen are greater than zero
Then Validate All input field values should be greater than 0


Scenario: verify the values are formatted as currencies
Then Validate All field values are formatted as currencies

#/**Seems like Objectives 3 and 5 are looks same ***/
Scenario: verify the total balance matches the sum of the values
Scenario: verify the total balance is correct based on the values listed on the screen
Then Validate total balance matches the sum of the values


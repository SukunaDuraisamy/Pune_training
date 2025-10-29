Feature: Login
@tag1
Scenario: Login with valid credentials
Given Login page is displayed
When User enters valid username and password
When User clicks on login button
Then Product page is displayed
 
@tag2
Scenario Outline: Login with user input
Given The Login page is displayed
When The User enters valid "<username>" and "<password>"
When The User clicks on login button
Then The Product page is displayed 

Examples:
|username|password|
|standard_user|secret_sauce|
|standard_user|secret_sauce1|


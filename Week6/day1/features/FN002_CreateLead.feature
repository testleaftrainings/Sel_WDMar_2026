Feature: Lead Creation in Leaftaps Application

Background: 
# Given I launch the browser
# And I load the application url
And I enter the username as 'democsr'
And I enter the password as 'crmsfa'
When I click login button
Then I should be redirected to the home page
When I click 'CRM/SFA' link
And I click 'Leads' link
And I click 'Create Lead' link


## data-driven testing
Scenario Outline: validating Lead Creation by filling the mandatory fields

Given I enter Company Name as '<CompanyName>'
And I enter First name as '<firstName>'
And I enter Last name as '<lastName>'
When I click Create Lead button
Then I should view The Lead created with the Company

Examples:
|CompanyName|firstName|lastName|
|Qeagle|Bhuvanesh|M|
|Qualitest|Harrish|A|
|TCS|Vineeth|R|


Scenario: validating Lead Creation by without filling the mandatory fields
Given I enter Phone Number as '88657'
When I click Create Lead button
But I should view error message as parameter is missing


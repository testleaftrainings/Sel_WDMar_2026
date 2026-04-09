Feature: Lead Creation in Leaftaps Application

Background: 
Given I enter the username as 'DemoCsr'
And I enter the password as 'crmsfa'
When I click login button
Then I should be redirected to the home page
When I click CRM/SFA link
And I click Leads link
And I click Create Lead link


## data-driven testing
@BN1123@Regression@Positive
Scenario Outline: validating Lead Creation by filling the mandatory fields

Given I enter Company Name as '<companyName>'
And I enter First name as '<firstName>'
And I enter Last name as '<lastName>'
When I click Create Lead button
Then I should view The Lead created with the Company as '<verifyCompany>'

Examples:
|companyName|firstName|lastName|verifyCompany|
|Qeagle|Bhuvanesh|M|Qeagle|
|Qualitest|Harrish|A|Qualitest|


@Negative
Scenario: validating Lead Creation by without filling the mandatory fields
Given I enter Phone Number as '98763'
When I click Create Lead button
But I should view error message as parameter is missing


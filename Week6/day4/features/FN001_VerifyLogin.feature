Feature: User Authentication in Leaftaps Application

@Smoke
Scenario: validating the Leaftaps Application by providing the valid user credentials

Given I enter the username as 'DemoCsr'
And I enter the password as 'crmsfa'
When I click login button
Then I should be redirected to the home page
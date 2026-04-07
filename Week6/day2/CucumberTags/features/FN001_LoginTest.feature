Feature: User Authentication in Leaftaps Application

@Smoke
Scenario: validating the Leaftaps Application by providing the valid user credentials

# Given I launch the browser
# Given I load the application url
Given I enter the username as 'demosalesmanager'
Given I enter the password as 'crmsfa'
When I click login button
Then I should be redirected to the home page
 Feature: validate login funcitons
 
Scenario Outline: login should be fails

Given User should navigate to appication
And User enter the username as "<username>"
And user enter the password as "<password>"
When User click on the login button
But Login not successful

Examples: 
      | username | password |
      | keerthi  | sri2345  |
      |jvasan    | ugytf    |
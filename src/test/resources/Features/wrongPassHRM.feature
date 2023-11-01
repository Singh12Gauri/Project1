Feature: HRM Login with Invaild cridential

Scenario: Login Orange HRM with Invaild cridential 

Given User is on orangeHRM login page
When User enter valid Username and Wrong Password
And User cand click on the Login button
Then User shoud get the error message 

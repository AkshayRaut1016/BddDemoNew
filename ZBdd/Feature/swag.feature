Feature: Swag application login validation

@smoke
 Scenario Outline: login validation

Given : user opens the browser 
And   : hits the url "https://www.saucedemo.com/"
When  : Enter the valid name "<name>"
And   : Enter the valid pass "<pass>"
And   : click on submit
Then  : user must be able to logged in 
 
 Examples: 
 |name         |pass|
 |standard_user|secret_sauce|
 
 
 
 
 
 
 
 
 
 
 
 
 


## |standard_user|secret_sauce|
 ##|problem_user  | secret_sauce|
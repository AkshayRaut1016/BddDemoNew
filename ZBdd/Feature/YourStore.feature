
 Feature: Your store app
 
 @smoke 
 Scenario Outline:  validating the login functionality with valid username and pass
 Given :  user opens the browser 
 And   : hits the url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F%22"
 Then  : Enters the valid username "<name>" 
 And   : Enters the valid password  "<pass>"
 And   : Clicks on login 
 Then  : user must be able to logged in to the application
 
 Examples: 
         |name| pass|
         |admin@yourstore.com|admin|
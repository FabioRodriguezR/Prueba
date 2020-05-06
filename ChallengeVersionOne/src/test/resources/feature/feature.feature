#Author: fabiojrodriguez@outlook.com


Feature: Login
I as a user of the application
I want to access the application with my username and password
To make a purchase

@SuccessfulLogin
Scenario: Successful login
Given that the User want do login in the application
When he enter credentials
| User              | Password      | Answear |
| opensourcecms     | opensourcecms | TRUE    |
Then he must access the homepage
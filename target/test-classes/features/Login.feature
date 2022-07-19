Feature: Login into application

Scenario Outline: Positive test validating login
Given Initiate the browser with chrome
And Navigate to "http://qaclickacademy.com" site
And Click on login link in home page to land on secure sign in page
When User enters <username> and <password> and logs in
Then verify that user is successfully logged in

Examples:
|username	|password	|
|test99@gmail.com	|123456	|
|akhhsk@khkhf	|186868	|
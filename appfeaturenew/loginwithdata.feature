Feature:Login with  data functionality
Scenario:Login with valid credentials
Given user should be login page
When user enters username as "Test"
And user enters password as "Test@123"
And user clicks on submit button
Then User logged into the application
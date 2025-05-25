@campaign
Feature:Sending email campaign
@sanity
Scenario:Create campaign

Given  user should be at campaign page
When user clciks on create campaign button
 And user enters the deatils
 Then campaign should get created
 
 @Regression
 Scenario:Update the details
 Given  user should be at campaign page
 When user clicks on update button
 And user update the information
 Then updated the information
 
 
 @Performance
 Scenario:delete campaign													
 
 Given user should be at campaign page
 When user clicks on delete button
 Then campaign should get deleted
 


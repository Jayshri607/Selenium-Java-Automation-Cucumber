Feature:Signup functionaliy

Background:
Given I have logged inn application 
And I am at home 
Scenario Outline:Signup to applicaion
Given user in signup page
When user enters name as "<name>" on form
And User select gender as "<gender>"
And user select slot number as <slot>
Then user gets created


Examples:
|name|gender|slot|
|Jay|Female|100|
|Vishal|Male|420|
|Shaswat|Male|143|
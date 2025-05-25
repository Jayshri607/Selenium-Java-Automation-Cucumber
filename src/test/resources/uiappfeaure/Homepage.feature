Feature: Homepage functionality
Scenario: validation of title of page
Given I am at the landing page
Then page title should contains "Shopping"

Scenario: verify cart icon
Given I am at the landing page
Then cart icon should get display

Scenario: checkout the laptop section
Given I am at the landing page
When I click on laptop section
Then grocery section should open

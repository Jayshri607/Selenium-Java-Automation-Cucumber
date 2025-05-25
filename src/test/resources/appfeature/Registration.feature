Feature: Opening bank account
Scenario: Opening bank account with nominee
Given user is at the accounts page
When user enters the following data
| Maya| Bankar | mbankar@gmail.com | 9988776655 |
| Shaswat | Bankar | Shaswatb@gmail.com | 9876543210 |
| Bapu| shiraskar| shiraskarb@gmail.com | 9999999999 |
| Kanchan | Shiraskar | Kshiraskar@gmail.com | 993534346346 |
And user clicks on submit button
Then user should get confirmation

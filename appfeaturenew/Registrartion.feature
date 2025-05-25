Feature:Opening bank account
Scenario:Opning bank account with nominee
Given User in account page
When User enter following details

|Firstname|Lastname|email|Phone|
|Erin|Smith|erins@gmail.com|7788114455|
|Shreyash|Iyer|shreysh143@gmail.com|9922114422|

And user clciks on submit button
Then User should get confirmation
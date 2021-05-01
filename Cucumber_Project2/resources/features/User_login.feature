Feature: Facebook login page
Scenario: Verifying login with valid data
		
		Given site url at chrome browser
		When user enter valid username and valid password
		And click on Sign in button
		Then Account Page should be Displayed
		
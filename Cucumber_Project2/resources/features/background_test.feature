Feature: Email communication
	Background:
			Given gmail homepage
			And login into account
			And Search email
	Scenario: Verifying Reply functionality
		When user click on reply button
		Then verify reply screen displayed
		
	Scenario: Verifying Forward functionality
		When user click on forward button
		Then verify forward screen displayed
		
	Scenario: Verifying delete functionality
		When user click on delete button
		Then verify email deleced option shoudl display
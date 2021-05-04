Feature:  Registration
Scenario: Successful Reg with Valid Credentials
 
 	Given outlook site url
 	And  click Create Account button
 	When user type username "Sunil" and password as "9030248855"
 	And Check Remember my username and password checkbox
 	And  click Create account button
 	Then display message "account crated"
 	But error message starts with "account" characters
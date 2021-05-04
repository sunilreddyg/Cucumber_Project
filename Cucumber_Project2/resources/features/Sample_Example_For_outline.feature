Feature:  Checking Outline scenario

#outline repeate all tests with multiple set of data
Scenario Outline:
		Given  url at browser window
		When  user type "<username>" and "<password>"
		Then  error messaage displayed
		
Examples:

		| username  |  password |
		| sunil     |  sunil123 |
		| pranil    |  prd123   |
		| kishan    |  Krt123   |
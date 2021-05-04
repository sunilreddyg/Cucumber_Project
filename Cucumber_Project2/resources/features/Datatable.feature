Feature:  group user search

# Datatable execute only selected step with multiple set of data
Scenario: UserSearch for Details
 Given user navigate to homepage
 When User completed login
 And user click search records
 And User enters Credentials to search
   | Username   | Password |
	    | Arjun | 1111111 |
	    | Akash | 2222222 |
	    | Ajay  | 3333333 |
 Then Record display at result window

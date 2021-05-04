Feature: Login Action

#outline repeat your total steps with multiple set of data
Scenario Outline: Successful Login with Valid Credentials
	Given Account User is on Home Page
	When User Navigate to Account LogIn Page
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully
Examples:
    | username   | password |
    | sunilreddy | Mindq123 |
    | Akshay1111 | Dq123456 |
    | Akshay2222 | Dq123411 |
    | Akshay1333 | HQ123hyf |
    | harshs	 | Hr123@12 |
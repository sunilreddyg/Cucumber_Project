Feature: Test with Cucumber Taged Hooks
	
	
		@First
		Scenario: My first scenario
				Given First step
				When Second step
				Then third step
		
		@Third	
		Scenario: My second scenario
				Given First step
				When Second step
				Then third step
				
		@Second		
		Scenario: My third scenario
				Given First step
				When Second step
				Then third step
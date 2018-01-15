Feature: github login

  #Scenario: login without username and password
    #Given user is on github homepage
    #When user clicks on Sign in button
    #Then user is displayed login screen
    
	Scenario: sign up form 
	  Given user is on github homepage for signup
	  When user fills sign up form
	  Then browser_teardown      
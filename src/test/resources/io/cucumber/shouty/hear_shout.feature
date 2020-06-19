Feature:hear shout
	Scenario:Listener is within range
		Given Lucy is located within 15 metres from Sean
		 When Sean shouts "Free bagels at Sean's"
		 Then Lucy should hear Sean's message
		
	Scenario:Listener hears a different message
		Given Lucy is located within 15 metres from Sean
		 When Sean shouts "Free Coffee!"
		 Then Lucy should hear Sean's message
				
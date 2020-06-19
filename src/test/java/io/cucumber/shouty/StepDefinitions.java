package io.cucumber.shouty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import static java.util.Arrays.*;


public class StepDefinitions {

	Person lucy;
	Person sean;
	String messageFromSean;
	
	@Given("{person} is located within {int} metre(s) from Sean")
	public void lucy_is_located_within_metres_from_Sean(Person lucy,Integer distance) {
//		lucy = new Person();
		this.lucy = lucy;
		sean = new Person();
		lucy.moveTo(distance);
	}

	@When("Sean shouts {string}")
	public void sean_shouts(String message) {
		sean.shout(message);
		lucy.messageHeard(message);
		messageFromSean=message;
	}

	@Then("Lucy should hear Sean's message")
	public void lucy_should_hear_Sean_s_message() {
		assertEquals(asList(messageFromSean),lucy.getMessagesHeard());
	}
	
}

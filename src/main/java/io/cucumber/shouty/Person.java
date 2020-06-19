package io.cucumber.shouty;

import java.util.ArrayList;

public class Person {

	private String name;

	private ArrayList<String> messagesHeard= new ArrayList<String>();

	public Person() {
		
	}
	public Person(String name) {
		this.name=name;
	}

	public void moveTo(Integer distance) {

	}

	public void shout(String message) {

	}

	public void messageHeard(String message) {
		messagesHeard.add(message);
	}

	public Object getMessagesHeard() {
		return messagesHeard;
	}

}

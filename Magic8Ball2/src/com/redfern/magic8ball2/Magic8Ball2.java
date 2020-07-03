package com.redfern.magic8ball2;

import java.util.ArrayList;
import java.util.List;

public class Magic8Ball2 { //POJO - Plain Ole Java Object
	
	private String question;
	private List<String> answers; //A type of Java Collections

	public Magic8Ball2() {
		this.question = null;
		answers = new ArrayList<String>();
		answers.add("As I see it yes.");
		answers.add("Ask again later.");
		answers.add("Yes.");
		answers.add("No.");
	}

	public String getQuestion() {
		return this.question;
	}

	public boolean askQuestion(String question) {
		if(question instanceof String) {
			this.question = question;
			return true;
		}
		else {
			return false;
		}
	}

	public String shake() {
		//Return a random element from the list.
		//???? Use Random class to create random number
		//???? Use random number to get element from ArrayList
		return "Ask again later.";
	}
}

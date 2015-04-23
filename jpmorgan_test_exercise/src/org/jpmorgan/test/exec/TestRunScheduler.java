package org.jpmorgan.test.exec;

import org.jpmorgan.test.impl.*;

public class TestRunScheduler {

	public static void main(String[] args) {
		SimpleMessage[] messages = {
				(SimpleMessage) MessageFactory.generateMessage(1),
				(SimpleMessage) MessageFactory.generateMessage(2),
				(SimpleMessage) MessageFactory.generateMessage(1),
				(SimpleMessage) MessageFactory.generateMessage(4),
				(SimpleMessage) MessageFactory.generateMessage(3),
				(SimpleMessage) MessageFactory.generateMessage(1),
				(SimpleMessage) MessageFactory.generateMessage(1),
				(SimpleMessage) MessageFactory.generateMessage(1),
				(SimpleMessage) MessageFactory.generateMessage(3),
				(SimpleMessage) MessageFactory.generateMessage(2),
				(SimpleMessage) MessageFactory.generateMessage(3),
				(SimpleMessage) MessageFactory.generateMessage(1),
				(SimpleMessage) MessageFactory.generateMessage(2),
				(SimpleMessage) MessageFactory.generateMessage(3),
				(SimpleMessage) MessageFactory.generateMessage(1),
				(SimpleMessage) MessageFactory.generateMessage(1),
				(SimpleMessage) MessageFactory.generateMessage(1),
				(SimpleMessage) MessageFactory.generateMessage(3),
				(SimpleMessage) MessageFactory.generateMessage(1),
				(SimpleMessage) MessageFactory.generateMessage(1),
				(SimpleMessage) MessageFactory.generateMessage(2),
				(SimpleMessage) MessageFactory.generateMessage(3),
		};
		
		SimpleResourceScheduler resScheduler = new SimpleResourceScheduler();

	}

}

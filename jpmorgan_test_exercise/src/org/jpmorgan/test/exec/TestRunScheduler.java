package org.jpmorgan.test.exec;

import org.jpmorgan.test.impl.*;

public class TestRunScheduler {

	public static void main(String[] args) {
		
		// Create a sample array of SimpleMessage objects
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
		
		// Start by adding the available resources
		SimpleResource res1 = new SimpleResource("Resource 1", 1);
		SimpleResource res2 = new SimpleResource("Resource 2", 2);
		resScheduler.addResource(res1);
		resScheduler.addResource(res2);
		
		// Add the messages to be processed
		resScheduler.addMessagesToProcess(messages);
		
		
	}

}

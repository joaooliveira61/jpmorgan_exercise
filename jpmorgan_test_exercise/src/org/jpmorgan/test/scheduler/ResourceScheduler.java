package org.jpmorgan.test.scheduler;

import java.util.Stack;

import org.jpmorgan.test.interfaces.Message;

public abstract class ResourceScheduler {

	// Stack queue for incoming messages
	private Stack<Message> waitingQueue = new Stack<Message>();
	
	// Process messages
	public abstract void processMessage(Message[] messages);
	
	
}

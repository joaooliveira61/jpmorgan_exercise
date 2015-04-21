package org.jpmorgan.test.interfaces;

/**
 * Abstract factory used to generate Messages
 * 
 * @author João Oliveira
 *
 */
public abstract class MessageFactory {

	// Generates a new Message 
	public abstract Message generateMessage(String messageTitle, String messageText,
			int messageGroup);
	
}

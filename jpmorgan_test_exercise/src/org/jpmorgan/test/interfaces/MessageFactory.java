package org.jpmorgan.test.interfaces;

/**
 * Abstract factory used to generate Messages
 * 
 * @author Jo�o Oliveira
 *
 */
public abstract class MessageFactory {

	// Generates a new Message 
	public abstract Message generateMessage(String messageTitle, String messageText,
			int messageGroup);
	
}

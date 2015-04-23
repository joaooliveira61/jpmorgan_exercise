package org.jpmorgan.test.impl;

import org.jpmorgan.test.interfaces.Message;

/**
 * Factory used to generate SimpleMessage objects
 * 
 * @author João Oliveira
 *
 */
public class MessageFactory {

	// Generates a new Message for three different groups
	public static Message generateMessage(int messageGroup) {

		switch (messageGroup) {
		case 1:
		default:
			return new SimpleMessage("Message - Group 1", "Text 1", messageGroup);
			
		case 2:
			return new SimpleMessage("Message - Group 2", "Text 2", messageGroup);
			
		case 3:
			return new SimpleMessage("Message - Group 3", "Text 3", messageGroup);
		}
	}

}

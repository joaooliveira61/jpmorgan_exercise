package org.jpmorgan.test.impl;

import org.jpmorgan.test.interfaces.*;

/**
 * Simple message implementation for testing purposes
 * @author João Oliveira
 *
 */
public class SimpleMessage extends Message {

	private boolean isCompleted = false;
	
	public SimpleMessage(String messageTitle, String messageText,
			int messageGroup) {
		super(messageTitle, messageText, messageGroup);
	}

	@Override
	public void completed() {
		this.isCompleted = true;
	}

	@Override
	public boolean isCompleted() {
		return this.isCompleted;
	}

}

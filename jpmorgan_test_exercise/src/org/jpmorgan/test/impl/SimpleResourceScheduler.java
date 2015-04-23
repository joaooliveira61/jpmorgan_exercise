package org.jpmorgan.test.impl;

import org.jpmorgan.test.interfaces.Message;
import org.jpmorgan.test.scheduler.ResourceScheduler;

public class SimpleResourceScheduler extends ResourceScheduler {

	@Override
	public void addMessagesToProcess(Message[] messages) {
		SimpleResource r = null;
		
		for (int i = 0; i < messages.length; i++) {
			if ((r = (SimpleResource) getAvailableResource()) != null) {
				r.startProcessing(messages[i]);
			} else {
				addMessageToWaitingList(messages[i]);
			}
		}
	}

	@Override
	public void sortMessageQueue() {
		// TODO Auto-generated method stub
		
	}

}

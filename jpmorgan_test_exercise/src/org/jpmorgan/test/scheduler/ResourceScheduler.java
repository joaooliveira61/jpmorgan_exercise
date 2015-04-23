package org.jpmorgan.test.scheduler;

import java.util.ArrayList;
import java.util.LinkedList;

import org.jpmorgan.test.interfaces.Message;
import org.jpmorgan.test.interfaces.Resource;

public abstract class ResourceScheduler {

	// Array list for messages waiting processing
	private ArrayList<Message> waitingList = new ArrayList<Message>();
	// Array list for the resources available to the scheduler
	private ArrayList<Resource> resourceList = new ArrayList<Resource>();
	
	/* 
	 * Send the messages to the gateway or store them if the
	 * gateway is not yet available
	 */
	public abstract void processMessage(Message[] messages);
	
	// Sort the message queue by message group id
	public abstract void sortMessageQueue();
	
	// Get the size of the waiting list
	public int getWaitingListSize() {
		return this.waitingList.size();
	}
	
	// Get the first available resource
	public Resource getAvailableResource() {
		
		for (Resource r : resourceList) {
			if (r.isResourceAvailable())
				return r;
		}
		
		return null;
		
	}
	
}

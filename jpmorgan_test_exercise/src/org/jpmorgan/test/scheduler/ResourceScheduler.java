package org.jpmorgan.test.scheduler;

import java.util.ArrayList;

import org.jpmorgan.test.interfaces.Gateway;
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
	public abstract void addMessagesToProcess(Message[] messages);

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

	// Add a resource to the list
	public boolean addResource(Resource res) {
		return resourceList.add(res);
	}

	// Remove a resource from the list
	public boolean removeResource(Resource res) {
		return resourceList.remove(res);
	}

	// Add a message to the list
	public boolean addMessageToWaitingList(Message msg) {
		return waitingList.add(msg);
	}

	// Remove a message from the list
	public boolean removeMessageFromWaitingList(Message msg) {
		return waitingList.remove(msg);
	}

}

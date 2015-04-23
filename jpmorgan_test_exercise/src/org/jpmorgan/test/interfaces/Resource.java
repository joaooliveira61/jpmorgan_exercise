package org.jpmorgan.test.interfaces;

public abstract class Resource {

	private String resourceName;
	private int resourceId;
	private boolean isResourceAvailable;
	
	public Resource(String resourceName, int resourceId) {
		this.resourceId = resourceId;
		this.resourceName = resourceName;
		// When the resource is created, it's available for processing
		this.isResourceAvailable = true;
	}
	
	
	// Returns true if the resource is available to process messages
	public abstract boolean isResourceAvailable();
	
	// Starts processing a message with the resource
	public abstract void startProcessing(Message msg);
	
	// Ends processing a message with the resource
	public abstract void endProcessing(Message msg);
}

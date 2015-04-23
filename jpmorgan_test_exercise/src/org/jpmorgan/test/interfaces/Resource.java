package org.jpmorgan.test.interfaces;

public abstract class Resource {

	private String resourceName;
	private int resourceId;
	
	public Resource(String resourceName, int resourceId) {
		this.setResourceId(resourceId);
		this.setResourceName(resourceName);
	}
	
	// Returns true if the resource is available to process messages
	public abstract boolean isResourceAvailable();
	
	// Starts processing a message with the resource
	public abstract void startProcessing(Message msg);
	
	// Ends processing a message with the resource
	public abstract void endProcessing(Message msg);

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
	
}

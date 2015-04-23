package org.jpmorgan.test.impl;

import org.jpmorgan.test.interfaces.Message;
import org.jpmorgan.test.interfaces.Resource;

/**
 * Simple resource implementation for testing purposes
 * @author João Oliveira
 *
 */
public class SimpleResource extends Resource {
	
	private boolean isResourceAvailable = true;

	public SimpleResource(String resourceName, int resourceId) {
		super(resourceName, resourceId);
		isResourceAvailable = true;
	}

	@Override
	public boolean isResourceAvailable() {
		return this.isResourceAvailable;
	}

	@Override
	public void startProcessing(Message msg) {
		this.isResourceAvailable = false;
	}

	@Override
	public void endProcessing(Message msg) {
		this.isResourceAvailable = true;
	}

}

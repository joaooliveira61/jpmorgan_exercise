package org.jpmorgan.test.interfaces;

public abstract class Message {
	
	private final String DEFAULT_MESSAGE_TITLE = "Default Message Title";
	private final String DEFAULT_MESSAGE_TEXT = "Default Message Text";
	private final int DEFAULT_MESSAGE_GROUP = 1;
	
	private String messageTitle;
	private String messageText;
	private int messageGroup;
	
	public Message(String messageTitle, String messageText, int messageGroup) {
		
		setMessageTitle(messageTitle);
		setMessageText(messageText);
		setMessageGroupId(messageGroup);
		
	}
	
	// Method triggered when the processing is completed
	public abstract void completed();
	
	// Method to check the status of the message processing
	public abstract boolean isCompleted();
	
	// Sets the message title, null validation included
	public void setMessageTitle(String messageTitle) {
		if (messageTitle == null)
			this.messageTitle = DEFAULT_MESSAGE_TITLE;
		else
			this.messageTitle = messageTitle;
	}
	
	// Sets the message text, null validation included
	public void setMessageText(String messageText) {
		if (messageText == null)
			this.messageText = DEFAULT_MESSAGE_TEXT;
		else
			this.messageText = messageText;
	}
	
	// Sets the groupId for the message, checks if the value is greater than zero
	public void setMessageGroupId(int groupId) {
		if (groupId < 0)
			this.messageGroup = DEFAULT_MESSAGE_GROUP;
		else
			this.messageGroup = groupId;
	}

	// Message title getter
	public String getMessageTitle() {
		return messageTitle;
	}

	// Message text getter
	public String getMessageText() {
		return messageText;
	}

	// Message group getter
	public int getMessageGroup() {
		return messageGroup;
	}
	
	
	
}

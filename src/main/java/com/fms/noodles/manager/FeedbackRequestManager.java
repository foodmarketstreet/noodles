package com.fms.noodles.manager;

public interface FeedbackRequestManager {

	/**
	 * This method will trigger feedback request to the user 
	 * based on the form selected.Feedback should be sent based on 
	 * form configuration email or SMS or both.
	 * */
	void sendFeedbackRequest();
	
	void sendSMS();
	
	void sendEmail();
}

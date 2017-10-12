package com.fms.noodles.manager;

public interface FeedbackResponseManager {

	/**
	 * This method should return requested form related questions.
	 * 
	 * */
	void showForm();
	
	/**
	 * This method will persist feedback response.
	 * */
	void persistResponse();
	
	void getFormResponseCount();
	
	void getAllFormResponses();
}

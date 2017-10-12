package com.fms.noodles.model;

import java.util.List;

import com.fms.noodles.util.Status;

public class Form {

	private Long id;
	
	private String code;
	
	private List<Field> fields;
	
	private boolean sendSMS;
	
	private boolean sendEmail;
	
	private Status status;
	
}

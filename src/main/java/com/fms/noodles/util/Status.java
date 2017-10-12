package com.fms.noodles.util;

public enum Status {

	Active("A"),Disabled("D");
	private String status;
	
	private Status(String status) {
		this.status = status;
	}

	public String getStatus(){
		return this.status;
	}
}

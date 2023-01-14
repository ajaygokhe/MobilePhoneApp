package com.BikkadIt.PhoneBookApp.exception;

public class ApiResponse {

	String massage;
	
	boolean status;
	

	public String getMassage() {
		return massage;
	}



	public void setMassage(String massage) {
		this.massage = massage;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "ApiResponse [massage=" + massage + ", status=" + status + "]";
	}



	public ApiResponse(String massage, boolean status) {
		super();
		this.massage = massage;
		this.status = status;
	}

	
	
	
	
}

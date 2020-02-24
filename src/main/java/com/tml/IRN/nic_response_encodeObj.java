package com.tml.IRN;

public class nic_response_encodeObj {
	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public String getErrorDetails() {
		return ErrorDetails;
	}
	public void setErrorDetails(String errorDetails) {
		ErrorDetails = errorDetails;
	}
	String Status;
	String Data;
	String ErrorDetails;

}

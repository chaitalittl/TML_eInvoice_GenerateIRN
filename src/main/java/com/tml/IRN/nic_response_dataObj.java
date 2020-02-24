package com.tml.IRN;

public class nic_response_dataObj {
	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getAckNo() {
		return AckNo;
	}
	public void setAckNo(String ackNo) {
		AckNo = ackNo;
	}
	public String getAckDt() {
		return AckDt;
	}
	public void setAckDt(String ackDt) {
		AckDt = ackDt;
	}
	public String getIrn() {
		return Irn;
	}
	public void setIrn(String irn) {
		Irn = irn;
	}
	public String getSignedQRCode() {
		return SignedQRCode;
	}
	public void setSignedQRCode(String signedQRCode) {
		SignedQRCode = signedQRCode;
	}
	public String getSignedInvoice() {
		return SignedInvoice;
	}
	public void setSignedInvoice(String signedInvoice) {
		SignedInvoice = signedInvoice;
	}
	String Status;
	String AckNo;
	String AckDt;
	String Irn;
	String SignedQRCode;
	String SignedInvoice;


}

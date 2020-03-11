package com.tml.IRN;

import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.XmlType;

import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.ArrayList;
import java.util.List;

import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlType(name = "IRNInputResponse")

@XmlRootElement(name = "IRNInputResponse")

public class IRNInputResponse {
	
	String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getReport_url() {
		return report_url;
	}
	public void setReport_url(String report_url) {
		this.report_url = report_url;
	}
	public String getIrnstatus() {
		return irnstatus;
	}
	public void setIrnstatus(String irnstatus) {
		this.irnstatus = irnstatus;
	}
	public String getAckDt() {
		return ackDt;
	}
	public void setAckDt(String ackDt) {
		this.ackDt = ackDt;
	}
	public String getAckNo() {
		return ackNo;
	}
	public void setAckNo(String ackNo) {
		this.ackNo = ackNo;
	}
	public String getIrn() {
		return irn;
	}
	public void setIrn(String irn) {
		this.irn = irn;
	}
	public String getSignedInvoice() {
		return signedInvoice;
	}
	public void setSignedInvoice(String signedInvoice) {
		this.signedInvoice = signedInvoice;
	}
	public String getSignedQRCode() {
		return signedQRCode;
	}
	public void setSignedQRCode(String signedQRCode) {
		this.signedQRCode = signedQRCode;
	}
	String message;
	String report_url;
	String irnstatus;
	String ackDt;
	String ackNo;
	String irn;
	String signedInvoice;
	String signedQRCode;
	
	//Validation_remarks Validation_remarksObject;
	
	/*@XmlElement(name="Validation_remarks")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<Validation_remarks> Validation_remarks ;*/
	
	/*public Validation_remarks getValidation_remarksObject() {
		return Validation_remarksObject;
	}
	public void setValidation_remarksObject(Validation_remarks validation_remarksObject) {
		Validation_remarksObject = validation_remarksObject;
	}*/
	public String getstatus() {
		return status;
	}
	public void setInvoice_number(String status) {
		this.status = status;
	}
	
	 
}

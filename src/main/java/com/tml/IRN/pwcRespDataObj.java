package com.tml.IRN;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonFormat;


@XmlType(name = "pwcRespDataObj") 

@XmlRootElement(name = "pwcRespDataObj")

public class pwcRespDataObj {
	
	public String getInvoice_number() {
		return invoice_number;
	}
	public void setInvoice_number(String invoice_number) {
		this.invoice_number = invoice_number;
	}
	/*public String getGstin() {
		return gstin;
	}
	public void setGstin(String gstin) {
		this.gstin = gstin;
	}
	public String getDocument_date() {
		return document_date;
	}
	public void setDocument_date(String document_date) {
		this.document_date = document_date;
	}
	public String getDocument_type() {
		return document_type;
	}
	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}*/
	/*public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}*/
	/*public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getValidation_status() {
		return validation_status;
	}
	public void setValidation_status(String validation_status) {
		this.validation_status = validation_status;
	}
	public String getUdid() {
		return udid;
	}
	public void setUdid(String udid) {
		this.udid = udid;
	}
	public String getIs_irn() {
		return is_irn;
	}
	public void setIs_irn(String is_irn) {
		this.is_irn = is_irn;
	}
	public String getIs_exclude() {
		return is_exclude;
	}
	public void setIs_exclude(String is_exclude) {
		this.is_exclude = is_exclude;
	}
	public String getLoad_id() {
		return load_id;
	}
	public void setLoad_id(String load_id) {
		this.load_id = load_id;
	}
	public String getIs_ewb() {
		return is_ewb;
	}
	public void setIs_ewb(String is_ewb) {
		this.is_ewb = is_ewb;
	}*/
	String invoice_number;
	/*String gstin;
	String document_date;
	String document_type;*/
	//String status;
	/*String message;
	String validation_status;
	
	String udid;
	String is_irn;
	String is_exclude;
	String load_id;
	String is_ewb;*/
	
	/*@XmlElement(name="validation_remarks")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<validation_remarksObj> validation_remarks ;*/
	
	/*public ArrayList<validation_remarksObj>[] getValidation_remarks() {
		return validation_remarks;
	}

	public void setValidation_remarks(ArrayList<validation_remarksObj>[] validation_remarks) {
		this.validation_remarks = validation_remarks;
	}

	@XmlElement(name="validation_remarks")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected ArrayList<validation_remarksObj>[] validation_remarks ;*/
	
	

}

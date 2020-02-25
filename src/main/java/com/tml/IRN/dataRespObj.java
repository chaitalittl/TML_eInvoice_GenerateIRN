package com.tml.IRN;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonFormat;

@XmlType(name = "dataRespObj") 

@XmlRootElement(name = "dataRespObj")

public class dataRespObj {
	

	
	@XmlElement(name="nic_response_data")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<nic_response_dataObj> nic_response_data ;
	
	/*@XmlElement(name="nic_response_encoded")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<nic_response_encodeObj> nic_response_encoded ;*/
	

	
	/*@XmlElement(name="nic_request_payload")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)*/
	
	
	String report_url;
	String nic_document_status_created_date;
	String nic_response_status;
	String nic_status;
	String nic_gen_mode;
	String nic_response_created_date;
	
	public String getReport_url() {
		return report_url;
	}

	public void setReport_url(String report_url) {
		this.report_url = report_url;
	}

	public String getNic_document_status_created_date() {
		return nic_document_status_created_date;
	}

	public void setNic_document_status_created_date(String nic_document_status_created_date) {
		this.nic_document_status_created_date = nic_document_status_created_date;
	}

	public String getNic_response_status() {
		return nic_response_status;
	}

	public void setNic_response_status(String nic_response_status) {
		this.nic_response_status = nic_response_status;
	}

	public String getNic_status() {
		return nic_status;
	}

	public void setNic_status(String nic_status) {
		this.nic_status = nic_status;
	}

	public String getNic_gen_mode() {
		return nic_gen_mode;
	}

	public void setNic_gen_mode(String nic_gen_mode) {
		this.nic_gen_mode = nic_gen_mode;
	}

	public String getNic_response_created_date() {
		return nic_response_created_date;
	}

	public void setNic_response_created_date(String nic_response_created_date) {
		this.nic_response_created_date = nic_response_created_date;
	}


	
	/*@XmlElement(name="nic_response_plaintext_json")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<nic_response_plaintextObj> nic_response_plaintext_json ;

	@XmlElement(name="nic_request_header")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<nic_request_headerObj> nic_request_header ;
	
	@XmlElement(name="qr_image")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<qr_imageObj> qr_image ;*/
	
	
	
	
}

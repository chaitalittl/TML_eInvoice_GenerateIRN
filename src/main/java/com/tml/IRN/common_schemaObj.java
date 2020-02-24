package com.tml.IRN;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "common_schemaObj") 

@XmlRootElement(name = "common_schemaObj")

public class common_schemaObj {
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getField_name() {
		return field_name;
	}
	public void setField_name(String field_name) {
		this.field_name = field_name;
	}
	public String getValidation_status() {
		return validation_status;
	}
	public void setValidation_status(String validation_status) {
		this.validation_status = validation_status;
	}
	String remark;
	String field_name;
	String validation_status;

}

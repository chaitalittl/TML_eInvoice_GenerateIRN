package com.tml.IRN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@XmlAccessorType( XmlAccessType.FIELD )
@JsonNaming(UpperCamelCaseStrategy.class)
@JsonInclude(Include.NON_NULL)
public class EwbDtlsObj {

	protected String TransId;
	protected int Distance;
	protected String TransName;
	protected String TransMode;
	protected String TransDocNo;
	protected String TransDocDt;
	protected String VehNo;
	protected String VehType;
	
	public String getTransId() {
		return TransId;
	}
	public void setTransId(String transId) {
		TransId = transId;
	}
	public int getDistance() {
		return Distance;
	}
	public void setDistance(int distance) {
		Distance = distance;
	}
	public String getTransName() {
		return TransName;
	}
	public void setTransName(String transName) {
		TransName = transName;
	}
	public String getTransMode() {
		return TransMode;
	}
	public void setTransMode(String transMode) {
		TransMode = transMode;
	}
	public String getTransDocNo() {
		return TransDocNo;
	}
	public void setTransDocNo(String transDocNo) {
		TransDocNo = transDocNo;
	}
	public String getTransDocDt() {
		return TransDocDt;
	}
	public void setTransDocDt(String transDocDt) {
		TransDocDt = transDocDt;
	}
	public String getVehNo() {
		return VehNo;
	}
	public void setVehNo(String vehNo) {
		VehNo = vehNo;
	}
	public String getVehType() {
		return VehType;
	}
	public void setVehType(String vehType) {
		VehType = vehType;
	}
}

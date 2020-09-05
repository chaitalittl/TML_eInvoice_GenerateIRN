package com.tml.IRN;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType( XmlAccessType.FIELD )
public class EwbDtlsObj {

	protected String TransId;
	protected int Distance;
	protected String TransName;
	protected String TransMode;
	protected String TransDocNo;
	protected Date TransDocDt;
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
	public Date getTransDocDt() {
		return TransDocDt;
	}
	public void setTransDocDt(Date transDocDt) {
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
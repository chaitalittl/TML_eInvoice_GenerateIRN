package com.tml.IRN;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@XmlAccessorType( XmlAccessType.FIELD )
@JsonNaming(UpperCamelCaseStrategy.class)
public class ContrDtlsObj {

	protected String RecAdvRefr;
	protected Date RecAdvDt;
	protected String TendRefr;
	protected String ContrRefr;
	protected String ExtRefr;
	protected String ProjRefr;
	protected String PORefr;
	protected Date PORefDt;
	
	public String getRecAdvRefr() {
		return RecAdvRefr;
	}
	public void setRecAdvRefr(String recAdvRefr) {
		RecAdvRefr = recAdvRefr;
	}
	public Date getRecAdvDt() {
		return RecAdvDt;
	}
	public void setRecAdvDt(Date recAdvDt) {
		RecAdvDt = recAdvDt;
	}
	public String getTendRefr() {
		return TendRefr;
	}
	public void setTendRefr(String tendRefr) {
		TendRefr = tendRefr;
	}
	public String getContrRefr() {
		return ContrRefr;
	}
	public void setContrRefr(String contrRefr) {
		ContrRefr = contrRefr;
	}
	public String getExtRefr() {
		return ExtRefr;
	}
	public void setExtRefr(String extRefr) {
		ExtRefr = extRefr;
	}
	public String getProjRefr() {
		return ProjRefr;
	}
	public void setProjRefr(String projRefr) {
		ProjRefr = projRefr;
	}
	public String getPORefr() {
		return PORefr;
	}
	public void setPORefr(String pORefr) {
		PORefr = pORefr;
	}
	public Date getPORefDt() {
		return PORefDt;
	}
	public void setPORefDt(Date pORefDt) {
		PORefDt = pORefDt;
	}
}

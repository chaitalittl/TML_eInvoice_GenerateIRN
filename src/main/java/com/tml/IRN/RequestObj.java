package com.tml.IRN;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType( XmlAccessType.FIELD )
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@XmlRootElement(name="request")
@JsonInclude(Include.NON_NULL)
public class RequestObj {

	@XmlElement(required = true)
	@JsonProperty(value="User_GSTIN")
	@Size(min=15,max=15)
	public String user_GSTIN;
	
	@JsonProperty(value="IRN")
	@Size(min=64,max=64)
	public String irn;
	
	@JsonProperty(value="SourceSystem")
	@Size(min=0,max=250)
	public String sourceSystem;

	public String is_irn;
	public String is_ewb;
	
	@Size(min=0,max=250)
	public String email;
	
	public String getUser_GSTIN() {
		return user_GSTIN;
	}

	public void setUser_GSTIN(String user_GSTIN) {
		user_GSTIN = user_GSTIN;
	}

	public String getIRN() {
		return irn;
	}

	public void setIRN(String iRN) {
		irn = iRN;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		sourceSystem = sourceSystem;
	}

	public String getIs_irn() {
		return is_irn;
	}

	public void setIs_irn(String is_irn) {
		this.is_irn = is_irn;
	}

	public String getIs_ewb() {
		return is_ewb;
	}

	public void setIs_ewb(String is_ewb) {
		this.is_ewb = is_ewb;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@XmlElement(name="TranDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected TranDtlsObj TranDtls ;
	
	@XmlElement(name="DocDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected DocDtlsObj DocDtls ;
	
	@XmlElement(name="SellerDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected SellerDtlsObj SellerDtls ;
	
	@XmlElement(name="BuyerDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected BuyerDtlsObj BuyerDtls ;

	@XmlElement(name="DispDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected DispDtlsObj DispDtls ;
	
	@XmlElement(name="ShipDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected ShipDtlsObj ShipDtls ;
	
	@XmlElement(name="ItemList")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<elementObj> ItemList ;

	@XmlElement(name="ValDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected ValDtlsObj ValDtls ;
	
	@XmlElement(name="PayDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected PayDtlsObj PayDtls ;
	
	@XmlElement(name="RefDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected RefDtlsObj RefDtls ;
	
	@XmlElement(name="AddlDocDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<AddlDocDtlsObj> AddlDocDtls ;
		
	@XmlElement(name="ExpDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected ExpDtlsObj ExpDtls ;
	
	@XmlElement(name="EwbDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected EwbDtlsObj EwbDtls ;
	
	@XmlElement(name="WhtHdrsDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected WhtHdrsDtlsObj WhtHdrsDtls ;
	
	@XmlElement(name="MisColumns")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected MisColumnsObj MisColumns ;
	
	@XmlElement(name="FuColumns")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected FuColumnsObj FuColumns ;

}

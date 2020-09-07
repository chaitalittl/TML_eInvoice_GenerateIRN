package com.tml.IRN;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@XmlAccessorType( XmlAccessType.FIELD )
@JsonNaming(UpperCamelCaseStrategy.class)
public class WhtHdrsDtlsObj {

	protected String Tan;
	protected String VendorSiteId;
	protected String WhtTransCategory;
	protected String SourceDocType;
	protected String LineDescription;
	protected String DateOfDeduction;
	protected String EntryDate;
	protected String ProjectCode;
	protected String TaxCodeErp;
	protected String Currency;
	protected int ExchangeRate;
	protected String ExchangeType;
	protected String Notification_21_2012;
	protected String CountryRemittance;
	protected String IsGrossedUp;
	
	public String getTan() {
		return Tan;
	}
	public void setTan(String tan) {
		Tan = tan;
	}
	public String getVendorSiteId() {
		return VendorSiteId;
	}
	public void setVendorSiteId(String vendorSiteId) {
		VendorSiteId = vendorSiteId;
	}
	public String getWhtTransCategory() {
		return WhtTransCategory;
	}
	public void setWhtTransCategory(String whtTransCategory) {
		WhtTransCategory = whtTransCategory;
	}
	public String getSourceDocType() {
		return SourceDocType;
	}
	public void setSourceDocType(String sourceDocType) {
		SourceDocType = sourceDocType;
	}
	public String getLineDescription() {
		return LineDescription;
	}
	public void setLineDescription(String lineDescription) {
		LineDescription = lineDescription;
	}
	public String getDateOfDeduction() {
		return DateOfDeduction;
	}
	public void setDateOfDeduction(String dateOfDeduction) {
		DateOfDeduction = dateOfDeduction;
	}
	public String getEntryDate() {
		return EntryDate;
	}
	public void setEntryDate(String entryDate) {
		EntryDate = entryDate;
	}
	public String getProjectCode() {
		return ProjectCode;
	}
	public void setProjectCode(String projectCode) {
		ProjectCode = projectCode;
	}
	public String getTaxCodeErp() {
		return TaxCodeErp;
	}
	public void setTaxCodeErp(String taxCodeErp) {
		TaxCodeErp = taxCodeErp;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public int getExchangeRate() {
		return ExchangeRate;
	}
	public void setExchangeRate(int exchangeRate) {
		ExchangeRate = exchangeRate;
	}
	public String getExchangeType() {
		return ExchangeType;
	}
	public void setExchangeType(String exchangeType) {
		ExchangeType = exchangeType;
	}
	public String getNotification_21_2012() {
		return Notification_21_2012;
	}
	public void setNotification_21_2012(String notification_21_2012) {
		Notification_21_2012 = notification_21_2012;
	}
	public String getCountryRemittance() {
		return CountryRemittance;
	}
	public void setCountryRemittance(String countryRemittance) {
		CountryRemittance = countryRemittance;
	}
	public String getIsGrossedUp() {
		return IsGrossedUp;
	}
	public void setIsGrossedUp(String isGrossedUp) {
		IsGrossedUp = isGrossedUp;
	}
}

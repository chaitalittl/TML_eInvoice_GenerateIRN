package com.tml.IRN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType( XmlAccessType.FIELD )
public class AddlDocDtlsObj {
	protected String Url;
	protected String Docs;
	protected String Info;
	
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public String getDocs() {
		return Docs;
	}
	public void setDocs(String docs) {
		Docs = docs;
	}
	public String getInfo() {
		return Info;
	}
	public void setInfo(String info) {
		Info = info;
	}
}

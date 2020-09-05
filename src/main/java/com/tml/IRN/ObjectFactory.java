package com.tml.IRN;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

	public ObjectFactory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public IRNInput createIRNInput() {
        return new IRNInput();
    }

}

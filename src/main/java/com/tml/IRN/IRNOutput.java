package com.tml.IRN;


import javax.xml.bind.annotation.XmlType;
import org.apache.camel.Exchange;
import javax.xml.bind.annotation.XmlRootElement;

@XmlType(name = "IRNOutput")
@XmlRootElement(name = "IRNOutput")
public class IRNOutput {
	
	IRNInputResponse IR;
    public IRNOutput() {
        this.IR= new IRNInputResponse();
    }
    
    public void response(final Exchange exchange) throws Exception {
        exchange.getOut().setBody((Object)this.IR);
    }    
}

package com.tml.IRN;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static net.logstash.logback.argument.StructuredArguments.*;


public class LogAggregator {
	private static final Logger logger = LoggerFactory.getLogger(LogAggregator.class);

	  public void sourceIp(String message, Exchange exchange){
	    String sourceIp = exchange.getIn().getHeader("X-Forwarded-For", String.class);
	    //logger.info("This is an information message");
	    logger.info("source-ip", value("source-ip",message + sourceIp));		
	  }
	  
	  public void request(String message, Exchange exchange){		
		  logger.info("request", value("request",message + "\n" + exchange.getIn().getBody(String.class)));
	  }
	  
	  public void response(String message, Exchange exchange) {		  
		  logger.info("response", value("response","INVOICE-NO-"+(String)exchange.getIn().getHeader("User_GSTIN",String.class)+","+message + "," + exchange.getIn().getBody(String.class)));
	  }
	  
	  public void responseCode(String message, Exchange exchange) {		  
		  logger.info("responseCode", value("responseCode","INVOICE-NO-"+(String)exchange.getIn().getHeader("User_GSTIN",String.class)));
}
	  public void marshal(String message, Exchange exchange) {
		  logger.info("marshal", value("marshal",message + "\n" + exchange.getIn().getBody(String.class)));
	  }
	  
	  public void unmarshal(String message, Exchange exchange) {
		  logger.info("unmarshal", value("unmarshal",message + "\n" + exchange.getIn().getBody(String.class)));
	  }
	  
	  public void exception(String message, Exchange exchange) {
		  logger.info("exception", value("exception",message + "\n" + exchange.getIn().getBody(String.class)));
	  }

}

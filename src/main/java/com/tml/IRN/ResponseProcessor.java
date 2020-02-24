package com.tml.IRN;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.apache.cxf.message.MessageContentsList;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ResponseProcessor {
		Logger log = Logger.getLogger(ResponseProcessor.class);

	public void process(Exchange exchange) throws Exception {
		try {
			
			//System.out.println("in process");
			Message inMessage = exchange.getIn();
			//System.out.println("in process  1");
			String doc_type = (String) inMessage.getBody(String.class);

			//System.out.println("doc_type process:"+doc_type);
			 
			 	/*
			 	JSONParser parser = new JSONParser();
			 	JSONObject json = (JSONObject) parser.parse(doc_type);*/
			
		doc_type = doc_type.replace("[", "").replace("]", "");
			


			//System.out.println("doc_type :"+doc_type);
			
			inMessage.setBody(doc_type);

		} catch (Exception e) {
			log.error("Exception in process()", e);
		}

	}

}

package com.tml.IRN;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.apache.cxf.message.MessageContentsList;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ResponseProcessor {
		Logger log = Logger.getLogger(ResponseProcessor.class);

	public void process(Exchange exchange) throws Exception {
		try {
			
			System.out.println("in process");
			Message inMessage = exchange.getIn();
			System.out.println("in process  1");
			String doc_type = (String) inMessage.getBody(String.class);

			System.out.println("doc_type process:"+doc_type);
			
			
			 
			int strlen = doc_type.length();
			doc_type = doc_type.substring(1, strlen-1);
			 	/*
			 	JSONParser parser = new JSONParser();
			 	JSONObject json = (JSONObject) parser.parse(doc_type);*/
			//JSONObject jsonObj = new JSONObject();
		//doc_type = doc_type.replace("[", "").replace("]", "");
		//jsonObj.getJSONObject(doc_type).remove("validation_remarks");
		//doc_type = "{\"pwc_response\": {\"invoice_number\": \"E-Invoice94\", \"gstin\": \"24AAAPI3182M002\", \"document_date\": \"2020-01-25\", \"document_type\": \"INV\", \"status\": 704, \"message\": \"PwC Authentication Passed, IRN Receive(Y), EWB Determine(Y), PwC IRN & EWB Schema Validation Failed, PwC Business Validation Not Required\", \"validation_status\": \"Error\",\"udid\": \"24AAAPI3182M0022019-20INVE-Invoice94\", \"is_irn\": \"Y\", \"is_exclude\": \"N\""
				//+ ", \"load_id\": 41577, \"is_ewb\": \"Y\", \"created_date\": \"2020-02-25 14:52:49.767075\"}, \"irp_response\": {}, \"qr_b64_encoded\": \"\","
				//+ "\"validation_remarks\": {\"ie_schema\": {\"remark\": \"'24AAAPI3182M002' is too long\", \"field_name\": \"RefDtls.InvEndDt\", \"validation_status\": \"Error\"}}}";
			System.out.println("doc_type :"+doc_type);
			
			inMessage.setBody(doc_type);

		} catch (Exception e) {
			log.error("Exception in process()", e);
		}

	}
	
	
	public void selectedParamProcess(Exchange exchange) throws Exception {
				try {
					
					Message inMessage = exchange.getIn();
					String pStatus = (String) inMessage.getHeader("status", String.class);
					System.out.println("pStatus :"+pStatus);
					String pMessage = (String) inMessage.getHeader("message", String.class);
					String pAckDt = (String) inMessage.getHeader("ackDt", String.class);
					String pAckNo = (String) inMessage.getHeader("ackNo", String.class);
					String pIrn = (String) inMessage.getHeader("irn", String.class);
					String pSignedInvoice = (String) inMessage.getHeader("signedInvoice", String.class);
					String pSignedQRCode = (String) inMessage.getHeader("signedQRCode", String.class);
					String pIrnstatus = (String) inMessage.getHeader("irnstatus", String.class);
					String preport_url = (String) inMessage.getHeader("report_url", String.class);
				

					/*String finalResponse = "{\"status\":\"" + pStatus + "\",\"message\":\"" + pMessage + "\",\"ackDt\":\""
							+ pAckDt + "\"}";*/

								
					String finalResponse ="{\"status\":\"" + pStatus + "\",\"message\":\"" + pMessage + "\",\"ackDt\":\""
					+ pAckDt + "\",\"ackNo\":\""+ pAckNo + "\",\"irn\":\""+ pIrn + "\",\"signedInvoice\":\""
							+ pSignedInvoice + "\",\"signedQRCode\":\""+ pSignedQRCode + "\",\"irnstatus\":\""+ pIrnstatus + "\",\"report_url\" : \""+preport_url+"\"}";
					//System.out.println("tentResponse :" + finalResponse);
					inMessage.setHeader(Exchange.CONTENT_TYPE, "application/json");
					MessageContentsList req = new MessageContentsList();
					req.add(finalResponse);
					//System.out.println("bodyPara" + req);
					inMessage.setBody(req);

				} catch (Exception e) {
					log.error("Exception in process()", e);
				}

			} 
		 


}
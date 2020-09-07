package com.tml.IRN;

import java.util.ArrayList;
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

				Message inMessage = exchange.getIn();
	
				String doc_type = (String) inMessage.getBody(String.class);
	
				int strlen = doc_type.length();
				doc_type = doc_type.substring(1, strlen - 1);
	
				inMessage.setBody(doc_type);

		} catch (Exception e) {
			log.error("Exception in process()", e);
		}

	}

	public void selectedParamProcess(Exchange exchange) throws Exception {
		try {

			Message inMessage = exchange.getIn();
			String pStatus = (String) inMessage.getHeader("status", String.class);
			String pMessage = (String) inMessage.getHeader("message", String.class);
			String pAckDt = (String) inMessage.getHeader("ackDt", String.class);
			String pAckNo = (String) inMessage.getHeader("ackNo", String.class);
			String pIrn = (String) inMessage.getHeader("irn", String.class);
			String pSignedInvoice = (String) inMessage.getHeader("signedInvoice", String.class);
			String pSignedQRCode = (String) inMessage.getHeader("signedQRCode", String.class);
			String pIrnstatus = (String) inMessage.getHeader("irnstatus", String.class);
			String preport_url = (String) inMessage.getHeader("report_url", String.class);
			String qr_b64_encoded = (String) inMessage.getHeader("qr_b64_encoded");

			String finalResponse = "{\"status\":\"" + pStatus + "\",\"message\":\"" + pMessage + "\",\"ackDt\":\""
					+ pAckDt + "\",\"ackNo\":\"" + pAckNo + "\",\"irn\":\"" + pIrn + "\",\"signedInvoice\":\""
					+ pSignedInvoice + "\",\"signedQRCode\":\"" + pSignedQRCode + "\",\"irnstatus\":\"" + pIrnstatus
					+ "\",\"report_url\" : \"" + preport_url + "\",\"qr_b64_encoded\" : \"" + qr_b64_encoded + "\"}";

			System.out.println("finalResponse "+finalResponse);
			inMessage.setHeader(Exchange.CONTENT_TYPE, "application/json");
			MessageContentsList req = new MessageContentsList();
			req.add(finalResponse);

			inMessage.setBody(req);

		} catch (Exception e) {
			log.error("Exception in process()", e);
		}

	}

	public static String removeWord(String string, String word) {

		// Check if the word is present in string
		// If found, remove it using removeAll()
		if (string.contains(word)) {

			// To cover the case
			// if the word is at the
			// beginning of the string
			// or anywhere in the middle
			String tempWord = word + " ";
			string = string.replaceAll(tempWord, "");

			// To cover the edge case
			// if the word is at the
			// end of the string
			tempWord = " " + word;
			string = string.replaceAll(tempWord, "");
		}

		// Return the resultant string
		return string;
	}

	public void processItemlist(Exchange exchange) throws Exception {
		try {

			Message inMessage = exchange.getIn();
			String ITEMLISTH = (String) inMessage.getHeader("ITEMLISTH", String.class);
			System.out.println("ITEMLISTH :" + ITEMLISTH);

			ITEMLISTH = ITEMLISTH.replace("<element>", "");
			System.out.println("before ITEMLISTH :" + ITEMLISTH);
			ITEMLISTH = removeWord(ITEMLISTH, "</element>");
			System.out.println("after ITEMLISTH :" + ITEMLISTH);

			ITEMLISTH = ITEMLISTH.replaceAll("(?m)^[ \t]*\r?\n", "");
			System.out.println("after removing spaces :" + ITEMLISTH);
			/*
			 * String finalResponse = "{\"status\":\"" + pStatus + "\",\"message\":\"" +
			 * pMessage + "\",\"ackDt\":\"" + pAckDt + "\"}";
			 */
			String finalResponse = "";

			/*
			 * String finalResponse ="{\"status\":\"" + pStatus + "\",\"message\":\"" +
			 * pMessage + "\",\"ackDt\":\"" + pAckDt + "\",\"ackNo\":\""+ pAckNo +
			 * "\",\"irn\":\""+ pIrn + "\",\"signedInvoice\":\"" + pSignedInvoice +
			 * "\",\"signedQRCode\":\""+ pSignedQRCode + "\",\"irnstatus\":\""+ pIrnstatus +
			 * "\",\"report_url\" : \""+preport_url+"\"}";
			 * //System.out.println("tentResponse :" + finalResponse);
			 */
			inMessage.setHeader(Exchange.CONTENT_TYPE, "application/json");
			MessageContentsList req = new MessageContentsList();
			req.add(finalResponse);
			// System.out.println("bodyPara" + req);
			inMessage.setBody(req);

		} catch (Exception e) {
			log.error("Exception in process()", e);
		}

	}

	public void processItemlistjson(Exchange exchange) throws Exception {
		try {
			Message inMessage = exchange.getIn();
			String jsonString = null;
			String tentResponse = null;

			ObjectMapper objectMapper = new ObjectMapper();

			// System.out.println("**************IN process******** 101 both API");
			HashMap<String, ArrayList<HashMap<String, String>>> map1 = new HashMap<>();
			map1 = (HashMap<String, ArrayList<HashMap<String, String>>>) inMessage.getHeader("ITEMLISTH");

			jsonString = objectMapper.writeValueAsString(map1);
			tentResponse = jsonString;

			inMessage.setHeader(Exchange.CONTENT_TYPE, "application/json");
			MessageContentsList req = new MessageContentsList();
			req.add(tentResponse);
			// System.out.println("bodyPara" + req);
			inMessage.setBody(req);

		} catch (Exception e) {
			log.error("Exception in process()", e);
		}

	}

}

package package2;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Postclass {
	
	public static void main(String[] args) {
		

		RequestSpecification reqspecification = RestAssured.given();
		reqspecification.baseUri("https://run.mocky.io/");
		reqspecification.basePath("v3/0afd7836-74f5-4300-ab61-248839a9c22b");
		reqspecification.body(" {\r\n"
				+ "      \"Products\": [\r\n"
				+ "        {\r\n"
				+ "          \"Id\": 1,\r\n"
				+ "          \"Name\": \"Mock\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "          \"Id\": 2,\r\n"
				+ "          \"Name\": \"Second Mock\"\r\n"
				+ "        }\r\n"
				+ "      ],\r\n"
				+ "      \"Orders\": [\r\n"
				+ "        {\r\n"
				+ "          \"Id\": 1,\r\n"
				+ "          \"Name\": \"Order1\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "          \"Id\": 2,\r\n"
				+ "          \"Name\": \"Second Order\"\r\n"
				+ "        }\r\n"
				+ "      ]\r\n"
				+ "    }");
		
		reqspecification.contentType("application/json");
		reqspecification.log().all();
		
		
		Response response = reqspecification.post();
		
		System.out.println("========================");
		
		ValidatableResponse valresponse = response.then();
		valresponse.statusCode(200);
		valresponse.log().all();
		
		/*
		 * if (200 == response.statusCode()) {
		 * System.out.println("System response code is 200"); }
		 */
	}

}

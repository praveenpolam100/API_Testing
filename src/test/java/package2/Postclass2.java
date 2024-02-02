package package2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Postclass2 {
	
	public static void main(String[] args) {
		

		RestAssured
		.given()
			.baseUri("https://run.mocky.io/")
			.basePath("v3/0afd7836-74f5-4300-ab61-248839a9c22b")
			
			.body(" {\r\n"
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
					+ "    }")
			
			.contentType(ContentType.JSON)
		
		.when()
			.log().all()
			.post()
		
		
		.then().statusCode(200).log().all();

	}

}

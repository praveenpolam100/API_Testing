package testing;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class OverloadedMethods {
	static Response response;
	public static Response postRequest() {
		
		return response = RestAssured
		.given()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking")
		.contentType(ContentType.JSON)
		.body("{\r\n"
				+ "    \"firstname\" : \"Jim\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}")
		.post();
	}
	
	
public static Response postRequest(String uri) {
		
		return response = RestAssured
		.given()
		.baseUri(uri)
		.basePath("booking")
		.contentType(ContentType.JSON)
		.body("{\r\n"
				+ "    \"firstname\" : \"Jim\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}")
		.post();
	}
	
public static Response postRequest(String uri, String body) {
	
	if (!uri.endsWith("/")) {
		uri.concat("/");
	}

	return response = RestAssured
	.given()
	.baseUri(uri)
	.basePath("booking")
	.contentType(ContentType.JSON)
	.body(body)
	.post();
}

public static int postRequest1(String url, String body) {
	
	int statusCode;

	return statusCode = RestAssured
	.given()
	.baseUri(url)
	.contentType(ContentType.JSON)
	.body(body)
	.post().statusCode();
}

	
}

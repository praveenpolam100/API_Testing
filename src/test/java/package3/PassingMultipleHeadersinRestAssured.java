package package3;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;

public class PassingMultipleHeadersinRestAssured {
	
	
	@Test
	public void updateBoooking() {
		
		List<Header> allHeaders = new ArrayList<>();
		
		Header header1 = new Header("Content-Type", "application/json");
		Header header2 = new Header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=");
		allHeaders.add(header1);
		allHeaders.add(header2);
		
		Headers headers = new Headers(allHeaders);
				
		
		RestAssured
			.given()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking")
			.body("{\r\n"
					+ "    \"firstname\" : \"James\",\r\n"
					+ "    \"lastname\" : \"Brown\",\r\n"
					+ "    \"totalprice\" : 111,\r\n"
					+ "    \"depositpaid\" : true,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2018-01-01\",\r\n"
					+ "        \"checkout\" : \"2019-01-01\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
					+ "}")
			.headers(headers)
			.when()
				.put()
			.then()
				.log().all();
		
			
			
		
	}

}

package package3;

import org.apache.http.entity.ContentType;

import io.restassured.RestAssured;

public class UpdateBookingPUT {
	
	public static final String BASE_URL = "https://restful-booker.herokuapp.com/";
	
	public static void main(String[] args) {
		
		RestAssured
		.given()
			.log().all()
			.baseUri(BASE_URL)
			.basePath("/booking/{id}")
			.pathParam("id", 1)
			.header("Content-Type","application/json")
			.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
			
			.body("{\r\n"
					+ "    \"firstname\" : \"Praveen\",\r\n"
					+ "    \"lastname\" : \"Polam\",\r\n"
					+ "    \"totalprice\" : 111,\r\n"
					+ "    \"depositpaid\" : true,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2018-01-01\",\r\n"
					+ "        \"checkout\" : \"2019-01-01\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
					+ "}")
			
			
			
		.when()
			.put()
		.then()
			.statusCode(200).log().all();
			
			
			
					
			
		
			
			
	}

}

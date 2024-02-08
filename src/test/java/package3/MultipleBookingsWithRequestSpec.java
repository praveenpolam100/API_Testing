package package3;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class MultipleBookingsWithRequestSpec {
	
	public static final String BASE_URL = "https://restful-booker.herokuapp.com/";
	RequestSpecification requestSpecification;
	
	@BeforeClass
	public void setupRequestMethod() {
		
		requestSpecification = RestAssured.given()
				.baseUri(BASE_URL)
				.basePath("/booking/{id}")
				.pathParam("id", 1)
				.log().all();
		
		
	}
	
	@Test(priority = 1)
	public void getBooking() {
		
		RestAssured
		.given()
		.spec(requestSpecification)
				/*
				 * .baseUri(BASE_URL) .basePath("/booking/{id}") .pathParam("id", 1)
				 */
		.when()
			.get()
		.then()
			.statusCode(200)
			.log().all();
		
	}

	@Test(priority = 2)
	public void updateBooking() {
		
		RestAssured
		.given()
			.spec(requestSpecification)
				/*
				 * .baseUri(BASE_URL) .basePath("/booking/{id}") .pathParam("id", 1)
				 */
			.header("Content-Type","application/json")
			.header("Authorization",  "Basic YWRtaW46cGFzc3dvcmQxMjM=")
			.body("{\r\n"
					+ "    \"firstname\" : \"Praveen\",\r\n"
					+ "    \"lastname\" : \"Polam\",\r\n"
					+ "    \"totalprice\" : 112,\r\n"
					+ "    \"depositpaid\" : true,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2023-01-01\",\r\n"
					+ "        \"checkout\" : \"2023-01-01\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
					+ "}")
			
			
		.when()
			.put()
			
		.then()
			.statusCode(200)
			.log().all();
			
		
		
	}
	
	
}

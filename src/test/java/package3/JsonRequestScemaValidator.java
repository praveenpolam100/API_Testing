package package3;

import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.specification.ResponseSpecification;

public class JsonRequestScemaValidator {
	
	public static void main(String[] args) {
		
	
	}
	
	@Test
	public void createBooking() {
			
		String createBookingScema = "{\r\n"
				+ "    \"firstname\" : \"Jim\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 500,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}";
		
		JsonSchemaValidator.matchesJsonSchemaInClasspath("getBooking1.json");
		MatcherAssert.assertThat(createBookingScema,JsonSchemaValidator.matchesJsonSchemaInClasspath("getBooking1.json"));
		
		
		RestAssured
		.given()
			.baseUri("https://restful-booker.herokuapp.com/booking")
			.header("Content-Type", "application/json")
			.header("Accept", "application/json")
				/*
				 * .body("{\r\n" + "    \"firstname\" : \"Jim\",\r\n" +
				 * "    \"lastname\" : \"Brown\",\r\n" + "    \"totalprice\" : 111,\r\n" +
				 * "    \"depositpaid\" : true,\r\n" + "    \"bookingdates\" : {\r\n" +
				 * "        \"checkin\" : \"2018-01-01\",\r\n" +
				 * "        \"checkout\" : \"2019-01-01\"\r\n" + "    },\r\n" +
				 * "    \"additionalneeds\" : \"Breakfast\"\r\n" + "}")
				 */
				.body(createBookingScema)
			
			.when()
				.post()
			.then()
				.log().all();
				
			
		
	}
	

}

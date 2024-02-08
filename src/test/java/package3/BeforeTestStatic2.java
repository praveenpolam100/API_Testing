package package3;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BeforeTestStatic2 {
	
	@Test
	public void insertBooking2() {
		
		String booking_id = 
				RestAssured
			.given()
			//.baseUri("https://restful-booker.herokuapp.com/")
			//.basePath("booking")
			.body("{\r\n"
					+ "    \"firstname\" : \"Jims\",\r\n"
					+ "    \"lastname\" : \"Browny\",\r\n"
					+ "    \"totalprice\" : 112,\r\n"
					+ "    \"depositpaid\" : true,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2019-01-01\",\r\n"
					+ "        \"checkout\" : \"2019-01-01\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
					+ "}")
			
						/*
						 * .header("Content-Type", "application/json")
						 * .header("Accept","application/json")
						 */
			
			.when()
				.post()
			.then()
				//.log().all()
				.extract().body().jsonPath().getString("bookingid")
				;
		
		System.out.println("booking id: " +booking_id);
	}

}

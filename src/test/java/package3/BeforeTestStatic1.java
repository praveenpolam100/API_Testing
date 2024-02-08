package package3;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BeforeTestStatic1 {
	@BeforeTest
	public static void restAssured() {
		
		 RestAssured.baseURI = "https://restful-booker.herokuapp.com/";
		 RestAssured.basePath = "booking";
		 RestAssured.requestSpecification = RestAssured.given().log().all();
		 RestAssured.requestSpecification = RestAssured.given().header("Content-Type", "application/json");
		 RestAssured.requestSpecification = RestAssured.given().header("Accept", "application/json");
		 
		 RestAssured.responseSpecification = RestAssured.expect().statusCode(200).log().all();
		 //RestAssured.
			//.header("Content-Type", "application/json")
			//.header("Accept","application/json");
			
		
		
	}
	
	@Test
	public void insertBooking1() {
		
		String booking_id = 
				RestAssured
			.given()
			//.baseUri("https://restful-booker.herokuapp.com/")
			//.basePath("booking")
			.body("{\r\n"
					+ "    \"firstname\" : \"Jams\",\r\n"
					+ "    \"lastname\" : \"Browns\",\r\n"
					+ "    \"totalprice\" : 112,\r\n"
					+ "    \"depositpaid\" : true,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2018-01-01\",\r\n"
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

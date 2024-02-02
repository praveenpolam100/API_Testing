package package3;

import static org.testng.Assert.assertEquals;

import io.restassured.RestAssured;
import java.util.*;

public class GetBooking {

	final static String BASE_URI = "https://restful-booker.herokuapp.com/";
	public static void main(String[] args) {
		
	
		
		/*
		 * RestAssured .given() .baseUri(BASE_URI) .basePath("{bookings}/{id}")
		 * .pathParam("bookings", "booking") .pathParam("id", 1) .when() .get() .then()
		 * .statusCode(200).log().all();
		 */
		
		//;Map<String, Object> pathParams = new HashMap<>();
			
		
		RestAssured
		.given()
			.baseUri(BASE_URI)
			//.basePath("{bookings}/{id}")
			.pathParam("bookings", "booking")
			.pathParam("id", 1)
		.when()
			.log().all()
			.get(BASE_URI+"{bookings}/{id}", "bookings", "id")
		.then()
			.statusCode(200).log().all();
		
		
	}
}

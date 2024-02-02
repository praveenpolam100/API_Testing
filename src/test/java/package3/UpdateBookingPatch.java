package package3;

import java.util.*;

import io.restassured.RestAssured;

public class UpdateBookingPatch {

	public static final String BASE_URI = "https://restful-booker.herokuapp.com/";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured
		.given()
			.baseUri(BASE_URI)
			.basePath("/booking/{id}")
			.pathParam("id", 1)
			.header("Content-Type", "application/json")
			.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
			.body("{\r\n"
					+ "    \"firstname\" : \"Prithvi\",\r\n"
					+ "    \"lastname\" : \"Polam\"\r\n"
					+ "}")
			.log().all()
			.when()
				.patch()
			
			.then()
				.statusCode(200).log().all();
	}

}

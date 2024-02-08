package package3;

import io.restassured.RestAssured;

public class ExtractBodyandStore {
	public static final String STRING_URI = "https://restful-booker.herokuapp.com/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String getBooking = RestAssured
		.given()
			.baseUri(STRING_URI)
			.basePath("/booking/{id}")
			.pathParam("id",  1)
		
		.when()
			.get()
		.then()
			.statusCode(200)
			.extract().body().asPrettyString();
		
		System.out.println(getBooking);

	}

}

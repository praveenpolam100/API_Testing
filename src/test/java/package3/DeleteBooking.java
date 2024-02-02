package package3;

import io.restassured.RestAssured;

public class DeleteBooking {
	
	public static final String BASE_URI = "https://restful-booker.herokuapp.com/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured
		.given()
			.baseUri(BASE_URI)
			.basePath("/booking/1")
			.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.when()
			.delete()
		.then()
			.statusCode(201)
			.log().all()
			.assertThat().extract().body().equals("HTTP/1.1 201 Created");
			
			
		

	}

}

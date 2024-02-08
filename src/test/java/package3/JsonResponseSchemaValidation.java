package package3;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class JsonResponseSchemaValidation {
	String file_path = "C:\\eclipse-workspace\\API_Testing\\src\\test\\resources\\getBooking1.json";
	File file = new File(file_path);
	

	@Test
	public void jsonSchemavalidation_getBooking() {
		
		RestAssured
		.given()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking/{id}")
			.pathParam("id",  1)
		.when()
			.get()
		.then()
			.log().all()
			//This must be inside the project folder
			//.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("getBooking1.json"));
			
			//This path can be outside of the project folder, added code formats
			//.body(JsonSchemaValidator.matchesJsonSchema(new File("C:\\eclipse-workspace\\API_Testing\\src\\test\\resources\\getBooking1.json")));
			.body(JsonSchemaValidator.matchesJsonSchema(file));

			
		
			
	}
	
	

}

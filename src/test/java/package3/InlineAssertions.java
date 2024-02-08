package package3;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class InlineAssertions {

	public void inLineAssertion() {

		RestAssured.given().baseUri("https://restful-booker.herokuapp.com/").basePath("auth")
				.contentType(ContentType.JSON)
				.body("{\r\n" + "    \"username\" : \"admin\",\r\n" + "    \"password\" : \"password123\"\r\n" + "}")
				.when().post().then().log().all()
				// .statusCode(200).log().all().extract().asString();
				.body("token", Matchers.notNullValue()).body("token.length()", Matchers.is(15));

	}
	
	
	@Test
	public void asserTion() {
		
		String jsonResponse = "";
		
		jsonResponse = RestAssured
		.given().baseUri("https://restful-booker.herokuapp.com/")
		.basePath("auth")
		.contentType(ContentType.JSON)
		.body("{\r\n" + "    \"username\" : \"admin\",\r\n" + "    \"password\" : \"password123\"\r\n" + "}")
		.when()
		.post()
		.then()
		//.log().all()
		.extract().asPrettyString();
		
		JsonPath jsonpath = new JsonPath(jsonResponse);
		System.out.println(jsonpath.getString("token"));
		String str = jsonpath.get("$").toString();
		System.out.println(str);

		
		
	}



}

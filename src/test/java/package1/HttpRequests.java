package package1;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.*;
import org.testng.annotations.Test;

public class HttpRequests {

	public final int STATUS_CODE = 200;
	public final int STATUS_CODE_POST = 201;
	public final int STATUS_CODE_DELETE = 204;
	int userid;

	@Test(priority = 0)
	public void getUsers() {

		given()

				.when().get("https://reqres.in/api/users?page=2")

				.then()
				.statusCode(STATUS_CODE)
				.body("page", equalTo(2))
				.body("$", hasKey("total"))
				.body("$", hasKey("per_page"))
				.body("$", hasKey("total_pages"))
				.body("data[0]", hasKey("email"))
				//.log().all()
		;

	}

	@Test(priority = 1)
	public void createUser() {

		HashMap <String, String> data = new HashMap();
		data.put("name", "praveen");
		data.put("job", "PM");

		userid = given()

				.contentType("application/json")
				.body(data)

			.when()
				
				.post("https://reqres.in/api/users")
				.jsonPath().getInt("id");
				
	}
	
	@Test(priority = 2)
	public void updateUser() {
		
		HashMap <String, String> data = new HashMap();
		data.put("name", "praveen Reddy");
		data.put("job", "LSI");
		
		given()
			.contentType("application/json")
			.body(data)
		
		.when()
			.put("https://reqres.in/api/users/"+userid)
		.then()
			.statusCode(STATUS_CODE)
			.log().all()
		;
		
		
	}
	
	@Test(priority = 3)
	public void deleteuser() {
		
		when()
			.delete("https://reqres.in/api/users/"+userid)
		
		.then()
		
			.statusCode(STATUS_CODE_DELETE)
			.log().all()
			;
		
	}

}

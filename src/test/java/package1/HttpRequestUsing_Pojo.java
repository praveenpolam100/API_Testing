package package1;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
//import package1.Pojo_Request;

public class HttpRequestUsing_Pojo {
	
	private  final String NAME = "Praveen";
	private  final String PHONE_NUMBER = "898565258";
	private  final String LOCATION = "India";
	private  final String courses[] = {"C", "C++"};

	void createTestdata() {
		
		Pojo_Request data = new Pojo_Request();
		data.setName(NAME);
		data.setPhone(PHONE_NUMBER);
		data.setLocation(LOCATION);
		data.setCourses(courses);
		
	}
	
	
	public void createUser() {
		given()
				
		.when()

		
		.then()
		;
		
	}

	public void updateUser() {
		
		
	}
	
	public void deleteUser() {
		
		
	}
}

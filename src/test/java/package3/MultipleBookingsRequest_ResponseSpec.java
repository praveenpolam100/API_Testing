package package3;

//import java.util.concurrent.TimeUnit;

//import org.checkerframework.checker.index.qual.LessThan;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class MultipleBookingsRequest_ResponseSpec {
	
	ResponseSpecification responsespecification;
	RequestSpecification requestspecification;
	public static final String BASE_URI = "https://restful-booker.herokuapp.com/";
	
	
	@BeforeClass
	public void RequestSpec() {
		requestspecification = RestAssured.given()
				.baseUri(BASE_URI)
				.basePath("booking/1")
				.header("Content-Type", "application/json")	
				.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
				;
		
	}
	
	@BeforeClass
	public void ResponseSpec() {
		responsespecification = RestAssured.expect()
				.statusCode(200)
				.contentType(ContentType.JSON)
				.time(Matchers.lessThan(2000L));
				
	}
	
	@Test
	public void updateBooking1() {
		RestAssured
		.given()
			.spec(requestspecification)
			.body("{\r\n"
				+ "    \"firstname\" : \"Praveen\",\r\n"
				+ "    \"lastname\" : \"Polam\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}")
			
			.when()
				.put()
			.then()
				.spec(responsespecification)
				.log().all();
				
		
		
	}
	
	@Test
	public void updateBooking2() {
		RestAssured
		//saving one line 
		.given(requestspecification)
			//.spec(requestspecification)
			.body("{\r\n"
				+ "    \"firstname\" : \"Prashanth\",\r\n"
				+ "    \"lastname\" : \"Polam\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2020-01-01\",\r\n"
				+ "        \"checkout\" : \"2020-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}")
			
			.when()
				.put()
			.then()
				.spec(responsespecification)
				.log().all();
		
	}
}

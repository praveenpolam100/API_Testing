package package3;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;

public class ResponseTime {

	public static final String BASE_URL = "https://restful-booker.herokuapp.com/";
	public static void main(String[] args) {
		
		Response response =
		//ResponseSpecification responsetime = 
		RestAssured
		.given()
			.baseUri(BASE_URL)
			.basePath("/booking/1")
			.header("Content-Type", "application/json")
			.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
			.body("{\r\n"
					+ "    \"firstname\" : \"James\",\r\n"
					+ "    \"lastname\" : \"Brown\",\r\n"
					+ "    \"totalprice\" : 111,\r\n"
					+ "    \"depositpaid\" : true,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2018-01-01\",\r\n"
					+ "        \"checkout\" : \"2019-01-01\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
					+ "}")
			.when()
				.put();
		
		long responsetimeinMS = response.time();
		long responsetimeinS = response.timeIn(TimeUnit.SECONDS);
		long responsetimeinMS1 = response.getTime();
		long responsetimeinS2 = response.getTimeIn(TimeUnit.SECONDS);
		
		System.out.println(responsetimeinMS);
		System.out.println(responsetimeinS);
		System.out.println(responsetimeinMS1);
		System.out.println(responsetimeinS2);
		
		response.then().time(Matchers.lessThan(5000L));
		response.then().time(Matchers.greaterThan(2000L));
		response.then().time(Matchers.lessThan(2L), TimeUnit.SECONDS);
		response.then().time(Matchers.both(Matchers.lessThan(5L)).and(Matchers.greaterThan(1L)));
			
		
		
		
			
	}
}

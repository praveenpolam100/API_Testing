package payloads;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PayloadusingMAP {
	
	
	@Test
	public void payloadusingHashmap() {
		
		Map<String, Object> payload = new HashMap<>();
		payload.put("id", 1);
		payload.put("firstname", "Praveen");
		payload.put("lastname", "Polam");
		payload.put("married", true);
		payload.put("salary", 1236.25);
		
		RestAssured
		.given()
			.log().all().body(payload)
			.get();
		
		
		
	}

}

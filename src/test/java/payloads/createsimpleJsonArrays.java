package payloads;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class createsimpleJsonArrays {
	
	@Test
	public void simplejsonArray(){
		
		
		Map<String, Object>empDetails = new HashMap<>();
		empDetails.put("id", 1);
		empDetails.put("first_name", "Tarra");
		empDetails.put("last_name", "Lensch");
		empDetails.put("email", "tlensch0@narod.ru");
		empDetails.put("gender", "Female");
		
		Map<String, Object>empDetails1 = new HashMap<>();
		
		empDetails1.put("id", 2);
		empDetails1.put("first_name", "Hendrika");
		empDetails1.put("last_name", "Hoffner");
		empDetails1.put("email", "hhoffner1@scribd.com");
		empDetails1.put("gender", "Female");
		
		
		List<Map<String, Object>> listEmpmaps = new LinkedList<>();
		listEmpmaps.add(empDetails);
		listEmpmaps.add(empDetails1);
		
		RestAssured
		.given()
			.log().all().body(listEmpmaps).get();
		
		
	}
	

				

}

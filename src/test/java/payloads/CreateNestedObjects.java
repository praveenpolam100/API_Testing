package payloads;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateNestedObjects {
	
	@Test	
	public void nestedObjects(){
		
		Map<String, Object> nestedObject = new LinkedHashMap<>();
		Map<String, Object> emploYees = new LinkedHashMap<>();
		
		nestedObject.put("company", "Acme Corporation");
		
		emploYees.put("id", 1);
		emploYees.put("name", "John Doe");
		emploYees.put("department", "Engineering");
		
		nestedObject.put("employees", emploYees);
		
		RestAssured
		.given()
			.body(nestedObject).log().all().get();	
		
	}
	
	
	
	
	/*
	 * { "company": "Acme Corporation", "employees": [ { "id": 1, "name":
	 * "John Doe", "department": "Engineering", "skills": ["Python", "JavaScript",
	 * "HTML", "CSS"] } ] }
	 */
	
	

}

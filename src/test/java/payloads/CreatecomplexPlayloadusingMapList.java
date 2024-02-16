package payloads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreatecomplexPlayloadusingMapList {
	
	
	@Test
	public void createPayloadforcomplexJson() {
		
		Map<String, Object>finalJson = new HashMap<>();
		
				
				
		List<Map<String, Object>> employees = new ArrayList<>();
		
			Map<String, Object>empdetails1 = new HashMap<>();
			empdetails1.put("id", 1);
			empdetails1.put("name", "John Doe");
			empdetails1.put("department", "Engineering");
			List<String>skills1 = Arrays.asList("Phython", "Java Script","HTML", "CSS");
			empdetails1.put("skills", skills1);
		employees.add(empdetails1);
			Map<String, Object>empdetails2 = new HashMap<>();
			empdetails2.put("id", 2);
			empdetails2.put("name", "Jane Smith");
			empdetails2.put("department", "Marketing");
			List<String>skills2 = Arrays.asList("Marketing Strategy", "Social Media Management", "Content Creation");
			empdetails2.put("skills", skills2);
		employees.add(empdetails2);
		
		List<Map<String,Object>>products = new ArrayList<>();
			Map<String, Object>products1 = new HashMap<>();
			products1.put("id", 101);
			products1.put("name", "Widget");
			products1.put("price", 10.99);
			products1.put("category", "Hardware");
			
			Map<String, Object>products2 = new HashMap<>();
			products2.put("id", 102);
			products2.put("name", "Gizmo");
			products2.put("price", 24.99);
			products2.put("category", "Electronics");
			
			products.add(products1);
			products.add(products2);
		
		Map<String, Object>address = new HashMap<>();
		address.put("street", "123 Main st");
		address.put("city", "Metropolis");
		address.put("state", "CA");
		address.put("zip", "12345");
		
		
		finalJson.put("company", "Acme Corporation");
		finalJson.put("employees", employees);
		finalJson.put("products", products);
		finalJson.put("address", address);
		
		
		RestAssured
		.given()
		.log().all().body(finalJson).get();
				
	}

}

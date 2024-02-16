package responses;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class ConvertJsonArrayResponsetoList {
	
	@Test
	public void arrayresponseasList() {
		
		List<Object>arraylist = 
			
		RestAssured
		.given()
		.get("https://run.mocky.io/v3/5d0b09cc-be2c-4e32-97e7-1a68bfd0a27e")
		.as(List.class);
		
		System.out.println(arraylist.size());
		
		Map<String, Object> products = (Map<String, Object>) arraylist.get(0);
				
		String name = (String) products.get("name");
		System.out.println(name);
		
	}
	
	@Test
	public void arrayresponseasListType() {
		
		List<Map<String, Object>> arraylist = RestAssured.given()
		.get("https://run.mocky.io/v3/5d0b09cc-be2c-4e32-97e7-1a68bfd0a27e")
		.as(new TypeRef<List<Map<String, Object>>>(){});
		
		System.out.println(arraylist.size());
		System.out.println(arraylist.get(0).get("name"));
		
	}

}

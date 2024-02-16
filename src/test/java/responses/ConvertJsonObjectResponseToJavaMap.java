package responses;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ConvertJsonObjectResponseToJavaMap {
	
	@Test
	public void extractResponse() {
	
		Map jsonResponse = RestAssured
		.given()
		.get("https://run.mocky.io/v3/798121e3-4e33-4752-9c7f-383b5996227e")
		.as(Map.class);
		
		int id = (int) jsonResponse.get("id");
		String name = (String) jsonResponse.get("name");
		System.out.println("id=" +id +" "+"name:=" +name);	
		
		jsonResponse.keySet().forEach(k -> System.out.println(k));
	
		
	}
	
	@Test
	public void extractResponsefromNested() {
		
		Map jsonResponse = RestAssured
		.given().log().all()
			.get("https://run.mocky.io/v3/c5a9307c-07c4-41f3-bfb7-b539f7db51a5")
			.as(Map.class);
		
		
		    Map <String, Object> skillMap = (Map<String, Object>)jsonResponse.get("skills");
		    System.out.println(skillMap.get("name"));
		    System.out.println(skillMap.get("profession"));
			
		
	}
	
	

}

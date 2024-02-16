package responses;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class ConvertJsonObjectResponsetoJavaMapwithGenerics {

	
	@Test
	public void javaMapwithGenerics() {
		
		Map<String, Object> jsonresponseasMap = RestAssured
		.given()
		.get("https://run.mocky.io/v3/c5a9307c-07c4-41f3-bfb7-b539f7db51a5")
		.as(new TypeRef<Map<String, Object>>(){});
		
		int id = (int) jsonresponseasMap.get("id");
		String name = (String) jsonresponseasMap.get("name");
		
		Map<String, Object> skil = (Map<String, Object>) jsonresponseasMap.get("skills");
		
		String profes = (String) skil.get("profession"); 
			
		System.out.println(id);
		
		System.out.println(name);
		System.out.println(profes);
	
	}
	
	
}

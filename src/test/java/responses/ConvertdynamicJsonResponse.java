package responses;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ConvertdynamicJsonResponse {
	
	@Test
	public void dynamicjsonResponse() {
		
		Response response = RestAssured
		.get("https://run.mocky.io/v3/5d0b09cc-be2c-4e32-97e7-1a68bfd0a27e");

		
		Object response1 = response.as(Object.class);
		if (response1 instanceof List) {
			int size = ((List) response1).size();
			System.out.println(size);
			
		}
		else if (response1 instanceof Map) {
			
			Map firstresponse = (Map) ((Map) response1).get(0);
			firstresponse.keySet();
			System.out.println(firstresponse.keySet());
			
		}
		
		
	}

}

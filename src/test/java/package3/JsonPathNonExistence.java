package package3;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonPathNonExistence {
	
	@Test
	public void jsonPath() {
		
		String json = "{\r\n"
				+ "    \"firstname\" : \"James\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}";
		
		JsonPath jsonpath  = new JsonPath(json);
		Object obj = jsonpath.get("firstname");
		System.out.println(obj);
		String firstname = jsonpath.getString("firstname");
		System.out.println(firstname);
		System.out.println((Object)jsonpath.get("$"));
		System.out.println(jsonpath.getString("$"));
		System.out.println(jsonpath.getString(""));
		System.out.println(jsonpath.getString("bookingdates.checkin"));
		
		Object obj2 = jsonpath.getJsonObject("bookingdates");
		System.out.println(obj2);
	}

}

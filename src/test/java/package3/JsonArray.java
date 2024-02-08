package package3;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class JsonArray {

public static void main(String[] args) {
	
	String jsonArray = "[\r\n"
			+ "  [\r\n"
			+ "    100,\r\n"
			+ "    200,\r\n"
			+ "    300,\r\n"
			+ "    400\r\n"
			+ "  ],\r\n"
			+ "  [\r\n"
			+ "    1000,\r\n"
			+ "    2000,\r\n"
			+ "    3000,\r\n"
			+ "    4000\r\n"
			+ "  ]\r\n"
			+ "]";
	
			
	JsonPath jsonpath = new JsonPath(jsonArray);
	int size = jsonpath.getList("$").size();
	System.out.println(size);
	System.out.println(jsonpath.getString("[0][1]"));
	List <Object> internallist = (List<Object>) jsonpath.getList("$").get(0);
	System.out.println(internallist.size());
			
	
	
}
	

}

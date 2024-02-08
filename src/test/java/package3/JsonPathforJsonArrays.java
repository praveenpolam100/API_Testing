package package3;

import io.restassured.path.json.JsonPath;

public class JsonPathforJsonArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String jsonArray = "[\r\n"
				+ "  {\r\n"
				+ "    \"id\": 1,\r\n"
				+ "    \"name\": \"John Doe\",\r\n"
				+ "    \"age\": 30,\r\n"
				+ "    \"email\": \"john.doe@example.com\",\r\n"
				+ "    \"address\": {\r\n"
				+ "      \"street\": \"123 Main St\",\r\n"
				+ "      \"city\": \"Anytown\",\r\n"
				+ "      \"zipCode\": 12345\r\n"
				+ "    },\r\n"
				+ "    \"phoneNumbers\": [\r\n"
				+ "      {\r\n"
				+ "        \"type\": \"home\",\r\n"
				+ "        \"number\": \"555-1234\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"type\": \"work\",\r\n"
				+ "        \"number\": \"555-5678\"\r\n"
				+ "      }\r\n"
				+ "    ],\r\n"
				+ "    \"isVerified\": true\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"id\": 2,\r\n"
				+ "    \"name\": \"Jane Smith\",\r\n"
				+ "    \"age\": 25,\r\n"
				+ "    \"email\": \"jane.smith@example.com\",\r\n"
				+ "    \"address\": {\r\n"
				+ "      \"street\": \"456 Oak St\",\r\n"
				+ "      \"city\": \"Othercity\",\r\n"
				+ "      \"zipCode\": 67890\r\n"
				+ "    },\r\n"
				+ "    \"phoneNumbers\": [\r\n"
				+ "      {\r\n"
				+ "        \"type\": \"mobile\",\r\n"
				+ "        \"number\": \"555-4321\"\r\n"
				+ "      }\r\n"
				+ "    ],\r\n"
				+ "    \"isVerified\": false\r\n"
				+ "  }\r\n"
				+ "]";
		
		
		JsonPath jsonpath = new JsonPath(jsonArray);
		String zipcode = jsonpath.getString("[0].address.zipCode");
		System.out.println(zipcode);
		String phonetype = jsonpath.getString("[0].phoneNumbers[1].type");
		System.out.println(phonetype);
		
		System.out.println(jsonpath.getString("phoneNumbers"));

	}

}

package testing;

import io.restassured.response.Response;

public class TestingOverloaded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadedMethods om = new OverloadedMethods();
		
		String url = "https://restful-booker.herokuapp.com/booking";
		String body = "{\r\n"
				+ "    \"firstname\" : \"Jim\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}";
		/*
		 * int statusCode = om.postRequest1(url, body); System.out.println(statusCode);
		 * if (statusCode ==200) {
		 * 
		 * System.out.println("Successful"); }else {
		 * 
		 * System.out.println("failed"); }
		 */
		
		String uri = "https://restful-booker.herokuapp.com/";
		Response response = om.postRequest(uri, body);
		if (response.getStatusCode() == 200) {
			System.out.println("Passed");
			
		}else
		{
			System.out.println("Failed");
		}

		
	}

}

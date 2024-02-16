package pojo.jsonresponsetopojo;

import org.testng.Assert;

import io.restassured.RestAssured;

public class EmployeenestedgetResponse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employeepojonested employeepojonestedresponse = 
		RestAssured
		.get("https://run.mocky.io/v3/2a9a3028-d552-431b-9d4a-ae8682f3a4be")
		.as(Employeepojonested.class);
		
		String email = employeepojonestedresponse.getEmail();
		String city = employeepojonestedresponse.getAddress().getCity();
		
		System.out.println(email);
		System.out.println(city);
		

	}

}

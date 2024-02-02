package package2;

import static org.testng.Assert.assertEquals;

import io.restassured.RestAssured;

public class JsonObjectResponseToPojo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = RestAssured.get("https://run.mocky.io/v3/65468d02-dbb7-4f87-b199-7e686604aed6")
		.as(Employee.class);
		String firstname = employee.getFirstName();
		System.out.println(firstname);
		
		
		

	}

}

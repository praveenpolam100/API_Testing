package pojo.jsonresponsetopojo;

import io.restassured.RestAssured;

public class Employeegetresponse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employeepojo emppojo = 
		RestAssured
		.get("https://run.mocky.io/v3/019f1315-5058-4efb-b441-a98396121eb1")
		.as(Employeepojo.class);
		
		
		Double salary = emppojo.getSalary();
		System.out.println(salary);
		
	}

}

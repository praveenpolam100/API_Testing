package pojo.nestedjsonarray;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperType;

public class EmployeenestedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Employeepojo> employee = new ArrayList<>();
		
	
		Employeepojo[] employees = 
		RestAssured
		.get("https://run.mocky.io/v3/02be1327-93c1-4580-895f-ad219b7d8159")
		.as(Employeepojo[].class);
		
		int length = employees.length;
		System.out.println(length);
		System.out.println(employees[0].getFirstname());
		


	}

}

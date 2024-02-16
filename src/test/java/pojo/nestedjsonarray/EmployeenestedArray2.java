package pojo.nestedjsonarray;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.mapper.ObjectMapperType;

public class EmployeenestedArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Employeepojo> employee = new ArrayList<>();
		
	
		List <Employeepojo> employees = 
		RestAssured
		.get("https://run.mocky.io/v3/02be1327-93c1-4580-895f-ad219b7d8159")
		.as(new TypeRef<List<Employeepojo>>(){});
		
		System.out.println(employees.size());
		System.out.println(employees.get(0).getFirstname());
		
	
		


	}

}

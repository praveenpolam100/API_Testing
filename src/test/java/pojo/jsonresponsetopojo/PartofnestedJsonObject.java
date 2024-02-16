package pojo.jsonresponsetopojo;

import io.restassured.RestAssured;

public class PartofnestedJsonObject {

	public static void main(String[] args) {

		EmployeeAddressPojo employeeaddress = RestAssured
				.get("https://run.mocky.io/v3/2a9a3028-d552-431b-9d4a-ae8682f3a4be").jsonPath()
				.getObject("address", EmployeeAddressPojo.class);

		String address = employeeaddress.getStreetname().concat(",").concat(employeeaddress.getCity()).concat(",")
				.concat(employeeaddress.getState()).concat(",").concat(employeeaddress.getZipcode());

		System.out.println(address);

	}
}

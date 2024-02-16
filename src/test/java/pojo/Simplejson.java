package pojo;

import io.restassured.RestAssured;

public class Simplejson {

	
	public static void main(String[] args) {
		
		SimpleStrudentPojo sp = new SimpleStrudentPojo();
		sp.setId(100);
		sp.setFirstname("Praveen");
		sp.setLastname("Polam");
		sp.setEmail("praveen.po@hotmail.com");
		sp.setSalary((float) 1001.35);
		
		RestAssured
		.given().log().all().body(sp).get();
		
		
	}
	
	
	
	

}

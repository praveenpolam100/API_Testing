package pojo;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class SimplejsonArray {

	
	
	public static void main(String[] args) {
		
		SimpleStrudentPojo sp1 = new SimpleStrudentPojo();
		sp1.setId(100);
		sp1.setFirstname("Praveen");
		sp1.setLastname("Polam");
		sp1.setEmail("praveen.po@hotmail.com");
		sp1.setSalary((float) 1001.35);
		
		SimpleStrudentPojo sp2 = new SimpleStrudentPojo();
		sp2.setId(101);
		sp2.setFirstname("Praveen Reddy");
		sp2.setLastname("Polams");
		sp2.setEmail("praveen.polams@hotmail.com");
		sp2.setSalary((float) 100231.35);
		
		
		List <SimpleStrudentPojo> student = new ArrayList<>();
		student.add(sp1);
		student.add(sp2);
		
		RestAssured
		.given()
			.log().all().body(student).get();
		
		
	}
	
	
	
}

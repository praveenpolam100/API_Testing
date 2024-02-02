package package1;

import java.util.ArrayList;
import java.util.List;

import groovy.transform.stc.POJO;
import io.restassured.RestAssured;

public class Nestedjson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Address ad1 = new Address();
		ad1.setCity("Dallas");
		ad1.setState("TX");
		
		Address ad2 = new Address();
		ad2.setCity("Pewaukee");
		ad2.setState("WI");
		
		List<Address>address = new ArrayList<Address>();
		address.add(ad1);
		address.add(ad2);
		
		Pojo_Request pr = new Pojo_Request();
		pr.setFirstName("Praveen");
		pr.setLastName("Polam");
		pr.setProfession("IT");
		pr.setAddress(address);
		
		RestAssured.given().log().all()
		.body(pr)
		.post();


	}

}

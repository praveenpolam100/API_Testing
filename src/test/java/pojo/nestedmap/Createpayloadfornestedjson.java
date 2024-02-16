package pojo.nestedmap;

import io.restassured.RestAssured;

public class Createpayloadfornestedjson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SkillsMap sm = new SkillsMap();
		sm.setName("Praveen");
		sm.setProfession("Testing");
		
		Nestedpojo np = new Nestedpojo();
		np.setId(101);
		np.setName("Praveen");
		np.setPrice(1234.45);
		np.setCategory("IT Professional");
		np.setSkills(sm);
		
		
		RestAssured
		.given().log().all().body(np).post();
				

	}

}

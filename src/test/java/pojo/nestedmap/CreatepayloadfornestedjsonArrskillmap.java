package pojo.nestedmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;

public class CreatepayloadfornestedjsonArrskillmap {
	
	
	public static void main(String[] args) {
		
		
		SkillsMap sm = new SkillsMap();
		sm.setName("Praveen");
		sm.setProfession("Testing");
		
		SkillsMap sm1 = new SkillsMap();
		sm1.setName("Praveen Pol");
		sm1.setProfession("Testing Professional");
		
		List <SkillsMap>maps = new ArrayList<>();
		maps.add(sm);
		maps.add(sm1);
		
		
	
		Nestedpojo2 np2 = new Nestedpojo2();
		
		np2.setId(101);
		np2.setName("Praveen");
		np2.setPrice(1234.45);
		np2.setCategory("IT Professional");
		np2.setSkills(maps);
				
		//List <Map<String, Object>> skills = new ArrayList<>();
		
		RestAssured
		.given().log().all()
		.body(np2).post();
	
		
		
		
		
		
	}

}

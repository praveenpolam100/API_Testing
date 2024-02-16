package verifytypeofresponse;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.core.IsInstanceOf;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerifyTypeofResponsefromAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
		RestAssured
		.given().get("https://run.mocky.io/v3/89aec114-3a50-430b-997e-51b872f44451")
		.then().body("",Matchers.instanceOf(Map.class));
		
		
		
		
		
		
		

	}

}

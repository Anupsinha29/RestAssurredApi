package CRUDOperationWithBDDApproach;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;


public class UsingHamcrestCreatePost {
	
	
	@Test
	public void validateUsingHamcrestCreatePost() {
		
		
		Random ran = new Random();
		int r= ran.nextInt(1000);
		JSONObject jobc = new JSONObject();
		jobc.put("createdBy", "AnupKumarwe");
		jobc.put("projectName", "Tysty"+r);
		jobc.put("status", "created42376r");
		jobc.put("teamSize", 2231454);
		
		given().body(jobc).contentType(ContentType.JSON).when().post("http://rmgtestingserver:8084/addProject").then().assertThat().time(Matchers.lessThan(5000L),TimeUnit.MILLISECONDS).log().all();
		
		
		
		
				
		
		
		
		
		
		
		
	}

}

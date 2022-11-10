package DifferentWaysToCreateObject;

import java.util.HashMap;
import java.util.Map;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import JavaUtility.RandomNum;

public class PostUsingHashMap {
	
	
	RandomNum ran = new RandomNum();
	
	@Test
	public void postUsingHashMap() {
		
		 Map map = new HashMap();
		 
		 
		 
			map.put("createdBy", "AnupKumarwe");
			map.put("projectName", "Tysty"+ran.ran(1000));
			map.put("status", "created42376r");
			map.put("teamSize", 2231454);	
			
			
			given()
			.body(map).contentType(ContentType.JSON).when().post("http://rmgtestingserver:8084/addProject").then().statusCode(201).log().all();
			
			
		
	}
}

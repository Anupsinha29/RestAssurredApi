package DifferentWaysToCreateObject;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import JavaUtility.RandomNum;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;


import io.restassured.http.ContentType;

public class PostUsingJsonObject {
	RandomNum raa = new RandomNum();
	
	
	@Test
	
	public void postusingjsonObject() {
		
		
		JSONObject jj = new JSONObject();
		jj.put("createdBy", "aqqq");
		jj.put("projectName", "nivida"+raa.ran(1000));
		jj.put("status", "passed");
		jj.put("teamsize", 876);
		
		
		given()
		.body(jj)
		.contentType(ContentType.JSON)
		
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		
		.then()
		.statusCode(201).log().all();
		
		
		
		
		
		

	
	
	
		
		
		
		
	}
}

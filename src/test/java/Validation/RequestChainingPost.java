package Validation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import JavaUtility.RandomNum;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RequestChainingPost {
	
	@Test
	
	public void requestchainigPost() {
		baseURI ="http://rmgtestingserver";
		port =8084;
		RandomNum ran = new RandomNum();
		int rana = ran.ran(1000);
		JSONObject obj =new JSONObject();
		obj.put("createdBy", "Sukhdeep");
		obj.put("projectName", "sports"+ran.ran(1000));
		obj.put("status", "ok");
		obj.put("teamSize", 14);
		
		
		//precondition
		Response request = given().body(obj).contentType(ContentType.JSON)
				.when().post("/addProject");
		
		String pr =request.jsonPath().get("projectId");
		System.out.println(pr);
		request.then().assertThat().statusCode(201).log().all();
		
		//given().pathParam("Pid",pr)
		when().get("/project/"+pr)
		.then().assertThat().statusCode(200).log().all();
		
		
				
		
		
		
		
	}

}

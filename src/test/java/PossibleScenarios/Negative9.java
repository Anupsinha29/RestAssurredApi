package PossibleScenarios;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import JavaUtility.RandomNum;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Negative9 {
	RandomNum ran=new RandomNum();
	@Test
	public void Negative1()
	{
		when()
		.get("http://rmgtestingserver:8084/projects")
		.then()
		.statusCode(108)
		.log().all();


	

    
	}

}

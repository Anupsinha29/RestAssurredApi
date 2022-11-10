package PossibleScenarios;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import JavaUtility.RandomNum;
import io.restassured.http.ContentType;

public class negative6 {
	RandomNum ran=new RandomNum();
	@Test
	public void Negative1()
	{
		JSONObject ob=new JSONObject();
		ob.put("createdBy","VIkashhh");
		ob.put("projectName","tms"+ran.ran(1000));
		ob.put("status","completed");
		ob.put("teamSize",5);
		given()
		.body(ob)
		.contentType(ContentType.JSON)
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		.then()
		.assertThat().statusCode(300)
		.statusLine("HTTP/1.1")
		
		.log().all();
	}

}

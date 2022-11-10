package PossibleScenarios;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import JavaUtility.RandomNum;
import io.restassured.http.ContentType;

public class Negative3 {
	RandomNum ran=new RandomNum();
	@Test
	public void Negative3Test()
	{
		JSONObject ob=new JSONObject();
		ob.put("CreatedBy","Rani");
		ob.put("ProjectName","tms"+ran.ran(1000));
		ob.put("Status","completed");
		ob.put("TeamSize",5);
		given()
		.body(ob)
		.contentType(ContentType.JSON)
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}

}

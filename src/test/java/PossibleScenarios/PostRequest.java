package PossibleScenarios;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import JavaUtility.RandomNum;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostRequest {
	RandomNum r=new RandomNum();

	@Test
	public void post()
	{
		JSONObject ob=new JSONObject();
		ob.put("createdBy","Arti");
		ob.put("projectName","tms"+r.ran(1000));
		ob.put("status","completed");
		ob.put("teamSize",5);
		given()
		.body(ob)
		.contentType(ContentType.JSON)
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		.then()
		.assertThat().statusCode(200)
		.log().all();
		//.statusLine(DEFAULT_BODY_ROOT_PATH)
		
	}

}

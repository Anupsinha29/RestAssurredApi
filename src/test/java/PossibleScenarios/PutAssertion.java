package PossibleScenarios;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class PutAssertion {
	@Test
	public void put()
	{
		JSONObject ob=new JSONObject();
		ob.put("createdBy", "Reshma");
		ob.put("projectName", "ZmS");
		ob.put("Status", "Processing");
		ob.put("TeamSize", 5);
		
		given()
		.body(ob)
		.contentType(ContentType.JSON)
		.when()
		.put("http://rmgtestingserver:8084/projects/TY_PROJ_4435")
		
		.then()
		.statusCode(200)
		.assertThat()
		.time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
		.log().all();
		
		
	}

}

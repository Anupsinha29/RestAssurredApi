package PossibleScenarios;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import JavaUtility.RandomNum;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class Negative29 {
@Test
public void get()
{
	
	RandomNum r=new RandomNum();
    JSONObject ob=new JSONObject();
    ob.put("createdBy", "Bharud");
	ob.put("projectName", "ZMS"+r.ran(1000));
	ob.put("Status", "Completed");
	ob.put("teamSize", 5);
	given()
	.body(ob)
	.contentType(ContentType.JSON)

	.when()
	.get("http://rmgtestingserver:8084/addProject")

	.then()
	.statusCode(201)
	.statusLine("HTTP/1.1 201 ")
	
	.log().all();
	

}
}

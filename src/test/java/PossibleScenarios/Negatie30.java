package PossibleScenarios;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import JavaUtility.RandomNum;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class Negatie30 {
@Test
public void get()
{
	
	RandomNum r=new RandomNum();
    JSONObject ob=new JSONObject();
    ob.put("createdBy", "Anup");
	ob.put("projectName", "ZMS"+r.ran(1000));
	ob.put("Status", "Completed");
	ob.put("teamSize", 5);
	given()
	.body(ob)
	.contentType(ContentType.JSON)

	.when()
	.put("http://rmgtestingserver:8084/projects")

	.then()
	.statusCode(300)
	.statusLine("HTTP/1.1201 ")
	
	.log().all();
	

}
}

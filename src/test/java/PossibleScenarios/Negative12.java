package PossibleScenarios;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import JavaUtility.RandomNum;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class Negative12 {
	@Test
	public void createProject()
	{
JSONObject ob=new JSONObject();
RandomNum r=new RandomNum();
ob.put("createdBy", "Ajaa");
ob.put("projectName", "ZMS");
ob.put("Status", "Done");
ob.put("teamSize", 5);



when()
.put("http://rmgtestingserver:8084/projects/TY_PROJ_4234")

.then()
.statusCode(200)
.log().all();





				
	}
	

		

	

}

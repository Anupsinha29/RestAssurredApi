package PossibleScenarios;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAllProject {
	@Test
	public void Get()
	{
		when()
	 .get("http://rmgtestingserver:8084/projects/TY_PROJ_541")
.then()
.statusCode(200)
.statusLine("HTTP/1.1200")
.log().all();
	 
	 
	 
	}

}

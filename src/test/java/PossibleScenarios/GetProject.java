package PossibleScenarios;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetProject {
	@Test
	public void Get()
	{
		when()
		.get("http://rmgtestingserver:8084/projects/TY_PRO")
		.then()
		.statusCode(200)
		//.statusLine()
		.log().all();


	}

}

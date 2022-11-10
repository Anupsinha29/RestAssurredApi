package PossibleScenarios;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteProject {

	@Test
	public void Delete()
	{
		when()
		.delete("http://rmgtestingserver:8084/projects/TY_PROJ_3923")
		.then().assertThat().log().all();

	}
}

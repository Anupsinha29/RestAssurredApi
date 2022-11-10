package Parameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

public class PathparameterforDeleteProject {
	
	@Test
	public void pathparameterforDeleteProject() {
		baseURI ="http://rmgtestingserver";
		port =8084;
		given().pathParam("pid", "TY_PROJ_5546")
		.when().delete("/projects/{pid}")
		.then().assertThat().statusCode(204);
	
	}

}

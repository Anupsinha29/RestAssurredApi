package Parameters;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class PathparameterforSingleProject {
	
	
	@Test
	
	public void pathParameterForSingleProject() {
		baseURI ="http://rmgtestingserver";
		port =8084;
		given().pathParam("pid", "TY_PROJ_5529")
		.when().get("/projects/{pid}")
		.then().assertThat().statusCode(200);
		
		
		
		
		
		
		
		
		
	}

}

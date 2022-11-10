package DifferentWaysToCreateObject;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class PostUsingJsonFile {
	
	@Test
	public void postusingJsonFile() {
		File file = new File("./src/test/resources/Pojo1Class.json");
		given().
		body(file)
		.contentType(ContentType.JSON)
		.when()
		.post("http://rmgtestingserver:8084/addProject").then().statusCode(201).log().all();
		
		
	}
	

}

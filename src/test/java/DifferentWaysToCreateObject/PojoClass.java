package DifferentWaysToCreateObject;

import java.io.File;
import java.io.IOException;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import JavaUtility.RandomNum;
import POJO.PostUsingPojoClass;
import io.restassured.http.ContentType;

public class PojoClass {
	
	RandomNum ra = new RandomNum();
	
	@Test
	public void pojoclass() throws JsonGenerationException, JsonMappingException, IOException {
		
		
		PostUsingPojoClass pj = new PostUsingPojoClass("Aj","ssyt","passed"+ra.ran(100), 9);
		ObjectMapper obj =new  ObjectMapper();
		obj.writeValue(new File("./PojoClass.json"), pj);
		
		
		given()
		.body(pj)
		.contentType(ContentType.JSON)
		.when()
		.post("http://rmgtestingserver:8084/addProject").then().statusCode(201).log().all();
		
	}

}

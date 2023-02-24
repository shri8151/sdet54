package different_ways_post_request;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectWithJsonFile {

	
	
	@Test
	public void jsonFile() {
		
		File file = new File("./src/test/resources/pro.json");
		baseURI="http://rmgtestingserver";
		port=8084;
		given().body(file).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
	}
}

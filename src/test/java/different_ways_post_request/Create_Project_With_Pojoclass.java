package different_ways_post_request;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import JavaLibrary.Jlib;
import io.restassured.http.ContentType;
import pojoclassLibrary.ProjectLibrary;

public class Create_Project_With_Pojoclass {


	@Test
	public void pojoClassTest() {

		ProjectLibrary pj=new ProjectLibrary ("shrikanthk", "ty"+Jlib.random(400),"ongoing",28);
		baseURI="http://rmgtestingserver";
		port=8084;
		//prerequisites
		given()
		.body(pj)
		.contentType(ContentType.JSON)

		//perform action
		.when().post("/addProject").

		//validation;
		then().assertThat().statusCode(201).
		contentType(ContentType.JSON)    
		.time(Matchers.greaterThan(200l),TimeUnit.MILLISECONDS)
		.log().all();
	}
}

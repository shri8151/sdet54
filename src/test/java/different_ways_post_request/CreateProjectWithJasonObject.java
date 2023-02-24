package different_ways_post_request;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import JavaLibrary.Jlib;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectWithJasonObject {

	@SuppressWarnings("unchecked")
	@Test
	public void projectAddTest() {

		//create json object
		JSONObject json2=new JSONObject();
		json2.put("createdBy", "shrikanth");
		json2.put("projectName", "rmg-tyu-01"+Jlib.random(500));
		json2.put("teamSize", 13);
		json2.put("status", "ongoing");
		
		//step:1 create prerequisites
		baseURI="http://rmgtestingserver";
		port=8084;
		given().body(json2).contentType(ContentType.JSON)
		//step:2 perform action
		.when().post("/addProject")

		//step:3 validation.
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
	



	}
}

package crud_With_BDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateProject {

	
	@Test
	public void projectUpdateTest() {

		//create json object
		JSONObject json2=new JSONObject();
		json2.put("createdBy", "shrikanthl");
		json2.put("projectName", "rmg-tyu-01456");
		json2.put("status", "ongoing-w");
		json2.put("teamSize", 19);

		//step:1 create prerequisites
		baseURI="http://rmgtestingserver";
		port=8084;
		given().body(json2).contentType(ContentType.JSON)
		//step:2 perform action
		.when().put("/projects/TY_PROJ_16491")

		//step:3 validation.
		.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();
	



	}
}

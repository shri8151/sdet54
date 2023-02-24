package crud_With_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class PostProject {
 
	@Test
	public void projectAddTest() {

		//create json object
		JSONObject json2=new JSONObject();
		int random=(int) Math.floor(Math.random()*500);
		json2.put("createdBy", "shrikanth");
		json2.put("projectName", "rmg-tyu-01"+random);
		json2.put("teamSize", 13);
		json2.put("status", "ongoing");
		
		//step:1 create prerequisites
		baseURI="http://localhost";
		port=8084;
		given().body(json2).contentType(ContentType.JSON);
		//step:2 perform action
		 when().post("/addProject")

		//step:3 validation.
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
	



	}
}

package different_ways_post_request;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.http.ContentType;

public class CreateProject_With_HashMap {

	
	@Test
	public void hashmap() {
		
		HashMap<Object, Object> obj=new HashMap<Object, Object>();
		obj.put("createdBy", "shrikanth");
	    obj.put("projectName", "rmg-ty098-01");
		obj.put("teamSize", 13);
		obj.put("status", "ongoing");
		
		baseURI="http://rmgtestingserver";
		port=8084;
		given().body(obj).contentType(ContentType.JSON)
		
		.when().post("/addProject").
		
		then().assertThat().statusCode(201).
		contentType(ContentType.JSON)
		.log().all();
	}
}

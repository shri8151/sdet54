package parameters;

import static io.restassured.RestAssured.*;


import org.testng.annotations.Test;

import JavaLibrary.Jlib;


public class FormParameter {
	
	@Test
	public void form() {
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given()
		.formParam("createdBy", "shrikanth")
		.formParam("projectName","ty"+Jlib.random(300))
		.formParam("status", "working")
		
	   . when().get("/addProject")
	    .then()
	    .assertThat()
	    .statusCode(201)
	    .log().all();


}
}
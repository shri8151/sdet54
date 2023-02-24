package parameters;


import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class PathParameter {

		@Test
		public void Path() {
			//pre requisites
			baseURI="http://rmgtestingserver";
			port=8084;
			given().pathParam("pid", "TY_PROJ_16221");
			
			//perform action using 
		    when().get("/projects/{pid}")
			
			.then()
	        .assertThat()
			.statusCode(200)
			.log().all();
			
		}
	

}

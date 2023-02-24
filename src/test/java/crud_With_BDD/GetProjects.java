package crud_With_BDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetProjects {

	@Test
	public void getallTest() {
		//step:1 create prerequisites
				baseURI="http://rmgtestingserver";
				port=8084;
				
				//step:2 perform action
				when().get("/projects")

				//step:3 validation.
				.then()
				.assertThat()
				.statusCode(200)
				.contentType(ContentType.JSON)
				.log().all();
		
		
		
	}
}

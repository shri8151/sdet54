package crud_With_BDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteProject {

	@Test
	public void deleteProjectTest() {
		//step:1 create prerequisites
				baseURI="http://rmgtestingserver";
				port=8084;
				
				//step:2 perform action
				when().delete("/projects/TY_PROJ_16338")

				//step:3 validation.
				.then()
				.assertThat()
				.statusCode(204)
				.contentType(ContentType.JSON)
				.log().all();
	}	
		
		
}

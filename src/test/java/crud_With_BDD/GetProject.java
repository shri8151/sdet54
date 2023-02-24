 package crud_With_BDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetProject {

	@Test
	public void getSingleTest() {
		//step:1 create prerequisites
				baseURI="http://rmgtestingserver";
				port=8084;
				//step:2 perform action
				 when().get("/projects/TY_PROJ_16491")

				//step:3 validation.
			      .then()
				.assertThat()
				.statusCode(200)
				.contentType(ContentType.JSON)
				.log().all();
		
		
		
	}
}

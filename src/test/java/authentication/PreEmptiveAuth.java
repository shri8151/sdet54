package authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class PreEmptiveAuth {

	
	@Test
	public void preEmptiveAuthentictionTest() {
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given().auth().preemptive().basic("rmgyantra", "rmgy@9999")
		
		.when().get("/login")
		
		.then().assertThat().statusCode(202)
		.log().all();
	}
}

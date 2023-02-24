package authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DigestiveAuth {

	
	@Test
	public void preDigestiveAuthentictionTest() {
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given().auth().digest("rmgyantra", "rmgy@9999")
		
		.when().get("/login")
		
		.then().assertThat().statusCode(202)
		.log().all();
	}
}


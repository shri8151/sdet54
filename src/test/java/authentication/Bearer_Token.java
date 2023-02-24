package authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Bearer_Token {

	
	
	@SuppressWarnings("unchecked")
	@Test
	public void bearerToken() {
		
		baseURI="https://api.github.com";
		JSONObject j=new JSONObject();
		j.put("name", "sdet54");
		j.put("description", "sdret-Rest-ASSURED");
		
		given().auth().oauth2("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")
		.body(j).contentType(ContentType.JSON)
		
		.when().post("/user/repos")
		
		.then().log().all();
		
	}
}

package authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth2_Authentication {

	@Test
	public void oAuth() {

		//create request to generate access token
		Response resp = given()
				.formParam("client_id", "sdet-21")
				.formParam("client_secret", "59aab87ccd38eaa2a6356816d2230e67")
				.formParam("grant_type", "client_credentials")
				.formParam("redirect_uri", "http://example21.com")
				.formParam("code", "authorization_code")

				.when().post("http://coop.apps.symfonycasts.com/token");

		//capture the access token from the response of the above request
		String token = resp.jsonPath().get("access_token");
		System.out.println(token);
		
		//create another requet use the token o access the APIs
		given()  
		.auth().oauth2(token)
		.pathParam("User_Id",4208)    
		
		 .when().post("http://coop.apps.symfonycasts.com/api/{User_Id}/eggs-collect")
		.then().log().all();

	}


}

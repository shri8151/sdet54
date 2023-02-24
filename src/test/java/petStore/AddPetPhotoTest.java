package petStore;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

import java.io.File;

public class AddPetPhotoTest {
 
	@Test
	public void addPet() {

		//create json object

		
		  
		//step:1 create prerequisites
		baseURI="https://petstore.swagger.io/v2";
		File nfile=new File("./src/test/resources/Screenshot_2018-04-13-20-45-09-262_net.slideshare.mobile.png");
		given().contentType(ContentType.MULTIPART)
		.multiPart("file",nfile)
		//step:2 perform action
		. when().post("/pet/13/uploadImage") 

		//step:3 validation.
		.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)  
		.log().all();
	



	}
}

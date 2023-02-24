package petStore;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AddPet {

	@Test
	public void addPet() {

		//create json object
        
		
		  
		//step:1 create prerequisites
		baseURI="https://petstore.swagger.io/v2";
		File nfile=new File("./src/test/resources/pet.json");
		given().body(nfile).contentType(ContentType.JSON)
		
		//step:2 perform action
		. when().post("/pet")

		//step:3 validation.
		.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)  
		.log().all();

}
}

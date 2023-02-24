package serialization_Deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassLibrary.EmployeeAddress;
import pojoclassLibrary.EmployeeObjectArray;

public class Serialization_ComplexArrayObject {
	
	@Test
	public void serializeTheArrayObject() throws JsonGenerationException, JsonMappingException, IOException {
		
		ObjectMapper obj=new ObjectMapper();
		int[] phoneNo= {123,426};
		EmployeeAddress address = new EmployeeAddress("sri@ymail.com",phoneNo, "banglore", "karnataka", 560002);
		EmployeeObjectArray emp = new EmployeeObjectArray("shri","ty109","testing",200000,phoneNo,address);
		obj.writeValue(new File("./object.json"), emp);
	}

}

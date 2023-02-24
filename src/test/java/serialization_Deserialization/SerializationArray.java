package serialization_Deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassLibrary.EmployeeObject;
import pojoclassLibrary.EmployeeObjectArray;

public class SerializationArray {

	@Test
	public void employeeDetails() throws JsonGenerationException, JsonMappingException, IOException {
		int[] phoneNo= {123,426};
		EmployeeObjectArray emp=new EmployeeObjectArray("shri123", "ty135", "testing", 200000,phoneNo);
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./serialArray.json"), emp);
		
	}

}

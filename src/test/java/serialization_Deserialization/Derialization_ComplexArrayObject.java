package serialization_Deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassLibrary.EmployeeAddress;
import pojoclassLibrary.EmployeeObjectArray;

public class Derialization_ComplexArrayObject {
	
	@Test
	public void serializeTheArrayObject() throws JsonGenerationException, JsonMappingException, IOException {
		
		ObjectMapper obj=new ObjectMapper();
		 EmployeeObjectArray d = obj.readValue(new File("./object.json"),EmployeeObjectArray.class );
	
		System.out.println(d.getEmail());
	      
		
	
		
		
	}

}

package dummyRestApi;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;
import org.junit.Test;

public class UpdateEmployee {
	
	@Test
	public void updateEmployee() {
		
		JSONObject request = new JSONObject();
		
		request.put("name","Gargi");
		request.put("salary","95000");
		request.put("age","48");
		
		given()
			
		.when()
	     	.put("https://dummy.restapiexample.com/api/v1/update/21")
		
	    .then()
	    	.statusCode(200)
			.log().all();
		
		
	}
	
	

}

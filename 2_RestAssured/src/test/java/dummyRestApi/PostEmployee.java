package dummyRestApi;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;
import org.junit.Test;

public class PostEmployee {
	
	@Test
	public void createEmployee() {
		
		JSONObject request = new JSONObject();
		
		request.put("name","David");
		request.put("salary","80000");
		request.put("age","55");
		
		given()
		
		.when()
			.post("https://dummy.restapiexample.com/api/v1/create")
		
		.then()
			.statusCode(200)
			.log().all();
		
	}

}

package dummyRestApi;

import static io.restassured.RestAssured.*;

import org.junit.Test;

public class DeleteEmployee {
	
	@Test
	public void deleteEmployee() {
		
		given()
		
		.when()
			.delete("https://dummy.restapiexample.com/api/v1/delete/2")
		
		.then()
			.statusCode(200)
			.log().all();
		
		
	}

}

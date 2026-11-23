package dummyRestApi;

import static io.restassured.RestAssured.*;

import org.junit.Test;

public class GetAllEmployee {

	@Test
	public void getEmployees() {
		
		given()
		
		.when()
			.get("https://dummy.restapiexample.com/employees")
		
		.then()
			.statusCode(200)
			.log().all();
	}

}

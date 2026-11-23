package dummyRestApi;

import static io.restassured.RestAssured.*;

import org.junit.Test;

public class GetEmployeeById {
	
	@Test
	public void getEmplyee() {
		
		given()
		
		.when()
			.get("https://dummy.restapiexample.com/api/v1/employee/1")
		 
		.then()
			.statusCode(200)
			.log().all();
		
		
	}

}

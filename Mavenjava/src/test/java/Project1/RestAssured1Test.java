package Project1;

import com.jayway.restassured.RestAssured;
import org.testng.annotations.Test;

public class RestAssured1Test {
	
	@Test
	
 public void fun1() {
		
		RestAssured.baseURI = "https://google.com";
		System.out.println("Rakesh");
	}
	

}
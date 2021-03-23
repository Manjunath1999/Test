
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Ra11 {
      @Test
      void Registration()
      {
    	  RestAssured.baseURI= "https://jsonplaceholder.typicode.com" ;
    	  RequestSpecification arequest=RestAssured.given();
    	  Response response =arequest.request(Method.GET,"/users");
    	  String body = response.getBody().asString();
          System.out.println(body);
          String users=response.jsonPath().getString("username");
          System.out.println(users);
          
        	  
          
          
    	  
      }
	}
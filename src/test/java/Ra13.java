
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.*;

public class Ra13 {
	
	@Test
	
    void Registration()
    {
	 
     RestAssured.baseURI="https://jsonplaceholder.typicode.com";
     RequestSpecification arequest=RestAssured.given();
     Response response=arequest.request(Method.GET,"/posts/1/comments");
     ArrayList object=(ArrayList) response.jsonPath().get();
     for(var i:object)
     {
     	var temp=(HashMap)i;
     	System.out.println("comment of"+temp.get("id")+":"+temp.get("body"));
     	System.out.println();
     }
  	  
        
         
  	  
    }

}
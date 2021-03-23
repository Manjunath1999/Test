
import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Ra12 {
	@Test
      void Registration()
      {
    	  RestAssured.baseURI= "https://jsonplaceholder.typicode.com";
    	  RequestSpecification arequest=RestAssured.given();
    	  Response response =arequest.request(Method.GET,"/posts");
    	 ArrayList object=(ArrayList) response.jsonPath().get();
    	 for(int i=0;i<object.size();i++)
    	 {
    		 var temp=(HashMap) object.get(i);
    		 System.out.println("id:" +" " +temp.get("id"));
    		 System.out.println("title:" +" " + temp.get("title"));
    		 System.out.println("body:" +" " + temp.get("body"));
    	 }
      }

}
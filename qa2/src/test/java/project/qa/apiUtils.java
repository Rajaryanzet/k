package project.qa;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;
//import io.restassured.response.ValidatableResponse;



public class apiUtils {
	

	


    public static  Response getData(String url) {
	
	
//	         verify get apicall 
//	               input required 
//	                    1.api(in string format)
	
	
	
			Response res=	given()
				.when()
				   .get(url)
				.then()
				   .extract().response();
		return res;  
		
	}


	
	public static  Response addData(String url,String bodytype ) {
			
			
//			verify post apicall 
//		     input required 
//		         1.api(in string format)
//			     2.data you want to add in string format
			
			Response res=
		given()
	    	.contentType("application/json")
		    .body(bodytype)
		.when()
		     .post(url)
		 .then()
		      .extract().response();
			
			
			return res;
		
	}
		
		
		
	@Test
    public static Response updateData(String url,String bodytype) {
	
		
		
		
//		verify put apicall 
//	     input required 
//	         1.api(in string format)
//		     2.data you want to add in string format
		
    
		
		
		Response res=
				given()
			    	.contentType("application/json")
				    .body(bodytype)
				.when()
				     .put(url)
				 .then()
				      .extract().response();
					
					
					return res;
    }
     
	
	
	
	
    public static Response deleteData(String url) {
    	
    	
    	
//		verify delete apicall 
//	     input required 
//	         1.api(in string format)

		
		
    	Response res=	given()
				.when()
				   .delete(url)
				.then()
				   .extract().response();
		return res;
		
		
	}
}

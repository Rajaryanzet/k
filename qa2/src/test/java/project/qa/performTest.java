package project.qa;

//import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.Assert; 

import io.restassured.response.Response;


//import io.restassured.matcher.RestAssuredMatchers.*;
//import org.hamcrest.Matchers.*;



public class performTest {
	static String baseUrl="https://dummy.restapiexample.com/api/v1";
	@Test
	public  static void gett(){
		Response res= apiUtils.getData(baseUrl+"/employees");
		Assert.assertEquals(res.getStatusCode(), 200); 
		
    };
    @Test
    public  static void postt(){
    	String bodytype="{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";
    	Response res= apiUtils.addData(baseUrl+"/create",bodytype);
    	Assert.assertEquals(res.getStatusCode(), 200);
		
   };
   @Test
   public  static void updatee(){
      	String bodytype="{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";
   	    Response res= apiUtils.updateData(baseUrl+"/update/21",bodytype);
      	 Assert.assertEquals(res.getStatusCode(), 200);
		
  };
  @Test
  public  static void deletee(){
	  Response res= apiUtils.deleteData(baseUrl+"/delete/2");
	  Assert.assertEquals(res.getStatusCode(), 200);
 };
};


package com.example.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/** 
 * Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {
    
    /** Method processing HTTP GET requests 
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET 
    @Produces(MediaType.APPLICATION_JSON)
    
    public Response getStudentInfo(
    		@MatrixParam ("studentRollNo") String studentRollNo1,
    		@MatrixParam ("studentRollNo2") String studentRollNo2) {
    	
    	System.out.println("Roll Numbers: "+studentRollNo1 + studentRollNo2);   	
    	
        return Response.status(200).entity(studentRollNo1+studentRollNo2).build();
    }
}
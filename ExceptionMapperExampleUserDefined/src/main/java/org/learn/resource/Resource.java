
package org.learn.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.learn.exception.MyArithmeticException;
import org.learn.exception.MyNullPointerException;


@Path("/exp")
public class Resource {

	@GET	
	@Path("outofbound")
	public Response indexOutOfBoundException() {
		String indexOutOfBound = "hello";
		
		/*
		 Any code come here and suppose following exception raised
		 */
		
		//It will raise index out of bound exception
		//It will be caught in ApplicationExceptionMapper
		indexOutOfBound.charAt(indexOutOfBound.length());
		return  Response.status(Response.Status.OK).build();
	}
	@GET	
	@Path("nullp")
	public Response nullPointerException() {
		/*
		 
		 Any code come here and suppose following exception raised
		 
		 */
		//It will be caught in MyNullPointerExceptionMapper
		throw new MyNullPointerException("Throwing my null pointer exception");
	}
	
	@GET	
	@Path("dividebyzero")
	public Response divideByZero() {		
		/*
		 
		 Any code come here and suppose following exception raised
		 
		 
		 * */
		//Raising divide by zero exception	
		int divByZero  = 0;
		try {
			divByZero = 100 / 0;
		} catch(ArithmeticException exp) {
			//It will be caught in yArithmeticExceptionMapper
			throw new MyArithmeticException("Throwing MyArithmeticException "+exp.getMessage());
		}
		System.out.println(divByZero);
		return Response.status(Response.Status.OK).build();
	}	
}

package org.learn.exceptionmapper;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.learn.exception.MyNullPointerException;

@Provider
public class MyNullPointerExceptionMapper implements ExceptionMapper<MyNullPointerException> {

    @Override
    public Response toResponse(MyNullPointerException e) {
          
        return Response
                .status(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode())
                .type(MediaType.TEXT_PLAIN)
                .entity("Catching in MyNullPointerExceptionMapper : "+ e.getMessage())
                .build();
    }
}
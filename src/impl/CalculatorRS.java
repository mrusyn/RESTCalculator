package impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.google.gson.Gson;

import org.apache.log4j.Logger;

//REST Service

@Path("/calc")
public class CalculatorRS implements ICalculator{

    private static final Logger LOG = Logger.getLogger(CalculatorRS.class);

    
    @GET
    @Path("/add/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public int add(@PathParam("a") int a, @PathParam("b") int b) {
    
        return (a+b);
    }

    @GET
    @Path("/multiply/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public int multiply(@PathParam("a") int a, @PathParam("b") int b) {
        
        return (a*b);
    }

    @GET
    @Path("/divide/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public int divide(@PathParam("a") int a, @PathParam("b") int b) {
        
        return (a/b);
    }

    @GET
    @Path("/substract/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public int subtract(@PathParam("a") int a, @PathParam("b") int b) {
        
        return (a-b);
    }
}
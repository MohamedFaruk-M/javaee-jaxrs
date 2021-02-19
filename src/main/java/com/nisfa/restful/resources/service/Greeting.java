package com.nisfa.restful.resources.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author Administrator
 */
@Path("greet")
public class Greeting {

    @GET
    @Path("{name}")
    public Response sayHello(@PathParam("name") String name) {
        return Response.ok(new StringBuilder("Welcome ")
                .append(name)
                .append("!, In the world of javaEE Restful Webservices")
                .toString()).build();
    }

}

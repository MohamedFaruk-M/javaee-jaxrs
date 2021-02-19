package com.nisfa.restful.resources;

import com.nisfa.entity.Employee;
import com.nisfa.service.PersistenceService;
import com.nisfa.service.QueryService;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author Administrator
 */
@Path("employee")
public class EmployeeResource {

    @Inject
    PersistenceService persistenceService;

    @Inject
    QueryService queryService;

    @POST
    @Path("create")
    public Response createEmployee(Employee employee) {

        int id = persistenceService.createEmployee(employee);

        if (id == -1) {
            return Response.ok(new StringBuilder("Employee")
                    .append("created successfully having id : ")
                    .append(id).toString()).build();
        } else {
            return Response.ok(new StringBuilder("Error on ")
                    .append("Employee creation").toString()).build();
        }

    }

    @GET
    @Path("{id}")
    public Response getEmployee(@PathParam("id") String id) {

        Employee employee = queryService.findEmployeeById(Long.valueOf(id));

        return Response.ok(employee).build();
    }

}

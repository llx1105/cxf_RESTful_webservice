package services;

import models.Customer;
import models.Customers;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@WebService
@Path("/customer")
public interface CustomerInterface {


    @GET
    @Path("/customer/{id}")
    @Produces({"application/json", "application/xml"})
    Customer getCustomer(@PathParam("id") String id);

    @GET
    @Path("/customers")
    @Produces({"application/json", "application/xml"})
    Customers getCustomers();

    @POST
    @Consumes("application/json")
    @Produces({"application/json", "application/xml"})
    Customer createCustomer(Customer customer);

    @PUT
    @Path("/update")
    void updateCustomer(Customer customer);

    @DELETE
    @Path("/delete/{id}")
    void removeCustomer(@PathParam("id") String id);


}

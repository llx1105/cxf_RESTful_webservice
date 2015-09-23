package services;

import models.Customer;
import models.Customers;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@WebService
public interface CustomerInterface {

//    @GET
//    @Path("/customer/{username}")
//    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//    @Produces({MediaType.APPLICATION_JSON})
//    public String sayHello(@PathParam(value = "username") String username);
//
//    @POST
//    @Path("update")
//    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//    @Produces({MediaType.APPLICATION_JSON})
//    public void setUser(String username);


    @GET
    @Path("/customer/{id}")
    @Produces({"application/json", "application/xml"})
    Customer getCustomer(@PathParam("id") String id);

    @GET
    @Path("/customers")
    @Produces({"application/json", "application/xml"})
    Customers getCustomers();

    @POST
    @Path("/create")
    @Produces({"application/json", "application/xml"})
    Customer createCustomer(Customer customer);

    @PUT
    @Path("/update")
    void updateCustomer(Customer customer);

    @DELETE
    @Path("/delete/{id}")
    void removeCustomer(@PathParam("id") String id);


}

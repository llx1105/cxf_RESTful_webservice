import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@WebService
public interface HelloWorldInterface {

    @GET
    @Path("/personDetail/{username}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces({MediaType.APPLICATION_JSON})
    public String sayHello(@PathParam(value = "username") String username);

    @POST
    @Path("updatePersonDetail")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces({MediaType.APPLICATION_JSON})
    public void setUser(String username);


}

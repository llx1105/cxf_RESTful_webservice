import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by lxliang on 9/21/15.
 */
@WebService
public interface HelloWorldInterface {

    @GET
    @Path("/get/{username}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces({ MediaType.APPLICATION_JSON })
    public String sayHello(@PathParam(value = "username") String username);

    @POST
    @Path("post")
    public void setUser(String username);


}

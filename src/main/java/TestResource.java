import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Marek Marusic <mmarusic@redhat.com> on 2/23/18.
 */
@Path("/test")
public class TestResource {

    @EJB
    Loop loop;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getProducts(){
        return loop.loop();
    }

}

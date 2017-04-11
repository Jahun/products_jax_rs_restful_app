package ProductsRs;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by Ceyhun on 11.04.2017.
 */
@Path("/products")
public class Products {
    @GET
    @Path("/get-product/{i}")
    @Produces("text/plain")
    public String getProduct(@PathParam("i") Integer i) {
        // Return some cliched textual content
        return "Product => " + i.toString();
    }


}

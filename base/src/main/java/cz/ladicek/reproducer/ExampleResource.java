package cz.ladicek.reproducer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/example")
public class ExampleResource {
    @GET
    public String hello() {
        return "Hello, world!";
    }
}

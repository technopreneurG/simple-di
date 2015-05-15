package example.simple.ws;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import example.simple.data.interfaces.DataAccess;
import example.simple.data.dummystatic.User;

@Path("/test")
public class TestResource {

	DataAccess da;

	@Inject
	TestResource(DataAccess da) {
		this.da = da;
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("{id}")
	public User getUser(@PathParam("id") int id) {
		return (User) da.getData(id);
	}
}

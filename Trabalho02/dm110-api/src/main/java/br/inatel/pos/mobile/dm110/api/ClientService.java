package br.inatel.pos.mobile.dm110.api;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/client")
public interface ClientService {
	@POST
	@Path("/{clientName}")
	void addNewClient(@PathParam("clientName") String clientName); 
	
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	String[] listClientNames();
}
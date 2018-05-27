package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import dto.HelloDTO;

@Path("hello")
public class RESTHelloWorld {
	
	@GET
	public String getMessage() {
		return "Hello";
	}
	
	@GET
	@Path("{name}")
	@Produces("application/json")
	public HelloDTO sayHello(@PathParam("name") String name) {
		HelloDTO dto = new HelloDTO();
		dto.setName(name);
		dto.setMessage("Hello");
		
		return dto;
	}
}

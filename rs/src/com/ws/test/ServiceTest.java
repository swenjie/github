package com.ws.test;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Produces("text/plain")
@Consumes("text/plain")
@Path("/serviceTest")
public class ServiceTest {

	@GET
	@Path("/testGet/{name}")
	@Produces("text/plain")
	@Consumes("text/plain")
	public String testGet(@DefaultValue("Ð¡Ã÷") @PathParam("name") String name) {
		return name+":ÄãºÃ";
	}
}
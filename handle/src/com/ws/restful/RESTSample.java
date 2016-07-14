package com.ws.restful;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path(value="/sample")
public interface RESTSample {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String doGet();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/request/{param}")
	public String doRequest(@PathParam("param") String param,
			@Context HttpServletRequest servletRequest,
			@Context HttpServletResponse servletResponse);
	@GET
	@Path("/bean/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public User getBean(@PathParam("id") int id);
}

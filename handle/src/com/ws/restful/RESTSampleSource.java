package com.ws.restful;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;
@Path(value="/sample")
public class RESTSampleSource implements RESTSample {

	@Context
	private UriInfo uriInfo;
	@Context
	private Request request;
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String doGet() {
		return "this is get rest request";
	}
	//"http://localhost:8080/handle/ws/rest/sample/request/123"
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/request/{param}")
	public String doRequest(@PathParam("param") String param,
			@Context HttpServletRequest servletRequest,
			@Context HttpServletResponse servletResponse) {
		System.out.println(servletRequest);  
        System.out.println(servletResponse);  
        System.out.println(servletRequest.getParameter("param"));  
        System.out.println(servletRequest.getContentType());  
        System.out.println(servletResponse.getCharacterEncoding());  
        System.out.println(servletResponse.getContentType());  
        return "success";  
	}

	@GET
	@Path("/bean/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public User getBean(@PathParam("id") int id) {
        System.out.println("id:" + id);  
        System.out.println("Method:" + request.getMethod());  
        System.out.println("uri:" + uriInfo.getPath());  
        System.out.println(uriInfo.getPathParameters());  
        User user = new User();  
        user.setId(id);  
        user.setName("JojO");  
        return user;  
	}

}

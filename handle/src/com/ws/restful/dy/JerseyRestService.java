package com.ws.restful.dy;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/jsonServices")
public class JerseyRestService {

	
	@POST
	@Path("/print/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Students produceJSON( @PathParam("name") String name ) {
		Students sts=new Students();
		List<Student> list=new ArrayList<Student>();
		Student st = new Student(name, "Diaz",22,1);
		list.add(st);
		sts.setList(list);
		return sts;
	}
	/*
 	{
		"student":{
		        "id": 1,
		        "firstName": 12,
		        "lastName": "Diaz",
		        "age": 22
    			}
	} 	  
	 */
	@POST
	@Path("/send")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String consumeJSON( Student student ) {
		String output = student.toString();
		System.out.println(output);
		System.out.println(student.getId());
		if("".equals(student.getFirstName())){
			return "kongkong";
		}else{
			return student.getFirstName();
		}
		
	}

	@GET
	@Path("/printStu/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student produceStu( @PathParam("name") String name ) {
		
		Student st = new Student(name, "Diaz",22,1);

		return st;

	}
	
	@POST
	@Path("/sendJson")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response consumeStu( Student student ) {
		String output = student.toString();
		return Response.status(200).entity(output).build();
	}

}

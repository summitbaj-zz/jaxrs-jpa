package com.lftechnology.restful.rs;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import com.lftechnology.restful.entity.Student;
import com.lftechnology.restful.service.impl.StudentServiceImpl;
import jdk.nashorn.internal.parser.JSONParser;

import javax.json.JsonObject;
import javax.json.stream.JsonParsingException;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Summit on 1/27/2017.
 */
@Path("/student")
public class StudentRs {
    @Inject
    StudentServiceImpl studentService;

    @GET
    @Path("/get/{param}")
   // @Produces(MediaType.APPLICATION_JSON)
    public Response getMsg(@PathParam("param") String msg) {

        String output = "Test say : " + msg;
        return Response.status(200).entity(output).build();

    }

    @Path("/post")
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@FormParam("name") String name) {
        ObjectMapper mapper = new ObjectMapper();
        Student student = new Student();
        student.setName(name);
        student.setId(1);
        String jsonString = null;
        try {
            jsonString = mapper.writeValueAsString(student);
        } catch(JsonProcessingException e) {
            System.out.println("exception"+e);
        }
        System.out.println("test"+name);
        studentService.save(student);
        return Response.ok(jsonString, MediaType.APPLICATION_JSON).build();
       }

}
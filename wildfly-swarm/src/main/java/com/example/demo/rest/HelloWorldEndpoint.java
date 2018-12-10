package com.example.demo.rest;


import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.lang.Exception;
import java.lang.InterruptedException;
import java.lang.Runtime;
import java.lang.Thread;


@Path("/hello")
public class HelloWorldEndpoint {
	@Inject
	private CdiBean bean;

	@GET
	@Produces("text/plain")
	public Response doGet() {
		System.gc();
		try
		{
			Thread.sleep( 200L );
		}
		catch ( InterruptedException e )
		{
			e.printStackTrace();
		}
		System.out.printf( "##### spotreba pamate: %.3f, %s\n", ( Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024*1024f), bean.getStr() );
		return Response.ok("Hello from WildFly Swarm!").build();
	}
}
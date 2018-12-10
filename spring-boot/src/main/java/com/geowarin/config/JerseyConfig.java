package com.geowarin.config;

import com.geowarin.rest.RestResource;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import javax.ws.rs.ApplicationPath;

public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(RequestContextFilter.class);
        //packages("com.geowarin.rest");
        register(RestResource.class);
        register(LoggingFilter.class);
    }
}
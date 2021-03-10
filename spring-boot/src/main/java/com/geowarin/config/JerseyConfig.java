package com.geowarin.config;

import com.geowarin.rest.RestResource;
import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import java.util.logging.Logger;

import static java.util.logging.Level.INFO;
import static org.glassfish.jersey.logging.LoggingFeature.DEFAULT_LOGGER_NAME;
import static org.glassfish.jersey.logging.LoggingFeature.Verbosity.PAYLOAD_ANY;

public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(RequestContextFilter.class);
        register(RestResource.class);
        register(new LoggingFeature(Logger.getLogger(DEFAULT_LOGGER_NAME), INFO, PAYLOAD_ANY, 10_000));
    }
}
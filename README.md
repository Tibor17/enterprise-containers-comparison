# enterprise-containers-comparison

The build time of TomEE uber WAR takes 5 minutes to complete.

Startup time:

| WildFly AS 10.1.0 | WidlFly Swarm | TomEE JAX-RS    | TomEE Full Stack | Spring Boot |
| :---------------- |:-------------:|:---------------:| :---------------:|------------:|
|    10 seconds     |  18 seconds   | 3 - 4 seconds   |   3 - 4 seconds  | 10 seconds  |


Boot JAR size:

| WildFly AS 10.1.0 | WidlFly Swarm | TomEE JAX-RS    | TomEE Full Stack | Spring Boot |
| :---------------- |:-------------:|:---------------:|:----------------:| -----------:|
|     170/240 MB    |      90MB     |      32 MB      |       52 MB      |    28 MB    |


Java Heap size (MB) after Full GC:

| WildFly AS 10.1.0 | WidlFly Swarm | TomEE JAX-RS    | TomEE Full Stack | Spring Boot |
| :---------------- |:-------------:|:---------------:|:----------------:| -----------:|
|       29 MB       |     56 MB     |      23 MB      |       19 MB      |    37 MB    |



## TomEE Embedded

The container starts with CLI `java -jar tomee-embedded/target/tomee-embedded-1.0-SNAPSHOT.war`
and the startup completes within

Check the connection via `telnet localhost 8080`.

If you use `<tomee.flavor>jaxrs</tomee.flavor>`, the technology stack contains:
CDI, JPA, JTA, JSP, JSTL, Servlet, Java Mail, Bean Validation, JAX-RS

References:

[Apache TomeEE](http://tomee.apache.org/apache-tomee.html)

## WildFly Swarm

Check the connection via browser with URL `http://localhost:8080/hello`

The technology stack is:

`Installed fraction:                  Logging - STABLE          org.wildfly.swarm:logging:2017.9.5`

`Installed fraction:          Bean Validation - STABLE          org.wildfly.swarm:bean-validation:2017.9.5`

`Installed fraction:        CDI Configuration - STABLE          org.wildfly.swarm:cdi-config:2017.9.5`

`Installed fraction:                   JAX-RS - STABLE          org.wildfly.swarm:jaxrs:2017.9.5`

`Installed fraction:             Transactions - STABLE          org.wildfly.swarm:transactions:2017.9.5`

`Installed fraction:                      CDI - STABLE          org.wildfly.swarm:cdi:2017.9.5`

`Installed fraction:                 Undertow - STABLE          org.wildfly.swarm:undertow:2017.9.5`


## Spring Boot


CLI: `java -jar spring-boot-1.0.0-SNAPSHOT.jar`

Check the connection:

[GET /rest/hello](http://localhost:8080/rest/hello)

[GET /rest/messages](http://localhost:8080/rest/messages)











